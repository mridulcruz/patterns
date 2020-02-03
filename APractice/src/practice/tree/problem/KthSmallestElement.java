package practice.tree.problem;

public class KthSmallestElement {
	public static void main(String[] args) {
		int kthEle = 2;
		int arr[] = new int[] { 3, 2, 5, 4, 8, 6, 9, 2, 5, 2 };
		mergeSort(arr);
	}

	private static void mergeSort(int[] arr) {
		if (arr.length > 1) {
			int mid = arr.length / 2;
			int leftArr[] = new int[mid];
			int rightArr[] = new int[arr.length - mid];

			for (int l = 0; l < mid; l++) {
				leftArr[l] = arr[l];
			}
			for (int l = 0; l < (arr.length - mid); l++) {
				rightArr[l] = arr[l + mid];
			}
			mergeSort(leftArr);
			mergeSort(rightArr);
			merge(arr, leftArr, rightArr);
		}
	}

	private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int i, j, k;
		i = j = k = 0;
		int iL = leftArr.length;
		int iR = rightArr.length;
		while (iL > 0 && iR > 0) {
			if (leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}
			if (leftArr[i] > rightArr[j]) {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
	}

}
