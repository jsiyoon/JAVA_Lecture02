package j210908_thows;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleA_Multiple {
	public static void main(String[] args) {
		try { //ù���� try-catch��
			method1();

		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		try {//�ι�°try-catch��
			method1();
		} catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		try {//����° try-catch��
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
