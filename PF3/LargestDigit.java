/**
 * Class name-GreatestCommonDivisor
 * @version 1.0
 * 
 * @author Saloni
 *
 */

/*
 *  A class to find largest digit using recursion.
 */

public class LargestDigit 
{
	/*
	 *  Below function works by finding the largest digit in a given number 
	 *  and calls the same function by a new number.
	 *  The function returns the largest digit by dividing the number by 10 
	 *   and comparing it with the remainder of the given number.
	 * 
	 */
	int largestdigit(int x)
	{
		int digit, newDigit;
		if(x == 0)
		{
			return 0;
		}
		else
		{
			digit = x % 10;
			newDigit = largestdigit(x / 10);
			if(newDigit > digit)
			{
				return newDigit;
			}
			else
			{
				return digit;
			}
		}
	}
}



