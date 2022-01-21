package ConsoleWriter;

import DataStructure.WordGrid.WordGrid;

public class ConsoleWriter {
    private static final String[] ANSI_COLOR_CODE = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m"};
    private static final String ANSI_RESET = "\u001B[0m";
    private WordGrid wordGrid;

    public ConsoleWriter(WordGrid wordGrid) {
        this.wordGrid = wordGrid;
    }

    public void write() {
        int i, j, length, width;

        length = this.wordGrid.getLength();
        width = this.wordGrid.getWidth();

        for (i = 0; i < length; i++) {
            for (j = 0; j < width; j++) {
                if (this.wordGrid.getGrid(i, j).getWordIndex() != -1) {
                    System.out.print(ANSI_COLOR_CODE[this.wordGrid.getGrid(i, j).getWordIndex() % ANSI_COLOR_CODE.length] + this.wordGrid.getGrid(i, j).getContent() + ANSI_RESET + " ");
                } else {
                    System.out.print(this.wordGrid.getGrid(i, j).getContent() + " ");
                }
            }
            System.out.println();
        }
    }
}
