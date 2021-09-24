package Quiz_map;

import java.util.*;

public class map_Ex_textbook {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			if(maxScore < map.get(key)) {
				maxScore = map.get(key);
				name = key;
			}
			totalScore += map.get(key);
		}
		
		System.out.println("평균:" + totalScore/map.size());
		System.out.println("최고점수아이디:" + name + ",최고점수:" + maxScore);
	}
}
