package Quiz_set;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class Ex05 {
	public int CountLetter(String str) {
		//str에 몇개의 문자 사용되었는지 리턴
		Set<Character> set = new HashSet<>();
		
		for(int i = 0; i < str.length(); i++) {
				set.add(str.charAt(i));
		}
		return set.size();
	}
}
