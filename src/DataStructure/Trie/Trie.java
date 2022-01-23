package DataStructure.Trie;

public class Trie {
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public TrieNode getRoot() {
        return this.root;
    }

    public void insertWord(String word) {
        TrieNode curTrieNode = this.root;

        for (char c : word.toCharArray()) {
            if (curTrieNode.getChild(c) != null) {
                curTrieNode = curTrieNode.getChild(c);
            } else {
                TrieNode newTrieNode = new TrieNode();
                curTrieNode.addChild(c, newTrieNode);
                curTrieNode = newTrieNode;
            }
        }

        curTrieNode.addChild('*', null);
    }
}