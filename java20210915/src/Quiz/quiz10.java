package Quiz;

import java.util.ArrayList;
import java.util.List;

public class quiz10 {
	public ArrayList<Integer> evenList(List<Integer> list) {
		// list�� ¦�� �����۵鸸 ���� �� ArrayList�� ���� ����
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
