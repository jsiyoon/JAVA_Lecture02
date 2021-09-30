package j210930_io_filterStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Ex03BufferedReader {
	public static void main(String[] args) throws Exception{
		String name = "src/j210930_io_filterStream/Ex03BufferedReader.java";
		Reader reader = new FileReader(name);
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		System.out.println(line);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		reader.close();
		System.out.println("종료");
	}
}
