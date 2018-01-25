/**
 * Class name-RemoveDuplicates
 * 
 * @version 1.0
 * @author Saloni
 */

/*
 * A class to remove duplicate elements from the given array.
 */
public class RemoveDuplicates 
{
		/*
		 * Below function removes the duplicate element and makes the array with unique elements.
		 * The function works by comparing each element with remaining elements and if it finds
		 * any duplicate element then it will replace the element by shifting the elements in left.
		 * The function returns the resultant array in modified size.
		 */
	
	int[] RemoveDuplicate(int input[])
	 {
		 int size, iterator1, iterator2, iterator3;		//to store size of array and iterators for loops
		 size = input.length;
		 if( size == 1 || size == 0)					//if there is no element or one element then it returns same array
			 return input;
		 for( iterator1 = 0; iterator1 < size; iterator1++ )		
		 {
			 for( iterator2 = iterator1 + 1; iterator2 < size; iterator2++ )
			 {
				 if( input[iterator1] == input[iterator2] )		//comparision of each element with remaining elements
				 {
					 for( iterator3 = iterator2; iterator3 < size-1; iterator3++ )
					 {
						 input[iterator3] = input[iterator3 + 1];	//elements are left shifted to get a unique array
					 }
					 iterator2--;
					 size--;			//size of array is modified
				 }
					 
			 }
		 }
		int output[] = new int[size];
		System.arraycopy(input, 0 , output, 0, size);
		return output;			//returns the array of unique elements of modified size
		 
	 }

}
