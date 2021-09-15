package j210910;

import java.util.regex.Pattern;

public class Ex12Example {
	public static void main(String[] args) {
		//전화번호 010-####-####
		String p1 = "010-\\d{4}-\\d{4}";
		System.out.println(Pattern.matches(p1, "010-1234-5678"));
		
		String p2 = "01\\d-\\d{3,4}-\\d{4}";
		System.out.println(Pattern.matches(p2, "017-123-1234"));
		
		String p3 = "01\\d-{0,1}\\d{3,4}-{0,1}\\d{4}";
		System.out.println(Pattern.matches(p3, "0123456789"));
	}
}
