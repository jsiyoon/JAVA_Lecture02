package Quiz;

import java.io.FileNotFoundException;

public class Example5 {
	public static void main(String[] args) {
		//일반예외(checked Exception)발생시키는 코드 작성
//		try {
//			throw new Exception();			
//		}catch(Exception e) {
//			System.out.println("익셉션 발생");
//		}
		
		try {
			throw new FileNotFoundException();
		}
		catch(FileNotFoundException e){
			System.out.println("파일 못 찾음.");
		}
	}
}
