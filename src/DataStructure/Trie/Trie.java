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

    // TEST
    private void printTrieNode(TrieNode trieNode) {
        if (!trieNode.isEndWord()) {
            for (char key : trieNode.getChildren()) {
                System.out.print(key);
                System.out.print("(");
                printTrieNode(trieNode.getChild(key));
                System.out.print(")");
            }
        } else {
            System.out.print("");
        }
    }

    // TEST
    public void printTrie() {
        printTrieNode(this.root);
        System.out.println();
    }
}
