import static org.junit.Assert.*;

import org.junit.Test;


public class GreatestCommonDivisorTest {
	
	GreatestCommonDivisor g = new GreatestCommonDivisor();

	@Test
	public void test() 
	{
		int expected = 1;
		int actual = g.gcd(2, 1);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2() 
	{
		int expected = 6;
		int actual = g.gcd(12, 18);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test3() 
	{
		int expected = 1;
		int actual = g.gcd(100, 3);
		assertEquals(expected,actual);
	}

}
