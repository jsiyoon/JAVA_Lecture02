package j210927_lamda;

import java.util.*;

public class Ex14FinalVariable {
	public static void main(String[] args) {
		
		final int a = 3; //final�� ���� 1���� �Ҵ���� �� �ְ���.
//		a = 4; // a�� �� ���Ҵ� �Ұ�.
		int sum = 0;
		List<Integer> list = Arrays.asList(3,4,5);
//		list.forEach(e -> sum += e); //���������� ������ �� ����.
									 //����ϴ� ���������� final�̾�� ��
									 //final�ƴϸ� final�� ������.
		list.forEach(e -> System.out.println(sum)); //����� ����
	}
}
