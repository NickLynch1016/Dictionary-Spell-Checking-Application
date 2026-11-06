import org.junit.*;

import itsc2214.BagADT;

import static org.junit.Assert.*;

//import java.nio.file.Path;

/**
 * Unit test for the Project2 class.
 */
public class Project2Test {

    /**
     * testWordByWord() testing adding words by hand.
     */
    @Test
    public void testWordByWord() {
        Project2 runner = new Project2();
        runner.addWord("Hello");
        runner.addWord("Hello");
        runner.addWord("World");

        int n = runner.numUniqueWords();
        assertEquals(2, n);
        assertEquals(3, runner.numWords());
    }

    /**
     * testLoadFromString() testing adding a long string.
     */
    @Test
    public void testLoadFromString() {
        Project2 runner = new Project2();
        runner.loadFromString("Hello, Hello, World");

        int n = runner.numWords();
        assertEquals("numWords() is wrong", 3, n);
    }

    /**
     * testLoadFromString() testing adding a long string and the method
     * getFilename(), and the getMisspelledWords() method.
     */
    @Test
    public void testLoadFromFile() {
        Project2 runner = new Project2();
        runner.loadFromFile("shortdoc.txt");

        // testing getFileName()
        assertEquals("shortdoc.txt", runner.getFilename());

        // you must update these numbers
        int n = runner.numUniqueWords();
        assertEquals(7, n);

        // testGetMisspelledWords
        BagADT<String> misspelled = runner.getMisspelledWords();
    }

    /**
     * These methods tested here are not required for this project
     * but are called here so you get full coverage points.
     */
    @Test
    public void testCallingMethodsNotUsed() {
        Project2 runner = new Project2();
        assertEquals(0, runner.numOfPolySyllabic(0));
        assertEquals(0, runner.numOfSyllables());
        assertEquals("", runner.getContents());
    }

    /**
     * Runs adding an empty and null String in addWord().
     */
    @Test
    public void testAddingEmptyStringAndFile() {
        Project2 runner = new Project2();
        String word = "";
        runner.addWord(word);
        String nullWord = null;
        runner.addWord(nullWord);
    }

    /**
     * Runs loadFromFile() with an empty file.
     */
    @Test
    public void testEmptyFile() {
        Project2 runner = new Project2();
        boolean emptyTxtBool = runner.loadFromFile("empty.txt");
    }

    /**
     * Tests catch IOExceptions.
     */
    @Test
    public void testeIOExceptions() {
        Project2 runner = new Project2();
        runner.loadFromFile("hello.txt");
        assertFalse(runner.makeDictionary("hello.txt"));
    }
}
