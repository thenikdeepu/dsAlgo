package LogicalQuestion;

public class GCD {

	public static void main(String[] args) {
		int dividend = 60, divisor = 36;

		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);

	}

}
//	 it doesn't matter if dividen>divisor or divisor>dividend;
