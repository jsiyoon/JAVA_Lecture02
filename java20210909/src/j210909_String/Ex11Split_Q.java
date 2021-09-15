package j210909_String;

import java.util.Scanner;

public class Ex11Split_Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("입력 문자열:");
			String input = scan.nextLine();
		
			if(input == "q") {
				break;
			}
		
			System.out.print("구분자:");
			String dm = scan.nextLine();
		
			String[] arr = input.split(dm);
			for(String item : arr) {
				System.out.println(item);
			}
		}
		scan.close();
	}
}
