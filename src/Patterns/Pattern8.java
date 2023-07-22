package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int space = 0;
		int star = 2*n - 1;

		printPattern8(n, row, star, space);
	}

	private static void printPattern8(int n, int row, int star, int space) {
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
			System.out.println();
			row++;
			space++;
			star-=2;
		}
	}
}
