package util;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,7,8,9,6,4);
		Optional<Integer> firstElementFinder = numbers.stream().findFirst();
		if (firstElementFinder.isPresent()) {
			System.out.println("First element:" + firstElementFinder.get());
		} else {
			System.out.println("List is  empty");
		}

	}

}
