package Quiz;

import java.util.List;

public class quiz08 {
	public int maxLastIndex(List<Integer> list) {
		//list의 최대값이 있는 마지막인덱스
		int max = list.get(0);
		int index = 0;
		
		for(int i =1; i <list.size(); i++) {
			if(list.get(i) >= max) {
				max = list.get(i);
				index = i;
			}
		}
		return index;
	}
}
