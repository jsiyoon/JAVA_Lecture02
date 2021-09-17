package Quiz_list;

import java.util.List;

public class quiz07 {
	public int maxIndex(List<Integer> list) {
		//최대값이 있는 인덱스 리턴
		int max = list.get(0);
		int num = 0;
		
		for(int i = 1; i < list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
				num = i;
			}
		}

		return num;
	}
}
