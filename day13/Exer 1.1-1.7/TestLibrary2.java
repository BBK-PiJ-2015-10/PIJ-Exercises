import org.junit.*;
import static org.junit.Assert.*;

public class TestLibrary2 {
	
	private LibraryImpl library;
		
	@Before
	public void setup(){
		library = new LibraryImpl("British Library");
	}
	
	@Test
	public void testgetIDs (){
		assertEquals(1,library.getID("Marc"));
		assertEquals(2,library.getID("Tom"));
		assertEquals(2,library.getID("Tom"));
	}
		
	@Test
	public void testgetReaderCount (){
		assertEquals(0,library.getReaderCount());
		library.getID("Marc");
		assertEquals(1,library.getReaderCount());
	}
	
	@Test
	public void testaddBookCount (){
		library.addBook("Swimming like a shark", "Michael Phelps");
		assertEquals(1,library.getBookCount());
		library.addBook("Paradise", "Rafael Arias");
		assertEquals(2,library.getBookCount());
	}
	
	
	@Test
	public void testgetBorrowedBook (){
		assertEquals(0,library.getBorrowedBookCount());
		library.takeBook("Paradise");
		assertEquals(0,library.getBorrowedBookCount());
		library.addBook("Paradise", "Rafael Arias");
		library.takeBook("Paradise");
		assertEquals(1,library.getBorrowedBookCount());
	}
	
	@Test
	public void testreturnBook (){
		Book input = new BookImpl("Paradise", "Rafael Arias");
		library.returnBook(input);
		assertEquals(0,library.getBorrowedBookCount());
		library.addBook("Paradise", "Rafael Arias");
		library.returnBook(input);
		assertEquals(0,library.getBorrowedBookCount());
		library.addBook("Programming in Java", "Ale Cane");		
		library.takeBook("Programming in Java");
		Book input2 = new BookImpl("Programming in Java", "Ale Cane");
		library.returnBook(input2);
		assertEquals(0,library.getBorrowedBookCount());
	}
	
	
}