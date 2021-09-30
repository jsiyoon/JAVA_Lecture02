package j210929_io_Writer;

import java.io.FileWriter;

public class Ex01 {
	public static void main(String[] args) throws Exception{
		String fileName = "C:\\Users\\jjc90\\Desktop\\iotest\\outtest7.txt";
		FileWriter wr = new FileWriter(fileName);
		
		wr.write('a');
		wr.write('A');
		wr.write(65);
		wr.write('가');
		wr.write(4335);
		
		System.out.println("프로그램 종료");
		wr.close();
	}
}
