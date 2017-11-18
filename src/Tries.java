
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
			int charCode = getChaIndex(current);
			TrieNode child = getNode(current);
			if (child == null) {
				child = new TrieNode();
				setNode(current, child);
			}
			child.add(s, index + 1);
		}
	}
	
	public static void main(String[] args) {
		

	}

}
