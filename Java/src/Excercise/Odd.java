package Excercise;

public class Odd {

	public static void main(String[] args) {
		int n = 8;
		trynumber(n);

		n = 7;
		trynumber(n);
	}

	public static void trynumber(int n) {
		try {
			checkEvenNumber(n);
			System.out.println(n + "is even");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void checkEvenNumber(int number) {
		if (number % 2 != 0) {
			throw new IllegalArgumentException(number + "is odd");
		}
	}

}

//		int number = 5;
//		try {
//
//			checkEvenNumber(number);
//			System.out.println(number + "is an even number");
//
//		} catch (OddNumberException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//
//	public static void checkEvenNumber(int number) throws OddNumberException {
//		if (number % 2 != 0) {
//			throw new OddNumberException("Number must be even");
//		}
//
//	}
//
//}
//
//class OddNumberException extends Exception {
//	public OddNumberException(String message) {
//		super(message);
//	}
//}
