package j210929_io_OutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\outtest.txt";
		OutputStream os = new FileOutputStream(file);
		
		os.write(65);
		os.write(66);
		
		System.out.println("���α׷� ����");
		os.close();
	}
}
