package j210909_String;

import java.util.Scanner;

public class Ex03StringLength_Q {
	public static void main(String[] args) {
		
		//�Է¹��� ���ڿ��� ��������� ����ϴ� �ڵ�
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(true) {
			
			System.out.print("�Է�:");
			String s = scan.next() ;
			
			if(s.equals("quit")){
				break;
			}
			
			System.out.println(s.length() + "���� �Դϴ�.");
		}
		
		scan.close();
	}
}
