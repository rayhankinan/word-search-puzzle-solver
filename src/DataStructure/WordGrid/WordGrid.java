package DataStructure.WordGrid;

import java.util.List;
import java.util.ArrayList;

import DataStructure.Trie.Trie;
import DataStructure.Trie.TrieNode;

public class WordGrid {
    private int length, width, numOperation;
    private List<List<WordGridStruct>> grid;

    public WordGrid() {
        this.length = 0;
        this.width = 0;
        this.numOperation = 0;
        this.grid = new ArrayList<List<WordGridStruct>>();
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public int getNumOperation() {
        return this.numOperation;
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
        
        this.width = tempList.size();
        this.length++;
    }

    public void parseTrie(Trie trie) {
        Vector[] arrVector = {new Vector(0, -1), new Vector(1, -1), new Vector(1, 0), new Vector(1, 1), new Vector(0, 1), new Vector(-1, 1), new Vector(-1, 0), new Vector(-1, -1)};
        Vector curPosition, iterVector;
        WordGridStruct curWordGridStruct, iterWordGridStruct;
        TrieNode p;
        int i, j, wordIndex;

        wordIndex = 0;
        for (i = 0; i < this.getLength(); i++) {
            for (j = 0; j < this.getWidth(); j++) {
                
                for (Vector vector : arrVector) {
                    curPosition = new Vector(i, j);
                    p = trie.getRoot();

                    while (p != null && this.inGrid(curPosition.getX(), curPosition.getY())) {
                        curWordGridStruct = this.getGrid(curPosition.getX(), curPosition.getY());

                        if (p.getChild(curWordGridStruct.getContent()) != null && p.getChild(curWordGridStruct.getContent()).isEndWord()) {
                            for (iterVector = new Vector(i, j); !iterVector.isEqual(curPosition.add(vector)); iterVector.increment(vector)) {
                                iterWordGridStruct = this.getGrid(iterVector.getX(), iterVector.getY());
                                iterWordGridStruct.setWordIndex(wordIndex);
                            }
                            
                            wordIndex++;
                        }

                        this.numOperation++;
                        p = p.getChild(curWordGridStruct.getContent());
                        curPosition.increment(vector);
                    }
                }
            }
        }
    }
}