package phase3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
	/**
	 * This method calculates the frequency count of each word in a file. 
	 * @param  fileScanner the scanner object used to read the file
	 * @return Map object containing the word frequency counts for all words in the file
	 */
    public static Map<String, Integer> getWordCount(Scanner fileScanner) {
        Map<String, Integer> wordFreq = new HashMap<String, Integer>();
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] words = line.split("\\s+");
            for (String w : words) {
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