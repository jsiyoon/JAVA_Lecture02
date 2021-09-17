package j210915_Collection_set;

import java.util.HashSet;
import java.util.Set;

public class Ex01Lotto {
	public static void main(String[] args) {
		//set : 자동 중복제거 , but 자동정렬 안됨.
		//보통 순서 상관없을때 사용.
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 6){
			int ran = (int)(Math.random() * 45) +1;
			System.out.println(ran);
			lotto.add(ran);
		}
		
		System.out.println("=========================");
		
		for(int l : lotto) {
			System.out.println(l);
		}
	}
}
