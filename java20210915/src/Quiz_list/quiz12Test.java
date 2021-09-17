
package Quiz_list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class quiz12Test {

	@Test
	void test() {
		quiz12 e = new quiz12(); 
		
		assertEquals(true, e.mirror(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
		assertEquals(true, e.mirror(Arrays.asList(5, 4, 2, 2, 4, 5)));
		assertEquals(false, e.mirror(Arrays.asList(1, 2, 3, 1, 2, 3)));
	}

}
