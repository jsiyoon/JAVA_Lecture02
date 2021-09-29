package j210929_ioQuiz;

import java.io.FileReader;
import java.io.Reader;

public class Ex06 {
	public static void main(String[] args) throws Exception{
		String fileName = "C:\\Users\\jjc90\\Desktop\\iotest\\test3.txt";
		Reader r = new FileReader(fileName);
		
		int data = 0;
		while((data = r.read()) != -1) {
			System.out.println((char)data);
		}
		r.close();
	}
}
