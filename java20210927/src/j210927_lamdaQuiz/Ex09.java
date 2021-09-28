package j210927_lamdaQuiz;

import java.util.*;

public class Ex09 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
		
		//ArrayList.replaceAll
		list.replaceAll(n -> n*2);
		System.out.println(list); // [2,4,6,8]
	}
}
