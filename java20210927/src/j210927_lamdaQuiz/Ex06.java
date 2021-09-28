package j210927_lamdaQuiz;

import java.util.HashMap;
import java.util.Map;

public class Ex06 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("lang", "java");
		map.put("fw", "spring");
		map.put("fe", "html");
		
		map.forEach((k, v) -> System.out.println("key : " + k + ", value" + v));
	}
}
