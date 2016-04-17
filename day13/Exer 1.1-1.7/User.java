import java.util.*;

public interface User {

	String getName();
	
	int getLibraryID();
	
	void register(Library library);
	
	Library getLibrary();
	
	public List booksTaken (Library library);
	

}