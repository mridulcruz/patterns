package practice.lambda;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 1, 2, 4, 0 };
		mergeSort(arr);
	}

	private static void mergeSort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int mid = arr.length / 2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[arr.length - mid];
		for (int i = 0; i < mid; i++) {
			leftArr[i] = arr[i];
			
		}
	}

}
