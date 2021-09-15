package Quiz;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example7 { //try / catch안쓰고 컴파일 오류 해결
	public static void main(String[] args) throws IOException{
		System.out.println("프로그램 실행");
		method1();
		System.out.println("프로그램 종료");
	}
	private static void method1() throws IOException{
		System.out.println("method1실행");
		method2();
		System.out.println("method1종료");
	}
	private static void method2() throws IOException{
		System.out.println("method2실행");
		method3();
		System.out.println("method2종료");
	}
	private static void method3() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		System.out.println("method3실행");
		is.close();
		System.out.println("method3종료");
	}
}
