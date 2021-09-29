package j210929_ioQuiz;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\down.jpg";
		InputStream is = new FileInputStream(file);
		
		byte[] data = new byte[100];
		int cnt = 0;
		int fileSize = 0;
		
		while((cnt = is.read(data)) != -1) {
			fileSize += cnt;
		}
		
		System.out.println("파일크기:" + fileSize + "bytes");
		System.out.println("프로그램 종료");
		is.close();
	}
}
