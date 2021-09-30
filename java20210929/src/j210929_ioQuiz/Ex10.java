package j210929_ioQuiz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex10 {
	public static void main(String[] args) throws Exception{
		String src = "C:\\Users\\jjc90\\Desktop\\iotest\\outtest9.txt"; //원본파일
		String des = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestB.txt"; //대상파일
		Reader rd = new FileReader(src);
		Writer wt = new FileWriter(des);
		char[] datas = new char[4];
		
		int n = 0;
		while((n = rd.read(datas))!= -1) {
//			for(int i = n-1; i >= 0; i--) {
//				wt.write(datas[i]);
//			}
			reverse(datas);
			wt.write(datas);
		}
		rd.close();
		wt.close();
	}
	
	private static void reverse(char[] datas) {
		int left = 0;
		int right = datas.length-1;
		
		while(left < right) {
			char c = datas[left];
			datas[left] = datas[right];
			datas[right] = c;
			
			left++;
			right--;
		}
	}
}
