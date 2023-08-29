package model;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	//public static void main(String args[]) {
		List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = integerList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

	}
//}
