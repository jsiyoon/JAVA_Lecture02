package j210929_io_Reader;

import java.io.FileReader;
import java.io.Reader;

public class Ex01 {
	public static void main(String[] args) throws Exception{
		String fileName = "C:\\Users\\jjc90\\Desktop\\iotest\\test3.txt";
		Reader r = new FileReader(fileName);
		
		int c1 = r.read();
		int c2 = r.read();
		int c3 = r.read(); 
		int c4 = r.read();
		int c5 = r.read(); //값이 없으면 -1 return
		
		System.out.println((char) c1);
		System.out.println((char) c2);
		System.out.println((char) c3);
		System.out.println((char) c4);
		System.out.println(c5);
		
		r.close();
	}
}
