package j210927_lamdaQuiz;

import java.util.*;

public class Ex14 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("spring", 1);
		map.put("java", 1);
		map.put("html", 1);
		map.put("css", 1);
		
		//map.replaceAll
		map.replaceAll((k,v) -> k.length());
		
		//Ǯ�
		map.replaceAll((k,v)->{
			System.out.println(k+ ":"+ v);
			return k.length();
		});
		
		System.out.println(map);
	}
}
