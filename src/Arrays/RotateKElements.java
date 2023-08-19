package Arrays;

import java.util.Scanner;

public class RotateKElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		int k = s.nextInt();

		rotate(array, k);
		for (int i : array) {
			System.out.println(array[i]);
		}
	}

	private static void rotate(int[] array, int k) {
		k = k % array.length;
		for (int i = array.length - k; i >= 0; i--) {
			array[i + 1] = array[i];
		}
//		for(int i=k;i<array.length;i++) {
//			array[i]=
//		}
	}

}
