public class Power {
	
	public int pow(int a, int b) {
		if (b == 0) {
			return 0;
		} else if (b == 1) {
			return a;
		}
		return this.pow(a, b - 1) * a;
	}

}
