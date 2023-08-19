package Sorting;

import java.util.Scanner;

public class InsertionSort {

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

	private static int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			inserElement(arr, i);
		}
		return arr;
	}

	private static void inserElement(int[] arr, int i) {
		int j = i - 1;
		int item = arr[i];
		while (j >= 0 && arr[j] > item) {
			arr[j + 1] = arr[j];
			arr[j] = item;
			j--;
		}
	}

}
