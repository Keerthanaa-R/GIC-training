package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,12);

		List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers:" + evenNumbers);
		int evenNumbersCount = evenNumbers.size();
		System.out.println("Number of even numbers:" + evenNumbersCount);

	}

}
