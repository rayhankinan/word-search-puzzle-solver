import java.util.Scanner;
import DataStructure.Trie.Trie;
import DataStructure.WordGrid.WordGrid;
import FileReader.FileReader;
import ConsoleWriter.ConsoleWriter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();

        FileReader fileReader = new FileReader(filename);
        WordGrid wordGrid = fileReader.getWordGrid();
        Trie trie = fileReader.getTrie();
        fileReader.close();

        wordGrid.parseTrie(trie);

        ConsoleWriter consoleWriter = new ConsoleWriter(wordGrid);
        consoleWriter.write();

        // TEST
        // for (int i = 0; i < wordGrid.getLength(); i++) {
        //     for (int j = 0; j < wordGrid.getWidth(); j++) {
        //         System.out.print(wordGrid.getGrid(i, j).getWordIndex() + " ");
        //     }
        //     System.out.println();
        // }

        // TEST
        // trie.printTrie();

        scanner.close();
    }
}
