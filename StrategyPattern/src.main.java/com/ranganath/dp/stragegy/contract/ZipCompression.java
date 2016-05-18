/**
 * 
 */
package com.ranganath.dp.stragegy.contract;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

/**
 * @author Ranganath
 *
 */
public class ZipCompression implements ContractCompression {

	/*
	 * zip compression. This example is not to demonstrate how to zip the file.
	 * Rather it explains how strategy pattern works
	 * 
	 * @see
	 * org.ranganath.dp.stragegy.contract.ContractCompression#compressFiles(java
	 * .util.List, java.nio.file.Path, java.nio.file.Path)
	 */
	@Override
	public long compressFiles(List<File> files, Path inputDir, Path outputDir) {
		// TODO Auto-generated method stub
		return 0;
	}

}
