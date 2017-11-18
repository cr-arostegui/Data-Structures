
public class Tries {
	
	public static class TrieNode {
		
		final int NUMBER_OF_CHARACTERS = 26;
		TrieNode[] children = new TrieNode[NUMBER_OF_CHARACTERS];
		
		public static int getChaIndex(char c){
			return c - 'a';
		}
		
		private TrieNode getNode(char c) {
			return this.children[getChaIndex(c)];
		}
		
		private void setNode(char c, TrieNode node) {
			children[getChaIndex(c)] = node;
		}
		
		public void add(String s) {
			add(s, 0);
		}
		
		private void add(String s, int index) {
			if (index == s.length()) return;
			char current  = s.charAt(index);
			TrieNode child = getNode(current);
			if (child == null) {
				child = new TrieNode();
				setNode(current, child);
			}
			child.add(s, index + 1);
		}
		
		private boolean search(String word) {
			if (!word.isEmpty()) {
				char current = word.charAt(0);
				TrieNode child = getNode(current);
				if (child != null) {
					if (word.length() == 1) {
						return true;
					}
					return child.search(word.substring(1));
				}
				return false;
			}
			return false;
		}
	}
	
	public static void main(String[] args) {
		TrieNode trie = new TrieNode();
		trie.add("jose");
		trie.add("juan");
		trie.add("pepe");
		trie.add("pedro");
		trie.add("eduardo");
		System.out.println("Result: "+ trie.search("eduardo"));
	}

}
