package Quiz_set;

import java.util.HashSet;
import java.util.Set;

public class Ex06 {
	//��� ���ڰ� �ߺ� ���Ǿ��°�?
	public int dupLetter(String str) {
		Set<Character> set = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(set.contains(str.charAt(i))) {
				set2.add(str.charAt(i));
			}else {
				set.add(str.charAt(i));
			}
		}
		return set2.size();
	}
}
