package LogicalQuestion;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		checkPrime(n);

	}

	private static void checkPrime(int n) {
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");

	}

}
