package Quiz_map;

import java.util.HashMap;
import java.util.Map;

public class Ex09 {
	public Map<Character,Integer> countCharacter(String str){
		//str의 문자 몇번 나오는지 세어서 
		//문자를 key몇번 value로 갖는 map return
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		return map;
	}
}
