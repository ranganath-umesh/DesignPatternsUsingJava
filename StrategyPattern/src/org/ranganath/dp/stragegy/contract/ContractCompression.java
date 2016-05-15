/**
 * Contract compression interface has method to zip the file
 * 
 */
package org.ranganath.dp.stragegy.contract;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

/**
 * @author Ranganath
 *
 */
public interface ContractCompression {

	/**
	 * CompressFiles compress the files and return the size of the compressed files
	 * @param files
	 * @param inputDir
	 * @param outputDir
	 * @return
	 */
	public long compressFiles(List<File> files,Path inputDir, Path outputDir);
}
