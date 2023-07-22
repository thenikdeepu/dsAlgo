package Patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;

		printPattern9(n, row, star, space);
	}

	private static void printPattern9(int n, int row, int star, int space) {
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			while (j <= star) {
				if (j % 2 == 0) {
					System.out.print("! ");
				} else {
					System.out.print("* ");
				}
				j++;
			}

			System.out.println();
			row++;
			space--;
			star+=2;
		}
	}
}
