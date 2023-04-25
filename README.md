
# CS5103 Software Engineering (Strings and Words)

In this project, we will go through all software engineering practices phasewise. This project will have three phases (Phase1, Phase2 and Phase3) where we will be updating and extending the program as per the requirement.


## Specifications
#### Phase 1:

This project counts the number of words in the given input file. First, it takes the input filename from the command line from the user and tokenize it based on the separators. The separators or the delimiter that are used here are space, tabs and newline character. These delimiters can come up either singly or in combination, this program is able to handle both.

Once, the string is tokenized, the occurrence of unique words is calculated.Hashmap is used as a Datastructure.

#### Phase 2:

Phase 2 is the extension of Phase1 where we have our First requirement change. Here we have added two more features,

i) *LineCount* : Counts the number of lines in the input file. 

ii) *CharacterCount* : Counts number of characters in the input file.

#### Phase 3:

Phase 3 is the extension of Phase2 where we have our Second requirement change. Here we have added one more feature,

*WordReplace* which replaces all occurrences of a specified word pattern in a given file with a replacement string

## Development Environment:

This project is build using Maven framework and developed using eclipse IDE. Unit testing is performed using JUnit library with Maven.

## Setting up for Maven:

### For Windows user:

* STEP 1: Install Maven

  - Visit the [Maven download page](https://maven.apache.org/download.cgi?.) and download the version of Maven you want to install. 
  - Click on the appropriate link to download the binary zip archive of the latest version of Maven.
  - Since there is no installation process, extract the Maven archive to a directory of your choice once the download is complete.

 
* STEP 2: Add MAVEN_HOME and Path Variable
  - Update the environment variables
  - Add MAVEN_HOME as the variable name and the path to the Maven directory as the variable value. 
  - Similarly, Add Path Variable to %MAVEN_HOME%\bin in the new field. 

* STEP 3: Verify Maven Installation

  In the command prompt, use the following command 
        
        mvn -version



## Implementation

This program provides a set of functions to manipulate strings in a document, including gathering various statistics and performing word replacements. Upon running the program, the user is presented with two options: 
* Option 1: provides access to the Word Statistics feature, where the user can obtain information such as the word count, frequency of occurrence, line count, and    		   character count. 
* Option 2: provides access to the Word Replacement feature, where the user is prompted to enter the pattern of the word they wish to replace and the word they want to 	    replace it with. In order to replace a word, the pattern must match exactly with the word in the input file.

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
 
  **Phase 3**
  
        java -cp target\WordCounter-0.0.1-SNAPSHOT.jar phase3.Driver <inputfilepath>

I have uploaded some of the sample/ possible test text file that can be used.

### Sample Run

##### Checking for Phase 3, Checking for SingleOccurence.txt #####

<img src="https://user-images.githubusercontent.com/91647704/234200363-0f4db4d8-fdc8-43b4-9ca7-711f010504f7.png" width="650" height="300"/>

## User Story

All the UserStories for this project can be found under issues section of this repo.Check here:
	[UserStory](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/issues)

Also, you can refer to [Test Case Document](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase3_RequirementAndTestCases.pdf).


## Project Status

The status of the Project can be tracked here:
[Project Status](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/projects?query=is%3Aopen)
	
## Unit Testing 

[Please Refer documentation of Test Cases and requirement here:

[Test and Requirement Document Phase 1](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase1_RequirementAndTestCases.pdf)

[Test and Requirement Document Phase 2](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase2_RequirementAndTestCases.pdf)

[Test and Requirement Document Phase 3](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase3_RequirementAndTestCases.pdf)

Example Test case:  [Please click on the document link above for further details]

1. For Single Occurence of token pattern
2. For input with multiple occurence of token pattern
3. For input with Numbers
4. For input with no Match
5. For input with Uppercase and Lowercase

All Test case are $\colorbox{white}{{\color{green}{PASSED !!}}}$ &check; 

Command used to test:

	mvn test

<img src="https://user-images.githubusercontent.com/91647704/234201577-977a0a4e-3288-438b-92d7-52f189541791.png" width="650" height="300" />


## Bug Testing: <img src="https://user-images.githubusercontent.com/91647704/234212062-02799862-1b21-423c-945e-631d097bec9b.png" width="15" height="20" />


[Please Refer  [Test Phase 1](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase1_RequirementAndTestCases.pdf), [Test Phase 2](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase2_RequirementAndTestCases.pdf) and [Test Phase 3](https://github.com/ShresthaSamita/CS5103_qkp232_Samita/blob/main/Phase3_RequirementAndTestCases.pdf) for further detailed documentation]

For Bug Detection, PMD plugin from eclipse marketplace was used.

<img src="https://user-images.githubusercontent.com/91647704/234201971-a6b09a11-1a00-44fc-a4e5-a5ba185dc46d.png" width="650" height="150" />

## Code Clone Detection: 

For Code Clone Detection, PMD's Copy/Paste Detector (CPD) was used. For ease I used the GUI version of it.

* How to use CPD tool?
- Download the latest version of PMD- CPD from [this link](https://github.com/pmd/pmd/releases)
- Extract the zipped file to desired location
- Once Downloaded, open command prompt and go to the bin folder from the extracted folder
``` 
cd C:\Users\samit\OneDrive\Documents\pmd-bin-6.55.0\bin
```
- Run the GUI file by simply executing
```
cpdgui.bat
```
<img src="https://user-images.githubusercontent.com/91647704/234206755-188014af-921d-4a17-b675-9d8f68a56c17.png" width="650" height="400" />	
