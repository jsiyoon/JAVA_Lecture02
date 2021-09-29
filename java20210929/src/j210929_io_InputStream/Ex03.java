package j210929_io_InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\test2.txt";
		InputStream is = new FileInputStream(file);
		
		byte[] data = new byte[10];
		int dataSize1 = is.read(data);
		int dataSize2 = is.read(data);
		int dataSize3 = is.read(data);
		int dataSize4 = is.read(data);
		int dataSize5 = is.read(data);
		int dataSize6 = is.read(data); //더이상 읽을 데이터 없다면 -1
		
		System.out.println(dataSize1);
		System.out.println(dataSize2);
		System.out.println(dataSize3);
		System.out.println(dataSize4);
		System.out.println(dataSize5);
		System.out.println(dataSize6);
		
		is.close();
	}
}
