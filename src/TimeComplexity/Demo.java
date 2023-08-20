package TimeComplexity;

public class Demo {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000_000; i++) {

		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}

}
