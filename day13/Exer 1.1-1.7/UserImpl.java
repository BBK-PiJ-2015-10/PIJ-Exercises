import java.util.*;

/**
*  UserImpl is the implementation of interface User
*  @author YAP
*/
public class UserImpl implements User {

/**
    *This field holds the name of the user.
    */	
	private String name;
	
	/**
    *This field holds the unique ID #.
    */
	private int libraryID;
	
	private Library enrolledlibrary;
	
	
	/**
    *This is the constructor.
    */
	public UserImpl(String name){
		this.name = name;
		//this.libraryID = -1;
	}
	
	
	/**
    *This methods returns the name of the user.
    */
	public String getName(){
		return this.name;
	}
	
	/**
    *This methods returns the ID of the user.
    */
	public int getLibraryID(){
		return this.libraryID;
	}

	public void register(Library library){
		this.enrolledlibrary = library;
		this.libraryID = library.getID(this.name);
	}
	
	public Library getLibrary() {
		return this.enrolledlibrary;
	}
	
	public void setLibraryID(int input){
		this.libraryID = input;
	}
	
	public List booksTaken (Library library){
		return library.borrowedBooks(this.libraryID);
	}	
	
}