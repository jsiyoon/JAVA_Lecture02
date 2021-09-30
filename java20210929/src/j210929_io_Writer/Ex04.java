package j210929_io_Writer;

import java.io.FileWriter;
import java.io.Writer;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		String name = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestC.txt";
		Writer wr = new FileWriter(name);
		
		wr.write("java");
		wr.write("\n");
		wr.write("spring");
		
		wr.close();
		
		System.out.println("done");
	}
}
