package j210910;

import java.util.regex.Pattern;

public class Ex10Quantifier {
	public static void main(String[] args) {
		String p1 = "a{1,}";
		String p2 = "a+"; //+: 1���̻�
		
		System.out.println(Pattern.matches(p1, " "));
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "aa"));
		
		System.out.println(Pattern.matches(p2, " "));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "aa"));
		
		System.out.println("======================");
		
		String p3 = "a{0,}";
		String p4 = "a*"; //*: 0���̻�
		System.out.println(Pattern.matches(p3, " "));
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "aa"));
		
		System.out.println("======================");
		System.out.println(Pattern.matches(p4, " "));
		System.out.println(Pattern.matches(p4, "a"));
		System.out.println(Pattern.matches(p4, "aa"));
		
		System.out.println(Pattern.matches(p4, "ab")); //false a�θ� �̷��������.
		
	}
}
