import org.junit.*;
import static org.junit.Assert.*;

public class TestExer1a {

	private Exer1a one;

	@Before
	public void buildUp(){
		one = new Exer1a();
	}


	@Test
	public void testsFib1(){
		assertEquals(3,one.fib(4));
	}


}
