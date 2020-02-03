package questions.array;

//Question 28 : Given an array containing zeroes, ones and twos only. Write a function to sort the given array in O(n) time complexity.
public class SortZerosOnesAndTwos {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 2, 2, 1, 1, 0, 2, 0, 0 };

		int l = 0, j = 0, k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {

				l++;
			} else if (arr[i] == 1) {
				j++;
			} else {
				k++;
			}
		}
		int finArr[] = new int[l + j + k];
		int len = l + j + k;
		for (int i = 0; i < (len); i++) {
			if (l > 0) {
				finArr[i] = 0;
				l--;
			} else if (j > 0) {
				finArr[i] = 1;
				j--;
			} else if (k > 0) {
				finArr[i] = 2;
				k--;
			}

		}
		for (int i = 0; i < finArr.length; i++) {

			System.out.print(" " + finArr[i]);
		}
	}

//	public static void main(String[] args) {
//		int arr[] = new int[] { 2, 2, 0, 0, 0, 1, 1, 1,2 ,0,0,0,2,1, 0, 2 };
//		Integer[] arr1 = new Integer[9], arr2 = new Integer[9], arr3 = new Integer[9];
//
//		int l = 0, j = 0, k = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				arr1[l] = 0;
//				l++;
//			} else if (arr[i] == 1) {
//				arr2[j] = 1;
//				j++;
//			} else {
//				arr3[k] = 2;
//				k++;
//			}
//		}
//		Integer finArr[] = new Integer[arr.length + 100];
//		for (int i = 0; i < arr1.length; i++) {
//			if (Objects.isNull(arr1[i])) {
//				l = i;
//				break;
//			}
//			finArr[i] = arr1[i];
//
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			if (Objects.isNull(arr2[i])) {
//				j = i;
//				break;
//			}
//			finArr[i + l] = arr2[i];
//		}
//		for (int i = 0; i < arr3.length; i++) {
//			if (Objects.isNull(arr3[i])) {
//				break;
//			}
//			finArr[i + l + j] = arr3[i];
//		}
//		for (int i = 0; i < finArr.length; i++) {
//			if (Objects.isNull(finArr[i])) {
//
//				break;
//			}
//			System.out.print(" " + finArr[i]);
//		}
//	}

}
