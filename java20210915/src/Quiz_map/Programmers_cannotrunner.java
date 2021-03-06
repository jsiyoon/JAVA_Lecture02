package Quiz_map;

import java.util.HashMap;
import java.util.Map;

public class Programmers_cannotrunner {
	public String solution(String[] p, String[] c) {
		Map<String, Integer> map = new HashMap<>();
		
		for (String name : c) {
			if (map.containsKey(name)) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}
		}
		
		System.out.println(map);

		for(String name : p) {
			if(!map.containsKey(name)) {
				return name;
			}else {
				if(map.get(name)==0) {
					return name;
				}
				map.put(name, map.get(name)-1);
			}
		}
		return null;
	}
}
