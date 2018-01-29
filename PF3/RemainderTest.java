import static org.junit.Assert.*;

import org.junit.Test;


public class RemainderTest
{
	Remainder r = new Remainder();
	
	@Test
	public void test()
	{
		int expected = 0;
		int actual = r.rem(2, 1);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2()
	{
		int expected = 2;
		int actual = r.rem(2, 0);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test3()
	{
		int expected = 1;
		int actual = r.rem(100, 3);
		assertEquals(expected,actual);
	}

}
