package Quiz;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		try {
			while(run) {
			
				System.out.print("ù��° �� �Է� :");
				String str1 = scan.next();
				
				System.out.print("�ι�° �� �Է� :");
				String str2 = scan.next();
				
				int n1 = Integer.parseInt(str1);
				int n2 = Integer.parseInt(str2);
				
				System.out.println("���� �����:" + (n1 + n2));
				
			}
		}catch(NumberFormatException e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}
