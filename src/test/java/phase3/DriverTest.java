package phase3;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class DriverTest {


	@Test
	public void testSingleOccurence() throws IOException {
		String filename = "SingleOccurence.txt";
		String original = "And She said she is going to rule the world and make herself proud";
		Path testFile = Paths.get(filename);
	    Files.writeString(testFile, original);
		
		WordReplace.replaceWord(filename, "world", "universe");
		String actualContent = Files.readString(testFile);
		String expectedContent = "And She said she is going to rule the universe and make herself proud";
		assertEquals(expectedContent, actualContent);
	}

	@Test
	public void testMultipleOccurence() throws IOException {
		String filename = "MultipleOccurence.txt";
		String original = "This file has multiple strings in it. All the strings has to be "
				+ "replaced by the new string to create a file with new strings .";
		Path testFile = Paths.get(filename);
	    Files.writeString(testFile, original);
		
		WordReplace.replaceWord(filename, "strings", "words");
		String actualContent = Files.readString(testFile);
		String expectedContent = "This file has multiple words in it. All the words has to be "
				+ "replaced by the new string to create a file with new words .";
		assertEquals(expectedContent, actualContent);
	}

	@Test
	public void testForUpperLower() throws IOException {
		String filename = "UpperLower.txt";
		
		String original = "I like ham burger and ham salad but he doesnot like HaM ";
		Path testFile = Paths.get(filename);
	    Files.writeString(testFile, original);
	    
		WordReplace.replaceWord(filename, "ham", "chicken");
		String actualContent = Files.readString(testFile);
		String expectedContent = "I like chicken burger and chicken salad but he doesnot like HaM ";
		assertEquals(expectedContent, actualContent);
	}
	
	@Test
	public void testForNumbers() throws IOException {
		String filename = "WithNumber.txt";
		
		String original = "I was 20 years old when I first moved 20 miles away from home 2029";
		Path testFile = Paths.get(filename);
	    Files.writeString(testFile, original);
	    
		WordReplace.replaceWord(filename, "20", "21");
		String actualContent = Files.readString(testFile);
		String expectedContent = "I was 21 years old when I first moved 21 miles away from home 2029";
		assertEquals(expectedContent, actualContent);
	}
	
	@Test
	public void testNoMatch() throws IOException {
		String filename = "NoMatch.txt";
		
		String original = "Hello, this is just a random file.";
		Path testFile = Paths.get(filename);
	    Files.writeString(testFile, original);
	    
		WordReplace.replaceWord(filename, "strings", "words");
		String actualContent = Files.readString(testFile);
		String expectedContent = "Hello, this is just a random file.";
		assertEquals(expectedContent, actualContent);
		
	}
}
