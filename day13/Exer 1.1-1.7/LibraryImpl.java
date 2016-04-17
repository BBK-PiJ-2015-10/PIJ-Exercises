import java.util.*;

public class LibraryImpl implements Library {

	private String libraryname;
	
	private List<UserImpl> userset;
	
	private List<BookImpl> bookset;
	
	private int idcount = 0;
	
	private int bookcount = 0;
	
	private int borrowedbookcount = 0;
	
	public LibraryImpl(String libraryname){
		this.libraryname = libraryname;
		this.userset = new LinkedList<UserImpl>();
		this.bookset = new LinkedList<BookImpl>();
	}
	
	public boolean isRegistered(String username){	
		boolean result = false;
		for (int i=0; i< userset.size();i++){
			String tempname = userset.get(i).getName();
			if (username == tempname){
				result = true;
			}	
		}
		return result;
	}
	
	public int getexistingID(String username, int i){	
		if (userset.get(i).getName() == username) {
			return userset.get(i).getLibraryID();
		}
		else {
			return getexistingID(username,i-1);
		}
	}
	
	public int getID(String username) {
		if (!isRegistered(username)){
			UserImpl input = new UserImpl(username);
			idcount = idcount + 1;
			input.setLibraryID(idcount);
			userset.add(input);
			return idcount;
		}
		else {
			return getexistingID(username, userset.size()-1);
		}
	}	
				
	public String getLibraryName (){
		return this.libraryname;
	}
	
	private int maxbooksperuser=3;
	
	public int getMaxBooksPerUser(){
		return this.maxbooksperuser;
	}
	
	public void setMaxBooksPerUser(int newmaxbooksperuser){
		this.maxbooksperuser = newmaxbooksperuser;
	}	
	
	public void addBook(String title, String author){
		BookImpl input = new BookImpl(title, author);
		bookcount ++;
		bookset.add(input);
	}
	
	public void takeBook(String title){
		if(isInCollection(title)){
			for (int i=0; i< bookset.size();i++){
				if (bookset.get(i).getTitle() == title) {
					if (!bookset.get(i).getTaken()){
						bookset.get(i).setTaken(true);
						borrowedbookcount ++;
					}		
				}
			}
		}
	}
		
	
	public void returnBook(Book book){
		String returntitle = book.getTitle();
		if(isInCollection(returntitle)){
			for (int i=0; i< bookset.size();i++){
				if (bookset.get(i).getTitle() == returntitle) {
					if (bookset.get(i).getTaken()== true){
						bookset.get(i).setTaken(false);
						borrowedbookcount --;
					}
				}
			}
		}
	}
		
	public boolean isInCollection(String title){	
		boolean result = false;
		for (int i=0; i< bookset.size();i++){
			String temptitle = bookset.get(i).getTitle();
			if (temptitle == title){
				result = true;
			}	
		}
		return result;
	}
	
	public int getReaderCount(){
		return idcount;
	}
	
	public int getBookCount(){
		return bookcount;
	}

	public int getBorrowedBookCount(){
		return borrowedbookcount;
	}
	
	
	public List borrowedBooks(int userID){
		List<String> outputlist = new LinkedList<String>();
		for (int i=0; i< bookset.size();i++){
			if (bookset.get(i).getBorrowerID() == userID) {
					outputlist.add(bookset.get(i).getTitle());
				}
		}		
		return outputlist;	
	}
	


	
	
}