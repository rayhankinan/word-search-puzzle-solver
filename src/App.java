import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

import DataStructure.Trie.Trie;
import DataStructure.WordGrid.WordGrid;
import FileReader.FileReader;
import ConsoleWriter.ConsoleWriter;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama file: ");
        String filename = scanner.nextLine();

        FileReader fileReader = new FileReader(filename);
        if (fileReader.getWordGrid() != null && fileReader.getTrie() != null) {
            WordGrid wordGrid = fileReader.getWordGrid();
            Trie trie = fileReader.getTrie();
            fileReader.close();

            long startTime = System.nanoTime();
            wordGrid.parseTrie(trie);
            long endTime = System.nanoTime();

            double executionTime = ((double) (endTime - startTime)) * 1e-6;

            System.out.println();
            ConsoleWriter consoleWriter = new ConsoleWriter(wordGrid);
            consoleWriter.write();

            BigDecimal bigDecimal = new BigDecimal(executionTime).setScale(3, RoundingMode.HALF_EVEN);

            System.out.println();
            System.out.println("Waktu eksekusi: " + bigDecimal.doubleValue() + " milidetik");

            System.out.println();
            System.out.println("Jumlah operasi perbandingan: " + wordGrid.getNumOperation());

            scanner.close();
            
        } else {
            System.out.println("File tidak ditemukan pada folder test!");
        }
    }
}