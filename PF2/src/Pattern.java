/**
 * Class name-Pattern
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
public class Pattern
{
	/*
	 * This function returns string of spaces.
	 * @param row
	 * @param n
	 */
	String spaces(int row, int n)
	{
		String str="";
		for(int i = 0; i < row; i++)
		{
			str += " ";
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
		
			for(int j = 1; j <= (n-row); j++)
			{
				num += j;
				
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
		String pattern[] = new String[n];
		int j = 0;
		for(int i = 0; i < n; i++)
		{
			pattern[j] = spaces(i,n) + numbers(i,n);
			j++;
			System.out.println(pattern[i]);
			
		}
		
		return pattern;
		
	}
	
}
