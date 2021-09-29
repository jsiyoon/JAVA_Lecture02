package j210929_io_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:\\Users\\jjc90\\Desktop\\iotest\\down.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\jjc90\\Desktop\\iotest\\outtest6.jpg");
		
		byte[] datas = new byte[100];
		int len = 0;
		while((len = is.read(datas)) != -1) {
			os.write(datas,0,len);
		}
		
		System.out.println("프로그램 종료");
		is.close();
		os.close();
	}
}
