package j210927_lamdaQuiz;

import java.util.*;

public class Ex13 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		
		//forEach
		map.forEach((k,v) -> System.out.println(k + ":" + v));
		
		map.compute(1, (k,v) -> v*10);
		map.forEach((k,v) -> System.out.println(k + ":" + v));
		
		map.compute(4, (k,v) -> v == null ? k*10 : v+10);
		map.forEach((k,v) -> System.out.println(k + ":" + v));
	}
}
