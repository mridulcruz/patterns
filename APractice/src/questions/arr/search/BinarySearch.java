package questions.arr.search;

public class BinarySearch {

	public static void main(String[] args) {
		int ele = 21;
		int arr[] = new int[] { 3, 6, 1, 2, 8, 5 };
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		boolean sd = binarySearch(arr, ele, 0, arr.length);
		System.out.println(sd);
	}

	private static boolean binarySearch(int[] arr, int ele, int start, int last) {
		boolean st=false;
		if (last > start) {
			int mid = (last + start) / 2;
			if (arr[mid] == ele) {
				System.out.println("Found !!!");
				return true;
			}
			if (arr[mid] < ele) {
				st=binarySearch(arr, ele, mid + 1, last);
			}
			if (arr[mid] > ele) {
				st=binarySearch(arr, ele, start, mid - 1);
			}

		}
		return st;
	}

	private static void quickSort(int[] arr, int i, int last) {
		if (last > i) {

			int pivot = partition(arr, i, last);
			quickSort(arr, i, pivot - 1);
			quickSort(arr, pivot + 1, last);
		}
	}

	private static int partition(int[] arr, Integer i, Integer last) {
		int lastIndexEle = arr[last];
		int pivot = i;
		for (int j = i; j < last; j++) {
			if (arr[j] < lastIndexEle) {
				swap(arr, pivot, j);
				pivot++;
			}
		}
		swap(arr, pivot, last);
		return pivot;
	}

	private static void swap(int[] arr, Integer i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
