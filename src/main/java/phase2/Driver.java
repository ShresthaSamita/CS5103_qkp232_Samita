package phase2;

import java.io.*;
import java.util.*;
/**
 * 
 * @author SamitaShrestha
 *
 */

public class Driver {

	 public static void main(String[] args) {
		 /*get the input from commandline */

	        String inputFileName = args[0];
	        File inputFile = new File(inputFileName);

	        Scanner fileScanner;
	        
	        try {
	            fileScanner = new Scanner(inputFile);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found.");
	            return;
	        }

	        int numChars = CharacterCount.getCharacterCount(fileScanner);
	        fileScanner.close();

	        try {
	            fileScanner = new Scanner(inputFile);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found.");
	            return;
	        }

	        Map<String, Integer> wordFreq = WordCount.getWordCount(fileScanner);
	        fileScanner.close();

	        try {
	            fileScanner = new Scanner(inputFile);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found.");
	            return;
	        }

	        int numLines = LineCount.getLineCount(fileScanner);
	        fileScanner.close();

	        /* Formatted Display */
	        System.out.println("\nThe words and their frequency are: ");
	        System.out.println("+------------+-----------+");
	        System.out.println("|     Word   | Frequency |");
	        System.out.println("+------------+-----------+");
	        for(String key : wordFreq.keySet()) {
	        	System.out.printf("| %10s | %9d |\n", key, wordFreq.get(key));
	        }
	        System.out.println("+------------+-----------+");
	        System.out.println("\nThe number of lines are: " + numLines);
	        System.out.println("The number of characters are: " + numChars);
	    }
}