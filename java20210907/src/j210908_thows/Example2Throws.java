package j210908_thows;

import java.io.FileNotFoundException;

public class Example2Throws {
	public static void main(String[] args) {
		
		try {			
			method1();
		}catch(FileNotFoundException e) {
			System.out.println("������ �� ã�ҽ��ϴ�.");
		}
	}
	
	public static void method1() throws FileNotFoundException {
		throw new FileNotFoundException();
		
	}
}
