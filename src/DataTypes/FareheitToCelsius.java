package DataTypes;

import java.util.Scanner;

public class FareheitToCelsius {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int minf=s.nextInt();
		int maxf=s.nextInt();
		int steps=s.nextInt();
		for(int i=minf;i<=maxf;i+=steps) {
			System.out.print(i+"\t");
			System.out.println((int)((5.0/9)*(i-32)));
			
		}
	}

}
