package Quiz_map;

import java.util.HashMap;
import java.util.Map;

public class Ex09 {
	public Map<Character,Integer> countCharacter(String str){
		//str�� ���� ��� �������� ��� 
		//���ڸ� key��� value�� ���� map return
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		return map;
	}
}
