package Quiz_set;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public Set<Integer> dupSet(int[] arr){
		//arr�迭�� �ߺ��� ���鸸 set�� ��Ƽ� ����
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
