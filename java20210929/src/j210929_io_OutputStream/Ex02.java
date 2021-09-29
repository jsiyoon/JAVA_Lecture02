package j210929_io_OutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		byte[] datas = new byte[] {65,65,65,65};
		
		OutputStream os = new FileOutputStream("C:\\Users\\jjc90\\Desktop\\iotest\\outtest3.txt");
		os.write(datas);
		os.write(datas);
		
		System.out.println("프로그램 종료");
		os.close();
	}
}
