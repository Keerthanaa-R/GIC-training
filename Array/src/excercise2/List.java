package excercise2;

import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		LinkedList<String> namesList = new LinkedList<>();
		namesList.add("Ganga");
		namesList.add("Yamuna");
		namesList.add("Narmada");
		System.out.println("Original order of names:" + namesList);
		LinkedList<String> reverseNamesList = new LinkedList<>();
		for (int i = namesList.size() - 1; i >= 0; i--) {
			reverseNamesList.add(namesList.get(i));
		}
		System.out.println("Names in reverse order:" + reverseNamesList);

	}

}
