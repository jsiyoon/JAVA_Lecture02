package Quiz_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex07 {
	public Map<String, String> swap(Map<String, String> param){
		//param�� size�� 2
		//�� value�� ���� �ٲ�(swap) map���� return
		//param ����x
		Map<String, String> map = new HashMap<>();
		map.put("b", param.get("a"));
		map.put("a", param.get("b"));
		
		return map;
	}
}
