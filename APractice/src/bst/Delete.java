package bst;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Delete {

	public static void main(String[] args) {
		HashSet ds = Stream.of("acc_number", "branch_id", "balance").collect(Collectors.toCollection(HashSet::new));

		Set<String> ds1 = Stream.of("acc_number", "branch_id", "balance").collect(Collectors.toSet());
		System.out.println(ds + " " + ds1);
	}

}
