package j210909_String;

import java.util.Scanner;

public class Ex08Substring_Q {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(true) {
			System.out.print("입력:");
			String s = scan.next();
			
			if(s.equals("q")) {
				break;
			}
				
			System.out.println("압 절반:" + s.substring(0, s.length()/2));
			System.out.println("뒤 절반:" + s.substring(s.length()/2));
		}
		
	}
}
