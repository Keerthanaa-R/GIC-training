package util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Num {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 23, 145, 101, 256, 187, 13);
		List<Integer> numbersStrartingWithOne = numbers.stream().filter(num -> String.valueOf(num).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("Numbers starting with 1:" + numbersStrartingWithOne);

	}

}
