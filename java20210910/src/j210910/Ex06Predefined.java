package j210910;

import java.util.regex.Pattern;

public class Ex06Predefined {
	public static void main(String[] args) {
		String p1 = "[0-9]";
		
		System.out.println(Pattern.matches(p1, "0"));
		System.out.println(Pattern.matches(p1, "5"));
		System.out.println(Pattern.matches(p1, "9"));
		
		System.out.println("======================");
		String p2 = "\\d";
		
		System.out.println(Pattern.matches(p2, "0"));
		System.out.println(Pattern.matches(p2, "5"));
		System.out.println(Pattern.matches(p2, "9"));
		
		System.out.println("======================");
		String p3 = "[^0-9]";
		
		System.out.println(Pattern.matches(p3, "0"));
		System.out.println(Pattern.matches(p3, "5"));
		System.out.println(Pattern.matches(p3, "9"));
		
		System.out.println("======================");
		String p4 = "\\D"; //[^0-9]?? ????
		
		System.out.println(Pattern.matches(p4, "0"));
		System.out.println(Pattern.matches(p4, "5"));
		System.out.println(Pattern.matches(p4, "9"));
		
		System.out.println("======================");
		String p5 = "[a-zA-Z0-9_]";
		String p6 = "\\W";
		
		System.out.println(Pattern.matches(p5, "a"));
		System.out.println(Pattern.matches(p5, "A"));
		System.out.println(Pattern.matches(p5, "5"));
		
		System.out.println(Pattern.matches(p6, "a"));
		System.out.println(Pattern.matches(p6, "A"));
		System.out.println(Pattern.matches(p6, "5"));
	}
}
