package bst;

import java.util.Objects;

public class BSTDeletion {
	static Node root;
	static Node parent;
//	static String dir;

	public BSTDeletion(int val) {
		BSTDeletion.root = new Node(4);
	}

	public static void main(String[] args) {
		BSTDeletion bs = new BSTDeletion(1);
		int[] arr = new int[] { 2, 3, 3, 6, 4, 7, 5 };
		for (int i = 0; i < arr.length; i++) {
			bs.binaryInsertion(root, arr[i]);
		}
		System.out.println("DONE");
		bs.traverse(root);
		bs.delete(root, 7);
	}

	private void traverse(Node root) {
		if (Objects.nonNull(root)) {
			System.out.println(root.data);
			traverse(root.left);
			traverse(root.right);
		}
	}

	private void delete(Node root, int key) {
		if (root.data > key) {
			if (root.left == null) {
				System.out.println("Ele Not Found");
			} else {
				parent = root;
				// BSTDeletion.dir = "left";
				delete(root.left, key);
			}
		} else if (root.data < key) {
			if (root.right == null) {
				System.out.println("Ele Not Found");
			} else {
				parent = root;
				// BSTDeletion.dir = "right";
				delete(root.right, key);
			}
		} else if (root.data == key) {
			System.out.println("Ele found with parent " + parent.data);
			if (root.data > parent.data) {
				if (Objects.nonNull(root.left)) {
					binaryInsertion(parent, root.left.data);
				} else {
					parent.left = null;
				}
				if (Objects.nonNull(root.right)) {
					binaryInsertion(parent, root.right.data);
				} else {
					parent.right = null;
				}
				System.out.println("Operated inside");
				traverse(BSTDeletion.root);
			}
			if (root.data < parent.data) {
				parent.left = null;
				System.out.println("Operated inside");
				traverse(BSTDeletion.root);
			}
		}
	}

	private static void binaryInsertion(Node root, int key) {
		if (root.data > key) {
			if (Objects.isNull(root.left)) {
				root.left = new Node(key);
			} else {
				binaryInsertion(root.left, key);
			}
		} else if (root.data < key) {
			if (Objects.isNull(root.right)) {
				root.right = new Node(key);
			} else {
				binaryInsertion(root.right, key);
			}
		} else {
			System.out.println("duplicate found " + key);
		}
	}
}
