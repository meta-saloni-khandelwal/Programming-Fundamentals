/**
 * Class name-LongestIncreasingSequence
 * 
 * @version 1.0
 * @author Saloni
 */

/*
 * A class to find the longest increasing subsequence from the given unsorted array.
 */

public class LongestIncreasingSequence 
{
	/*
	 * Below function finds the longest increasing sequence from array.
	 * The function returns the resultant aaray
	 * It is assumed that if there are two longest increasing sequence then first one is 
	 * considered as longest increasing sequence.
	 */
	int[] longestSequence(int input[])
	{
		int seqStart = 0, count = 0, seqLength = 0;
		for(int counter = 1; counter < input.length; counter++)
		{
			if(input[counter] > input[counter-1])
			{
				count++;				//Increment count if the current element is greater than the previous one
			}
			else
			{
				count = 0;				//re-initialize count
			}
			if(count > seqLength)
			{
				seqStart = counter;		//If we find subsequence longer than any we found yet, update sequence length
				seqLength = count;
			}
		}
		int output[] = new int[seqLength+1];
		for(int counter = (seqStart-seqLength), c = 0; counter <= seqStart; counter++)
		{
			output[c++] = input[counter];
		}
				
		return output;			//Returns the longest increasing sequence
		
	}
}
