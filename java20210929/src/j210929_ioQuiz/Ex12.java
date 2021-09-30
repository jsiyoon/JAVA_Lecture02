package j210929_ioQuiz;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex12 {
	public static void main(String[] args) throws Exception{
		String file = "src/j210929_ioQuiz/Ex12.java";
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		int LineNumber = 1;
		while((line = br.readLine()) != null) {
			System.out.println(LineNumber + ":" + line);
			LineNumber++;
		}
		reader.close();
		br.close();
	}
}
