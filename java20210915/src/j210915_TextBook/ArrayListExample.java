package j210915_TextBook;

import java.util.ArrayList;
import java.util.List;
//728p
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java"); //String��ü����
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); //2��°�� Database�����Ѵٴ� ��
		list.add("iBATIS");
		list.add("iBATIS");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("�� ��ü��:" + size); //5
		System.out.println();
		
		String skil1 = list.get(2); //2���ε��� ��ü���
		System.out.println("2:" + skil1);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2); // Database������
		list.remove(2); // Servlet/JSP������
		list.remove("iBATIS"); // 3���� iBATIS�� �Ѱ��� iBATIS�� ������.
		list.removeIf(str -> str.equals("iBATIS")); // ��� iBATIS������.
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
