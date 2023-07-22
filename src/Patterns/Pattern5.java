package Patterns;

public class Pattern5 {

	public static void main(String[] args) {
		int n = 5;
		int star = n;
		int row = 1;
		int space = 0;

		printPattern5(n, row, star, space);
	}

	private static void printPattern5(int n, int row, int star, int space) {
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
			star--;
		}
	}
}

//* * * * * 
//  * * * * 
//    * * * 
//      * * 
//        * 
