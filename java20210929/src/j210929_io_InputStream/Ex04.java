package j210929_io_InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\test2.txt";
		InputStream is = new FileInputStream(file);
		
		byte[] data = new byte[10];
		int cnt = 0;
		
		while((cnt = is.read(data)) != -1) {
			for(int i =0; i < cnt; i++) {
				System.out.print(data[i] + ",");
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");
		is.close();
	}
}
