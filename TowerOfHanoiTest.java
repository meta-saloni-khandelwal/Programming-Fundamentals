import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TowerOfHanoiTest 
{
	TowerOfHanoi tower = new TowerOfHanoi();
	ArrayList<String> expected = new ArrayList<String>();
	
	@Test
	public void towerOfHanoiTestFor1Disk()
	{
			expected.add( "Move Disk 1 from A to B");
			ArrayList<String> actual = tower.towerOfHanoi("A", "B", "C", 1);
			assertEquals(expected, actual);
		
	}

	@Test
	public void towerOfHanoiTestFor2Disk()
	{
			expected.add( "Move Disk 1 from A to C");
			expected.add( "Move Disk 2 from A to B");
			expected.add( "Move Disk 1 from C to B");
			ArrayList<String> actual = tower.towerOfHanoi("A", "B", "C", 2);
			assertEquals(expected, actual);
		
	}
	
	@Test
	public void towerOfHanoiTestFor3Disk()
	{
		expected.add( "Move Disk 1 from A to B");
		expected.add( "Move Disk 2 from A to C");
		expected.add( "Move Disk 1 from B to C");
		expected.add( "Move Disk 3 from A to B");
		expected.add( "Move Disk 1 from C to A");
		expected.add( "Move Disk 2 from C to B");
		expected.add( "Move Disk 1 from A to B");
		ArrayList<String> actual = tower.towerOfHanoi("A", "B", "C", 3);
		assertEquals(expected, actual);
		
	}
}
