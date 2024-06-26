/*******************************************************************************
 * Copyright (c) 2021 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   See git history
 *******************************************************************************/

package org.eclipse.birt.report.designer.internal.ui.util;

import org.eclipse.birt.report.model.api.metadata.ILocalizableInfo;

public class IIndexInfo implements ILocalizableInfo {

	private int idx;

	public int getIndex() {
		return idx;
	}

	public IIndexInfo(int idx) {
		this.idx = idx;
	}

	@Override
	public String getDisplayName() {
		return null;
	}

	@Override
	public String getDisplayNameKey() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getToolTip() {
		return null;
	}

	@Override
	public String getToolTipKey() {
		return null;
	}

}
