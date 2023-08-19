package Arrays;

import java.util.Scanner;

public class ArrayProductExceptSelf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		arrayProduct(arr);
	}

	private static int[] arrayProduct(int[] arr) {
      int n=arr.length;
      int leftArray[] =new int[n];
      leftArray[0]=1;
      for(int i=1;i<arr.length;i++) {
    	  leftArray[i]=leftArray[i-1]*arr[i-1];
      }
      int rightArray[]=new int[n];
      rightArray[n-1]=1;
      for(int i=n-2;i>=0;i--) {
    	  rightArray[i]=rightArray[i+1]*arr[i+1];
      }
      for(int i=0;i<n;i++) {
    	  arr[i]=leftArray[i]*rightArray[i];
      }
     return arr;
	}

}
