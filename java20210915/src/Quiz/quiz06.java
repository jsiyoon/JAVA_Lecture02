package Quiz;
import java.util.*;

public class quiz06 {
	public int max(List<Integer> list) {
		//list�������� �ִ밪 ����
		int max = list.get(0);
//		for(int i = 1; i < list1.size(); i++) {
//			if(max < list1.get(i)) {
//				max = list1.get(i);
//			}
//		}
		for(int item : list) {
			max = (max < item) ? item : max;
		}
		
		return max;
		
	}
}
