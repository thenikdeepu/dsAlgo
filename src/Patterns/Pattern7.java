package Patterns;

public class Pattern7 {

	public static void main(String[] args) {
		int n = 5, row = 1, space = n - 1, star = 1;

		printPattern7(n, row, star, space);

	}

	private static void printPattern7(int n, int row, int star, int space) {
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
			space--;
			star += 2;
			row++;
			System.out.println();

		}
	}
}

//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
