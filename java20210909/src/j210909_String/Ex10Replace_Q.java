package j210909_String;

import java.util.Scanner;

public class Ex10Replace_Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ют╥б1 :");
		String str2 = scan.nextLine();
		System.out.println(str2.trim());
		System.out.println(str2.replace(" ",""));
		
		scan.close();
	}
}
