package Quiz_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class quiz03Test {

	@Test
	void test() {
		assertEquals(0, 0);
		assertEquals(1, 1);
		assertEquals(3.14, 3.14);
//		assertEquals(2, 1);
		
		quiz03 e = new quiz03();
		assertEquals(0, e.triple(0));
		assertEquals(3, e.triple(1));
		assertEquals(6, e.triple(2));
	}

}
