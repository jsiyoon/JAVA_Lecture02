package j210910;

import java.util.regex.Pattern;

public class Ex04Characters {
	public static void main(String[] args) {
//		String p1 = "[abcd]";
		String p1 = "[a-d]";
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "b"));
		System.out.println(Pattern.matches(p1, "c"));
		System.out.println(Pattern.matches(p1, "d"));
		
		System.out.println("======================");
		String p2 = "[0-9]";
		
		System.out.println(Pattern.matches(p2, "0"));
		System.out.println(Pattern.matches(p2, "5"));
		System.out.println(Pattern.matches(p2, "9"));
		
		System.out.println("----------------------");
		String p3 = "[a-zA-Z]";
		
		System.out.println(Pattern.matches(p3, "j"));
		System.out.println(Pattern.matches(p3, "A"));
		System.out.println(Pattern.matches(p3, "T"));
	}
}
