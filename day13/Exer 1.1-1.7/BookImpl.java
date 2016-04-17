/**
*  BookImpl is the implementation of interface Book
*  @author YAP
*/
public class BookImpl implements Book {

    /**
    *This field holds the author of the book.
    */	
	private final String author;
	
	/**
    *This field holds the tittle of the book.
    */
	private final String title;
	
	
	/**
    *Value of 1 if taken, and 0 otherwise.
    */
	private boolean taken;
	
	private int borrowerID;
	
	/**
    *This is the constructor.
    */
	public BookImpl(String title, String author){
		this.title = title;
		this.author = author;
		this.taken = false;
		this.borrowerID = 0;
	}
	
	
	/**
    *This methods returns the author of the book.
    */
	public String getAuthor(){
		return this.author;
	}
	
	/**
    *This methods returns the tittle of the book.
    */
	public String getTitle(){
		return this.title;
	}

	public void setTaken(boolean input){
	    this.taken=input;
	}
	
	public void setborrowerID(User user){
	    this.borrowerID = user.getLibraryID();
	}
	
	
	public String isTaken(){
	    if (this.taken == false){
			return "Book is not taken";
		}
		else {
			return "Book is taken";
		}
	}
	
	public boolean getTaken(){
		return this.taken;
	}
	
	public int getBorrowerID(){
		return this.borrowerID;
	}
	
	
}