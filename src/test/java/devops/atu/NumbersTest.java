package devops.atu;

import junit.framework.*;


public class NumbersTest extends TestCase{
	
	Numbers numbers = new Numbers();
   
	//test add method
	public void testAdd() {
		int total = 0;
		total = numbers.
				sum(2,7);
		assertTrue(total == 9);
		
		    		
	}
	

	public void testSubtract() {
		int total = 0;
		total = numbers.subtract(8,3);
		assertTrue(total == 5);
 
		
		//fail("Not yet implemented");
	}
	
	public void testLargest() {
		int largest = 0;
		
		largest = numbers.largest(12, 5);
		
		assertTrue(largest == 12);
		//fail("Not yet implemented");
	}

	public void testSmallest() {
		int smallest = 0;
		smallest = numbers.smallest(18, 3);
		assertTrue(smallest == 3);
				

		//fail("Not yet implemented");
	}
}
