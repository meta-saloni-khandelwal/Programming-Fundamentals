import static org.junit.Assert.*;

import org.junit.Test;


public class PatternTest {
	Pattern p = new Pattern();
	
	@Test(timeout=4000)
	public void test() 
	{
			String expected[] = { "12345",
								  " 1234",
								  "  123",
								  "   12",
								  "    1"};
			String actual[] = p.print(5);
			assertArrayEquals(expected,actual);
	}

}
