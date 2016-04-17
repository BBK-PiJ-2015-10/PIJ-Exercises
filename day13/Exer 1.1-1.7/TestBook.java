import org.junit.*;
import static org.junit.Assert.*;

public class TestBook {
	
	  Book one;
	  
	  @Before
	  public void setup(){
		  one = new BookImpl("Smith","Wealth of nations");
	  }
	

      @Test
	  public void testGetters(){		  
		  assertEquals("Smith",one.getAuthor());
		  assertEquals("Wealth of nations",one.getTitle());
	  }
	  
	  
	  


}