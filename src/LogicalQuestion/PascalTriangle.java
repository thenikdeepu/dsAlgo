package LogicalQuestion;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 0;
		int star = 1;
		int number = 1;
		pascalTriangle(n, row, star, number);

	}

	private static void pascalTriangle(int n, int row, int star, int number) {
		while (row <= n) {
			int i = 0;
			number = 1;
			while (i < star) {
				System.out.print(number + "\t");
				number = ((row - i) * number) / (i + 1);
				i++;
			}
			System.out.println();
			row++;
			star++;

		}

	}

}
