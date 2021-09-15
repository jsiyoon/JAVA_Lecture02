package j210907_3annonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Example4AnnoymousClass {//배열 거꾸로 출력하기
	public static void main(String[] args) {
		String[] arr = {"java", "bootstrap", "react", "vue", "angular", "jstl", "spring"};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr, new Comparator<String>() {
//			@Override
//			public int compare(String a1, String a2) {
//				return a2.compareTo(a1);
//			}
//		});
//		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
	}
}
