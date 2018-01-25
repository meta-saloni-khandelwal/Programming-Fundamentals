import static org.junit.Assert.*;

import org.junit.Test;


public class RemoveDuplicatesTest extends RemoveDuplicates {

	RemoveDuplicates d = new RemoveDuplicates();
	@Test
	//positive test
	public void test()
	{
		
		int []input = new int[]{2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int []resultant = new int[]{2,5,4,6,3,8,9,0};
		assertArrayEquals(resultant,d.RemoveDuplicate(input));
	}
	@Test
	//negative test
	public void test1()
	{
		
		int []input = new int[]{2,2,4,4,5,5};
		int []resultant = new int[]{2,2,5,4,6,3,8,9,0};
		assertArrayEquals(resultant,d.RemoveDuplicate(input));
	}
	@Test
	//positive test
	public void test3()
	{
		
		int []input = new int[]{2};
		int []resultant = new int[]{2};
		assertArrayEquals(resultant,d.RemoveDuplicate(input));
	}

}
