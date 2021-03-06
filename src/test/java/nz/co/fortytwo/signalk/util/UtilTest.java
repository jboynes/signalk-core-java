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
package nz.co.fortytwo.signalk.util;

import static org.junit.Assert.assertTrue;

import java.net.UnknownHostException;

import mjson.Json;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtilTest {

	private static Logger logger = Logger.getLogger(UtilTest.class);
	
	@BeforeClass
	public static void setUp() throws Exception {
		Util.getConfig();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void shouldGetWelcomeMsg(){
		Json msg = Util.getWelcomeMsg();
		logger.debug(msg);
		//{"timestamp":"2015-04-13T23:04:03.826Z","version":"0.1","SignalKConstants.self":"motu"}
		assertTrue(msg.has(SignalKConstants.timestamp));
		assertTrue(msg.has(SignalKConstants.version));
		assertTrue(msg.has(SignalKConstants.self_str));
	}
}
