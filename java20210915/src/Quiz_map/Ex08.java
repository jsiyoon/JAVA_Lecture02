package Quiz_map;

import java.util.Map;

public class Ex08 {
	public void swap(Map<String, String> param) {
		//param size : 2
		//param key : "a", "b"
		//param 각 값 변경
		String b = param.get("b");
		param.put("b", param.get("a"));
		param.put("a", b);
		
	}
}
