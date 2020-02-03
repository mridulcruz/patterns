package questions.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OddNoOfTImes {
	public static void main(String sd[]) {
		int arr[] = new int[] { 2, 7, 4, 5, 5, 3, 4, 2, 1, 3, 5 };
		Map<Integer, Integer> mp = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (mp.containsKey(arr[i])) {
				// int j = mp.get(arr[i]) + 1;
				mp.put(arr[i], mp.get(arr[i]) * (-1));
			} else {
				mp.put(arr[i], 1);
			}
		}

		mp.values().stream().forEach(obj -> {

		});
		List<Integer> as = new ArrayList<Integer>();
		mp.keySet().stream().forEach(obj -> {
			if (mp.get(obj).equals(1)) {
				as.add(obj);
			}
		});

		System.out.println(as);
	}
}
