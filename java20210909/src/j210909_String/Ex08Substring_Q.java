package j210909_String;

import java.util.Scanner;

public class Ex08Substring_Q {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(true) {
			System.out.print("�Է�:");
			String s = scan.next();
			
			if(s.equals("q")) {
				break;
			}
				
			System.out.println("�� ����:" + s.substring(0, s.length()/2));
			System.out.println("�� ����:" + s.substring(s.length()/2));
		}
		
	}
}
