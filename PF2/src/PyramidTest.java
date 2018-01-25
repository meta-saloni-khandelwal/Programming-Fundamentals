import static org.junit.Assert.*;

import org.junit.Test;


public class PyramidTest
{
	Pyramid p = new Pyramid();

	@Test
	public void test()
	{
		String expected[] = {"    1    ",
							 "   121   ",
							 "  12321  ",
							 " 1234321 ",
							 "123454321",
							 " 1234321 ",
							 "  12321  ",
							 "   121   ",
							 "    1    "};
		String actual[] = p.print(5);
		assertArrayEquals(expected,actual);
	}
	@Test
	public void test1()
	{
		String expected = "    ";
		String actual = p.spaces(0,5);
		assertEquals(expected,actual);
	}
	@Test
	public void test2()
	{
		String expected = "123454321";
		String actual = p.numbers(4,5);
		assertEquals(expected,actual);
	}	
	
}
