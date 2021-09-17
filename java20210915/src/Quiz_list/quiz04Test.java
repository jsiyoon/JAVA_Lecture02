package Quiz_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class quiz04Test {

	@Test
	void test() {
		quiz04 e = new quiz04();
		
		assertEquals(0, e.remainder(0));
		assertEquals(2, e.remainder(2));
		assertEquals(2, e.remainder(12));
		assertEquals(3, e.remainder(33));
	}

}
