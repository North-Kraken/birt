/*******************************************************************************
 * Copyright (c) 2004,2005 Actuate Corporation.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.birt.data.engine.regre.db;

import org.junit.Before;
import org.junit.Ignore;

import testutil.ConfigText;

/**
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
@Ignore("Ignore tests that require manual setup")
public class ConnectSybaseTest extends ConnectionTest {
	/*
	 * (non-Javadoc)
	 *
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void connectSybaseSetUp() throws Exception {
		DriverClass = ConfigText.getString("Regre.Sybase.DriverClass");
		URL = ConfigText.getString("Regre.Sybase.URL");
		User = ConfigText.getString("Regre.Sybase.User");
		Password = ConfigText.getString("Regre.Sybase.Password");

	}
}
