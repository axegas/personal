import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest{
/*

	void test() {
		fail("Not yet implemented");
	}
*/	@Test
	public void selectionSort() {
		int[] v1 = {14,21,12,7,9};
		Vector.selectionSort(v1);
		assertArrayEquals(new int[] {7,9,12,14,21},v1);
		
	}
	@Test
	public void insercionDirecta() {
		int[] v1 = {14,21,12,7,9};
		Vector.insercionDirecta(v1);
		assertArrayEquals(new int[] {7,9,12,14,21},v1);
		
	}

	@Test
	public void max() {
		assertEquals(24,Vector.max(new int[] {4,14,24,8,7}));
		 
	}
	
	
}
