package j210909_String;

import java.util.Scanner;

public class Ex11Split_Q {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("�Է� ���ڿ�:");
			String input = scan.nextLine();
		
			if(input == "q") {
				break;
			}
		
			System.out.print("������:");
			String dm = scan.nextLine();
		
			String[] arr = input.split(dm);
			for(String item : arr) {
				System.out.println(item);
			}
		}
		scan.close();
	}
}
