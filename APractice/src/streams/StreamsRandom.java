package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsRandom {
	static final StreamsRandom sr;
	static {
		sr = new StreamsRandom();
	}

	private StreamsRandom() {

	}

	public static void main(String[] args) {
		Random r = new Random();
		// r.ints().forEach(System.out::println);
		// System.out.println(i);
		// String sd = System.console().readLine();
		List<Integer> ls = Arrays.asList(1, 5, 2, 3, 4, 2, 3, 5, 4);
		List<String> lss = Arrays.asList("manu", "Sonal", "lanos");
		// List<Integer> mod = ls.stream().map(i -> i * i).collect(Collectors.toList());
		List<Integer> mod = ls.stream().map(Dummy::oye).distinct().sorted().collect(Collectors.toList());
		IntSummaryStatistics stats = ls.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());

		String mod1 = lss.stream().collect(Collectors.joining(" # "));
		System.out.println(mod);
		System.out.println(mod1);
	}

}

class Dummy {
	public static Integer oye(Integer i) {
		// System.out.print(i * 2 + " ");
		return i * 2;
	}
}
