package Quiz_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex10 {
	public Map<String, Integer> sum(Map<String, Integer> map1, Map<String, Integer> map2){
		//map1과 map2 키 둘다 있으면 더해서 추가
		//한쪽에만 있으면 그냥 추가
		//한 새 map을 만들어서 리턴
		Map<String, Integer> map = new HashMap<>();
		Set<String> keys1 = map1.keySet();
		Set<String> keys2 = map2.keySet();
		
//		for(String key1 : keys1) {
//			for(String key2 : keys2) {
//				if(key1.equals(key2)) {
//					map.put(key1, map1.get(key1) + map2.get(key2));
//				}
//			}
//			if(!map.containsKey(key1)) {
//				map.put(key1, map1.get(key1));
//			}
//		}
//		
//		for(String key2 : keys2) {
//			if(!map.containsKey(key2)) {
//				map.put(key2, map2.get(key2));
//			}
//		}
		
		for(String key1 : keys1) {
			map.put(key1, map1.get(key1));
		}
		for(String key2 : keys2) {
			if(map.containsKey(key2)) {
				map.put(key2, map.get(key2)+ map2.get(key2));
			}else {
				map.put(key2, map2.get(key2));
			}
		}
		return map;
	}
}
