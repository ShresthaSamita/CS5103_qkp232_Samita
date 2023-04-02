package phase2;

import java.io.*;
import java.util.*;

public class Driver {

	 public static void main(String[] args) {
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

	        System.out.println("The words are: " + wordFreq);
	        System.out.println("The number of lines are: " + numLines);
	        System.out.println("The number of characters are: " + numChars);
	    }
}