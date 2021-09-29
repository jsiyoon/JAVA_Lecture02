package j210929_io_InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex05HandleException {
	public static void main(String[] args) {
		String name = "없는파일";
		InputStream is = null;
		try {
			is = new FileInputStream(name);
			
			while((is.read()) != -1) {
				System.out.println("읽음");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(is != null) {
					is.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void method() {
		//try-with-resource
		//348p - 자동리소스 닫기
		String name = "없는 파일";
		try(
				InputStream is = new FileInputStream(name)
				){
			//정상적으로 할 일
		}catch(Exception e) {
			e.printStackTrace();
		}
		//final 블록에서 close매소드 실행 생략 가능.
	}
}
