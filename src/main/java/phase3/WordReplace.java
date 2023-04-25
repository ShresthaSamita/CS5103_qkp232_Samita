package phase3;

import java.io.IOException;
import java.nio.file.*;


public class WordReplace { 
	/**
	 * 
	 * This method replaces all occurrences of a specified word pattern in a given file with 
	 * a replacement string
	 * @param filename the path to the file to be modified
	 * @param pattern the word pattern to be replaced
	 * @param replacement the replacement string for the word pattern
	 * @return void
	 *
	 */
	public static void replaceWord(String filename, String pattern, String replacement) throws IOException {
		String content = Files.readString(Paths.get(filename));
		String modifiedContent = content.replaceAll("\\b" + pattern + "\\b", replacement);

	    if (content.equals(modifiedContent)) {
	        System.out.println("The word \""+ pattern+ "\" not found in file.");
	    } else {
	    	Files.writeString(Paths.get(filename), modifiedContent);
	        System.out.println("Word replaced in file.");
	    }
	}
}
