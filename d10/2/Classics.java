public class Classics {
	
	public int factorial(int n) {
		if (n < 2) {
			return n;
		}
		return n * factorial(n - 1);
	}

	public int fibonacci(int n) {
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public void hanoi(int n, String src, String aux, String dst) {
		if (n > 0) {
			this.hanoi(n - 1, src, dst, aux);
			System.out.println("Move " + n + " from " + src + " to " + dst);
			this.hanoi(n - 1, aux, src, dst);
		}
	}

}
