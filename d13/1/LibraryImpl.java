import java.util.HashMap;

public class LibraryImpl implements Library {
	private String name;
	private int maxBooksPerUser;
	private HashMap<String, Book> bookList = new HashMap<String, Book>();
	private HashMap<String, Integer> userList = new HashMap<String, Integer>();
	public LibraryImpl(String name) {
		this.name = name;
	}
	public void addBook(String title, String author) {
		if (bookList.containsKey(title)) {
			return;
		}
		Book book = new BookImpl(author, title);
		bookList.put(title, book);
	}
	public int getId(String username) {
		if (userList.containsKey(username)) {
			return userList.get(username);
		}
		int id = userList.size() + 1;
		userList.put(username, id);
		return id;
	}
	public String getName() {
		return this.name;
	}
	public int getMaxBooksPerUser() {
		return this.maxBooksPerUser;
	}
	public void returnBook(Book book) {
		String title = book.getTitle();
		if (bookList.containsKey(title)) {
			return;
		}
		bookList.put(title, book);
	}
	public void setMaxBooksPerUser(int maxBooksPerUser) {
		this.maxBooksPerUser = maxBooksPerUser;
	}
	public Book takeBook(String title) {
		if (bookList.containsKey(title)) {
			Book book = bookList.get(title);
			bookList.remove(title);
			return book;
		}
		return null;
	}
}
