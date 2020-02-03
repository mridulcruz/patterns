package questions;

import java.io.IOException;
import java.util.Objects;
import java.util.Stack;

//balance tree
//height of tree
//horizontal printing of tree

public class BinarySearchTreeBasic2 {
	Binary root;

	BinarySearchTreeBasic2(int key) {
		this.root = new Binary(key);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BinarySearchTreeBasic2 bst = new BinarySearchTreeBasic2(7);
		// Scanner sc=new Scanner();
		boolean operation = true;
//		while (operation) {
		int[] arr = new int[] { 2, 4, 9, 5, 3, 6, 8 };
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter choice to operate");
			// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// int choice = Integer.parseInt(br.readLine());
			Stack<Integer> st = new Stack<Integer>();
			int choice = 1;
			switch (choice) {
			case 1:
				System.out.print("Enter number to insert :");
				// br = new BufferedReader(new InputStreamReader(System.in));
				// choice = Integer.parseInt(br.readLine());
				choice = arr[i];
				insertion(choice, bst.root);
				inOrder(bst.root);
				// preOrder(bst.root, st);
				// System.out.println(st + "@");
				break;
			}
//			System.out.println("Wanna continue ");
//			br = new BufferedReader(new InputStreamReader(System.in));
//			if (!br.readLine().equalsIgnoreCase("y")) {
//				operation = false;
//			}
//		}
		}
	}

	private static void preOrder(Binary root) {

		if (Objects.nonNull(root)) {
			System.out.print(root.key + " ");
			if (Objects.nonNull(root.leftBin)) {
				preOrder(root.leftBin);
			}
			if (Objects.nonNull(root.rightBin)) {
				preOrder(root.rightBin);
			}

		}

	}

	private static void inOrder(Binary root) {

		if (Objects.nonNull(root)) {

			if (Objects.nonNull(root.leftBin)) {
				inOrder(root.leftBin);
			}
			System.out.print(root.key + " ");
			if (Objects.nonNull(root.rightBin)) {
				inOrder(root.rightBin);
			}

		}

	}

	private static void insertion(int choice, Binary root) {
		if (root.key == choice) {
			System.out.println("Found " + choice + " Aldready Present");
		} else if (root.key > choice) {
			if (Objects.isNull(root.leftBin)) {
				root.leftBin = new Binary(choice);
			} else {
				insertion(choice, root.leftBin);
			}
		} else if (root.key < choice) {
			if (Objects.isNull(root.rightBin)) {
				root.rightBin = new Binary(choice);
			} else {
				insertion(choice, root.rightBin);
			}
		}
	}

}
