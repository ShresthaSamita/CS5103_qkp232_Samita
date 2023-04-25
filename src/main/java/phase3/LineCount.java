package phase3;

import java.util.Scanner;

public class LineCount {
	/**
	 * This method calculates the total number of lines in the given file.
	 * @param fileScanner a Scanner object for the file to be scanned
	 * @return an integer representing the total number of lines in the file
	 */
    public static int getLineCount(Scanner fileScanner) {
        int numLines = 0;
        while (fileScanner.hasNextLine()) {
            fileScanner.nextLine();
            numLines++;
        }
        return numLines;
    }
}
