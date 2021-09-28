package j210927_lamda;

import java.util.*;

public class Ex11Comparator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,7,2,4,1);
		
		System.out.println(list);
		
		list.sort((o1,o2) -> o1 - o2);
		System.out.println(list);
		
		list.sort((a,b) -> b - a);
		System.out.println(list);
		
		list.sort((a,b) -> a.compareTo(b));
		System.out.println(list);
		
		List<String> arr = Arrays.asList("java", "apple", "spring", "jsp");
//		arr.sort((o1,o2) -> o1 - o2); //���Ұ�
		System.out.println(arr);
		
		arr.sort((a,b) -> a.compareTo(b));
		System.out.println(arr);
		
		arr.sort((o1,o2) -> o2.compareTo(o1));
		System.out.println(arr);
	}
}
