package phase2;


import java.util.Scanner;

public class LineCount {
    public static int getLineCount(Scanner fileScanner) {
        int numLines = 0;
        while (fileScanner.hasNextLine()) {
            fileScanner.nextLine();
            numLines++;
        }
        return numLines;
    }
}
