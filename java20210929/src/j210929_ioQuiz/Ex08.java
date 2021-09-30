package j210929_ioQuiz;

import java.io.FileReader;

public class Ex08 {
	public String split(int num) throws Exception{
		String s = "";
		String name = "C:\\Users\\jjc90\\Desktop\\iotest\\test4.txt";
		FileReader fr = new FileReader(name);
		char[] datas = new char[num];
		
		int n = 0;
		while((n = fr.read(datas)) != -1) {
//			for(int i = 0; i < n ; i++) {
//				s += datas[i];
//			}
			s += new String(datas,0,n) + ",";
		}
		
		fr.close();
		return s.substring(0,s.length()-1);
	}
}
