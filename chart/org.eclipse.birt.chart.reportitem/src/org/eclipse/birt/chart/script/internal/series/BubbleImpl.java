/*******************************************************************************
 * Copyright (c) 2006 Actuate Corporation.
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

package org.eclipse.birt.chart.script.internal.series;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.type.BubbleSeries;
import org.eclipse.birt.chart.script.api.series.IBubble;
import org.eclipse.birt.chart.script.api.series.data.ISeriesData;
import org.eclipse.birt.chart.script.internal.component.ValueSeriesImpl;
import org.eclipse.birt.chart.script.internal.series.data.BubbleDataImpl;

/**
 *
 */

public class BubbleImpl extends ValueSeriesImpl implements IBubble {

	public BubbleImpl(SeriesDefinition sd, Chart cm) {
		super(sd, cm);
		assert series instanceof BubbleSeries;
	}

	@Override
	public ISeriesData getDataExpr() {
		return new BubbleDataImpl(sd);
	}

}
