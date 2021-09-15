package j210908_thows;

import java.io.IOException;

public class Example8 {
	public static void main(String[] args) {
		
		try {
			method1();
		}catch(IOException e) {
//			e.printStackTrace();
		}
		
		try {
			method2();
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println(e instanceof Exception);
			System.out.println(e instanceof IOException);
		}
	}
	public static void method1() throws IOException{
		throw new IOException();
	}
	public static void method2() throws Exception{
		throw new IOException();
	}
}	
