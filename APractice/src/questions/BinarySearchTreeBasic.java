package questions;

import java.io.IOException;
import java.util.Objects;

//balance tree
//height of tree
//horizontal printing of tree

public class BinarySearchTreeBasic {
	Binary root;

	BinarySearchTreeBasic(int key) {
		this.root = new Binary(key);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BinarySearchTreeBasic bst = new BinarySearchTreeBasic(1);
		// Scanner sc=new Scanner();
		boolean operation = true;
//		while (operation) {
		int[] arr = new int[] { 2, 4, 7, 9, 5, 3, 6, 8 };
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter choice to operate");
			// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// int choice = Integer.parseInt(br.readLine());
			int choice = 1;
			switch (choice) {
			case 1:
				System.out.print("Enter number to insert :");
				// br = new BufferedReader(new InputStreamReader(System.in));
				// choice = Integer.parseInt(br.readLine());
				choice = arr[i];
				insertion(choice, bst.root);
				traverse(bst.root);
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

	private static void traverse(Binary root) {
		if (Objects.nonNull(root)) {
			System.out.print(root.key + " ");
			if (Objects.nonNull(root.leftBin)) {
				traverse(root.leftBin);
			}

			if (Objects.nonNull(root.rightBin)) {
				traverse(root.rightBin);
			}

		}
	}

	private static void inorder(Binary root) {

		if (Objects.nonNull(root)) {

			if (Objects.nonNull(root.leftBin)) {
				traverse(root.leftBin);
			}
			System.out.print(root.key + " ");
			if (Objects.nonNull(root.rightBin)) {
				traverse(root.rightBin);
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

class Binary {
	int key;
	Binary leftBin;
	Binary rightBin;

	Binary(int key) {
		this.key = key;
	}
}
