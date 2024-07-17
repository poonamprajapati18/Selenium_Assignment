package Java_Assignment;

public class P7FibonacciSeries {
	public static void main(String[] args) {
		int a = 0, b = 1;
		System.out.println(a + " \n" + b);

		int c;
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.println("" + c);
			a = b;
			b = c;

		}

	}

}
