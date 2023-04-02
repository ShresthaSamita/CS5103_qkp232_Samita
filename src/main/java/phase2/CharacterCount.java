package phase2;

import java.util.Scanner;

public class CharacterCount {
    public static int getCharacterCount(Scanner fileScanner) {
        int numChars = 0;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            numChars += line.replaceAll("\\s", "").length();
        }
        return numChars;
    }
}