package j210915_Collection_map;

import java.util.HashMap;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		//MAP
		//Key : value쌍으로 저장
		
		HashMap<Integer, Integer> map;
		map = new HashMap();
		
		//put : key:value쌍 추가
		map.put(100, 300);
		map.put(500, 3000);
		
		//size : map의 크기
		System.out.println(map.size());
		
		//get : key로 value얻기
		Integer v1 = map.get(100);
		System.out.println(v1);
		System.out.println(map.get(500));
		System.out.println(map.get(6000)); //없는 키는 null리턴
		
		//put : 이미 있는 Key로 Value추가 -> 덮어씀
		map.put(500, 7000);
		System.out.println(map.get(500));
		System.out.println(map.size()); //사이즈 변하지 않음
		
		//keySet : Key 집합(set)리턴
		System.out.println("===Keys===");
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		//전체 key:value쌍(entry)탐색
		//1. key set얻고
		//2. key로 value탐색
		System.out.println("===탐색1===");
		keys = map.keySet(); //1. key set얻고
		for(Integer key : keys) { //2. key로 value탐색
			System.out.println(key + ":" + map.get(key));
		}
	}
}
