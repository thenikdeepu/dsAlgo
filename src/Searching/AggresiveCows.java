package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class AggresiveCows {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		int item = s.nextInt();
		System.out.println(maxDistanceForCows(arr, item));
	}

	private static int maxDistanceForCows(int[] arr, int item) {
		int start = arr[0];
		int end = arr[arr.length - 1];
		int ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (isPossibleToSit(arr, item, mid)) {
				ans = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;

	}

	private static boolean isPossibleToSit(int[] arr, int item, int mid) {
		int pos = arr[0];
		int cow = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - pos >= mid) {
				pos = arr[i];
				cow++;
			}
			if (cow == item) {
				return true;
			}
		}
		return false;
	}

}
