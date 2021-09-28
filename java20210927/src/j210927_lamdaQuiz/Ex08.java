package j210927_lamdaQuiz;

import java.util.*;

public class Ex08 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "java", "abc", "amond", "spring"));
		
		//list removeifÈ°¿ë
		list.removeIf(n -> n.charAt(0) != 'a');
		
		System.out.println(list);
	}
}
