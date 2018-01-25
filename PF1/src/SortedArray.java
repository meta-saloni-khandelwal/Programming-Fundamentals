/**
 * Class name-SortedArray
 * 
 * @version 1.0
 * @author Saloni
 */

/*
 * A class to find whether the given array is sorted in ascending order or descending order or
 * the array is not sorted
 */
public class SortedArray
{
	/*
	 * Below function returns 1 if the array is sorted in increasing order
	 * It returns 2 if the array is sorted in decreasing order
	 * It returns 0 if the array is  not sorted.
	 * The function works by comparing each element with the next element of the array
	 */
	public int checkSortedOrder(int input[])
	{
		int count = 1, count2 = 1;
		for(int counter = 1; counter < input.length; counter++)
		{
			if(input[counter] > input[counter-1])		//comparision for increasing order of the array
			{
				count++;
			}
			else if(input[counter] < input[counter-1])	//comparision for decreasing order of the array
			{
				count2++;
			}
		}
		if(count == input.length)
		{
		return 1;			//It returns 1 if the array is sorted in increasing order
		}
		else if(count2 == input.length)
		{
			return 2;		//It returns 2 if the array is sorted in decreasing order
		}
		else 
			return 0;		//It returns 0 if the array is  not sorted.
	}
}
