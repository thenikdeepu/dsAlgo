package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int space = 0;

		pattern(n, row, star, space);
	}

	private static void pattern(int n, int row, int star, int space) {
		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			if (row < n) {
				star++;
			} else {
				star--;
			}
			System.out.println();
			row++;
		}
	}

}

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 
