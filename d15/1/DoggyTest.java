import org.junit.*;
import static org.junit.Assert.*;

public class DoggyTest {
	@Test
	public void userInput() {
		Doggy doggy = new Doggy();
		int result = doggy.mcCarthy91(95);
		assertEquals(result, 91);
	}
}
