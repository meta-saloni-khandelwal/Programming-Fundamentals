/**
 * Class name-Join
 * 
 * @version 1.0
 * @author Saloni
 */

/*
 * A class to join two 1-D array in sorted form.
 */
public class Join 
{
	/*
	 * Below function compares the two arrays and merge it.
	 * The function works by first comparing each elements of the arrays and
	 * the minimum among the two values is pushed to the resultant array.
	 * After it, the remaining elements of the array are pushed to the resultant array
	 * which can not be compared as the elements of one array is pushed completely.  
	 * At last, returns the resultant array in a sorted form.
	 */
	int[] merge(int a[], int asize, int b[], int bsize, int c[])
	{
		int i = 0, j = 0, k = 0;
		while(i < asize && j < bsize)		//compares the elements of the arrays and merge it
		{
			if(a[i] < b[j])
			{
				c[k] = a[i++];
			}
			else
			{
				c[k] = b[j++];
			}
			k++;
		}
		if(j >= bsize)						//join the remaining elements of first array 
		{
			while(i < asize)
			{
				c[k++] = a[i++];
			}
		}
		if(i >= asize)						//join the remaining elements of second array
		{
			while(j < bsize)
			{
				c[k++] = b[j++];
			}
		}
		
		return c;							//returns the resultant soted array 
	}
}
