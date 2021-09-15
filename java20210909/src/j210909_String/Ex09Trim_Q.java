package j210909_String;

import java.util.Scanner;

public class Ex09Trim_Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//next와 nextLine차이
//		System.out.print("입력1 :");
//		String str1 = scan.next();
//		System.out.println(str1);

		
		System.out.print("입력2 :");
		String str2 = scan.nextLine();
		System.out.println(str2.trim());
		
		scan.close();
	}
	
}
