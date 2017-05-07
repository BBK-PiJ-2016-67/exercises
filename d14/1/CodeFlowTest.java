import org.junit.*;
import static org.junit.Assert.*;

public class CodeFlowTest {
	@Test
	public void userInput0() {
		CodeFlow codeFlow = new CodeFlow();
		codeFlow.launch(0);
	}
	@Test
	public void userInput2() {
		CodeFlow codeFlow = new CodeFlow();
		codeFlow.launch(2);
	}
	@Test
	public void userInput4() {
		CodeFlow codeFlow = new CodeFlow();
		codeFlow.launch(4);
	}
	@Test
	public void userInput6() {
		CodeFlow codeFlow = new CodeFlow();
		codeFlow.launch(6);
	}
}