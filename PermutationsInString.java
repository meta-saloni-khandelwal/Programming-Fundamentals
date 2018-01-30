/**
 * 
 * Class name - PermutationsInString 
 * Created on - 30/01/18
 * Reference no - Programming Fundamentals-4
 * 
 * version 1.0
 * @author Saloni Khandelwal
 *
 */
import java.util.ArrayList;


public class PermutationsInString 
{
	public ArrayList<String> permutate = new ArrayList<String>();  //List to store all permutations of string
	/*
	 * Below function swaps character at position
	 * @param s
	 * @param i
	 * @param j
	 * @return swapped string
	 */
	
	public String swap(String s, int i, int j)
	{
		char temp;
		char charArray[] = s.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
		
	}
	
	/*
	 * Below function returns all the permutations of the string using backtracking.
	 * @param str
	 * @param start
	 * @param end
	 * @return all permutations of string
	 */
	public ArrayList<String> generatePermutations(String str, int start, int end)
	{
		if(start == end)			//Checks if starting and ending index are same. If they are equal
		{							//then no characters to be permuted.
			permutate.add(str);
		}
		else
		{
			for(int i = start; i <= end; i++)
			{
				str = swap(str, start, i);
				generatePermutations(str, start + 1, end);
				str = swap(str, start, i);
			}
		}
		return permutate;
		
	}
}
