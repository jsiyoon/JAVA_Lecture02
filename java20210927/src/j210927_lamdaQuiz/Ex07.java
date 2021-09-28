package j210927_lamdaQuiz;

import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3,4,5,6));
		System.out.println(arr1);
		
		arr1.removeIf(n -> n % 2 == 0);
		
		System.out.println(arr1);
	}
}
//		lambda 
//		arr1.removeIf((Integer item) -> {
//			return item % 2 == 0;
//		});
//		бщ

//		// lambda
//		arr1.removeIf((Integer item) -> item % 2 == 0);
//		бщ
//		
//		// lambda
//		arr1.removeIf((e) -> e % 2 == 0);
//		бщ
//		
//		// lambda
//		arr1.removeIf(e -> e % 2 == 0);
