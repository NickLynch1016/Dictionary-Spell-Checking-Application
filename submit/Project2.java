import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import itsc2214.*;

/**
 * This is the Project2 class, it extends the Document class and uses the
 * methods loadFromFile(),
 * loadFromString(), and addWord() to organize words from given text files into
 * docWords and misspelledWords,
 * it also counts the number of unique words and total words.
 */
public class Project2 extends Document {

    /** File name. */
    private String fileName;

    /** Data structures to store the file contents. */
    private ListADT<String> docWords;
    private BagADT<String> misspelledWords;
    private SetADT<String> dictionary;
    private int uniqueWords;
    private int numWords;

    /**
     * Default constructor for the class, creates the initial data structures (bag,
     * set, and list), and initializes everything as if it had an empty document by
     * calling loadFromString("").
     */
    public Project2() {
        docWords = Factory.makeListArray();
        misspelledWords = Factory.makeBagArrayList();
        makeDictionary("data/dictionary.txt");
        uniqueWords = 0;
        numWords = 0;

        fileName = "";
    }

    /**
     * Make as separate method using dictionary.txt.
     * 
     * @param fileName is the String called to turn into the dictionary set.
     * @return false if the file was not found or severed.
     */

    public boolean makeDictionary(String fileName) {
        this.dictionary = Factory.makeSetArrayList();
        try {
            for (String line : Files.readAllLines(Paths.get(fileName))) {
                String w = line.trim().toLowerCase();
                dictionary.add(w);
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Returns the fileName as passed in the first argument of the constructor. If
     * there is no file name, it just return an empty string.
     * 
     * @return the name of the file used
     */
    @Override
    public String getFilename() {
        return fileName;
    }

    /**
     * This routine should open the file named in the argument, load the full
     * content into a string and then call the loadFromString() method to process
     * the string. This routine captures a FileNotFoundException and simply call
     * loadFromString("") with an empty string. This should initialize the data
     * structures to have no words. In effect, a file not found should behave
     * identically to an empty file. It returns true if it was able to load the
     * file, or false if an error occurred. Either way, the content of the class
     * (fileName, data structures, etc.) should be left in a usable state (possibly
     * with no content).
     * 
     * @param fileName is the name of the file to read in
     * @return true if the file is processed correctly, false otherwise.
     */
    public boolean loadFromFile(String fileName) {
        try {
            this.fileName = fileName;
            java.util.List<String> lines = Files.readAllLines(Paths.get(fileName));
            StringBuilder k = new StringBuilder();
            for (String line : lines) {
                k.append(line).append(" ");
            }

            return loadFromString(k.toString().trim());
        } catch (IOException e) {
            return loadFromString("");
        }
    }

    /**
     * This method breaks a string into tokens separated by white space (blank, tab,
     * newlines) and by punctuations (anything that is not a letter or a digit). The
     * non-alphanumeric characters are used as separator and ignored. The remaining
     * tokens (words) should be processed by calling addWord(word) (see below). It
     * returns true unless some unexpected situation is found in which case it
     * should return false.
     * 
     * @param data is the String thats going to be split apart into separate words
     * @return true if the string is processed correctly, false otherwise.
     */
    public boolean loadFromString(String data) {
        String[] words = data.split("[^A-Za-z]+");

        for (String word : words) {
            if (!word.isEmpty()) {
                addWord(word);
            }
        }

        return true;
    }

    /**
     * This method implements the algorithm to add the word to the list and the
     * mispelled words. The steps are as follows:
     * - If the string w is null, do nothing.
     * - Trim (trim()) the string and turn it into lower case.
     * - If the string is empty (length 0), or its length is less than 4 characters,
     * do nothing.
     * - Add the w to the end of the list of words in the document. Then your code
     * should check if the word is mispelled or not by looking it up in the
     * dictionary. If it does not exits in the dictionary (i.e. it is mispelled),
     * store it in the bag of mispelled words.
     * 
     * @param w word to be added to the list
     */
    public void addWord(String w) {
        if (w == null) {
            return;
        }

        String newW = w.trim().toLowerCase();

        numWords++;

        if (newW.length() < 4) {
            return;
        }

        if (!docWords.contains(newW)) {
            uniqueWords++;
        }

        docWords.add(newW);

        if (!dictionary.contains(newW)) {
            misspelledWords.add(newW);
        }
    }

    /**
     * This method returns the total number of words, not just unique ones. So it
     * returns the size of the bag that contains the contents of the file.
     * 
     * @return count of total number of words
     */
    public int numWords() {
        return numWords;
    }

    /**
     * This method returns the number of unique words in the document. You have to
     * keep track of this number in the addWords() method. 
     * 
     * @return count of unique words
     */
    public int numUniqueWords() {
        return uniqueWords;
    }

    /**
     * Returns a bag of misspelled words from the document.
     * 
     * @return a BagADT with the misspelled words
     */
    public BagADT<String> getMisspelledWords() {
        return misspelledWords;
    }
}
