package Quiz;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example7 { //try / catch�Ⱦ��� ������ ���� �ذ�
	public static void main(String[] args) throws IOException{
		System.out.println("���α׷� ����");
		method1();
		System.out.println("���α׷� ����");
	}
	private static void method1() throws IOException{
		System.out.println("method1����");
		method2();
		System.out.println("method1����");
	}
	private static void method2() throws IOException{
		System.out.println("method2����");
		method3();
		System.out.println("method2����");
	}
	private static void method3() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		System.out.println("method3����");
		is.close();
		System.out.println("method3����");
	}
}
