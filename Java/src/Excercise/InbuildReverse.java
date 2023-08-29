package Excercise;

public class InbuildReverse {

	public static void main(String[] args) {
		String input = "PROGRAMMING LANGUAGE!";
		String reversed = reverseString(input);
		System.out.println("Reversed string:" + reversed);

	}

	public static String reverseString(String input) {
		StringBuilder stringBuilder = new StringBuilder(input);
		return stringBuilder.reverse().toString();
	}

}
