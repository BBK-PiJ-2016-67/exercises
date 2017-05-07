public class Doggy {
	String doggyMethod(int n) {
		if (n <= 0) {
			return "";
		}
		return doggyMethod(n-3) + n + doggyMethod(n-2);
	}
	int mcCarthy91(int n) {
		System.out.println(n);
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n + 11));
		}
	}
}
