package j210908;

import java.io.IOException;

public class Example2ThrowException {
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		//RuntimeException�� ��� ���� ����
		//Exception��
		//try/catch�� ����ؾ� ��.
		IOException e = new IOException();
		
		try {			
			throw e;
		}catch(IOException e1) {
			System.out.println("���̿��ͼ��� �߻�");
		}
	}
}
