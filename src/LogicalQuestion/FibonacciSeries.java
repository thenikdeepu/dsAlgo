package LogicalQuestion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		fibonacciSeries(n);
	}

	private static void fibonacciSeries(int n) {
		int a = 0;
		int b = 1, c = 0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 2; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}

	}

}
