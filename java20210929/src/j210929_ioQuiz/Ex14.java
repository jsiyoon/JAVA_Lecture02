package j210929_ioQuiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex14 {
	public static void main(String[] args) throws Exception{
		String src = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestF.txt";
		String des = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestG.txt";
		
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);
		
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		int data = 0;
		long start = System.currentTimeMillis();
//		while((data = is.read()) != -1) {
//				os.write(data);
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start) + "ms");
		
		bis.close();
		bos.close();
		is.close();
		os.close();
	}
}
