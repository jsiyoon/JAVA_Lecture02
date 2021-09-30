package j210929_io_Reader;

import java.io.FileReader;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		String name = "C:\\Users\\jjc90\\Desktop\\iotest\\test4.txt";
		FileReader fr = new FileReader(name);
		char[] datas = new char[3];
		
		int n = 0;
		while((n = fr.read(datas)) != -1) {
			for(int i = 0; i < n; i++) {
				System.out.print(datas[i] + ",");
			}
		}
		
		fr.close();
	}
}
