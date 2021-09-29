package j210929_ioQuiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	//각자 가진그림파일 내용으로 채워진 새파일 만들기
	//파일명 outtest2(원본파일 확장자 사용)
	//원본파일과 같은 크기, 같은 내용(파일 복사)
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\jjc90\\Desktop\\iotest\\down.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\jjc90\\Desktop\\iotest\\outtest2.jpg");
		
		int data = 0;
		while((data = is.read()) != -1) {
			os.write(data); //파일크기만큼 반복
		}
		System.out.println("프로그램종료");
		is.close();
		os.close();
	}
}
