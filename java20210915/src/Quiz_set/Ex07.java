package Quiz_set;

import java.util.HashSet;
import java.util.Set;

public class Ex07 {
	//한번만 사용된 문자 개수
	public int countOnlyLetter(String str) {
		Set<Character> set = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		
		for(int i = 0; i < str.length(); i++) {
			if(set2.contains(str.charAt(i))) {
				set.add(str.charAt(i));
			}else {
				set2.add(str.charAt(i));
			}
		}
		
		for(Character c: set) {
			set2.remove(c);
		}
		return set2.size();
	}
}
