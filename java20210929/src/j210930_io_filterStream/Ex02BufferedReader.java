package j210930_io_filterStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex02BufferedReader {
	public static void main(String[] args) throws Exception {
		//BufferedReader : 속도 향상
		String name = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestE.txt";
		Reader reader = new FileReader(name);
		BufferedReader br = new BufferedReader(reader);
		
		long start = System.currentTimeMillis();
//		while(reader.read() != -1) { //88602ms
		while(br.read() != -1){ //55931ms
			
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
		reader.close();
		br.close();
	}
}
