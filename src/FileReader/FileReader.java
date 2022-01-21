package FileReader;

import java.util.Scanner;
import java.io.File;
import DataStructure.Trie.Trie;
import DataStructure.WordGrid.WordGrid;
import DataStructure.WordGrid.WordGridStruct;

public class FileReader {
    private File file;
    private Scanner scanner;
    private Trie trie;
    private WordGrid wordGrid;

    public FileReader(String filename) {
        int length, width, i, j, N;
        String line;
        String[] data;

        try {
            file = new File("test/" + filename);
            scanner = new Scanner(file);

            data = scanner.nextLine().split(" ");
            length = Integer.parseInt(data[0]);
            width = Integer.parseInt(data[1]);

            this.wordGrid = new WordGrid(length, width);

            for (i = 0; i < length; i++) {
                data = scanner.nextLine().split(" ");
                for (j = 0; j < width; j++) {
                    wordGrid.setGrid(i, j, new WordGridStruct(data[j].charAt(0)));
                }
            }

            line = scanner.nextLine();
            N = Integer.parseInt(line);

            this.trie = new Trie();

            for (i = 0; i < N; i++) {
                line = scanner.nextLine().replaceAll(" ", "");
                this.trie.insertWord(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
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
