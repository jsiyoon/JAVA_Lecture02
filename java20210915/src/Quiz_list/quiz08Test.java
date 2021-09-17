package Quiz_list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class quiz08Test {

	@Test
	void test() {
		quiz08 e = new quiz08();
		
		assertEquals(3, e.maxLastIndex(Arrays.asList(8,9,10,10,9,8)));
		assertEquals(5,e.maxLastIndex(Arrays.asList(-1,-2,-3,-100,-200,-1)));
		assertEquals(3, e.maxLastIndex(Arrays.asList(10,9,8,100,1,2,3)));
	}

}
