package Quiz_set;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public Set<Integer> dupSet(int[] arr){
		//arr배열에 중복된 값들만 set에 모아서 리턴
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int item : arr) {
			if(set2.contains(item)) {
				set.add(item);
			}else {
				set2.add(item);
			}
		}

		return set;
	}
}
