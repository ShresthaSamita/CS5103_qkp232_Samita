# CS5103 Software Engineering (Strings and Words)

## Checkpoint 1:  Requirement Engineering:


Specifications:
==============
 
This project counts the number of words in the given input file. First, it takes the input filename from the command line from the user and tokenize it based on the separators. The separators or the delimiter that are used here are space, tabs and newline character. These delimiters can come up either singly or in combination, this program is able to handle both.

Once, the string is tokenized, the occurrence of unique words is calculated.Hashmap is used as a Datastructure


Development Environment:
========================

This project is build using Maven framework and developed using eclipse IDE. Unit testing is performed using JUnit library with Maven.

Setting up for Maven:
================
### For Windows user:

* STEP 1: Install Maven

  1. Visit the Maven download page and download the version of Maven you want to install. 
  2. Click on the appropriate link to download the binary zip archive of the latest version of Maven.
  3. Since there is no installation process, extract the Maven archive to a directory of your choice once the download is complete.

 
* STEP 2: Add MAVEN_HOME System Variable

  1. Open the Start menu and search for environment variables.
  2. Click the Edit the system environment variables result.
  3. Under the Advanced tab in the System Properties window, click Environment Variables.
  4. Click the New button under the System variables section to add a new system environment variable.
  5. Enter MAVEN_HOME as the variable name and the path to the Maven directory as the variable value. Click OK to save the new system variable.

* STEP 3: Add MAVEN_HOME Directory in PATH Variable

  1. Select the Path variable under the System variables section in the Environment Variables window. Click the Edit button to edit the variable.
  2. Click the New button in the Edit environment variable window.
  3. Enter %MAVEN_HOME%\bin in the new field. Click OK to save changes to the Path variable.
  4. Click OK in the Environment Variables window to save the changes to the system variables.


* STEP 4: Verify Maven Installation

  In the command prompt, use the following command 
        
        mvn -version


Implementation
==============
This program implements a set of string manipulation functions on a document, to gather various statistics on the words stored in that document. As a first   requirement, we start with finding the unique words along with their frequencies.

Running the Project
===================
  Download the repo to your preferred IDE
 
  Once downloaded it can be run either using Maven or Java

#### Using Maven

  i. Go to main folder where it has pom.xml file
  
  	cd <folderpath>

  ii. Build and Execute
    		
	mvn clean
 	mvn package

  iii. The jar file named WordCounter-0.0.1-SNAPSHOT.jar will be created in target folder. Execute the line below to get the output.
  
  	java -cp target\WordCounter-0.0.1-SNAPSHOT.jar phase1.WordCounter <inputfilepath>

Here I have uploaded some of the sample/ possible test text file that can be used.

Unit Testing [Refer to Test.pdf for more details]
============
1. For Empty Files
2. For input with separators only (no words or numbers)
3. For SimpleText with simple space only
4. For the input with single space, tab annd newline between words
5. For the input with Combination of space,tabs and newlines
6. For the input with Words, Number and separators combined

All Test case are PASSED!!

![image](https://user-images.githubusercontent.com/91647704/224465650-7d6451f3-964e-4c7b-a91f-26da25c3a111.png)

Bug Testing: [Refer to Test.pdf for more details]
===========
For Bug Detection, PMD plugin from eclipse marketplace was used.

