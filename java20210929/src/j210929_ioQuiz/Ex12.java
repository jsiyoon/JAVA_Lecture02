package j210929_ioQuiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex12 {
	public static void main(String[] args) throws Exception{
		String file = "src/j210929_ioQuiz/Ex12.java";
		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
		br.close();
	}
}
