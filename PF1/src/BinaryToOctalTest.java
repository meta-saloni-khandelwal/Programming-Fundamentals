import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryToOctalTest {

	@Test
	//positive test
	public void test() 
	{
		BinaryToOctal b = new BinaryToOctal();
		assertEquals( 65,b.convertBinaryToOctal( 110101 ));
	}
	@Test
	//negative test
	public void test1() 
	{
		BinaryToOctal b = new BinaryToOctal();
		assertEquals( 65,b.convertBinaryToOctal( 110111 ));
	}
}
