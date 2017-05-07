import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
	private Library library;
	@Before
	public void librarySetUp() {
		library = new LibraryMock();
	}
	@Test
	public void newUserCanRegisterToLibrary() {
		User user = new User("lucas");
		user.register(library);

	}
}
