package Quiz_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
	public Map<Integer, Integer> doubling(Map<Integer, Integer> param){
		//param이 가지고 있는 value를 2배한 새 맵 만들어 return
		//param변경되면 안됨.
		Map<Integer, Integer> map = new HashMap<>();
	
		Set<Integer> keys = param.keySet();
		for(Integer key : keys) {
			map.put(key, param.get(key) * 2);
		}
		return map;
	}
}
