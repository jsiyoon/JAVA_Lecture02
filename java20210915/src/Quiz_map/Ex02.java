package Quiz_map;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {
	
	public Map<Integer, Integer>put(){
		//map�� ���� return
		//1:2, 2:4�߰�
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 2);
		map.put(2, 4);
		
		return map;
	}
}
