package j210908_thows;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleA_Multiple {
	public static void main(String[] args) {
		try { //첫번쨰 try-catch문
			method1();

		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		try {//두번째try-catch문
			method1();
		} catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		try {//세번째 try-catch문
			method1();
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static void method1() throws ClassNotFoundException, FileNotFoundException ,IOException {
		
		Class.forName("");

		FileReader fr = new FileReader("");
		
		fr.close();
	}

}
