import java.util.Scanner;
import DataStructure.Trie.Trie;
import DataStructure.WordGrid.WordGrid;
import FileReader.FileReader;
import ConsoleWriter.ConsoleWriter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama file: ");
        String filename = scanner.nextLine();

        FileReader fileReader = new FileReader(filename);
        WordGrid wordGrid = fileReader.getWordGrid();
        Trie trie = fileReader.getTrie();
        fileReader.close();

        long startTime = System.nanoTime();
        wordGrid.parseTrie(trie);
        long endTime = System.nanoTime();

        double executionTime = ((double) (endTime - startTime)) / 1e6;

        System.out.println();
        ConsoleWriter consoleWriter = new ConsoleWriter(wordGrid);
        consoleWriter.write();

        System.out.println();
        System.out.println("Waktu eksekusi: " + executionTime + " milidetik");

        scanner.close();
    }
}
