package phase1;

import java.io.*;
import java.util.*;

/**
 * @author SamitaShrestha
 *
 */
public class WordCounter {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*Reads input from commandline*/
		String inputFileName = args[0];
		File inputFile = new File(inputFileName);

		Scanner fileScanner;
		/*Check validity of file*/
		try {
			fileScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}

		System.out.println("The word counts are: \n");
		System.out.println(getWordCount(fileScanner));
		fileScanner.close();
	}

	/*Method to get the WordCount */
	
	/**
	 * @param fileScanner
	 * @return
	 */
	public static Map<String, Integer> getWordCount(Scanner fileScanner) {
		
		Map<String, Integer> wordFreq = new HashMap<String, Integer>();
		
		/*Scans file line by line */
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			
			/*Checks for separator and tokenizes */
			String[] words = line.split("\\s+");

			for (String w : words) {
				/*To skip the newline*/
				if (!w.isEmpty()) {
					if (wordFreq.containsKey(w)) {
						int count = wordFreq.get(w);
						wordFreq.put(w, count + 1);
					} else {
						wordFreq.put(w, 1);
					}
				}
			}
		}
		return wordFreq;

	}

}


