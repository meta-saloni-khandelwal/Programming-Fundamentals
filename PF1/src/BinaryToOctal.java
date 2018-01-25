/**
 * Class name-BinaryToOctal
 * 
 * @version 1.0
 * @author Saloni
 */

/*
 * A class to convert a given binary number to its equivalent octal number.
 */
public class BinaryToOctal 
{
	/*
	 * Below function converts the binary number to its equivalent octal number.
	 * The function works by first converting the binary number to its equivalent
	 * decimal number.
	 * Then the decimal number is converted to its equivalent octal number.
	 */
		int convertBinaryToOctal(long binary)
		{
			int decimal = 0, octal = 0;			//to store the decimal number and octal number
			int counter = 0;					//counter for loops					
			while( binary != 0 )				//converts binary number to its equivalent decimal number
			{
				decimal += (int)(( binary%10 ) * Math.pow( 2,counter )); 
				counter++;
				binary = binary/10;
			}
			//conversion of decimal to octal
			counter = 1;
			while( decimal != 0 )			 //converts decimal number to its equivalent octal number
			{
				octal += ( decimal%8 ) * counter;
				decimal =decimal/8;
				counter *= 10;
			}
			return octal;					//returns the resultant octal number
		}
}
