package questions.array;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int arr[] = new int[] { 2, 7, 4, 5, 5, 3, 4, 2, 1, 3, 5 };
		int max = 0;
		int secMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (secMax < arr[i] && arr[i] != max) {
				secMax = arr[i];
			}
		}
		System.out.println(secMax + " this is it");

	}

}
