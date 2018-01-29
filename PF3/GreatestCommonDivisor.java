/**
 * Class name-GreatestCommonDivisor
 * @version 1.0
 * 
 * @author Saloni
 *
 */

/*
 *  A class to find greatest common divisor using recursion.
 */

public class GreatestCommonDivisor 
{
	/*
	 * Below function works by finding the gcd of two numbers using recursion.
	 * It is assumed that the numbers is greater than zero.
	 * The function works by calling the same function by remainder of two numbers.
	 */
	int gcd(int x, int y)
	{
		if(x > 0 && y > 0)
		{
			if(x % y == 0)
			{
				return y;
			}
			else
			{
				return gcd(y, x % y);
			}
		}
		else
		{
			return y;
		}
	}
	
}
