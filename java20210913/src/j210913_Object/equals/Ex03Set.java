package j210913_Object.equals;

import java.util.HashSet;
import java.util.Set;

public class Ex03Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		System.out.println(set.size()); //0
		
		set.add("java");
		System.out.println(set.size()); //1
		
		set.add("python");
		System.out.println(set.size()); //2
		
		set.add("java"); //���� ��ü�� ����� ����.
		System.out.println(set.size());//2
	}
}
