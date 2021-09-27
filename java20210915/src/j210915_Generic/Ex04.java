package j210915_Generic;

import java.util.List;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list1 =  Arrays.<String>asList();
		List<String> list2 = Arrays.asList();
		
		List<String> list3 = Arrays.asList("java", "html", "string");
		for(String item : list3) {
			System.out.println(item);
		}
		
		List<Integer> list4 = Arrays.asList(3, 6, 8, 9, 10);
		List<Double> list5 = Arrays.asList(3.14, 4.1, 5.6, 7.8);
	}
}
