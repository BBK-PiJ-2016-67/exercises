import org.junit.*;
import static org.junit.Assert.*;

public class ExceptionImplTest {
	@Test
	public void userInput() {
		ExceptionImpl codeFlow = new ExceptionImpl();
		codeFlow.add(1);
	}
}
