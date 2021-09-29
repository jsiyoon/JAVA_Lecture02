package j210929_ioQuiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
//파일 내용상관없이 outtest2.txt파일을 1024byte크기로 만들기
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\outtest2.txt";
		OutputStream os= new FileOutputStream(file);
		
		for(int i = 0; i < 1024; i++) {
			os.write((int)(Math.random())*126 + i);
		}
		System.out.println("프로그램 종료");
		os.close();
	}
}
