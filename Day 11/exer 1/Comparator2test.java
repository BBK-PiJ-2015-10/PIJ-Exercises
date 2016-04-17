import org.junit.*;
import static org.junit.Assert.*;

public class ComparatorTest {
	
	Comparator one;
	
	@Before
	public void Setup(){
		one = new Comparator();
	}
	
	@Test
	public void testmax(){
	    //int output = one.getMax(2,5);
		//int expected = 5;
		//assertEquals(output, expected);
		
		assertEquals(5,one.getMax(2,5));
	}
	
	
	@test
	public void testmax2(){
		assertEquals(5.0,one.getMax(2.0,5.0),0.01);
	}

	@test
	public void testmax3(){
		assertEquals(5.0,one.getMax("2","5"));
	}

	
	
	
}