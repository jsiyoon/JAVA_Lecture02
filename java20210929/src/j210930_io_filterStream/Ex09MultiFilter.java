package j210930_io_filterStream;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Ex09MultiFilter {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:\\Users\\jjc90\\Desktop\\iotest\\outtestJ.txt");
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		for(int i = 0 ; i < 1000; i++) {
			bw.write("hello world");
			bw.newLine();
		}
		
		System.out.println("종료");
		bw.close();
		wr.close();
		os.close();
	}
}
