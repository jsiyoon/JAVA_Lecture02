package Quiz_set;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {
	public Set<Integer> diff(int[] a, int[]b){
		//a�迭���� �ִ� �����۵鸸 ���� set����
		Set<Integer> set = new HashSet<>();
		
		for(int item : a) {
			set.add(item);
		}
		for(int item : b) {
			set.remove(item);
		}
		
		return set;
	}
}
