package j210910;

import java.util.regex.Pattern;

public class Ex07AnyCharacter {
	public static void main(String[] args) {
		String p1 = "."; //��繮�ڵ��� ��Ÿ���� ��
		
		System.out.println(Pattern.matches(p1, " "));
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "Z"));
		System.out.println(Pattern.matches(p1, "��"));
		System.out.println(Pattern.matches(p1, "5"));
		
		System.out.println("=====================");
		
		String p2 = "\\."; // "."�� �ݴ�
		
		System.out.println(Pattern.matches(p2, " "));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "Z"));
		System.out.println(Pattern.matches(p2, "��"));
		System.out.println(Pattern.matches(p2, "5"));
	}
}
