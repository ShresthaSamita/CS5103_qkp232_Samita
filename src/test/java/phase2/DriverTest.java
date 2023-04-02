package phase2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class DriverTest {

	@Test
	public void testForEmptyFile() throws IOException {
		
		File file = new File("EmptyFile.txt");
		Map<String, Integer> wordCount = WordCount.getWordCount(new Scanner(file));
	    int charCount = CharacterCount.getCharacterCount(new Scanner(file));
	    int lineCount = LineCount.getLineCount(new Scanner(file));
		assertTrue((wordCount.isEmpty()&& charCount==0 && lineCount==0) );
	}
	
	@Test
	public void testForSeparatorsOnly() throws IOException {

		File file = new File("SeparatorOnly.txt");

		Map<String, Integer> wordCount = WordCount.getWordCount(new Scanner(file));
	    int charCount = CharacterCount.getCharacterCount(new Scanner(file));
	    int lineCount = LineCount.getLineCount(new Scanner(file));
		assertTrue(wordCount.isEmpty()&& charCount==0 && lineCount==9);

	}
	/*Test case for SimpleText with simple space only*/
	@Test
	public void testForSimpleText() throws IOException {
	
		File file = new File("SimpleText.txt");
		Map<String, Integer> wordCount = WordCount.getWordCount(new Scanner(file));
		int lineCount = LineCount.getLineCount(new Scanner(file));
		int charCount = CharacterCount.getCharacterCount(new Scanner(file));
		Map<String, Integer> correctResult = new HashMap<String, Integer>() {
			{
				put("Hello", 1);
				put("This", 2);
				put("is", 1);
				put("just", 3);
				put("the", 1);
				put("simple",1);
				put("text", 1);
				put("with", 1);
				put("repeated", 2);
				put("words.", 1);

			}
		};
		 
		 
		// System.out.println(lineCount);
		   assertEquals(correctResult, wordCount);
	       assertTrue(charCount==66 && lineCount==1);
		 
	}

	/*Test case for the input with single space, tab annd newline between words*/
	@Test
	public void testForSimpleSeparator() throws IOException {
		File file = new File("SimpleSeparator.txt");
		Map<String, Integer> wordCount = WordCount.getWordCount(new Scanner(file));
		int lineCount = LineCount.getLineCount(new Scanner(file));
		int charCount = CharacterCount.getCharacterCount(new Scanner(file));
		Map<String, Integer> correctResult = new HashMap<String, Integer>() {
			{
				put("This", 1);
				put("will", 1);
				put("have", 1);
				put("one", 1);
				put("separators", 1);
				put("between", 1);
				put("two", 1);
				put("words", 1);
				put("why", 1);
				put("is", 1);
				put("it", 1);
				put("so", 1);
				

			}
		};
		   assertEquals(correctResult, wordCount);
	       assertTrue(charCount==49 && lineCount==2);
	
	}

	/*Test case for the input with Combination of space,tabs and newlines*/
	@Test
	public void testForCombinationSeparator() throws IOException {
		File file = new File("CombinationSeparator.txt");
		Map<String, Integer> wordCount = WordCount.getWordCount(new Scanner(file));
		int lineCount = LineCount.getLineCount(new Scanner(file));
		int charCount = CharacterCount.getCharacterCount(new Scanner(file));
		Map<String, Integer> correctResult = new HashMap<String, Integer>() {
			{
				put("I", 2);
				put("am", 2);
				put("Samita", 1);
				put("Shrestha", 1);
				put("born", 1);
				put("and", 1);
				put("raised", 1);
				put("in", 1);
				put("Nepal.", 1);
				put("so", 1);
				put("happy", 1);

			}
		};
		assertEquals(correctResult, wordCount);
	    assertTrue(charCount==48 && lineCount==14);
	

	}

	/*Test case for the input with Words, Numbers and Separators*/
	@Test
	public void testForWordAndNumber() throws IOException {
		File file =new File("WordAndNumber.txt");
		Map<String, Integer> wordCount = WordCount.getWordCount(new Scanner(file));
		int lineCount = LineCount.getLineCount(new Scanner(file));
		int charCount = CharacterCount.getCharacterCount(new Scanner(file));

		Map<String, Integer> correctResult = new HashMap<String, Integer>() {
			{
				put("123", 1);
				put("is", 2);
				put("my", 1);
				put("favorite", 1);
				put("number", 2);
				put("I", 2);
				put("donot", 1);
				put("know", 2);
				put("why", 3);
				put("may", 1);
				put("be", 1);
				put("23", 1);
				put("a",2);
				put("and",1);
				put("not",2);
				put("word",1);
				put("do",1);
				
			}
		};
	
		assertEquals(correctResult, wordCount);
	    assertTrue(charCount==77 && lineCount==1);

	}
}
