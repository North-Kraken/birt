/*******************************************************************************
 * Copyright (c) 2004,2009 Actuate Corporation.
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

package org.eclipse.birt.core.archive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.birt.core.i18n.CoreMessages;
import org.eclipse.birt.core.i18n.ResourceConstants;

public class FolderArchiveReader implements IDocArchiveReader {

	static Logger logger = Logger.getLogger(FolderArchiveReader.class.getName());
	private String folderName;
	private HashSet<RAFolderInputStream> inputStreams = new HashSet<>();
	// content escape, allow folder and file get the same name
	boolean contentEscape = false;

	/**
	 *
	 * @param folderName
	 * @param contentEscape old document should be false.
	 * @throws IOException
	 */
	public FolderArchiveReader(String folderName, boolean contentEscape) throws IOException {
		if (folderName == null || folderName.length() == 0) {
			throw new IllegalArgumentException(folderName);
		}

		File fd = new File(folderName);
		if (!fd.exists() || !fd.isDirectory()) {
			throw new FileNotFoundException(
					CoreMessages.getFormattedString(ResourceConstants.INVALID_ARCHIVE_NAME, folderName));
		}
		// make sure the folder name is an absolute path
		this.folderName = fd.getCanonicalPath();
		this.contentEscape = contentEscape;
	}

	/**
	 * @param folderName - the absolute name of the folder archive
	 */
	public FolderArchiveReader(String folderName) throws IOException {
		this(folderName, true);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.birt.core.archive.IDocArchiveReader#getName()
	 */
	/**
	 * return the folder name as the report archive name
	 */
	@Override
	public String getName() {
		return folderName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.birt.core.archive.IDocArchiveReader#open()
	 */
	@Override
	public void open() {
		// Do nothing
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.birt.core.archive.IDocArchiveReader#close()
	 */
	@Override
	public void close() throws IOException {
		IOException exception = null;
		synchronized (inputStreams) {
			ArrayList<RAFolderInputStream> inputs = new ArrayList<>(inputStreams);
			for (RAFolderInputStream in : inputs) {
				try {
					in.close();
				} catch (IOException ex) {
					if (exception != null) {
						exception = ex;
					}
					logger.log(Level.SEVERE, ex.getMessage(), ex);
				}
			}
			if (exception != null) {
				throw exception;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.birt.core.archive.IDocArchiveReader#getStream(java.lang.String)
	 */
	@Override
	public RAInputStream getStream(String relativePath) throws IOException {
		String path = getFilePath(relativePath);

		File file = new File(path);
		if (file.exists()) {
			return new RAFolderInputStream(inputStreams, file);
		}
		throw new FileNotFoundException(relativePath);
	}

	@Override
	public RAInputStream getInputStream(String relativePath) throws IOException {
		return getStream(relativePath);
	}

	@Override
	public boolean exists(String relativePath) {
		String fullPath = getFilePath(relativePath);
		File fd = new File(fullPath);
		return fd.exists();
	}

	/**
	 * return a list of strings which are the relative path of streams
	 */
	@Override
	public List<String> listStreams(String relativeStoragePath) throws IOException {
		ArrayList<String> streamList = new ArrayList<>();
		String storagePath = getFolderPath(relativeStoragePath);
		File dir = new File(storagePath);

		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles();
			if (files != null) {
				for (int i = 0; i < files.length; i++) {
					File file = files[i];
					if (file.isFile()) {
						String relativePath = ArchiveUtil.getEntryName(folderName, file.getPath());
						if (!ArchiveUtil.needSkip(relativePath)) {
							streamList.add(relativePath);
						}
					}
				}
			}
		}

		return streamList;
	}

	@Override
	public List<String> listAllStreams() throws IOException {
		ArrayList<File> list = new ArrayList<>();
		ArchiveUtil.listAllFiles(new File(folderName), list);

		ArrayList<String> streams = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			String relativePath;
			File file = list.get(i);
			relativePath = ArchiveUtil.getEntryName(folderName, file.getPath());
			if (!ArchiveUtil.needSkip(relativePath)) {
				streams.add(relativePath);
			}
		}
		return streams;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.birt.core.archive.IDocArchiveReader#lock(java.lang.String)
	 */
	@Override
	public Object lock(String stream) throws IOException {
		String path = getFilePath(stream) + ".lck";
		IArchiveLockManager lockManager = ArchiveLockManager.getInstance();
		return lockManager.lock(path);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.birt.core.archive.IDocArchiveReader#unlock(java.lang.Object)
	 */
	@Override
	public void unlock(Object lock) {
		IArchiveLockManager lockManager = ArchiveLockManager.getInstance();
		lockManager.unlock(lock);
	}

	private String getFilePath(String entryName) {
		return ArchiveUtil.getFilePath(folderName, entryName);
	}

	private String getFolderPath(String entryName) {
		return ArchiveUtil.getFolderPath(folderName, entryName);
	}
}
