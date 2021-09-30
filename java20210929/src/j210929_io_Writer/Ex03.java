package j210929_io_Writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		//ex02파일 outtest
		String src = "C:\\Users\\jjc90\\Desktop\\iotest\\outtest9.txt";
		String des = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestA.txt";
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);
		char[] datas = new char[3];
		int n = 0;

		while((n = rd.read(datas)) != -1) {
			wr.write(datas,0,n);
		}
		
		rd.close();
		wr.close();
	}
}
