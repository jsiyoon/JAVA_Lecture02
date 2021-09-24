package j210915_TextBook;

import java.util.*;
public class HashSetExample1 {
	//p737
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //Java�� �ѹ��� �����.
		set.add("iBATIS");
		
		int size = set.size(); //����� ��ü �� ���
		System.out.println("�� ��ü��:" + size);
		
		Iterator<String> iterator = set.iterator();//�ݺ��� ���
		while(iterator.hasNext()) { //��ü����ŭ ����
			String element = iterator.next();//�Ѱ��� ��ü ������.
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");//��ü ����
		
		System.out.println("�� ��ü��:" + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.clear();
		if(set.isEmpty()) {System.out.println("�������.");
		}
	}
}
