public class StringMap implements SimpleMap {

	private String[] map;
	private int count;

	public StringMap() {
		map = new String[1000];
		count = 0;
	}

	public void put(int key, String name) {
		count++;
		map[key] = name;
	}

	public String get(int key) {
		return map[key];
	}

	public void remove(int key) {
		count--;
		map[key] = null;
	}

	public boolean isEmpty() {
		return count == 0;
	}

}