package j210930_io_filterStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class Ex04BufferedOutputStream {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestF.txt";
		OutputStream os = new FileOutputStream(file);
		BufferedOutputStream bs = new BufferedOutputStream(os);
		
		long start = System.currentTimeMillis();
		for(int i = 0; i< 1024*1024* 20; i++) {
//			os.write('a');
			bs.write('a');
		}
		long end = System.currentTimeMillis();
		
		System.out.println((end-start) + "ms");
		
		bs.close();
//		os.close();
	}
}
