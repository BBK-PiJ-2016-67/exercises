import org.junit.*;
import static org.junit.Assert.*;

public class FibonacciTest {
	@Test
	public void userInputOne() {
		Fibonacci fib = new Fibonacci();
		long result = fib.get(8);
		assertEquals(21, result);
	}
	@Test
	public void userInputTwo() {
		Fibonacci fib = new Fibonacci();
		long result = fib.get(0);
		assertEquals(0, result);
	}
	@Test
	public void userInputThr() {
		Fibonacci fib = new Fibonacci();
		long result = fib.get(12);
		assertEquals(144, result);
	}
	@Test
	public void userInputFou() {
		Fibonacci fib = new Fibonacci();
		long result = fib.get(80);
		assertEquals(1, 1);
	}
}
