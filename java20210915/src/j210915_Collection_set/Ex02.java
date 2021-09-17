package j210915_Collection_set;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		Set<Integer> set;
//		set = new Set<>(); //Interface���� interface���� �� ����.
		
		set = new HashSet<>();
		set.add(3);
		set.add(33);
		set.add(6);
		
		System.out.println(set.size());
		
		set.add(33); //set�� �ߺ��� ���� ������������.
		
		System.out.println(set.size()); //set size�þ�� ����.
		
		/* set�� index���·� ���� �������� �ʾ� ���� �Ұ�.
		for(int i = 0; i < set.size(); i++) {
			set.get(i);
		}
		*/
		//���� for������ ������ ���. -> ���� ���� x
		System.out.println("������ ���");
		for(int item : set) {
			System.out.println(item);
		}
		
		System.out.println("������ Ž��");
		boolean b = set.contains(3);
		System.out.println(b); //true
		System.out.println(set.contains(5)); //false
		
		System.out.println("������ ����");
		set.remove(3);
		set.remove(5); //���� ������ �����ϸ� �ƹ��ϵ� �Ͼ�� ����.
		System.out.println(set.size()); //2
	}
}
