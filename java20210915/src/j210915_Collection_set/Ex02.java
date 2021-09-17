package j210915_Collection_set;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Set<Integer> set;
//		set = new Set<>(); //Interface여서 interface만들 수 없음.
		
		set = new HashSet<>();
		set.add(3);
		set.add(33);
		set.add(6);
		
		System.out.println(set.size());
		
		set.add(33); //set은 중복된 값을 저장하지않음.
		
		System.out.println(set.size()); //set size늘어나지 않음.
		
		/* set은 index형태로 값을 저장하지 않아 접근 불가.
		for(int i = 0; i < set.size(); i++) {
			set.get(i);
		}
		*/
		//향상된 for문으로 아이템 출력. -> 순서 보장 x
		System.out.println("아이템 출력");
		for(int item : set) {
			System.out.println(item);
		}
		
		System.out.println("아이템 탐색");
		boolean b = set.contains(3);
		System.out.println(b); //true
		System.out.println(set.contains(5)); //false
		
		System.out.println("아이템 삭제");
		set.remove(3);
		set.remove(5); //없는 아이템 삭제하면 아무일도 일어나지 않음.
		System.out.println(set.size()); //2
	}
}
