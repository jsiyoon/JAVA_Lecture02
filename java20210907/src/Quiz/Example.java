package Quiz;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		try {
			while(run) {
			
				System.out.print("첫번째 수 입력 :");
				String str1 = scan.next();
				
				System.out.print("두번째 수 입력 :");
				String str2 = scan.next();
				
				int n1 = Integer.parseInt(str1);
				int n2 = Integer.parseInt(str2);
				
				System.out.println("더한 결과는:" + (n1 + n2));
				
			}
		}catch(NumberFormatException e) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
