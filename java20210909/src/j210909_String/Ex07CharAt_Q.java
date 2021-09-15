package j210909_String;

import java.util.Scanner;

public class Ex07CharAt_Q {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(true) {
			System.out.print("입력:");
			String s = scan.next();
			
			if(s.equals("q")) {
				break;
			}
			
			System.out.println("가운데 글자는" + s.charAt(s.length()/2));
		}
		scan.close();
	}
}
