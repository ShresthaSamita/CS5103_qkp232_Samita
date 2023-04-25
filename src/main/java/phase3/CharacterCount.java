package phase3;

import java.util.Scanner;

public class CharacterCount {
	 /**
	  * This method calculates the total number of non-space characters in the given file
	  * @param fileScanner a Scanner object for the file to be scanned
	  * @return an int representing the total number of non-space characters in the file
	  */
   public static int getCharacterCount(Scanner fileScanner) {
       int numChars = 0;
       while (fileScanner.hasNextLine()) {
           String line = fileScanner.nextLine();
           numChars += line.replaceAll("\\s", "").length();
       }
       return numChars;
   }
}