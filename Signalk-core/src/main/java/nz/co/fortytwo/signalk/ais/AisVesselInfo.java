/*
 *
 * Copyright (C) 2012-2014 R T Huitema. All Rights Reserved.
 * Web: www.42.co.nz
 * Email: robert@42.co.nz
 * Author: R T Huitema
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package nz.co.fortytwo.signalk.ais;

import dk.dma.ais.message.AisMessage18;
import dk.dma.ais.message.AisPositionMessage;
import dk.dma.ais.message.AisStaticCommon;
import dk.dma.enav.model.geometry.Position;

/**
 * Holder for AIS info, cant use dk.dma as it has too many unwanted attributes which serialize to JSON by default
 * @author robert
 *
 */
public class AisVesselInfo {

	protected Position position;
	/**
     * Navigational status: 0 = under way using engine 1 = at anchor 2 = not under command 3 = restricted
     * manoeuvrability 4 = constrained by her draught 5 = moored 6 = aground 7 = engaged in fishing 8 = under way
     * sailing 9 = reserved for future amendment of navigational status for ships carrying DG, HS, or MP, or IMO hazard
     * or pollutant category C, high speed craft (HSC), 10 = reserved for future amendment of navigational status for
     * ships carrying dangerous goods (DG), harmful substances (HS) or marine pollutants (MP), or IMO hazard or
     * pollutant category A, wing in grand (WIG); 11-13 = reserved for future use 14 = AIS-SART (active) 15 = not
     * defined = default (also used by AIS-SART under test)
     */
    protected int navStatus; // 4 bits

    /**
     * Rate of Turn (ROT): 0 to +126 = turning right at up to 708 degrees per min or higher 0 to -126 = turning left at
     * up to 708 degrees per min or higher Values between 0 and 708 degrees per min coded by ROTais = 4.733
     * SQRT(ROTsensor) degrees per min where ROTsensor is the Rate of Turn as input by an external Rate of Turn
     * Indicator (TI). ROTais is rounded to the nearest integer value.
     * 
     * +127 = turning right at more than 5 degrees per 30 s (No TI available) -127 = turning left at more than 5 degrees
     * per 30 s (No TI available) -128 (80 hex) indicates no turn information available (default).
     * 
     * ROT data should not be derived from COG information.
     */
    protected int rot; // 8 bits :

    /**
     * Speed Over Ground Speed over ground in 1/10 knot steps (0-102.2 knots) 1023 = not available, 1022 = 102.2 knots
     * or higher
     */
    protected int sog; // 10 bits

    /**
     * Course over Ground Course over ground in 1/10 = (0-3599). 3600 (E10h) = not available = default. 3601-4095 should
     * not be used
     */
    protected int cog; // 12 bits

    /**
     * True heading Degrees (0-359) (511 indicates not available = default)
     */
    protected int trueHeading; // 9 bits

    /**
     * Time stamp: UTC second when the report was generated by the EPFS (0-59 or 60 if time stamp is not available,
     * which should also be the default value or 61 if positioning system is in manual input mode or 62 if electronic
     * position fixing system operates in estimated (dead reckoning) mode or 63 if the positioning system is
     * inoperative) 61, 62, 63 are not used by CS AIS
     */
    protected int utcSec; // 6 bits : UTC Seconds
    protected int userId; // 30 bit: MMSI number
    protected String name; //vessel name
	/**
     * Call sign: 7 = 6 bit ASCII characters, @@@@@@@ = not available = default
     */
    protected String callsign; // 7x6 (42) bits
    /**
     * Type of ship and cargo type: 0 = not available or no ship = default 1-99 = as defined in  3.3.2 100-199 =
     * reserved, for regional use 200-255 = reserved, for future use Not applicable to SAR aircraft
     */
    protected int shipType; // 8 bits
    
    //time message received, so we can clean up old ones
    protected long received; //millis time message recieved
    
	public AisVesselInfo(AisPositionMessage vessel){
		received=System.currentTimeMillis();
		userId=vessel.getUserId();
		utcSec=vessel.getUtcSec();
		position=vessel.getValidPosition();
		navStatus=vessel.getNavStatus();
		rot=vessel.getRot();
		sog=vessel.getSog();
		cog=vessel.getCog();
		trueHeading=vessel.getTrueHeading();
	}

	public AisVesselInfo(AisStaticCommon vessel) {
		received=System.currentTimeMillis();
		userId=vessel.getUserId();
		position=vessel.getValidPosition();
		name = vessel.getName();
		callsign = vessel.getCallsign();
		shipType = vessel.getShipType();
		
	}

	public AisVesselInfo(AisMessage18 vessel) {
		received=System.currentTimeMillis();
		userId=vessel.getUserId();
		utcSec=vessel.getUtcSec();
		position=vessel.getValidPosition();
		//navStatus=vessel.getNavStatus();
		//rot=vessel.getRot();
		sog=vessel.getSog();
		cog=vessel.getCog();
		trueHeading=vessel.getTrueHeading();
		
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getNavStatus() {
		return navStatus;
	}

	public void setNavStatus(int navStatus) {
		this.navStatus = navStatus;
	}

	public int getRot() {
		return rot;
	}

	public void setRot(int rot) {
		this.rot = rot;
	}

	public int getSog() {
		return sog;
	}

	public void setSog(int sog) {
		this.sog = sog;
	}

	public int getCog() {
		return cog;
	}

	public void setCog(int cog) {
		this.cog = cog;
	}

	public int getTrueHeading() {
		return trueHeading;
	}

	public void setTrueHeading(int trueHeading) {
		this.trueHeading = trueHeading;
	}

	public int getUtcSec() {
		return utcSec;
	}

	public void setUtcSec(int utcSec) {
		this.utcSec = utcSec;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

	public int getShipType() {
		return shipType;
	}

	public void setShipType(int shipType) {
		this.shipType = shipType;
	}

	public long getReceived() {
		return received;
	}

	public void setReceived(long received) {
		this.received = received;
	}
	

}
