import java.util.Map;
import java.util.HashMap;

public class Fibonacci {
	private Map<Long, Long> map;
	public Fibonacci() {
		this.map = new HashMap<Long, Long>();
	}
	public long get(long n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		// if (this.map.containsKey(n)) {
		// 	return this.map.get(n);
		// }
		long value = get(n - 1) + get(n - 2);
		this.map.put(n, value);
		return value;
	}
}
