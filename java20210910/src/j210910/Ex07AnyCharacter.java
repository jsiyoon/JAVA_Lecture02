package j210910;

import java.util.regex.Pattern;

public class Ex07AnyCharacter {
	public static void main(String[] args) {
		String p1 = "."; //모든문자들을 나타내는 것
		
		System.out.println(Pattern.matches(p1, " "));
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "Z"));
		System.out.println(Pattern.matches(p1, "한"));
		System.out.println(Pattern.matches(p1, "5"));
		
		System.out.println("=====================");
		
		String p2 = "\\."; // "."의 반대
		
		System.out.println(Pattern.matches(p2, " "));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "Z"));
		System.out.println(Pattern.matches(p2, "한"));
		System.out.println(Pattern.matches(p2, "5"));
	}
}
