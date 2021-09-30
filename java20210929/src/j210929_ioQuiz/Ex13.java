package j210929_ioQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex13 {
	public static void main(String[] args) throws Exception {
		String src = "src/j210929_ioQuiz/Ex13.java";
		String des = "C:\\Users\\jjc90\\Desktop\\iotest\\Ex13.java";
		
		FileReader reader = new FileReader(src);
		BufferedReader br = new BufferedReader(reader);
		
		FileWriter wr = new FileWriter(des);
		BufferedWriter bw = new BufferedWriter(wr);
		
		int Linenumber = 0;
		String line = null;
		while((line = br.readLine()) != null) {
			Linenumber++;
			bw.write(Linenumber + ":" +line);
			bw.newLine();
		}
		
		br.close();
		reader.close();
		
		bw.close();
		wr.close();
	}
}
