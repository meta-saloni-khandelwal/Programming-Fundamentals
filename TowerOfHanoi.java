/**
 * 
 * Class name - TowerOfHanoi 
 * Created on - 30/01/18
 * Reference no - Programming Fundamentals-4
 * 
 * version 1.0
 * @author Saloni Khandelwal
 *
 */
import java.util.ArrayList;


public class TowerOfHanoi 
{
	/*
	 * Below function uses three rods with n discs placed over the other.
	 * First one is source tower by which discs is to be moved.
	 * Second is destination tower where discs is to be moved.
	 * Last is temp tower which is used to transfer discs.
	 * Only one disc can be moved at a time.
	 * Always place a smaller disc on bigger disc
	 * @param source
	 * @param destination
	 * @param temp
	 * @param numOfDisk
	 * @return finalList
	 */
	public ArrayList<String> finalList = new ArrayList<String>();
	
	public ArrayList<String> towerOfHanoi(String source, String destination, String temp, int numOfDisk)
	{
		if(numOfDisk == 1)
		{
			finalList.add("Move Disk " + numOfDisk  + " from " + source + " to " + destination);
			return finalList;
		}
		
			towerOfHanoi(source,  temp,destination, numOfDisk-1);
			finalList.add("Move Disk " + numOfDisk + " from " + source + " to " + destination);
			towerOfHanoi(temp, destination, source, numOfDisk-1);
		
		return finalList;
		
	
		
	}

}
