package phase2;

import java.util.*;

public class WordCount {
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