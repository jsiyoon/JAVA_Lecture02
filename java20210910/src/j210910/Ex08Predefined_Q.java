package j210910;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex08Predefined_Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		String pattern = "[a-zA-Z]\\w\\w";
		
		while(run) {
			System.out.print("�Է�:");
			String input = scan.nextLine();
			
			if(Pattern.matches(pattern, input)) {
				System.out.println(input + "��" + pattern + "���ϰ� ��ġ�մϴ�.");
			}else {
				System.out.println(input + "��" + pattern + "���ϰ� ��ġ���� �ʽ��ϴ�.");
			}
		}
	}
}
