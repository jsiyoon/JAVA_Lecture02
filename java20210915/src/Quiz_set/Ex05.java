package Quiz_set;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class Ex05 {
	public int CountLetter(String str) {
		//str�� ��� ���� ���Ǿ����� ����
		Set<Character> set = new HashSet<>();
		
		for(int i = 0; i < str.length(); i++) {
				set.add(str.charAt(i));
		}
		return set.size();
	}
}
