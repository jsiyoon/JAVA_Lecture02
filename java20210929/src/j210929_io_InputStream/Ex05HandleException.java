package j210929_io_InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex05HandleException {
	public static void main(String[] args) {
		String name = "��������";
		InputStream is = null;
		try {
			is = new FileInputStream(name);
			
			while((is.read()) != -1) {
				System.out.println("����");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(is != null) {
					is.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void method() {
		//try-with-resource
		//348p - �ڵ����ҽ� �ݱ�
		String name = "���� ����";
		try(
				InputStream is = new FileInputStream(name)
				){
			//���������� �� ��
		}catch(Exception e) {
			e.printStackTrace();
		}
		//final ��Ͽ��� close�żҵ� ���� ���� ����.
	}
}
