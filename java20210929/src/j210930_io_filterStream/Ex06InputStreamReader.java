package j210930_io_filterStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex06InputStreamReader {
	public static void main(String[] args) throws Exception{
		InputStream is = getInputStream("C:\\Users\\jjc90\\Desktop\\iotest\\test5.txt");
		Reader reader = new InputStreamReader(is);
		
//		System.out.println((char) is.read());
//		System.out.println((char) is.read());
//		System.out.println((char) is.read());
//		System.out.println((char) is.read());
		
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		
		reader.close();
		is.close();
	}
	public static InputStream getInputStream(String file) throws Exception{
		
		return new FileInputStream(file);
	}
}
