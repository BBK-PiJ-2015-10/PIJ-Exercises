import java.util.*;

public interface Library {

	int getID(String username);
	
	public String getLibraryName ();
	
	public List borrowedBooks(int userID);
	
	public boolean isRegistered(String username);
	
	public int getexistingID(String username, int i);
	
	public void addBook(String title, String author);
	
	public void takeBook(String title);
	
	public void returnBook(Book book);
	
	public boolean isInCollection(String title);
	
	public int getBorrowedBookCount();
	
	public int getBookCount();
	
	public int getReaderCount();
	
    public void setMaxBooksPerUser(int newmaxbooksperuser);
	
	public int getMaxBooksPerUser();
	
	
	
	

}