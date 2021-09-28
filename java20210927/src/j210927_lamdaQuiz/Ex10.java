package j210927_lamdaQuiz;

import java.util.*;

public class Ex10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("java", "spring", "html", "a", "", "css"));
		
//		list.replaceAll (n ->{
//			if(n.length() > 2) {
//				return n.substring(n.length()-2);
//			}else {
//				return n;
//			}
//		});
		
		list.replaceAll (n -> n.length() > 2 ? n.substring(n.length()-2) : n);
		System.out.println(list); //[va, ng, ml, a , ,ss]
	}
}
