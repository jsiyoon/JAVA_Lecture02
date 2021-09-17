package Quiz_set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public Set<Integer> toSet(int[] arr){
		//파라미터 arr값들 저장한 HashSet객체 리턴
		Set<Integer> set = new HashSet<>();
		
		for(int item : arr) {
			set.add(item);
		}
		
		return set;
	}

	
}
