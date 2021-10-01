package j210930_io_filterStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Ex05BufferedInputStream {
	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestF.txt";
		InputStream is = new FileInputStream(file);
		BufferedInputStream br = new BufferedInputStream(is);
		
		long start = System.currentTimeMillis();
		while(is.read() != -1) { //18909ms 15157ms
//		while(br.read() != -1) { //60ms 47ms
		}
		long end = System.currentTimeMillis();
		
		System.out.println((end-start) + "ms");
		br.close();
//		is.close();
	}
}
