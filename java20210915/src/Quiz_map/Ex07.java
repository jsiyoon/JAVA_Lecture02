package Quiz_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex07 {
	public Map<String, String> swap(Map<String, String> param){
		//param의 size가 2
		//두 value를 서로 바꾼(swap) map만들어서 return
		//param 변경x
		Map<String, String> map = new HashMap<>();
		map.put("b", param.get("a"));
		map.put("a", param.get("b"));
		
		return map;
	}
}
