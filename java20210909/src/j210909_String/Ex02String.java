package j210909_String;

import java.util.Scanner;

public class Ex02String {
	public static void main(String[] args) {
		String[] ids = new String[10];
		int size = 0;
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.print("아이디 입력:");
			String id = scan.next();
			
			for(int i = 0; i < size; i++) {	
				if(ids[i].equals(id)) {					
					System.out.println("이미 입력된 아이디입니다.");
					run = false;
				}
				
			}
			
			if(run) {				
				ids[size++] = id;
			}
		}
		
		for(int i = 0; i < size; i++) {
			System.out.println(ids[i]);
		}
		
		scan.close();
	}
}
