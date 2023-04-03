
# CS5103 Software Engineering (Strings and Words)

In this project, we will go through all software engineering practices phasewise. This project will have three phases (Phase1, Phase2 and Phase3) where we will be updating and extending the program as per the requirement.


## Specifications
#### Phase 1:

This project counts the number of words in the given input file. First, it takes the input filename from the command line from the user and tokenize it based on the separators. The separators or the delimiter that are used here are space, tabs and newline character. These delimiters can come up either singly or in combination, this program is able to handle both.

Once, the string is tokenized, the occurrence of unique words is calculated.Hashmap is used as a Datastructure.

#### Phase 2:

Phase 2 is the extension of Phase1 where we have added two features,

i) *LineCount* : Counts the number of lines in the input file. 

ii) *CharacterCount* : Counts number of characters in the input file.

## Development Environment:

This project is build using Maven framework and developed using eclipse IDE. Unit testing is performed using JUnit library with Maven.

## Setting up for Maven:

### For Windows user:

* STEP 1: Install Maven

  - Visit the [Maven download page](https://maven.apache.org/download.cgi?.) and download the version of Maven you want to install. 
  - Click on the appropriate link to download the binary zip archive of the latest version of Maven.
  - Since there is no installation process, extract the Maven archive to a directory of your choice once the download is complete.

 
* STEP 2: Add MAVEN_HOME System Variable

  - Open the Start menu and search for environment variables.
  - Click the Edit the system environment variables result.
  - Under the Advanced tab in the System Properties window, click Environment Variables.
  - Click the New button under the System variables section to add a new system environment variable.
  - Enter MAVEN_HOME as the variable name and the path to the Maven directory as the variable value. Click OK to save the new system variable.

* STEP 3: Add MAVEN_HOME Directory in PATH Variable

  - Select the Path variable under the System variables section in the Environment Variables window. Click the Edit button to edit the variable.
  - Click the New button in the Edit environment variable window.
  - Enter %MAVEN_HOME%\bin in the new field. Click OK to save changes to the Path variable.
  - Click OK in the Environment Variables window to save the changes to the system variables.


* STEP 4: Verify Maven Installation

  In the command prompt, use the following command 
        
        mvn -version



## Implementation

This program implements a set of string manipulation functions on a document, to gather various statistics on the words stored in that document. As a first   requirement, we start with finding the unique words along with their frequencies. Then, the program is extended to count the number of lines and characters, in the second phase.

## Running the Project
First, Download the repo to your preferred location and extract.

### Prerequisites:

- [x] Maven has to be installed.

- [x] Should have latest Java JDK installed.

#### Using Maven via command line 

  i. Go to main folder where it has pom.xml file
  
  	cd <folderpath>

  ii. Build and Execute
    		
	mvn clean
 	mvn package

  iii. The jar file named WordCounter-0.0.1-SNAPSHOT.jar will be created in target folder. Execute the line below to get the output.
  
  **Phase 1**
        
        java -cp target\WordCounter-0.0.1-SNAPSHOT.jar phase1.WordCounter <inputfilepath>
        
  **Phase 2**
  
        java -cp target\WordCounter-0.0.1-SNAPSHOT.jar phase2.Driver <inputfilepath>

I have uploaded some of the sample/ possible test text file that can be used.

### Sample Run

##### Checking for Phase 2, Checking for SimpleText.txt #####

<img src="https://user-images.githubusercontent.com/91647704/229403972-b684f641-4d84-4af5-b1dc-07218b699976.png" width="650" height="300"/>

## User Story

All the UserStories for this project can be found under issues section of this repo.Check here:
	[UserStory](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/issues)

Also, you can refer to [Test Case Document](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase2_RequirementAndTestCases.pdf).


## Project Status

The status of the Project can be tracked here:
[Project Status](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/projects?query=is%3Aopen)
	
## Unit Testing 

[Please Refer documentation of Test Cases and requirement here:

[Test and Requirement Document Phase 1](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase1_RequirementAndTestCases.pdf)

[Test and Requirement Document Phase 2](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase2_RequirementAndTestCases.pdf)

Example Test case:  [Please click on the document link above for further details]

1. For Empty Files
2. For input with separators only (no words or numbers)
3. For SimpleText with simple space only
4. For the input with single space, tab annd newline between words
5. For the input with Combination of space,tabs and newlines
6. For the input with Words, Number and separators combined
7. For the input with Words, Number, Separator and Special Character


All Test case are $\colorbox{white}{{\color{green}{PASSED !!}}}$ &check; 

Command used to test:

	mvn test

<img src="https://user-images.githubusercontent.com/91647704/229402961-3ddc63e2-4306-443c-ab80-fda2e7ae2a4f.png" width="650" height="300" />


## Bug Testing: 

[Please Refer  [Test Phase 1](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase1_RequirementAndTestCases.pdf) and [Test Phase 2](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase2_RequirementAndTestCases.pdf) for further detailed documentation]

For Bug Detection, PMD plugin from eclipse marketplace was used.


