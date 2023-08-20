package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		int item = s.nextInt();
		System.out.println(search(arr, item));
	}

	private static int search(int[] arr, int item) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				end = mid - 1;
			} else
				start = mid + 1;
		}
		return -1;
	}

}
