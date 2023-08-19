package Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

// selection sort firstly sort small data and so on 1 2 3 4 5..n;
	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;

	}

}
