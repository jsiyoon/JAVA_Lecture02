package Quiz_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex06 {
	
	public void doubling(Map<Integer, Integer> map) {
			// 파라미터 map의 각 값(value)을 2배로
			Set<Integer> keys = map.keySet();
			for(Integer key : keys) {
				map.put(key, map.get(key)*2);
			}
		}
}
