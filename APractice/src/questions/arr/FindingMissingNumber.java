package questions.arr;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FindingMissingNumber {
	public static void main(String[] args) {
		int arr1[] = new int[] { 2, 5, 2, 4, 2, 1, 7, 8 };
		int arr2[] = new int[] { 2, 4, 5, 7, 6, 9, 2, 2 };
		List<Integer> ntFound = new ArrayList<>();
		Map<Integer, List<Integer>> mp = new LinkedHashMap<>();
		a: for (int i = 0; i < arr1.length; i++) {
			b: for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					List<Integer> lst = mp.get(arr1[i]);
					if (Objects.isNull(lst))
						lst = new ArrayList<>();
					if (lst.contains(j)) {
						// System.out.println("Aldredy comtains index " + j + " for i " + i + " " +
						// arr1[i]);
						continue b;
					} else {
						lst.add(j);
						mp.put(arr1[i], lst);
						continue a;
					}
				}
			}
			ntFound.add(arr1[i]);
		}
		ntFound.stream().forEach(obj -> System.out.println(obj + " "));
	}
}
