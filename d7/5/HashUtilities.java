public class HashUtilities {

	public static int shortHash(int i) {
		return Math.max(1, Math.abs(i)) % 1000;
	}

}