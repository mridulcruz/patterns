package bst;

import java.util.Stack;

public class BstWithoutRec {
	static Node root;

	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

	}

	public void inorder() {
		Stack<Node> st = new Stack();
		// st.add(root);
		Node curr = root;
		while (curr != null || !st.isEmpty()) {
			while (curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			System.out.println(curr.data);
			curr = curr.right;
		}
	}

}
