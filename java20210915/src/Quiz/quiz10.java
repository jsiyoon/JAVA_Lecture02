package Quiz;

import java.util.ArrayList;
import java.util.List;

public class quiz10 {
	public ArrayList<Integer> evenList(List<Integer> list) {
		// list의 짝수 아이템들만 모은 새 ArrayList를 만들어서 리턴
		ArrayList<Integer> list2 = new ArrayList<>();
		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i) % 2 == 0) {
//				list2.add(list.get(i));
//			}
//		}
		for(int item : list) {
			if((item % 2) ==0) {
				list2.add(item);
			}
		}
			return list2;
		}
}
