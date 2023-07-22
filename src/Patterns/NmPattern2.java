package Patterns;

import java.util.Scanner;

public class NmPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star = 1;
		int row = 1;
		int space = n/2;
		int number = 1;
		numberPattern(n, row, star, space, number);

	}

	private static void numberPattern(int n, int row, int star, int space, int number) {
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			if (row <= n / 2) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
			System.out.println();
			row++;
		}

	}

}
