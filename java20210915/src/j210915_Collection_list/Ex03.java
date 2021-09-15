package j210915_Collection_list;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList <>();
		
		list.add("java");
		list.add("spring");
		list.add("js");
		System.out.println("크기:" + list.size()); //3
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add("boot");
		list.add("list");
		System.out.println("크기:" + list.size());//5
		
		for(String str : list) {
			System.out.println(str);
		}
		
		list.forEach(str -> System.out.println(str));
		
		System.out.println(list);
	}
}
