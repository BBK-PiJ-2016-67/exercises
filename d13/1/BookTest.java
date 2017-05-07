import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
	@Test
	public void constructorWith2Strings() {
		BookImpl b = new BookImpl("bob", "my favourite trains");
		String author = b.getAuthor();
		String title = b.getTitle();
		assertEquals(author, "bob");
		assertEquals(title, "my favourite trains");
	}
}