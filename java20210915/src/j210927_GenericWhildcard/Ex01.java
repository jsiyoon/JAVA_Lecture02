package j210927_GenericWhildcard;

import java.util.ArrayList;

public class Ex01 {
	//whildcard
	public static void main(String[] args) {
		Number n1 = new Integer(3);
		
		ArrayList<Number> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
//		list1 = list2;//�̰� �ȴٸ�
//		list1.add(new Double(3.14)); //�̰� �Ǿ����.
		//list1�� ����Ű�� �ִ� instance�� list2�� ����
		//lists2�� DoubleŸ���� item������ ����
		
		
		//��� : ArrayList<Number>�� ArrayList<Integer>�� ���� Ÿ���� �ƴϴ�.
	}
}
