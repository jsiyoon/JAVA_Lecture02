package Quiz_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex10 {
	public Map<String, Integer> sum(Map<String, Integer> map1, Map<String, Integer> map2){
		//map1�� map2 Ű �Ѵ� ������ ���ؼ� �߰�
		//���ʿ��� ������ �׳� �߰�
		//�� �� map�� ���� ����
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
