import itsc2214.*;

/**
 * Sample main program.
 */
public class Main {
    public static void main(String[] args) {
        PackageInfo.printInfo();

        Project2 p2 = new Project2();
        p2.loadFromFile("paragraph.txt");
        System.out.println("Total words " + p2.numWords());
        System.out.println("Unique words " + p2.numUniqueWords());
        BagADT<String> misspelled = p2.getMisspelledWords();
        System.out.println("Misspelled words " + misspelled.size() + "\n");

        Project2 runner = new Project2();
        boolean emptyTxtBool = runner.loadFromFile("empty.txt");
    }
}
