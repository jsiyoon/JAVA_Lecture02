package j210929_ioQuiz;

import java.io.FileWriter;
import java.io.Writer;

public class Ex09 {
	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\outtest8.txt";
		Writer wr = new FileWriter(file);
		
//		for(int c = 65; c < 91;c++) {
//			wr.write((char) c);
//		}
		
		for(char c = 'A'; c <= 'Z';c++) {
			wr.write(c);
		}
		
		wr.close();
	}
}
