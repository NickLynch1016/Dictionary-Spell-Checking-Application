# Dictionary & Spell Checking Application

## Overview
A dictionary and spell checking application developed in Java as part of a Data Structures and Algorithms course. The application processes text documents, extracts individual words, checks them against a dictionary, and identifies misspelled words using Abstract Data Types (ADTs).

## Features
- **Dictionary Management:** Loads dictionary words from a text file and stores them in a Set ADT.
- **Word Extraction:** Processes text documents and separates words using whitespace and punctuation as delimiters.
- **Spell Checking:** Compares extracted words against the dictionary to identify misspellings.
- **Word Counting:** Tracks the total number of words and unique words in a document.
- **Misspelled Word Tracking:** Stores misspelled words in a Bag ADT, preserving repeated occurrences.
- **Text Normalization:** Converts words to lowercase and filters out words shorter than four characters.

## Data Structures
- **List ADT:** Stores words extracted from the document.
- **Bag ADT:** Stores misspelled words, including duplicate occurrences.
- **Set ADT:** Maintains dictionary words and supports membership checks.

## Technologies Used
- Java
- Java Collections and File I/O APIs
- Abstract Data Types (ADTs)
- Data Structures and Algorithms

## Project Structure
- `submit/` – Main project implementation and supporting files.
- `src/` – Project source files.
- `lib/` – Supporting libraries and dependencies.

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
3. Ensure the required dictionary and supporting files are available.
4. Compile and run the project using the provided project configuration.

## Learning Outcomes
- Applied abstract data types to solve practical programming problems.
- Gained experience implementing dictionary lookup and spell checking functionality.
- Developed skills in Java file handling, text processing, and data organization.
- Applied concepts of data storage, searching, and word frequency tracking.
