package Loops;

public class LoopsDemo {

	public static void main(String[] args) {
		int n = 4, sum = 0, i = 1;
		System.out.println(getnNaturalNumberSum(n, sum));
		printTable(n, i);
		int value = 436343;
		System.out.println(sumOfAGivenValue(value));
		System.out.println(reverseGivenValue(value));
		System.out.println(existOfNumberInGivenValue(value, n));
	}

	private static int existOfNumberInGivenValue(int value, int n) {
		int count = 0;
		while (value % 10 != 0) {
			if (value % 10 == n) {
				count++;
			}
			value = value / 10;
		}
		return count;
	}

	private static int reverseGivenValue(int value) {
		int reverseValue = 0;
		while (value % 10 != 0) {
			reverseValue = reverseValue * 10 + (value % 10);
			value = value / 10;

		}
		return reverseValue;
	}

	private static int sumOfAGivenValue(int value) {
		int sum = 0;
		while (value % 10 != 0) {
			sum += (value % 10);
			value = value / 10;
		}
		return sum;
	}

	private static void printTable(int n, int i) {
		while (i <= 10) {
			boolean flag = true;
			if (!flag) {
				if ((n * i) % 4 != 0) {
					System.out.println(n * i++);
				}
			} else {
				System.out.println(n * i++);
				if (i == 10 && flag) {
					flag = false;
					i = 1;
				}
			}

		}

	}

	private static int getnNaturalNumberSum(int n, int sum) {
		while (n >= 1) {
			sum += n--;
		}
		return sum;
	}
}
