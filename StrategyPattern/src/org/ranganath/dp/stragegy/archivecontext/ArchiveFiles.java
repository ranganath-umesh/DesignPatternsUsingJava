/**
 * 
 */
package org.ranganath.dp.stragegy.archivecontext;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.ranganath.dp.stragegy.context.CompressionContexts;
import org.ranganath.dp.stragegy.contract.ZipCompression;

/**
 * @author Ranganath
 *
 */
public class ArchiveFiles {

	/**
	 * Provide input path, output path and files for compression
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Path inputPath = Paths.get("D:/Temp");
		Path outputPath = Paths.get("D:/Archive");
		CompressionContexts cc = new CompressionContexts();
		cc.setCompressionPattern(new ZipCompression());
		cc.createArchive(new ArrayList<File>(), inputPath, outputPath);

	}

}
