package Patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star = 1;
		int row = 1;
		int space = n / 2;
		pattern(n, row, star, space);

	}

	private static void pattern(int n, int row, int star, int space) {
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
			row++;
			System.out.println();
		}

	}

}

//      * 
//    * * * 
//  * * * * * 
//* * * * * * * 
//  * * * * * 
//    * * * 
//      * 

