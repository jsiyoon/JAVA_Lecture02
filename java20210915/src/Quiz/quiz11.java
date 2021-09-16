package Quiz;

import java.util.ArrayList;
import java.util.List;

public class quiz11 {
	public ArrayList<Integer> minMax(List<Integer> list) {
		
		// 파라미터로 받은 list의 최소값, 최대값을 아이템으로 갖는 ArrayList 리턴
		ArrayList<Integer> result = new ArrayList<>();
		
		int min = list.get(0), max = list.get(0);
//		for(int i = 1; i < list.size(); i++) {
//			if(min > list.get(i)) {
//				min = list.get(i);
//			}
//			if(max < list.get(i)) {
//				max = list.get(i);
//			}
//		}

		for(int item : list) {
			min = Math.min(min, item);
			max = Math.max(max, item);
		}
		result.add(min);
		result.add(max);
		return result;
	}
}
