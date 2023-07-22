package Patterns;

public class DemoPatterns {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = n;
		pattern1(n, row, star);
	}

	private static void pattern1(int n, int row, int star) {
		while (row++ <= n) {
			int i = 1;
			while (i++ <= n) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * *
