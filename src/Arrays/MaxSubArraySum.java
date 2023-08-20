package Arrays;

import java.util.Scanner;

public class MaxSubArraySum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(subarraySum(arr));

	}

	private static int subarraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}

}
