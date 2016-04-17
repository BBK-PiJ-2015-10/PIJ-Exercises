import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {
	
	  User one;
	  User two;
	  
	  @Before
	  public void setup(){
		  one = new UserImpl("Robert Palmer");
		  two = new UserImpl("Marc Anthony");
	  }
	
      @Test
	  public void testGetters(){		  
		  assertEquals("Robert Palmer",one.getName());
		  assertEquals(0,one.getLibraryID());
	  }
	  
	 @Test
	 public void testRegister(){
		 assertNull(one.getLibrary());
		 Library library = new LibraryImpl("British Library");
		 one.register(library);
		 assertEquals("British Library",one.getLibrary().getLibraryName());
		 assertEquals(1,one.getLibraryID());
		 two.register(library);
		 assertEquals(2,two.getLibraryID());
	 }
	  


}