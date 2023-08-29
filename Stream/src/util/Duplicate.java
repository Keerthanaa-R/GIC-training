package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6, 7, 89);
		List<Integer> duplicateNumbers = numbers.stream()
				.collect(Collectors.groupingBy(number -> number, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toList());
		System.out.println("Duplicate numbers:" + duplicateNumbers);

	}

}
