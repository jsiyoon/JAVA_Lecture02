package j210929_io_InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\test1.txt";
		InputStream is = new FileInputStream(file);
		
		int input = 0;
		while((input = is.read()) != -1) {
			System.out.println(input);
		}
		
		System.out.println("���α׷� ����");
		is.close();
	}
}
