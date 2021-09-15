package j210909_String;

import java.util.Scanner;

public class Ex03StringLength_Q {
	public static void main(String[] args) {
		
		//입력받은 문자열이 몇글자인지 출력하는 코드
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(true) {
			
			System.out.print("입력:");
			String s = scan.next() ;
			
			if(s.equals("quit")){
				break;
			}
			
			System.out.println(s.length() + "글자 입니다.");
		}
		
		scan.close();
	}
}
