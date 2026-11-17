# Dictionary & Spell Checking Application

## Overview
A dictionary and spell checking application developed in Java as part of a Data Structures and Algorithms course. The application processes text documents, extracts individual words, checks them against a dictionary, and identifies misspelled words using Abstract Data Types (ADTs).

## Features
- **Dictionary Management:** Loads dictionary words from a text file and stores them in a Set ADT.
- **Word Extraction:** Separates text into individual words using non-alphabetic characters as delimiters.
- **Spell Checking:** Compares extracted words against the dictionary to identify misspellings.
- **Word Counting:** Tracks the total number of words and unique words in a document.
- **Misspelled Word Tracking:** Stores misspelled words in a Bag ADT, preserving repeated occurrences.
- **Text Normalization:** Converts words to lowercase and excludes words shorter than four characters from the stored document-word list.

## Data Structures
- **List ADT:** Stores words extracted from the document.
- **Bag ADT:** Stores misspelled words, including duplicate occurrences.
- **Set ADT:** Maintains dictionary words and supports efficient membership checks.

## Technologies Used
- Java
- Java File I/O
- Custom Abstract Data Types (ADTs)
- Data Structures and Algorithms

## Dependencies
The project uses the following supporting libraries, included in the `lib/` directory:
- `itsc2214-v45.jar` – Course-provided ADT library.
- `junit-4.13.2.jar` – Unit testing framework.
- `hamcrest-core-1.3.jar` – JUnit supporting library.

## Project Structure
- `data/` – Dictionary and sample text files.
- `lib/` – External libraries and dependencies.
- `src/` – Project source files.
- `submit/` – Main project implementation and supporting files.

## Getting Started

### Prerequisites
- Java Development Kit (JDK)
- A Java IDE such as IntelliJ IDEA or Eclipse

### Running the Application
1. Clone the repository:
   ```bash
   git clone https://github.com/NickLynch1016/Dictionary-Spell-Checking-Application.git
   ```
2. Open the project in your preferred Java IDE.
3. Ensure the required `.jar` files in the `lib/` directory are included in the project's build path.
4. Ensure the dictionary and sample text files are located in the expected directories.
5. Compile and run the project.

## Learning Outcomes
- Applied abstract data types to solve a practical programming problem.
- Gained experience implementing dictionary lookup and spell checking functionality.
- Developed skills in Java file handling and text processing.
- Applied concepts of data storage, searching, and data organization.
