package Quiz_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class quiz05Test {

	@Test
	void test() {
		quiz05 e = new quiz05();
		
		assertEquals(7, e.sum("3 4"));
		assertEquals(43, e.sum("10 33"));
		assertEquals(0, e.sum("-5 5"));
	}
}
