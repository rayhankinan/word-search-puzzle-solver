package DataStructure.WordGrid;

import java.util.List;
import java.util.ArrayList;
import DataStructure.Trie.Trie;
import DataStructure.Trie.TrieNode;

public class WordGrid {
    private int length, width;
    private List<List<WordGridStruct>> grid;

    public WordGrid() {
        this.length = 0;
        this.width = 0;
        this.grid = new ArrayList<List<WordGridStruct>>();
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public WordGridStruct getGrid(int i, int j) {
        return grid.get(i).get(j);
    }

    public void setGrid(int i, int j, WordGridStruct struct) {
        grid.get(i).set(j, struct);
    }

    public boolean inGrid(int i, int j) {
        return i >= 0 && i < this.getLength() && j >= 0 && j < this.getWidth();
    }

    public void addRow(char[] row) {
        List<WordGridStruct> tempList = new ArrayList<WordGridStruct>();

        for (char c : row) {
            tempList.add(new WordGridStruct(c));
        }

        this.grid.add(tempList);
        
        this.length = tempList.size();
        this.width++;
    }

    public void parseTrie(Trie trie) {
        Vector[] arrVector = {new Vector(0, -1), new Vector(1, -1), new Vector(1, 0), new Vector(1, 1), new Vector(0, 1), new Vector(-1, 1), new Vector(-1, 0), new Vector(-1, -1)};
        Vector curPosition, iterVector;
        TrieNode p;
        int i, j, wordIndex;

        wordIndex = 0;
        for (i = 0; i < this.getLength(); i++) {
            for (j = 0; j < this.getWidth(); j++) {
                
                for (Vector vector : arrVector) {
                    curPosition = new Vector(i, j);
                    p = trie.getRoot();

                    while (p != null && this.inGrid(curPosition.getX(), curPosition.getY())) {
                        if (p.isEndWord()) {
                            iterVector = new Vector(i, j);
                            
                            while (!iterVector.isEqual(curPosition)) {
                                this.getGrid(iterVector.getX(), iterVector.getY()).setWordIndex(wordIndex);

                                iterVector.increment(vector);
                            }

                            wordIndex++;
                        }

                        p = p.getChild(this.getGrid(curPosition.getX(), curPosition.getY()).getContent());
                        curPosition.increment(vector);
                    }
                }
            }
        }
    }
}