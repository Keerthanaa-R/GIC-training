package fact;

import java.util.stream.LongStream;

public class FactLambda {

	public static void main(String[] args) {

		int n = 5;
		long factorial = LongStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);

		System.out.println("Factorial of" + n + "is" + factorial);

	}

}
