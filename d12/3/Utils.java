package impl;

public class Utils {

	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].isEmpty()) {
				continue;
			}
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}
		return result;
	}

}
