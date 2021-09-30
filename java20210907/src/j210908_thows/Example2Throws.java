package j210908_thows;

import java.io.FileNotFoundException;

public class Example2Throws {
	public static void main(String[] args) {
		try {			
			method1();
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수없음.");
		}
	}
	
	public static void method1() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
}
