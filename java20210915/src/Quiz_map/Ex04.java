package Quiz_map;

import java.util.*;
public class Ex04 {
	public Map<String, Integer> length(List<String> strs){
		//list�� �ִ�string�� Ű, �� ���ڿ�(key)�� ���� value�� ����.
		//map����� return
		Map<String, Integer> map = new HashMap<>();
		
		for(String s : strs) {
			map.put(s, s.length());
		}
		
		return map;
	}
}
