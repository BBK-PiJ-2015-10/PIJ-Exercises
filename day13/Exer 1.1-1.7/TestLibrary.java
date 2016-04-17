import org.junit.*;
import static org.junit.Assert.*;

public class TestLibrary {
	
	private static LibraryImpl library;
	
	@BeforeClass
	public static void setup(){
		library = new LibraryImpl("British Library");
	}
	
	@Test
	public void testGetIDs (){
		//library.getID("Marc");
		assertEquals(1,library.getID("Marc"));
		assertEquals(2,library.getID("Tom"));
		assertEquals(2,library.getexistingID("Tom",1));
		assertEquals(true,library.isRegistered("Marc"));
		assertEquals(false,library.isRegistered("Tonto"));
	}

	@Test
	public void testIsRegistered (){
		assertEquals(false,library.isRegistered("Marc"));
		assertEquals(false,library.isRegistered("Tonto"));
	}
	

}