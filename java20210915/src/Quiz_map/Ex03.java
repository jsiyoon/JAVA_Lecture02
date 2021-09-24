package Quiz_map;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
	public Map<Integer, Integer> triple(){
		//map¸¸µé¾î¼­ return
		//Å° : value ÃÑ 5°³
		// ¹ë·ù : Å° * 3
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 3);
		map.put(2, 6);
		map.put(3, 9);
		map.put(4, 12);
		map.put(5, 15);
		
		return map;
	}
}
