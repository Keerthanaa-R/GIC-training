package util;

import java.util.Arrays;
import java.util.List;

public class CountElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 6, 7, 8, 9, 1, 2);
		long count = numbers.stream().count();
		System.out.println("Total number of elements:" + count);

	}

}
