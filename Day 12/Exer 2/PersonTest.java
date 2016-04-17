import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void testsNormalName(){
		Person p = new Person();
		String input = "Tom  Lond";
		String output = p.getInitials(input);
		String expected = "TL";
		assertEquals(output, expected);
	}

}