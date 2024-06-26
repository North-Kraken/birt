/*******************************************************************************
  * Copyright (c) 2012 Megha Nidhi Dahal and others.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the Eclipse Public License v2.0
  * which accompanies this distribution, and is available at
  * http://www.eclipse.org/legal/epl-2.0.html
  *
  * Contributors:
  *    Megha Nidhi Dahal - initial API and implementation and/or initial documentation
  *    Actuate Corporation - code cleanup
  *******************************************************************************/

package org.eclipse.birt.report.data.oda.excel.impl;

import org.eclipse.birt.report.data.oda.excel.impl.util.DataTypes;
import org.eclipse.datatools.connectivity.oda.IParameterMetaData;
import org.eclipse.datatools.connectivity.oda.OdaException;

/**
 * Implementation class of IParameterMetaData for Excel ODA runtime driver,
 * which does not currently support input nor output parameters.
 */
public class ParameterMetaData implements IParameterMetaData {

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IParameterMetaData#getParameterCount()
	 */
	@Override
	public int getParameterCount() throws OdaException {
		return 0;
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IParameterMetaData#getParameterMode(
	 * int)
	 */
	@Override
	public int getParameterMode(int param) throws OdaException {
		return IParameterMetaData.parameterModeUnknown;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IParameterMetaData#getParameterName(
	 * int)
	 */
	@Override
	public String getParameterName(int param) throws OdaException {
		return null; // name is not available
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IParameterMetaData#getParameterType(
	 * int)
	 */
	@Override
	public int getParameterType(int param) throws OdaException {
		return DataTypes.getTypeCode(null);
	}

	/*
	 * @see org.eclipse.datatools.connectivity.oda.IParameterMetaData#
	 * getParameterTypeName(int)
	 */
	@Override
	public String getParameterTypeName(int param) throws OdaException {
		int nativeTypeCode = getParameterType(param);
		return DataTypes.getNativeDataTypeName(nativeTypeCode);
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IParameterMetaData#getPrecision(int)
	 */
	@Override
	public int getPrecision(int param) throws OdaException {
		return -1;
	}

	/*
	 * @see org.eclipse.datatools.connectivity.oda.IParameterMetaData#getScale(int)
	 */
	@Override
	public int getScale(int param) throws OdaException {
		return -1;
	}

	/*
	 * @see
	 * org.eclipse.datatools.connectivity.oda.IParameterMetaData#isNullable(int)
	 */
	@Override
	public int isNullable(int param) throws OdaException {
		return IParameterMetaData.parameterNullableUnknown;
	}

}
