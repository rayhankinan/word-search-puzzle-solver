package DataStructure.WordGrid;

public class WordGridStruct {
    private char content;
    private int wordIndex;

    public WordGridStruct(char content) {
        this.content = content;
        this.wordIndex = -1;
    }

    public char getContent() {
        return this.content;
    }

    public void setContent(char content) {
        this.content = content;
    }

    public int getWordIndex() {
        return this.wordIndex;
    }

    public void setWordIndex(int wordIndex) {
        this.wordIndex = wordIndex;
    }
}
