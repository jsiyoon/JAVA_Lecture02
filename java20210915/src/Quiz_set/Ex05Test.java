package Quiz_set;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex05Test {

	@Test
	void test() {
		Ex05 e = new Ex05();
		
		assertEquals(3,e.CountLetter("cap"));
		assertEquals(3,e.CountLetter("java"));
		assertEquals(6,e.CountLetter("Ironman"));
		assertEquals(1,e.CountLetter("aaaaa"));
	}

}
