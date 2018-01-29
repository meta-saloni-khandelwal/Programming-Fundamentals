/**


 * 
 * Class name-Pattern
 * @version 1.0
 * 
 * @author Saloni
 *
 */

/*
 *  A class to find the remainder using recursion.
 */

public class Remainder 
{
	/*
	 * Below function finds the remainder by subtractng the divident by divisor.
	 * It is assumed that two numbers are greater than zero.
	 * If the value is greater than divisor then the value and divisor is returned and
	 * If the value is smaller than divisor then it is the resultant remainder.
	 * 
	 */
	int rem(int x, int y)
	{
		if(y == 0)
		{
			return x;
		}
		else                         
		{
			x = x - y;
			if(x < y)  
			{
				return x;		//returns final result
			}
			else
			{
			 return rem(x, y);		//Calls function
			}
		}
	}
}
