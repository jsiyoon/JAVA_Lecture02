package j210908_thows;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example9 {
	public static void main(String[] args)  throws ClassNotFoundException, FileNotFoundException ,IOException{
		method1();
	}
	public static void method1() throws ClassNotFoundException, FileNotFoundException ,IOException {
		Class.forName("");
		
		FileReader fr = new FileReader("");
		
		fr.close();
	}
}
