package Quiz_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex06 {
	
	public void doubling(Map<Integer, Integer> map) {
			// �Ķ���� map�� �� ��(value)�� 2���
			Set<Integer> keys = map.keySet();
			for(Integer key : keys) {
				map.put(key, map.get(key)*2);
			}
		}
}
