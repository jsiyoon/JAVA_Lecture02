package j210915_Collection_list;

import java.util.*;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("html");
		
		System.out.println(list.get(2));//IndexOutOfException¹ß»ý -> ÀÎµ¦½º ¹þ¾î
	}
}
