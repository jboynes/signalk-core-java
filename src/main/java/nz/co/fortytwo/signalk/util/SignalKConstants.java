/*
 * 
 * Copyright (C) 2012-2014 R T Huitema. All Rights Reserved.
 * Web: www.42.co.nz
 * Email: robert@42.co.nz
 * Author: R T Huitema
 * 
 * This file is part of the signalk-server-java project
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nz.co.fortytwo.signalk.util;


public class SignalKConstants {

	//fixed
	public static final double MS_TO_KNOTS = 1.94384;
	public static final double MS_TO_KM = 3.6;
	public static final double KNOTS_TO_MS = 0.51444;
	public static final double MTR_TO_FEET = 3.28084;
	public static final double MTR_TO_FATHOM = 0.546806649;
	public static final double TWO_PI = 2*Math.PI;
	
	public static final String dot = ".";
	public static final String vessels = "vessels";
	public static final String self_str =  "self";
	
	public static String self = self_str;
	public static String vessels_dot_self_dot=vessels+dot+self+dot;
	public static String vessels_dot_self=vessels+dot+self;
	
	public static final String version = "version";
	public static final String timestamp = "timestamp";
	public static final String source = "source";
	public static final String value = "value";
	
	
	
	public static final String meta = "meta";
	public static final String zones = "zones";
	public static final String attr = "_attr";
	public static final String alarms = "alarms";
	public static final String alarm = "alarm";
	public static final String alarmState = "alarmState";
	public static final String alarmMessage = "alarmMessage";
	public static final String warnMessage = "warnMessage";
	public static final String message = "message";
	public static final String warn = "warn";
	public static final String normal = "normal";
	
	public static final String type = "type";
	public static final String routes = "routes";
	public static final String key= "key";
	public static final String currentTrack = "currentTrack";
	
	
	public static final String websocketUrl="signalk-ws";
	public static final String restUrl="signalk-http";
	
	public static final String signalkTcpPort = "signalk-tcp";
	public static final String signalkUdpPort = "signalk-udp";
	public static final String nmeaTcpPort = "nmea-tcp";
	public static final String nmeaUdpPort = "nmea-udp";
	
	public static final String stompPort = "stomp";
	public static final String mqttPort = "mqtt";
	
	
	//public static final String DOT = ".";
	public static final String MSG_TYPE = "MSG_TYPE";
	public static final String SERIAL = "SERIAL";
	public static final String EXTERNAL_IP = "EXTERNAL_IP";
	public static final String INTERNAL_IP = "INTERNAL_IP";
	public static final String MSG_SERIAL_PORT = "MSG_SERIAL_PORT";
	public static final String MSG_SRC_IP = "MSG_SRC_IP";
	public static final String MSG_SRC_IP_PORT = "MSG_SRC_IP_PORT";
	public static final String MSG_APPROVAL = "MSG_APPROVAL";
	public static final String REQUIRED = "REQUIRED";
	public static final String CONFIG_ACTION = "CONFIG_ACTION";
	public static final String CONFIG_ACTION_READ = "CONFIG_ACTION_READ";
	public static final String CONFIG_ACTION_SAVE = "CONFIG_ACTION_SAVE";
	
	public static final String CONFIG = "config";
	
	public static final String CONTEXT = "context";
	public static final String UPDATES = "updates";
	public static final String SUBSCRIBE = "subscribe";
	public static final String UNSUBSCRIBE = "unsubscribe";
	public static final String LIST = "list";
	public static final String GET = "get";
	public static final String PUT = "put";
	public static final String PATHLIST = "pathlist";
	//public static final String source = "source";
	//public static final String DEVICE = "device";
	//public static final String timestamp = "timestamp";
	//public static final String SRC = "src";
	//public static final String PGN = "pgn";
	//public static final String value = "value";
	
	public static final String PATH = "path";
	public static final String PERIOD = "period";
	public static final String MIN_PERIOD = "minPeriod";
	public static final String SIGNALK_FORMAT="SIGNALK_FORMAT";
	public static final String FORMAT="format";
	public static final String FORMAT_DELTA="delta";
	public static final String FORMAT_FULL="full";
	public static final String POLICY="policy";
	public static final String POLICY_FIXED = "fixed";
	public static final String POLICY_INSTANT = "instant";
	public static final String POLICY_IDEAL = "ideal";
	
	public static final String N2K_MESSAGE = "N2K_MESSAGE";
	
	public static final String SIGNALK_DISCOVERY = "/signalk";
	public static final String SIGNALK_AUTH = "/signalk/v1/auth";
	public static final String SIGNALK_API = "/signalk/v1/api";
	public static final String SIGNALK_WS = "/signalk/v1/stream";
	public static final String SIGNALK_INSTALL = "/signalk/v1/install";
	public static final String SIGNALK_UPGRADE = "/signalk/v1/upgrade";
	
	//public static final String name = "name";
	//public static final String mmsi = "mmsi";

	public static final String url="url";
	public static final String uuid="uuid";
	public static final String vessels_id = "vessels.*";
	public static final String pgn = "pgn";
	public static final String values = "values";
	
	//temp
	public static final String env_time_time = "environment.time.time";
	public static final String env_time_date = "environment.time.date";
	public static final String env_time_millis = "environment.time.millis";
	public static final String env_time_utc = "environment.time.utc";
	public static final String env_timezone = "environment.time.timezone";

	//generated
	public static final String resources="resources";
	public static final String resources_charts="resources.charts";
	public static final String resources_charts_id="resources.charts.*";
	public static final String resources_charts_id_chartFormat="resources.charts.*.chartFormat";
	public static final String resources_charts_id_chartUrl="resources.charts.*.chartUrl";
	public static final String resources_charts_id_description="resources.charts.*.description";
	public static final String resources_charts_id_identifier="resources.charts.*.identifier";
	public static final String resources_charts_id_name="resources.charts.*.name";
	public static final String resources_charts_id_tilemapUrl="resources.charts.*.tilemapUrl";
	public static final String resources_notes="resources.notes";
	public static final String resources_notes_id="resources.notes.*";
	public static final String resources_notes_id_description="resources.notes.*.description";
	public static final String resources_notes_id_mimeType="resources.notes.*.mimeType";
	public static final String resources_notes_id_region="resources.notes.*.region";
	public static final String resources_notes_id_title="resources.notes.*.title";
	public static final String resources_notes_id_url="resources.notes.*.url";
	public static final String resources_regions="resources.regions";
	public static final String resources_regions_id="resources.regions.*";
	public static final String resources_regions_id_description="resources.regions.*.description";
	public static final String resources_regions_id_name="resources.regions.*.name";
	public static final String resources_regions_id_waypoints="resources.regions.*.waypoints";
	public static final String resources_routes="resources.routes";
	public static final String resources_routes_id="resources.routes.*";
	public static final String resources_routes_id_description="resources.routes.*.description";
	public static final String resources_routes_id_distance="resources.routes.*.distance";
	public static final String resources_routes_id_name="resources.routes.*.name";
	public static final String resources_routes_id_waypoints="resources.routes.*.waypoints";
	public static final String resources_waypoints="resources.waypoints";
	public static final String resources_waypoints_id="resources.waypoints.*";
	public static final String resources_waypoints_id_description="resources.waypoints.*.description";
	public static final String resources_waypoints_id_name="resources.waypoints.*.name";
	public static final String resources_waypoints_id_position="resources.waypoints.*.position";
	public static final String resources_waypoints_id_position_altitude="resources.waypoints.*.position.altitude";
	public static final String resources_waypoints_id_position_latitude="resources.waypoints.*.position.latitude";
	public static final String resources_waypoints_id_position_longitude="resources.waypoints.*.position.longitude";
	public static final String resources_waypoints_id_type="resources.waypoints.*.type";

	public static final String alarms_id="alarms.*";
	public static final String alarms_id_alarmMethod="alarms.*.alarmMethod";
	public static final String alarms_id_alarmState="alarms.*.alarmState";
	public static final String alarms_id_message="alarms.*.message";
	public static final String communication="communication";
	public static final String communication_callsignDsc="communication.callsignDsc";
	public static final String communication_callsignHf="communication.callsignHf";
	public static final String communication_callsignVhf="communication.callsignVhf";
	public static final String communication_crewNames="communication.crewNames";
	public static final String communication_email="communication.email";
	public static final String communication_emailHf="communication.emailHf";
	public static final String communication_phoneNumber="communication.phoneNumber";
	public static final String communication_satPhoneNumber="communication.satPhoneNumber";
	public static final String communication_skipperName="communication.skipperName";
	public static final String design="design";
	public static final String design_airHeight="design.airHeight";
	public static final String design_beam="design.beam";
	public static final String design_displacement="design.displacement";
	public static final String design_draft="design.draft";
	public static final String design_draft_canoe="design.draft.canoe";
	public static final String design_draft_maximum="design.draft.maximum";
	public static final String design_draft_minimum="design.draft.minimum";
	public static final String design_keel="design.keel";
	public static final String design_keel_angle="design.keel.angle";
	public static final String design_keel_lift="design.keel.lift";
	public static final String design_keel_type="design.keel.type";
	public static final String design_length="design.length";
	public static final String design_length_hull="design.length.hull";
	public static final String design_length_overall="design.length.overall";
	public static final String design_length_waterline="design.length.waterline";
	public static final String design_rigging="design.rigging";
	public static final String design_rigging_configuration="design.rigging.configuration";
	public static final String design_rigging_masts="design.rigging.masts";
	public static final String electrical="electrical";
	public static final String electrical_ac="electrical.ac";
	public static final String electrical_ac_bus1="electrical.ac.bus1";
	public static final String electrical_ac_bus1_average="electrical.ac.bus1.average";
	public static final String electrical_ac_bus1_average_frequency="electrical.ac.bus1.average.frequency";
	public static final String electrical_ac_bus1_average_lineLineVoltage="electrical.ac.bus1.average.lineLineVoltage";
	public static final String electrical_ac_bus1_average_lineNeutralVoltage="electrical.ac.bus1.average.lineNeutralVoltage";
	public static final String electrical_ac_bus1_phaseA="electrical.ac.bus1.phaseA";
	public static final String electrical_ac_bus1_phaseA_frequency="electrical.ac.bus1.phaseA.frequency";
	public static final String electrical_ac_bus1_phaseA_lineLineVoltage="electrical.ac.bus1.phaseA.lineLineVoltage";
	public static final String electrical_ac_bus1_phaseA_lineNeutralVoltage="electrical.ac.bus1.phaseA.lineNeutralVoltage";
	public static final String electrical_ac_bus1_phaseB="electrical.ac.bus1.phaseB";
	public static final String electrical_ac_bus1_phaseB_frequency="electrical.ac.bus1.phaseB.frequency";
	public static final String electrical_ac_bus1_phaseB_lineLineVoltage="electrical.ac.bus1.phaseB.lineLineVoltage";
	public static final String electrical_ac_bus1_phaseB_lineNeutralVoltage="electrical.ac.bus1.phaseB.lineNeutralVoltage";
	public static final String electrical_ac_bus1_phaseC="electrical.ac.bus1.phaseC";
	public static final String electrical_ac_bus1_phaseC_frequency="electrical.ac.bus1.phaseC.frequency";
	public static final String electrical_ac_bus1_phaseC_lineLineVoltage="electrical.ac.bus1.phaseC.lineLineVoltage";
	public static final String electrical_ac_bus1_phaseC_lineNeutralVoltage="electrical.ac.bus1.phaseC.lineNeutralVoltage";
	public static final String electrical_ac_generator="electrical.ac.generator";
	public static final String electrical_ac_generator_average="electrical.ac.generator.average";
	public static final String electrical_ac_generator_average_frequency="electrical.ac.generator.average.frequency";
	public static final String electrical_ac_generator_average_lineLineVoltage="electrical.ac.generator.average.lineLineVoltage";
	public static final String electrical_ac_generator_average_lineNeutralVoltage="electrical.ac.generator.average.lineNeutralVoltage";
	public static final String electrical_ac_generator_energy="electrical.ac.generator.energy";
	public static final String electrical_ac_generator_energy_totalExport="electrical.ac.generator.energy.totalExport";
	public static final String electrical_ac_generator_energy_totalImport="electrical.ac.generator.energy.totalImport";
	public static final String electrical_ac_generator_phaseA="electrical.ac.generator.phaseA";
	public static final String electrical_ac_generator_phaseA_frequency="electrical.ac.generator.phaseA.frequency";
	public static final String electrical_ac_generator_phaseA_lineLineVoltage="electrical.ac.generator.phaseA.lineLineVoltage";
	public static final String electrical_ac_generator_phaseA_lineNeutralVoltage="electrical.ac.generator.phaseA.lineNeutralVoltage";
	public static final String electrical_ac_generator_phaseA_reactivePower="electrical.ac.generator.phaseA.reactivePower";
	public static final String electrical_ac_generator_phaseA_reactivePower_powerFactor="electrical.ac.generator.phaseA.reactivePower.powerFactor";
	public static final String electrical_ac_generator_phaseA_reactivePower_powerFactorLagging="electrical.ac.generator.phaseA.reactivePower.powerFactorLagging";
	public static final String electrical_ac_generator_phaseA_reactivePower_reactivePower="electrical.ac.generator.phaseA.reactivePower.reactivePower";
	public static final String electrical_ac_generator_phaseA_realPower="electrical.ac.generator.phaseA.realPower";
	public static final String electrical_ac_generator_phaseA_realPower_apparentPower="electrical.ac.generator.phaseA.realPower.apparentPower";
	public static final String electrical_ac_generator_phaseA_realPower_realPower="electrical.ac.generator.phaseA.realPower.realPower";
	public static final String electrical_ac_generator_phaseB="electrical.ac.generator.phaseB";
	public static final String electrical_ac_generator_phaseB_frequency="electrical.ac.generator.phaseB.frequency";
	public static final String electrical_ac_generator_phaseB_lineLineVoltage="electrical.ac.generator.phaseB.lineLineVoltage";
	public static final String electrical_ac_generator_phaseB_lineNeutralVoltage="electrical.ac.generator.phaseB.lineNeutralVoltage";
	public static final String electrical_ac_generator_phaseB_reactivePower="electrical.ac.generator.phaseB.reactivePower";
	public static final String electrical_ac_generator_phaseB_reactivePower_powerFactor="electrical.ac.generator.phaseB.reactivePower.powerFactor";
	public static final String electrical_ac_generator_phaseB_reactivePower_powerFactorLagging="electrical.ac.generator.phaseB.reactivePower.powerFactorLagging";
	public static final String electrical_ac_generator_phaseB_reactivePower_reactivePower="electrical.ac.generator.phaseB.reactivePower.reactivePower";
	public static final String electrical_ac_generator_phaseB_realPower="electrical.ac.generator.phaseB.realPower";
	public static final String electrical_ac_generator_phaseB_realPower_apparentPower="electrical.ac.generator.phaseB.realPower.apparentPower";
	public static final String electrical_ac_generator_phaseB_realPower_realPower="electrical.ac.generator.phaseB.realPower.realPower";
	public static final String electrical_ac_generator_phaseC="electrical.ac.generator.phaseC";
	public static final String electrical_ac_generator_phaseC_frequency="electrical.ac.generator.phaseC.frequency";
	public static final String electrical_ac_generator_phaseC_lineLineVoltage="electrical.ac.generator.phaseC.lineLineVoltage";
	public static final String electrical_ac_generator_phaseC_lineNeutralVoltage="electrical.ac.generator.phaseC.lineNeutralVoltage";
	public static final String electrical_ac_generator_phaseC_reactivePower="electrical.ac.generator.phaseC.reactivePower";
	public static final String electrical_ac_generator_phaseC_reactivePower_powerFactor="electrical.ac.generator.phaseC.reactivePower.powerFactor";
	public static final String electrical_ac_generator_phaseC_reactivePower_powerFactorLagging="electrical.ac.generator.phaseC.reactivePower.powerFactorLagging";
	public static final String electrical_ac_generator_phaseC_reactivePower_reactivePower="electrical.ac.generator.phaseC.reactivePower.reactivePower";
	public static final String electrical_ac_generator_phaseC_realPower="electrical.ac.generator.phaseC.realPower";
	public static final String electrical_ac_generator_phaseC_realPower_apparentPower="electrical.ac.generator.phaseC.realPower.apparentPower";
	public static final String electrical_ac_generator_phaseC_realPower_realPower="electrical.ac.generator.phaseC.realPower.realPower";
	public static final String electrical_ac_generator_reactivePower="electrical.ac.generator.reactivePower";
	public static final String electrical_ac_generator_reactivePower_powerFactor="electrical.ac.generator.reactivePower.powerFactor";
	public static final String electrical_ac_generator_reactivePower_powerFactorLagging="electrical.ac.generator.reactivePower.powerFactorLagging";
	public static final String electrical_ac_generator_reactivePower_reactivePower="electrical.ac.generator.reactivePower.reactivePower";
	public static final String electrical_ac_generator_realPower="electrical.ac.generator.realPower";
	public static final String electrical_ac_generator_realPower_apparentPower="electrical.ac.generator.realPower.apparentPower";
	public static final String electrical_ac_generator_realPower_realPower="electrical.ac.generator.realPower.realPower";
	public static final String electrical_ac_utility="electrical.ac.utility";
	public static final String electrical_ac_utility_average="electrical.ac.utility.average";
	public static final String electrical_ac_utility_average_frequency="electrical.ac.utility.average.frequency";
	public static final String electrical_ac_utility_average_lineLineVoltage="electrical.ac.utility.average.lineLineVoltage";
	public static final String electrical_ac_utility_average_lineNeutralVoltage="electrical.ac.utility.average.lineNeutralVoltage";
	public static final String electrical_ac_utility_energy="electrical.ac.utility.energy";
	public static final String electrical_ac_utility_energy_totalExport="electrical.ac.utility.energy.totalExport";
	public static final String electrical_ac_utility_energy_totalImport="electrical.ac.utility.energy.totalImport";
	public static final String electrical_ac_utility_phaseA="electrical.ac.utility.phaseA";
	public static final String electrical_ac_utility_phaseA_frequency="electrical.ac.utility.phaseA.frequency";
	public static final String electrical_ac_utility_phaseA_lineLineVoltage="electrical.ac.utility.phaseA.lineLineVoltage";
	public static final String electrical_ac_utility_phaseA_lineNeutralVoltage="electrical.ac.utility.phaseA.lineNeutralVoltage";
	public static final String electrical_ac_utility_phaseA_reactivePower="electrical.ac.utility.phaseA.reactivePower";
	public static final String electrical_ac_utility_phaseA_reactivePower_powerFactor="electrical.ac.utility.phaseA.reactivePower.powerFactor";
	public static final String electrical_ac_utility_phaseA_reactivePower_powerFactorLagging="electrical.ac.utility.phaseA.reactivePower.powerFactorLagging";
	public static final String electrical_ac_utility_phaseA_reactivePower_reactivePower="electrical.ac.utility.phaseA.reactivePower.reactivePower";
	public static final String electrical_ac_utility_phaseA_realPower="electrical.ac.utility.phaseA.realPower";
	public static final String electrical_ac_utility_phaseA_realPower_apparentPower="electrical.ac.utility.phaseA.realPower.apparentPower";
	public static final String electrical_ac_utility_phaseA_realPower_realPower="electrical.ac.utility.phaseA.realPower.realPower";
	public static final String electrical_ac_utility_phaseB="electrical.ac.utility.phaseB";
	public static final String electrical_ac_utility_phaseB_frequency="electrical.ac.utility.phaseB.frequency";
	public static final String electrical_ac_utility_phaseB_lineLineVoltage="electrical.ac.utility.phaseB.lineLineVoltage";
	public static final String electrical_ac_utility_phaseB_lineNeutralVoltage="electrical.ac.utility.phaseB.lineNeutralVoltage";
	public static final String electrical_ac_utility_phaseB_reactivePower="electrical.ac.utility.phaseB.reactivePower";
	public static final String electrical_ac_utility_phaseB_reactivePower_powerFactor="electrical.ac.utility.phaseB.reactivePower.powerFactor";
	public static final String electrical_ac_utility_phaseB_reactivePower_powerFactorLagging="electrical.ac.utility.phaseB.reactivePower.powerFactorLagging";
	public static final String electrical_ac_utility_phaseB_reactivePower_reactivePower="electrical.ac.utility.phaseB.reactivePower.reactivePower";
	public static final String electrical_ac_utility_phaseB_realPower="electrical.ac.utility.phaseB.realPower";
	public static final String electrical_ac_utility_phaseB_realPower_apparentPower="electrical.ac.utility.phaseB.realPower.apparentPower";
	public static final String electrical_ac_utility_phaseB_realPower_realPower="electrical.ac.utility.phaseB.realPower.realPower";
	public static final String electrical_ac_utility_phaseC="electrical.ac.utility.phaseC";
	public static final String electrical_ac_utility_phaseC_frequency="electrical.ac.utility.phaseC.frequency";
	public static final String electrical_ac_utility_phaseC_lineLineVoltage="electrical.ac.utility.phaseC.lineLineVoltage";
	public static final String electrical_ac_utility_phaseC_lineNeutralVoltage="electrical.ac.utility.phaseC.lineNeutralVoltage";
	public static final String electrical_ac_utility_phaseC_reactivePower="electrical.ac.utility.phaseC.reactivePower";
	public static final String electrical_ac_utility_phaseC_reactivePower_powerFactor="electrical.ac.utility.phaseC.reactivePower.powerFactor";
	public static final String electrical_ac_utility_phaseC_reactivePower_powerFactorLagging="electrical.ac.utility.phaseC.reactivePower.powerFactorLagging";
	public static final String electrical_ac_utility_phaseC_reactivePower_reactivePower="electrical.ac.utility.phaseC.reactivePower.reactivePower";
	public static final String electrical_ac_utility_phaseC_realPower="electrical.ac.utility.phaseC.realPower";
	public static final String electrical_ac_utility_phaseC_realPower_apparentPower="electrical.ac.utility.phaseC.realPower.apparentPower";
	public static final String electrical_ac_utility_phaseC_realPower_realPower="electrical.ac.utility.phaseC.realPower.realPower";
	public static final String electrical_ac_utility_reactivePower="electrical.ac.utility.reactivePower";
	public static final String electrical_ac_utility_reactivePower_powerFactor="electrical.ac.utility.reactivePower.powerFactor";
	public static final String electrical_ac_utility_reactivePower_powerFactorLagging="electrical.ac.utility.reactivePower.powerFactorLagging";
	public static final String electrical_ac_utility_reactivePower_reactivePower="electrical.ac.utility.reactivePower.reactivePower";
	public static final String electrical_ac_utility_realPower="electrical.ac.utility.realPower";
	public static final String electrical_ac_utility_realPower_apparentPower="electrical.ac.utility.realPower.apparentPower";
	public static final String electrical_ac_utility_realPower_realPower="electrical.ac.utility.realPower.realPower";
	public static final String electrical_dc="electrical.dc";
	public static final String electrical_dc_battery="electrical.dc.battery";
	public static final String electrical_dc_battery_capacity="electrical.dc.battery.capacity";
	public static final String electrical_dc_battery_capacity_actual="electrical.dc.battery.capacity.actual";
	public static final String electrical_dc_battery_capacity_dischargeLimit="electrical.dc.battery.capacity.dischargeLimit";
	public static final String electrical_dc_battery_capacity_nominal="electrical.dc.battery.capacity.nominal";
	public static final String electrical_dc_battery_capacity_remaining="electrical.dc.battery.capacity.remaining";
	public static final String electrical_dc_battery_chemistry="electrical.dc.battery.chemistry";
	public static final String electrical_dc_battery_dc="electrical.dc.battery.dc";
	public static final String electrical_dc_battery_identity="electrical.dc.battery.identity";
	public static final String electrical_dc_battery_lifetimeDischarge="electrical.dc.battery.lifetimeDischarge";
	public static final String electrical_dc_battery_lifetimeRecharge="electrical.dc.battery.lifetimeRecharge";
	public static final String electrical_dc_battery_mode="electrical.dc.battery.mode";
	public static final String electrical_dc_battery_mode_value="electrical.dc.battery.mode.value";
	public static final String electrical_dc_battery_temperature="electrical.dc.battery.temperature";
	public static final String electrical_dc_battery_temperature_limitDischargeLower="electrical.dc.battery.temperature.limitDischargeLower";
	public static final String electrical_dc_battery_temperature_limitDischargeUpper="electrical.dc.battery.temperature.limitDischargeUpper";
	public static final String electrical_dc_battery_temperature_limitRechargeLower="electrical.dc.battery.temperature.limitRechargeLower";
	public static final String electrical_dc_battery_temperature_limitRechargeUpper="electrical.dc.battery.temperature.limitRechargeUpper";
	public static final String electrical_dc_definitions="electrical.dc.definitions";
	public static final String electrical_dc_definitions_acSource="electrical.dc.definitions.acSource";
	public static final String electrical_dc_definitions_acSource_associatedBus="electrical.dc.definitions.acSource.associatedBus";
	public static final String electrical_dc_definitions_acSource_voltage="electrical.dc.definitions.acSource.voltage";
	public static final String electrical_dc_definitions_acSource_voltage_measured="electrical.dc.definitions.acSource.voltage.measured";
	public static final String electrical_dc_definitions_dcSource="electrical.dc.definitions.dcSource";
	public static final String electrical_dc_definitions_dcSource_associatedBus="electrical.dc.definitions.dcSource.associatedBus";
	public static final String electrical_dc_definitions_dcSource_current="electrical.dc.definitions.dcSource.current";
	public static final String electrical_dc_definitions_dcSource_current_faultLower="electrical.dc.definitions.dcSource.current.faultLower";
	public static final String electrical_dc_definitions_dcSource_current_faultUpper="electrical.dc.definitions.dcSource.current.faultUpper";
	public static final String electrical_dc_definitions_dcSource_current_measured="electrical.dc.definitions.dcSource.current.measured";
	public static final String electrical_dc_definitions_dcSource_current_warnLower="electrical.dc.definitions.dcSource.current.warnLower";
	public static final String electrical_dc_definitions_dcSource_current_warnUpper="electrical.dc.definitions.dcSource.current.warnUpper";
	public static final String electrical_dc_definitions_dcSource_temperature="electrical.dc.definitions.dcSource.temperature";
	public static final String electrical_dc_definitions_dcSource_temperature_faultLower="electrical.dc.definitions.dcSource.temperature.faultLower";
	public static final String electrical_dc_definitions_dcSource_temperature_faultUpper="electrical.dc.definitions.dcSource.temperature.faultUpper";
	public static final String electrical_dc_definitions_dcSource_temperature_measured="electrical.dc.definitions.dcSource.temperature.measured";
	public static final String electrical_dc_definitions_dcSource_temperature_warnLower="electrical.dc.definitions.dcSource.temperature.warnLower";
	public static final String electrical_dc_definitions_dcSource_temperature_warnUpper="electrical.dc.definitions.dcSource.temperature.warnUpper";
	public static final String electrical_dc_definitions_dcSource_voltage="electrical.dc.definitions.dcSource.voltage";
	public static final String electrical_dc_definitions_dcSource_voltage_faultLower="electrical.dc.definitions.dcSource.voltage.faultLower";
	public static final String electrical_dc_definitions_dcSource_voltage_faultUpper="electrical.dc.definitions.dcSource.voltage.faultUpper";
	public static final String electrical_dc_definitions_dcSource_voltage_measured="electrical.dc.definitions.dcSource.voltage.measured";
	public static final String electrical_dc_definitions_dcSource_voltage_nominal="electrical.dc.definitions.dcSource.voltage.nominal";
	public static final String electrical_dc_definitions_dcSource_voltage_warnLower="electrical.dc.definitions.dcSource.voltage.warnLower";
	public static final String electrical_dc_definitions_dcSource_voltage_warnUpper="electrical.dc.definitions.dcSource.voltage.warnUpper";
	public static final String electrical_dc_definitions_identity="electrical.dc.definitions.identity";
	public static final String electrical_dc_definitions_identity_dateInstalled="electrical.dc.definitions.identity.dateInstalled";
	public static final String electrical_dc_definitions_identity_location="electrical.dc.definitions.identity.location";
	public static final String electrical_dc_definitions_identity_manufacturerModel="electrical.dc.definitions.identity.manufacturerModel";
	public static final String electrical_dc_definitions_identity_manufacturerName="electrical.dc.definitions.identity.manufacturerName";
	public static final String electrical_dc_definitions_identity_name="electrical.dc.definitions.identity.name";
	public static final String electrical_dc_inverter="electrical.dc.inverter";
	public static final String electrical_dc_inverter_ac="electrical.dc.inverter.ac";
	public static final String electrical_dc_inverter_dc="electrical.dc.inverter.dc";
	public static final String electrical_dc_inverter_identity="electrical.dc.inverter.identity";
	public static final String electrical_dc_inverter_mode="electrical.dc.inverter.mode";
	public static final String electrical_dc_inverter_mode_value="electrical.dc.inverter.mode.value";
	public static final String env="environment";
	public static final String env_airPressure="environment.airPressure";
	public static final String env_airPressureChangeRateAlarm="environment.airPressureChangeRateAlarm";
	public static final String env_airTemp="environment.airTemp";
	public static final String env_current="environment.current";
	public static final String env_current_drift="environment.current.drift";
	public static final String env_current_setMagnetic="environment.current.setMagnetic";
	public static final String env_current_setTrue="environment.current.setTrue";
	public static final String env_depth="environment.depth";
	public static final String env_depth_belowKeel="environment.depth.belowKeel";
	public static final String env_depth_belowSurface="environment.depth.belowSurface";
	public static final String env_depth_belowTransducer="environment.depth.belowTransducer";
	public static final String env_depth_surfaceToTransducer="environment.depth.surfaceToTransducer";
	public static final String env_depth_transducerToKeel="environment.depth.transducerToKeel";
	public static final String env_heave="environment.heave";
	public static final String env_humidity="environment.humidity";
	public static final String env_salinity="environment.salinity";
	public static final String env_tide="environment.tide";
	public static final String env_tide_heightHigh="environment.tide.heightHigh";
	public static final String env_tide_heightLow="environment.tide.heightLow";
	public static final String env_tide_heightNow="environment.tide.heightNow";
	public static final String env_tide_timeHigh="environment.tide.timeHigh";
	public static final String env_tide_timeLow="environment.tide.timeLow";
	public static final String env_waterTemp="environment.waterTemp";
	public static final String env_wind="environment.wind";
	public static final String env_wind_angleApparent="environment.wind.angleApparent";
	public static final String env_wind_angleTrueGround="environment.wind.angleTrueGround";
	public static final String env_wind_angleTrueWater="environment.wind.angleTrueWater";
	public static final String env_wind_directionChangeAlarm="environment.wind.directionChangeAlarm";
	public static final String env_wind_directionMagnetic="environment.wind.directionMagnetic";
	public static final String env_wind_directionTrue="environment.wind.directionTrue";
	public static final String env_wind_speedAlarm="environment.wind.speedAlarm";
	public static final String env_wind_speedApparent="environment.wind.speedApparent";
	public static final String env_wind_speedOverGround="environment.wind.speedOverGround";
	public static final String env_wind_speedTrue="environment.wind.speedTrue";
	public static final String mmsi="mmsi";
	public static final String name="name";
	public static final String nav="navigation";
	public static final String nav_activeRoute="navigation.activeRoute";
	public static final String nav_activeRoute_bearingActual="navigation.activeRoute.bearingActual";
	public static final String nav_activeRoute_bearingDirect="navigation.activeRoute.bearingDirect";
	public static final String nav_activeRoute_courseRequired="navigation.activeRoute.courseRequired";
	public static final String nav_activeRoute_distanceActual="navigation.activeRoute.distanceActual";
	public static final String nav_activeRoute_eta="navigation.activeRoute.eta";
	public static final String nav_activeRoute_route="navigation.activeRoute.route";
	public static final String nav_activeRoute_startTime="navigation.activeRoute.startTime";
	public static final String nav_activeRoute_waypoint="navigation.activeRoute.waypoint";
	public static final String nav_activeRoute_waypoint_last="navigation.activeRoute.waypoint.last";
	public static final String nav_activeRoute_waypoint_lastTime="navigation.activeRoute.waypoint.lastTime";
	public static final String nav_activeRoute_waypoint_next="navigation.activeRoute.waypoint.next";
	public static final String nav_activeRoute_waypoint_nextEta="navigation.activeRoute.waypoint.nextEta";
	public static final String nav_activeRoute_waypoint_xte="navigation.activeRoute.waypoint.xte";
	public static final String nav_anchor="navigation.anchor";
	public static final String nav_anchor_currentRadius="navigation.anchor.currentRadius";
	public static final String nav_anchor_maxRadius="navigation.anchor.maxRadius";
	public static final String nav_anchor_position="navigation.anchor.position";
	public static final String nav_anchor_position_altitude="navigation.anchor.position.altitude";
	public static final String nav_anchor_position_latitude="navigation.anchor.position.latitude";
	public static final String nav_anchor_position_longitude="navigation.anchor.position.longitude";
	public static final String nav_attitude="navigation.attitude";
	public static final String nav_attitude_pitch="navigation.attitude.pitch";
	public static final String nav_attitude_roll="navigation.attitude.roll";
	public static final String nav_attitude_yaw="navigation.attitude.yaw";
	public static final String nav_courseOverGroundMagnetic="navigation.courseOverGroundMagnetic";
	public static final String nav_courseOverGroundTrue="navigation.courseOverGroundTrue";
	public static final String nav_destination="navigation.destination";
	public static final String nav_destination_altitude="navigation.destination.altitude";
	public static final String nav_destination_eta="navigation.destination.eta";
	public static final String nav_destination_latitude="navigation.destination.latitude";
	public static final String nav_destination_longitude="navigation.destination.longitude";
	public static final String nav_gnss="navigation.gnss";
	public static final String nav_gnss_antennaAltitude="navigation.gnss.antennaAltitude";
	public static final String nav_gnss_differentialAge="navigation.gnss.differentialAge";
	public static final String nav_gnss_differentialReference="navigation.gnss.differentialReference";
	public static final String nav_gnss_geoidalSeparation="navigation.gnss.geoidalSeparation";
	public static final String nav_gnss_horizontalDilution="navigation.gnss.horizontalDilution";
	public static final String nav_gnss_integrity="navigation.gnss.integrity";

	public static final String nav_gnss_methodQuality="navigation.gnss.methodQuality";
	
	public static final String nav_gnss_positionDilution="navigation.gnss.positionDilution";
	public static final String nav_gnss_satellites="navigation.gnss.satellites";
	public static final String nav_headingMagnetic="navigation.headingMagnetic";
	public static final String nav_headingTrue="navigation.headingTrue";
	public static final String nav_log="navigation.log";
	public static final String nav_logTrip="navigation.logTrip";
	public static final String nav_magneticVariation="navigation.magneticVariation";
	public static final String nav_position="navigation.position";
	public static final String nav_position_altitude="navigation.position.altitude";
	public static final String nav_position_latitude="navigation.position.latitude";
	public static final String nav_position_longitude="navigation.position.longitude";
	public static final String nav_rateOfTurn="navigation.rateOfTurn";
	public static final String nav_speedOverGround="navigation.speedOverGround";
	public static final String nav_speedThroughWater="navigation.speedThroughWater";
	public static final String nav_state="navigation.state";

	public static final String performance="performance";
	public static final String performance_beatAngle="performance.beatAngle";
	public static final String performance_beatAngleTargetSpeed="performance.beatAngleTargetSpeed";
	public static final String performance_beatAngleVelocityMadeGood="performance.beatAngleVelocityMadeGood";
	public static final String performance_gybeAngle="performance.gybeAngle";
	public static final String performance_gybeAngleTargetSpeed="performance.gybeAngleTargetSpeed";
	public static final String performance_gybeAngleVelocityMadeGood="performance.gybeAngleVelocityMadeGood";
	public static final String performance_leeway="performance.leeway";
	public static final String performance_polarSpeed="performance.polarSpeed";
	public static final String performance_polarSpeedRatio="performance.polarSpeedRatio";
	public static final String performance_tackMagnetic="performance.tackMagnetic";
	public static final String performance_tackTrue="performance.tackTrue";
	public static final String performance_velocityMadeGood="performance.velocityMadeGood";
	public static final String performance_velocityMadeGoodToWaypoint="performance.velocityMadeGoodToWaypoint";
	public static final String propulsion="propulsion";
	public static final String propulsion_id="propulsion.*";
	public static final String propulsion_id_engineType="propulsion.*.engineType";
	
	public static final String propulsion_id_exhaustTemperature="propulsion.*.exhaustTemperature";
	public static final String propulsion_id_fuelRate="propulsion.*.fuelRate";
	public static final String propulsion_id_oilPressure="propulsion.*.oilPressure";
	public static final String propulsion_id_oilTemperature="propulsion.*.oilTemperature";
	public static final String propulsion_id_revolutions="propulsion.*.revolutions";
	public static final String propulsion_id_state="propulsion.*.state";

	public static final String propulsion_id_temperature="propulsion.*.temperature";
	public static final String propulsion_id_waterTemperature="propulsion.*.waterTemperature";
	public static final String sensors="sensors";
	public static final String sensors_id="sensors.*";
	public static final String sensors_id_fromBow="sensors.*.fromBow";
	public static final String sensors_id_fromCenter="sensors.*.fromCenter";
	public static final String sensors_id_name="sensors.*.name";
	public static final String sensors_id_sensorData="sensors.*.sensorData";
	public static final String sensors_id_sensorType="sensors.*.sensorType";
	public static final String sources="sources";
	public static final String sources_id="sources.*";
	public static final String sources_id_id="sources.*.*";
	public static final String sources_id_id_pgns="sources.*.*.pgns";
	public static final String sources_id_id_pgns_id="sources.*.*.pgns.*";
	public static final String sources_id_id_sentences="sources.*.*.sentences";
	
	public static final String sources_id_id_src="sources.*.*.src";
	public static final String sources_id_label="sources.*.label";
	public static final String sources_id_type="sources.*.type";
	public static final String steering="steering";
	public static final String steering_autopilot="steering.autopilot";
	public static final String steering_autopilot_backlash="steering.autopilot.backlash";
	public static final String steering_autopilot_deadZone="steering.autopilot.deadZone";
	public static final String steering_autopilot_gain="steering.autopilot.gain";
	public static final String steering_autopilot_headingSource="steering.autopilot.headingSource";
	
	public static final String steering_autopilot_maxDriveCurrent="steering.autopilot.maxDriveCurrent";
	public static final String steering_autopilot_maxDriveRate="steering.autopilot.maxDriveRate";
	public static final String steering_autopilot_mode="steering.autopilot.mode";
	
	public static final String steering_autopilot_portLock="steering.autopilot.portLock";
	public static final String steering_autopilot_starboardLock="steering.autopilot.starboardLock";
	public static final String steering_autopilot_state="steering.autopilot.state";
	
	public static final String steering_autopilot_targetHeadingMagnetic="steering.autopilot.targetHeadingMagnetic";
	public static final String steering_autopilot_targetHeadingNorth="steering.autopilot.targetHeadingNorth";
	public static final String steering_rudderAngle="steering.rudderAngle";
	public static final String steering_rudderAngleTarget="steering.rudderAngleTarget";
	public static final String tanks="tanks";
	public static final String tanks_id="tanks.*";
	public static final String tanks_id_capacity="tanks.*.capacity";
	public static final String tanks_id_level="tanks.*.level";
	public static final String tanks_id_name="tanks.*.name";
	public static final String tanks_id_type="tanks.*.type";
	
	
	

	public SignalKConstants() {
		super();
	}

}