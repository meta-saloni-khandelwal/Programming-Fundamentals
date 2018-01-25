import static org.junit.Assert.*;

import org.junit.Test;


public class SortedArrayTest 
{
	SortedArray checkSortOrder = new SortedArray();
	
	@Test
	public void test() 
	{
		int inputArray[] = {1,4,6,8,9};
		assertEquals(1,checkSortOrder.checkSortedOrder(inputArray));
	}
	
	@Test
	public void test1() 
	{
		int inputArray[] = {122,119,99,88,77,66};
		assertEquals(2,checkSortOrder.checkSortedOrder(inputArray));
	}
	
	@Test
	public void test2() 
	{
		int inputArray[] = {1,4,6,8,9,4,3,96};
		assertEquals(0,checkSortOrder.checkSortedOrder(inputArray));
	}

}
