package j210909_String;

import java.util.Scanner;

public class Ex02String {
	public static void main(String[] args) {
		String[] ids = new String[10];
		int size = 0;
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.print("���̵� �Է�:");
			String id = scan.next();
			
			for(int i = 0; i < size; i++) {	
				if(ids[i].equals(id)) {					
					System.out.println("�̹� �Էµ� ���̵��Դϴ�.");
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
