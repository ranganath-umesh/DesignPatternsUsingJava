/**
 * 
 */
package com.ranganath.dp.stragegy.context;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import com.ranganath.dp.stragegy.contract.ContractCompression;



/**
 * @author Ranganath
 *
 */
public class CompressionContexts {

	private ContractCompression compressionPattern;

	public void setCompressionPattern(ContractCompression compressionPattern) {
		this.compressionPattern = compressionPattern;
	}

	public long createArchive(List<File> files, Path inputDir, Path outputDir) {
		return compressionPattern.compressFiles(files, inputDir, outputDir);
	}

}
