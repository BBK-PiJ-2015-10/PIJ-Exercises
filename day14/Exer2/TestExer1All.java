import org.junit.*;
import static org.junit.Assert.*;

public class TestExer1All {

	private Exer1a one;
	
	private Exer1b two;

	@Before
	public void buildUp(){
		one = new Exer1a();
		two = new Exer1b();
	}


	@Test
	public void testsFib1(){
		assertEquals(two.fib(20),one.fib(20));
	}


}
