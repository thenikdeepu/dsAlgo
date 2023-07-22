package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = 1;
		printPattern2(n, row, star);

	}

	private static void printPattern2(int n, int row, int star) {
		while (row <= n) {
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			star++;
		}
	}
}

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
