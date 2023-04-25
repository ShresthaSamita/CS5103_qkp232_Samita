package phase3;

import java.io.*;
import java.util.*;

/**
 * 
 * @author SamitaShrestha
 *
 */

public class Driver {

	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			System.out.println("Please provide the input file name.");
			return;
		}

		String inputFileName = args[0];
		File inputFile = new File(inputFileName);

		Scanner fileScanner;
		try {
			fileScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			return;
		}

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("===================");
			System.out.println("Welcome to CS5103");
			System.out.println("===================");
			System.out.println("Please select one:");
			System.out.println("1. Word Statistics");
			System.out.println("2. Word Replacement");
			System.out.println("--------------------");
			System.out.print("\nEnter your choice: ");
			

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				int numChars = CharacterCount.getCharacterCount(fileScanner);
				fileScanner.close();

				fileScanner = new Scanner(inputFile);
				Map<String, Integer> wordFreq = WordCount.getWordCount(fileScanner);
				fileScanner.close();

				fileScanner = new Scanner(inputFile);
				int numLines = LineCount.getLineCount(fileScanner);
				fileScanner.close();
				System.out.println("--------------------------------------------------------");
				System.out.println(" Showing Word Statistic for : \""+ inputFile +"\"");
				System.out.println("--------------------------------------------------------");
				
				/* Formatted Display */
				System.out.println("\nThe words and their frequency are: ");
				System.out.println("+------------+-----------+");
				System.out.println("|     Word   | Frequency |");
				System.out.println("+------------+-----------+");
				for (String key : wordFreq.keySet()) {
					System.out.printf("| %10s | %9d |\n", key, wordFreq.get(key));
				}
				System.out.println("+------------+-----------+");
				System.out.println("\nThe number of lines are: " + numLines);
				System.out.println("The number of characters are: " + numChars);
				break;

			case 2:

				System.out.print("Enter the word you want to replace: ");
				Scanner sc = new Scanner(System.in);
				String word = sc.next();

				System.out.print("Enter the word you want to replace it with: ");
				String replacement = sc.next();

				WordReplace.replaceWord(inputFileName, word, replacement);
				
				break;

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 2.");
				break;
			}
		}
	}
}
