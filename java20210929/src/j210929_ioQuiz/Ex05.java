package j210929_ioQuiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex05 {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:\\Users\\jjc90\\Desktop\\iotest\\outtest4.txt");
		byte[] datas = new byte[1024];
		
		//����ũ�� : 1Mbytes = 1024*1024;
		for(int i = 0; i < 1024; i++) {
			os.write(datas); //1024��
		}
		
		System.out.println("���α׷� ����");
		os.close();
	}
}
