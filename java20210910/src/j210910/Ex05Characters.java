package j210910;

import java.util.regex.Pattern;

public class Ex05Characters {
	public static void main(String[] args) {
		String p1 = "[^a]"; // ^ = not
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, " "));
		
		System.out.println("======================");
		String p2 = "[^a-z]";
		
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "b"));
		System.out.println(Pattern.matches(p2, "T"));
		
		System.out.println("======================");
		String p3 = "[a-z^c]"; //여기서 ^는 not이아닌 그냥 기호
		
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "c")); //true
		System.out.println(Pattern.matches(p3, "w"));
	}
}
