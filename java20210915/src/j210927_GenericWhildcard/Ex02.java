package j210927_GenericWhildcard;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		//�Ķ���ͳ� ����Ÿ�Կ� �ۼ���.
		//Ȯ���� ���𺯼����� ����Ÿ���̸��.(Integer�� Number�� ����Ÿ��)
		ArrayList<? extends Number> list1 = new ArrayList<Integer>();
		list1 = new ArrayList<Double>();
		list1 = new ArrayList<Long>();
		
//		list1 = new ArrayList<Object>();
//		list1 = new ArrayList<String>(); //Number���� ����Ÿ���� �Ұ�.
		
		//����Ÿ������(super)
		ArrayList<? super Number> list2 = new ArrayList<Number>();
		list2 = new ArrayList<Object>();
		
//		list2 = new ArrayList<Integer>();
//		list2 = new ArrayList<Double>(); //Number���� ����Ÿ�ԺҰ�
		
		//���Ѿ���
		ArrayList<?> list3 = new ArrayList<Integer>();
		list3 = new ArrayList<Number>();
		list3 = new ArrayList<String>();
		list3 = new ArrayList<Object>();
		
	}
}
