package Arrays;

import java.util.Scanner;

public class TrapRainWater {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(trapping(arr));

	}

	private static int  trapping(int[] arr) {
		int n = arr.length;
		int left[] = new int[n];
		left[0] = arr[0];
		int leftmax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (leftmax < arr[i]) {
				leftmax = arr[i];
			}
			left[i] = leftmax;
		}
		
		int right[] = new int[n];
		right[n-1] = arr[n-1];
		int rightmax = arr[n-1];
		for (int i = n-1; i >=0; i--) {
			if (rightmax < arr[i]) {
				rightmax = arr[i];
			}
			right[i] = rightmax;
		}
		int trappingWaterUnit=0;
		for(int i=0;i<arr.length;i++) {
			int min=Math.min(left[i], right[i]);
			trappingWaterUnit+=min-arr[i];
		}
		return trappingWaterUnit;

	}

}
