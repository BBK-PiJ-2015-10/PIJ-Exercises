import org.junit.*;
import static org.junit.Assert.*;

public class TestExer1b {

	private Exer1b one;

	@Before
	public void buildUp(){
		one = new Exer1b();
	}


	@Test
	public void testsFib1(){
		assertEquals(3,one.fib(4));
	}


}
