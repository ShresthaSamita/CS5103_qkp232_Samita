package phase1;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.Test;

/**
 * @author SamitaShrestha
 *
 */
public class WordCounterTest {

	/*Test case for empty file */
	@Test
	public void testForEmptyFile() throws IOException {
		Scanner fileScanner = new Scanner(new File("EmptyFile.txt"));
		Map<String, Integer> ourResult = WordCounter.getWordCount(fileScanner);
		assertTrue(ourResult.isEmpty());
	}

	/*Test case for SimpleText with simple space only*/
	@Test
	public void testForSimpleText() throws IOException {
		Scanner fileScanner = new Scanner(new File("SimpleText.txt"));
		Map<String, Integer> ourResult = WordCounter.getWordCount(fileScanner);
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
		assertEquals(correctResult, ourResult);
	}

	/*Test case for the input with single space, tab annd newline between words*/
	@Test
	public void testForSimpleSeparator() throws IOException {
		Scanner fileScanner = new Scanner(new File("SimpleSeparator.txt"));
		Map<String, Integer> ourResult = WordCounter.getWordCount(fileScanner);
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
		assertEquals(correctResult, ourResult);
	}

	/*Test case for the input with Combination of space,tabs and newlines*/
	@Test
	public void testForCombinationSeparator() throws IOException {
		Scanner fileScanner = new Scanner(new File("CombinationSeparator.txt"));
		Map<String, Integer> ourResult = WordCounter.getWordCount(fileScanner);

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
		assertEquals(correctResult, ourResult);

	}

	/*Test case for the input with Words, Numbers and Separators*/
	@Test
	public void testForWordAndNumber() throws IOException {
		Scanner fileScanner = new Scanner(new File("WordAndNumber.txt"));
		Map<String, Integer> ourResult = WordCounter.getWordCount(fileScanner);

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
		assertEquals(correctResult, ourResult);

	}
}
