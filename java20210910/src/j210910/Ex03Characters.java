package j210910;

import java.util.regex.Pattern;

public class Ex03Characters {
	public static void main(String[] args) {
		String p1 = "[a,b,c]";
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "b"));
		System.out.println(Pattern.matches(p1, "c"));
		
		System.out.println(Pattern.matches(p1, "d"));
		System.out.println(Pattern.matches(p1, "e"));
		System.out.println(Pattern.matches(p1, "f"));
		
		System.out.println("=====================");
		
		String p2 = "[azAZ]";
		
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "b"));
		System.out.println(Pattern.matches(p2, "z"));
		System.out.println(Pattern.matches(p2, "Z"));
		
		System.out.println("=====================");
		
		String p3 = "[abcdefghijklmnopqrstuvwxyz]";
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "b"));
		System.out.println(Pattern.matches(p3, "c"));
		
		System.out.println(Pattern.matches(p3, "d"));
		System.out.println(Pattern.matches(p3, "e"));
		System.out.println(Pattern.matches(p3, "f"));
		
	}
}
