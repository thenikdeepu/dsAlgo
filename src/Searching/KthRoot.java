package Searching;

public class KthRoot {

	public static void main(String[] args) {
		int n = 149;
		int k = 3;
		System.out.println(kthRoot(n, k));
	}

	private static int kthRoot(int n, int k) {
		int start = 1, end = n;
		int ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				start = mid + 1;
			} else
				end = mid - 1;
		}

		return ans;

	}

}
