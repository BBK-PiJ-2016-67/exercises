public class GCD {

	private int test(int l, int h, int d) {
		if (l % d == 0 && h % d == 0) {
			return d;
		}
		return this.test(l, h, d - 1);
	}
	
	public int gcd(int p, int q) {
		if (p < q) {
			return this.test(p, q, p);
		} else {
			return this.test(q, p, q);
		}
	}

}
