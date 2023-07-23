package Patterns;

import java.util.Scanner;

public class NmPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star = 1;
		int row = 1;
		int space = n-1;
		int number = 1;
		numberPattern(n, row, star, space, number);

	}

	private static void numberPattern(int n, int row, int star, int space, int number) {
		while (row <=n*2-1) {
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			int j = 1;
			int p = number;
			while (j <= star) {
				System.out.print(p + "\t");

				if (j <= star / 2) {
					p++;
				} else {
					p--;
				}
				j++;
			}

			if (row <= n / 2) {
				star += 2;
				space--;
				number++;
			} else {
				star -= 2;
				space++;
				number--;
			}
			System.out.println();
			row++;
		}

	}

}
