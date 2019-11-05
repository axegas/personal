package personal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class VectorTest {

	@Test
	void indexOf() {
		int[] v = {17,12,15,9,14};
		

		assertEquals(2,Vector.indexOf(v, 15));

		
	}

}
