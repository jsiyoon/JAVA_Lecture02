package Quiz;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class quiz07Test {

	@Test
	void test() {
		quiz07 e = new quiz07();
		assertEquals(2, e.maxIndex(Arrays.asList(33,3,100,-80)));
		assertEquals(3, e.maxIndex(Arrays.asList(7,8,9,10)));
		assertEquals(3, e.maxIndex(Arrays.asList(-10,-8,-6,-1,-5)));
	}
}
