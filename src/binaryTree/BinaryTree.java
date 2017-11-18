package binaryTree;
//inorder tree
public class BinaryTree {

	class Node {
		int data;
		Node left, right;
		
		public Node (int data) {
			this.data = data;
		}
		
		private void insert(int value) {
			if (value <= this.data) {
				if (this.left == null) {
					this.left = new Node(value);					
				} else {
					this.left.insert(value);
				}
			} else {
				if (this.right == null) {
					this.right = new Node(value);					
				} else {
					this.right.insert(value);
				}
			}
		}
		
		private boolean contains (int value) {
			if (this.data == value) {
				return true;
			}
			if (value < this.data) {
				if (this.left != null) {
					this.left.contains(value);
				}
				return false;				
			} else {
				if (this.right != null) {
					this.right.contains(value);
				}
				return false;
			}	
		}
		
		private void printInOrder() {
			if (this.left != null) {
				this.left.printInOrder();
			}
			System.out.println(this.data);
			if (this.right != null) {
				this.right.printInOrder();
			}
		}
	}

}
