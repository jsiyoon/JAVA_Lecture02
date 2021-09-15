package j210914_wrap_boxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		
		int[] arr2 = Arrays.copyOf(arr, 5);
		
		System.out.println(Arrays.toString(arr2));
		
		//ArrayList
		
		System.out.println("=====================");
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		list1.add("html");
		
		System.out.println(list1);
		
		//int
		
		System.out.println("=====================");
//		ArrayList<int> list2 = new ArrayList<>(); //기본타입 담을수 없음
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(new Integer(100));
		list2.add(200);
		list2.add(333);
		list2.add(null);
		
		System.out.println(list2);
		
		Integer i3 = list2.get(2);
		System.out.println(i3);
		
		int i4 = list2.get(2);
		System.out.println(i4);
		
		if(list2.get(2) != null) {
			int i5 = list2.get(2).intValue();
			System.out.println(i5);
		}
		
		int i6 = list2.get(3);
		System.out.println(i6); //nullpointerror
	}
}
