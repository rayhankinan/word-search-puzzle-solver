package DataStructure.Trie;

import java.util.Map;
import java.util.HashMap;

// TEST
import java.util.Set;

public class TrieNode {
    private Map<Character, TrieNode> children;

    public TrieNode() {
        this.children = new HashMap<Character, TrieNode>();
    }

    public TrieNode getChild(char key) {
        return this.children.get(key);
    }

    public void addChild(char key, TrieNode value) {
        this.children.put(key, value);
    }

    public boolean isEndWord() {
        return this.children.keySet().contains('*');
    }

    // TEST
    public Set<Character> getChildren() {
        return this.children.keySet();
    }
}
