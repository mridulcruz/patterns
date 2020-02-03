package questions.arr;

public class MinMaxInArr {
	static Integer min;
	static Integer max;

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 7, 6, 1, 8, 0 };
		max = min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = swap(max, arr, i);
			} else if (min > arr[i]) {
				min = swap(min, arr, i);
			}
		}

		System.out.println("Max is " + max + " Min is " + min);
	}

	private static int swap(Integer min, int[] arr, int i) {
		min = min + arr[i];
		arr[i] = min - arr[i];
		min = min - arr[i];
		return min;
	}

}
