/**
 * Class name-Pyramid
 * @version 1.0
 * 
 * @author Saloni
 *
 */

/*
 * Class is made to print a pattern.
 * Class contains three functions.
 * First function returns the string of spaces.
 * second function returns the string of numbers.
 * Third function returns pattern.
 * 
 */
public class Pyramid
{
	/*
	 * This function returns string of spaces.
	 * @param row
	 * @param n
	 */
	String spaces(int row, int n)
	{
		String str="";
		if(row < n)
		{
			for(int i = row+1; i < n; i++)
			{
				str += " ";
			}
		}
		else
		{
			for(int i = 0; i < row-n+1; i++)
			{
				str += " ";
			}
		}
		return str;
	}
	
	/*
	 * This function returns string of numbers.
	 * @param row
	 * @param n
	 */
	String numbers(int row, int n)
	{
		String num="";
		if(row < n)
		{
			for(int j = 0; j <= row; j++)
			{
				num += (j + 1);
				
			}
			for(int i = row; i > 0; i--)
			{
				num += i;
				
			}
			
			
		}
		
		else
		{
			int k = 9 - row;
			for( int j = 0; j < k; j++)
			{
				num += j+1;
			}
			for( int i = k-1; i > 0 ; i--)
			{
				num += i;
			}
		}
		return num;
	}
	
	/*
	 * This function returns final desired pattern
	 * This function works by concatinating two strings of number and spaces.
	 * @param n
	 */
	String[] print(int n)
	{
		String pattern[] = new String[2*n-1];
		for(int i = 0; i < 2*n-1; i++)
		{
			pattern[i] = spaces(i,n) + numbers(i,n) + spaces(i,n); 
		}
		
		return pattern;
	}
	
	
}
