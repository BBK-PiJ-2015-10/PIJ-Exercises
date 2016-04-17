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
		assertEquals(5,one.getMax(2,5));
	}
	
	
	@Test
	public void testmax2(){
		assertEquals(5.0,one.getMax(2.0,5.0),0.01);
	}

	@Test
	public void testmax3(){
		assertEquals("5.0",one.getMax("2","5"));
	}

	
	
	
}