package Patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		printPattern4(n, row, star, space);
	}

	private static void printPattern4(int n, int row, int star, int space) {
		while (row <= n) {
			int i = 1;
			// space
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// next row
			System.out.println();
			row++;
			space--;
			star++;
		}
	}
}

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
