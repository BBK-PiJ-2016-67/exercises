public class Palindrome {
	
	public boolean test(String string) {
		int length = string.length();
		if (length <= 1) {
			return true;
		}
		if (string.charAt(0) != string.charAt(length - 1)) {
			return false;
		}
		return this.test(string.substring(1, length - 1));
	}

}
