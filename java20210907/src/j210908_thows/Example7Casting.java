package j210908_thows;

import java.io.IOException;

public class Example7Casting {
	public static void main(String[] args) {
		//try catch
		
		try {
			throw new NullPointerException();
//		}catch(NullPointerException e) {
		}catch(Exception e) {
			System.out.println("�ͼ��� �߻�");
		}
	}
//	public static void method1() throws IOException{
	public static void method1() throws Exception{//������ ������ ����
		throw new IOException();
	}
}
