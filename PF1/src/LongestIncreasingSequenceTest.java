import static org.junit.Assert.*;

import org.junit.Test;


public class LongestIncreasingSequenceTest
{
	LongestIncreasingSequence LIS = new LongestIncreasingSequence();
	@Test
	public void test() 
	{
		 int inputArray[] = new int[]{1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int outputArray[] = new int[]{1, 2,4,5,6,7,8,9};
		assertArrayEquals(outputArray, LIS.longestSequence(inputArray));
	}
	

}
