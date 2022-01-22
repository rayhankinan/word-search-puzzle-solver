package FileReader;

import java.util.Scanner;
import java.io.File;
import DataStructure.Trie.Trie;
import DataStructure.WordGrid.WordGrid;

public class FileReader {
    private File file;
    private Scanner scanner;
    private Trie trie;
    private WordGrid wordGrid;

    public FileReader(String filename) {
        String line;

        try {
            file = new File("test/" + filename);
            scanner = new Scanner(file);

            this.wordGrid = new WordGrid();

            line = scanner.nextLine();
            while (!line.equals("")) {
                wordGrid.addRow(line.replaceAll(" ", "").toCharArray());
                line = scanner.nextLine();
            }

            this.trie = new Trie();

            do {
                line = scanner.nextLine();
                this.trie.insertWord(line.replaceAll(" ", ""));
            } while (scanner.hasNextLine());

        } catch (Exception e) {
            this.wordGrid = null;
            this.trie = null;
        }
    }

    public Trie getTrie() {
        return this.trie;
    }

    public WordGrid getWordGrid() {
        return this.wordGrid;
    }

    public void close() {
        scanner.close();
    }
}
