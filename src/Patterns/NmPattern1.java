package Patterns;

import java.util.Scanner;

public class NmPattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star = 1;
		int row = 1;
		int space = n - 1;
		int number = 1;
		numberPattern(n, row, star, space, number);

	}

	private static void numberPattern(int n, int row, int star, int space, int number) {
		while (row <= n) {
			number = 1;
			int i = 1;
			while (i <= space) {
				System.out.print("   ");
				i++;
			}
			int j = 1;

			while (j <= star) {
				System.out.print(number + "  ");
				if (j <= star / 2) {
					number++;
				} else {
					number--;
				}
				j++;
			}
			System.out.println();
			row++;
			space--;
			star += 2;

		}
	}

}
