package j210909_String;

import java.util.Scanner;

public class Ex09Trim_Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//next�� nextLine����
//		System.out.print("�Է�1 :");
//		String str1 = scan.next();
//		System.out.println(str1);

		
		System.out.print("�Է�2 :");
		String str2 = scan.nextLine();
		System.out.println(str2.trim());
		
		scan.close();
	}
	
}
