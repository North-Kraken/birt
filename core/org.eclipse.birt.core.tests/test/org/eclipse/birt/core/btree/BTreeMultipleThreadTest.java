/*******************************************************************************
 * Copyright (c) 2010 Actuate Corporation.
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

package org.eclipse.birt.core.btree;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class BTreeMultipleThreadTest extends TestCase {

	static int KEY_COUNT = 10000;

	@Test
	public void testCursor() throws Exception {
		new File("./utest/btree.dat").delete();
		FileBTreeFile file = new FileBTreeFile("./utest/btree.dat");
		try (file) {
			BTreeOption<String, String> option = new BTreeOption<>();
			option.setFile(file, true);
			BTree<String, String> btree = new BTree<>(option);
			try {
				createBTree(btree);
				for (int i = 0; i < 4; i++) {
					new Thread(new TestThread(btree.createCursor())).start();
				}
				while (TestThread.hasActiveThread()) {
					try {
						Thread.sleep(200);
					} catch (Exception ex) {
					}
				}
			} finally {
				btree.close();
			}

			if (TestThread.hasErrors()) {
				TestThread.printErrors();
				fail("HAS ERROR!");
			}
		}
	}

	static boolean hasError;

	static void createBTree(BTree<String, String> btree) throws IOException {
		for (int i = 0; i < KEY_COUNT; i++) {
			String value = String.valueOf(i);
			btree.insert(value, value);
		}
	}

	static class TestThread implements Runnable {

		static int threadCount;
		static ArrayList<Throwable> errors = new ArrayList<>();

		static synchronized void increaseThreadCount() {
			threadCount++;
		}

		static synchronized void decreaseThreadCount() {
			threadCount--;
		}

		static synchronized boolean hasActiveThread() {
			return threadCount > 0;
		}

		static boolean hasErrors() {
			return !errors.isEmpty();
		}

		synchronized static void throwError(Throwable ex) {
			errors.add(ex);
		}

		synchronized static void printErrors() throws Exception {
			for (Throwable ex : errors) {
				ex.printStackTrace();
			}
		}

		BTreeCursor<String, String> cursor;

		TestThread(BTreeCursor<String, String> cursor) {
			this.cursor = cursor;
			increaseThreadCount();
		}

		@Override
		public void run() {
			try {
				// first is the before last
				int rowCount = 0;
				while (cursor.next()) {
					String key = cursor.getKey();
					String value = cursor.getValue();
					if (!(key.equals(value))) {
						throw new IOException(key + " != " + value);
					}
					rowCount++;
				}
				if (rowCount != KEY_COUNT) {
					throw new IOException("KEY_COUNT INCORRECT");
				}
			} catch (Throwable ex) {
				throwError(ex);
			} finally {
				cursor.close();

			}
			decreaseThreadCount();
		}
	}

}
