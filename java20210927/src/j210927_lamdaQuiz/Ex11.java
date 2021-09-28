package j210927_lamdaQuiz;

import java.util.*;

public class Ex11 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "a", "spring", "qa", "mouse", "bob");
		
		System.out.println(list);
		
		list.sort((a, b) -> a.length() - b.length());
		System.out.println(list);
	}
}
