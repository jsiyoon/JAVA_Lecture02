package j210930_io_filterStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class Ex10MultiFilter {
	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestJ.txt";
		
		InputStream is = new FileInputStream(file);
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println("종료");
		br.close();
		rd.close();
		is.close();
	}
}
