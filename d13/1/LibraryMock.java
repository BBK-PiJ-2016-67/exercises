public class LibraryMock implements Library {
	public int getId(String username) {
		return 1;
	}
	public String getName() {
		return "Mock Library";
	}
	public int getMaxBooksPerUser() {
		return 1;
	}
	public void setMaxBooksPerUser(int maxBooksPerUser) {}
	public void addBook(String title, String author) {}
	public Book takeBook(String title) {
		return null;
	}
	public void returnBook(Book book) {}
}