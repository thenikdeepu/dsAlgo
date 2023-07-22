package Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star = n;
		int row = 1;
		int space = 0;
		pattern(n, row, star, space);

	}

	private static void pattern(int n, int row, int star, int space) {
		while (row <= 2 * n - 1) {
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

			if (row < n) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			System.out.println();
			row++;

		}
	}

}
