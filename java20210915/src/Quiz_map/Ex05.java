package Quiz_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
	public Map<Integer, Integer> doubling(Map<Integer, Integer> param){
		//param�� ������ �ִ� value�� 2���� �� �� ����� return
		//param����Ǹ� �ȵ�.
		Map<Integer, Integer> map = new HashMap<>();
	
		Set<Integer> keys = param.keySet();
		for(Integer key : keys) {
			map.put(key, param.get(key) * 2);
		}
		return map;
	}
}
