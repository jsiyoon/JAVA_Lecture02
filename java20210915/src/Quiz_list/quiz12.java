package Quiz_list;

import java.util.List;

public class quiz12 {
	public boolean mirror(List<Integer> list) {
		// list 중간 인덱스 기준으로 왼쪽과 오른쪽이 거울(데칼코마니)처럼 같은지
		for(int i = 0; i < list.size()/2; i++) {
			for(int j = list.size()-1; j >= list.size()/2; i--) {
				return list.get(i) == list.get(j);
			}
		}
		
		return false;
	}
}
