package j210929_ioQuiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	//���� �����׸����� �������� ä���� ������ �����
	//���ϸ� outtest2(�������� Ȯ���� ���)
	//�������ϰ� ���� ũ��, ���� ����(���� ����)
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\jjc90\\Desktop\\iotest\\down.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\jjc90\\Desktop\\iotest\\outtest2.jpg");
		
		int data = 0;
		while((data = is.read()) != -1) {
			os.write(data); //����ũ�⸸ŭ �ݺ�
		}
		System.out.println("���α׷�����");
		is.close();
		os.close();
	}
}
