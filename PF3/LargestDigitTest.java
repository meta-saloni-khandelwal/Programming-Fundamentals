import static org.junit.Assert.*;

import org.junit.Test;


public class LargestDigitTest 
{
	LargestDigit ld = new LargestDigit();
	
	@Test
	public void test1() 
	{
		int expected = 2;
		assertEquals(expected, ld.largestdigit(2));
	}
	
	@Test
	public void test2() 
	{
		int expected = 9;
		assertEquals(expected, ld.largestdigit(1257369));
	}
	
	@Test
	public void test3() 
	{
		int expected = 4;
		assertEquals(expected, ld.largestdigit(444));
	}
}
