package Quiz_set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public Set<Integer> toSet(int[] arr){
		//�Ķ���� arr���� ������ HashSet��ü ����
		Set<Integer> set = new HashSet<>();
		
		for(int item : arr) {
			set.add(item);
		}
		
		return set;
	}

	
}
