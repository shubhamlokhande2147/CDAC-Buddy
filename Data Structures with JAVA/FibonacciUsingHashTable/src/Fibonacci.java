import java.util.Hashtable;

public class Fibonacci {

	private static Hashtable<Integer, Long> memo = new Hashtable<>();

	public static void main(String[] args) {

		int n = 6;
		long result = Fibonacci(n);

		System.out.println("fibonacci " + n + " " + " = " + result);

	}

	public static long Fibonacci(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("input must be non negative integer");
		}

		if (memo.containsKey(n)) {
			return memo.get(n);
		}

		if (n == 0) {
			return 0;
		}

		else if (n == 1) {
			return 1;
		}

		long result = Fibonacci(n - 1) + Fibonacci(n - 2);

		memo.put(n, result);

		return result;
	}

}
