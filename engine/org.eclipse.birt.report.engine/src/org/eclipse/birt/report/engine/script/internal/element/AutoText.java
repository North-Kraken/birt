/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
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

package org.eclipse.birt.report.engine.script.internal.element;

import org.eclipse.birt.report.engine.api.script.element.IAutoText;
import org.eclipse.birt.report.model.api.ReportItemHandle;

public class AutoText extends ReportItem implements IAutoText {

	public AutoText(ReportItemHandle handle) {
		super(handle);
	}

}
