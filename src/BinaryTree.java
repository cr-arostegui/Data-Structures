
public class BinaryTree {

	public static class Node {
		private int data;
		private Node left, right;
		
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
		
		private void printPreOrder() {
			System.out.println(this.data);
			if (this.left != null) {
				this.left.printInOrder();
			}
			if (this.right != null) {
				this.right.printInOrder();
			}
		}
		
		private void printPostOrder() {
			if (this.left != null) {
				this.left.printInOrder();
			}
			if (this.right != null) {
				this.right.printInOrder();
			}
			System.out.println(this.data);
		}
	}
	
	public static void main(String[] args) {
		BinaryTree.Node tree = new BinaryTree.Node(6);
		tree.insert(2);
		tree.insert(3);
		tree.insert(1);
		tree.insert(5);
		tree.insert(9);
		tree.insert(7);
		tree.insert(12);
		tree.insert(8);
		System.out.println("****** In Order: ");
		tree.printInOrder();
		System.out.println("****** Pre Order: ");
		tree.printPreOrder();
		System.out.println("****** Post Order: ");
		tree.printPostOrder();
	}

}
