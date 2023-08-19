package LogicalQuestion;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		// Scanner s=new Scanner(System.in);
		String string = "Maintain high standards   of  quality for code, ??? documentation  ..  and other deliverables".trim();
		String[] array = string.split(" +");
		System.out.println(array.length);

		int count = 0;
		for (String s : array) {
			if (!s.equals("")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
