package DataTypes;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev = 0;
		int count = 1;
		while (n > 0) {
			
			int rem = n % 10;
			rev = (int) (rev + count * (Math.pow(10, rem - 1)));
			count++;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
