package Quiz_map;

import java.util.*;
public class Ex04 {
	public Map<String, Integer> length(List<String> strs){
		//list에 있는string을 키, 그 문자열(key)의 길이 value로 갖음.
		//map만들어 return
		Map<String, Integer> map = new HashMap<>();
		
		for(String s : strs) {
			map.put(s, s.length());
		}
		
		return map;
	}
}
