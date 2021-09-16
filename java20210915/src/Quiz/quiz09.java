package Quiz;

import java.util.List;

public class quiz09 {
	public void removeLastMax(List<Integer> list) {
		//list가장 큰값 삭제
		int max = list.get(0);
		int index = 0;
		for(int i = 0; i < list.size(); i++) {
			if(max <= list.get(i)) {
				max = list.get(i);
				index = i;
			}
		}
		list.remove(index);
	}
}
