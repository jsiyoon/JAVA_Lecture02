package j210930_io_filterStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Ex01BufferedWriter {
	public static void main(String[] args) throws Exception {
		//BufferedWriter
		//빠른속도
		
		String  name = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestE.txt";
		Writer writer = new FileWriter(name);
		BufferedWriter bw = new BufferedWriter(writer);
		
		long start = System.currentTimeMillis();
		for(int i = 0; i <1024 * 1024 * 1024; i++) {
//			writer.write('a'); //Writer
			bw.write('a'); //BufferedWriter //속도 빨리짐
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start + "밀리세컨드");
		
		System.out.println("종료");
		
		bw.close();
		writer.close();
	}
}
