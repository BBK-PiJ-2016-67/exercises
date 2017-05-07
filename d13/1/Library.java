public interface Library {
	public int getId(String username);
	public String getName();
	public void setMaxBooksPerUser(int maxBooksPerUser);
	public int getMaxBooksPerUser();
	public void addBook(String title, String author);
	public Book takeBook(String title);
	public void returnBook(Book book);
	public int getReaderCount();
	public int getBookCount();
	public int getBookBorrowedCount();
}