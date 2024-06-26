/**************************************************************************
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
 *
 **************************************************************************/

package org.eclipse.birt.data.engine.api;

import org.eclipse.birt.core.script.ScriptContext;
import org.eclipse.birt.data.engine.core.DataException;
import org.mozilla.javascript.Scriptable;

/**
 * This class encapulates an DtE expression that has been analyzed, rewritten,
 * and compiled during report query preparation. An instance of its derived
 * class is given to the factory as a handle. The factory uses this handle to
 * evaluate the compiled expression at query execution time.
 *
 * @since 4.8
 */
public abstract class BaseCompiledExpression {

	/**
	 * gets the type of the compiled expression
	 */
	public abstract int getType();

	/**
	 * Evaluates this expression
	 */
	public abstract Object evaluate(ScriptContext context, Scriptable scope) throws DataException;

}
