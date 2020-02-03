package questions.arr;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class CountWithSeq {

	public static void main(String[] args) {
		List<String> arr = Arrays.asList("a", "c", "a", "b", "a", "f", "c", "d", "e", "a", "b", "b", "b");
		Map<String, Integer> count = new LinkedHashMap<>();
		// Map<String, Integer> count = new TreeMap();
		// Map<String, Integer> count = new HashMap<>();
		for (int i = 0; i < arr.size(); i++) {
			Integer cnt = null;
			if (Objects.nonNull(cnt = count.get(arr.get(i)))) {
				count.put(arr.get(i), ++cnt);
			} else {
				count.put(arr.get(i), 1);
			}
		}
		for (Entry<String, Integer> df : count.entrySet()) {
			System.out.println(df.getKey() + " " + df.getValue());
		}
	}

}
