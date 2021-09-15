package j210915_Collection_list;

import java.util.ArrayList;

public class Ex02ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		//add
		arr1.add(999);
		arr1.add(888);
		arr1.add(777); //arr1의 길이는 3이다.
		
		//size
		System.out.println(arr1.size());
		
		arr1.add(666);
		arr1.add(555); //arr1의 길이는 5이다.
		
		System.out.println(arr1.size());
		System.out.println("=================");
		
		//get
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		System.out.println(arr1.get(4));
		
		//remove
		arr1.remove(0); // arr[0] = 999 지워져서 배열 한칸씩 앞으로 이동
		arr1.remove(1); // arr[0] = 888, arr[1]= 777임으로 777사라짐
		System.out.println("================");
		System.out.println(arr1.size()); //size -2됨 => 3
		
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));

	}
}
