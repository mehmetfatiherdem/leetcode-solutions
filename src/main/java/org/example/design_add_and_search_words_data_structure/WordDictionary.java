package org.example.design_add_and_search_words_data_structure;

public class WordDictionary {
    WordDictionary[] children;
    boolean isTerminal;
    public WordDictionary() {
        children = new WordDictionary[26];
        isTerminal = false;
    }

    public void addWord(String word) {
        var wd = this;
        for(char c: word.toCharArray())  {
            if(wd.children[c-'a'] == null) {
                wd.children[c-'a'] = new WordDictionary();
            }
            wd = wd.children[c-'a'];
        }
        wd.isTerminal = true;
    }

    public boolean search(String word) {
        var wd = this;
        for(int i = 0; i<word.length(); i++) {
            char c = word.charAt(i);
            if(c == '.') {
                for(WordDictionary ch: wd.children) {
                    if(ch != null && ch.search(word.substring(i+1, word.length()))) return true;
                }
                return false;
            } else if(wd.children[c-'a'] == null) return false;
            wd = wd.children[c-'a'];
        }
        return wd != null && wd.isTerminal;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
