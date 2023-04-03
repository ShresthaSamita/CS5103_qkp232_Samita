package phase2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class DriverTest {

	/**
	 * Test case for EmptyFiles
	 * 
	 * @throws IOException
	 */
	@Test
	public void testForEmptyFile() throws IOException {

		File file = new File("EmptyFile.txt");
		Map<String, Integer> wordCount = WordCount.getWordCount(new Scanner(file));
		int charCount = CharacterCount.getCharacterCount(new Scanner(file));
		int lineCount = LineCount.getLineCount(new Scanner(file));
		assertTrue((wordCount.isEmpty() && charCount == 0 && lineCount == 0));
	}

	/**
	 * Test case for word=0, Character=0 but with newline character
	 * 
	 * @throws IOException
	 */
	@Test
	public void testForSeparatorsOnly() throws IOException {

		File file = new File("SeparatorOnly.txt");

		Map<String, Integer> wordCount = WordCount.getWordCount(new Scanner(file));
		int charCount = CharacterCount.getCharacterCount(new Scanner(file));
		int lineCount = LineCount.getLineCount(new Scanner(file));
		assertTrue(wordCount.isEmpty() && charCount == 0 && lineCount == 9);

	}

	/**
	 * Test case for Single Line, Single Separator, Multi word and Multi Character
	 * 
	 * @throws IOException
	 */
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
				put("simple", 1);
				put("text", 1);
				put("with", 1);
				put("repeated", 2);
				put("words.", 1);

			}
		};

		// System.out.println(lineCount);
		assertEquals(correctResult, wordCount);
		assertTrue(charCount == 66 && lineCount == 1);

	}

	/**
	 * Test case for Multi Line, Multicharacter, Multiword but single separator
	 * 
	 * @throws IOException
	 */
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
		assertTrue(charCount == 49 && lineCount == 2);

	}

	/**
	 * Test case for Multi Line, Multicharacter, Multiword and combination separator
	 * 
	 * @throws IOException
	 */
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
		assertTrue(charCount == 48 && lineCount == 14);

	}

	/**
	 * Test case for the input with Words, Numbers and Separators
	 * 
	 * @throws IOException
	 */
	@Test
	public void testForWordAndNumber() throws IOException {
		File file = new File("WordAndNumber.txt");
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
				put("a", 2);
				put("and", 1);
				put("not", 2);
				put("word", 1);
				put("do", 1);

			}
		};

		assertEquals(correctResult, wordCount);
		assertTrue(charCount == 77 && lineCount == 1);

	}

	/**
	 * Test case for Multiple word, multiple character, Multi Line, Multi Separator
	 * and Special characters
	 * 
	 * @throws IOException
	 */
	@Test
	public void testForLargerFile() throws IOException {
		File file = new File("LargerFile.txt");
		Map<String, Integer> wordCount = WordCount.getWordCount(new Scanner(file));
		int lineCount = LineCount.getLineCount(new Scanner(file));
		int charCount = CharacterCount.getCharacterCount(new Scanner(file));

		Map<String, Integer> correctResult = new HashMap<String, Integer>() {
			{
				put("say?", 1);
				put("train,", 1);
				put("bo$$", 1);
				put("turned", 1);
				put("woke", 1);
				put("Forgot", 1);
				put("relieved,", 1);
				put("I", 3);
				put("smile,", 1);
				put("your", 1);
				put("out", 2);
				put("depressed.", 1);
				put("can", 1);
				put("late", 1);
				put("okay,", 1);
				put("of", 1);
				put("me", 1);
				put("Missed", 1);
				put("up", 1);
				put("Its", 1);
				put("day", 1);
				put("a", 1);
				put("all", 1);
				put("But", 1);
				put("s@id,", 1);
				put("breath,", 1);
				put("felt", 1);
				put("feeling", 1);
				put("then", 1);
				put("my", 3);
				put("lunch,", 1);
				put("time.", 1);
				put("the", 1);
				put("take", 1);
				put("what", 1);
				put("today,", 1);
				put("And", 1);
				put("gave", 1);
				put("work,", 1);
				put("fine.", 1);
				put("to", 1);
				put("Ran", 1);

			}
		};

		assertEquals(correctResult, wordCount);
		assertTrue(charCount == 188 && lineCount == 20);

	}
}
