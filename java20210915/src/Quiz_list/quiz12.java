package Quiz_list;

import java.util.List;

public class quiz12 {
	public boolean mirror(List<Integer> list) {
		// list �߰� �ε��� �������� ���ʰ� �������� �ſ�(��Į�ڸ���)ó�� ������
		for(int i = 0; i < list.size()/2; i++) {
			for(int j = list.size()-1; j >= list.size()/2; i--) {
				return list.get(i) == list.get(j);
			}
		}
		
		return false;
	}
}
