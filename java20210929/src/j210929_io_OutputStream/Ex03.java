package j210929_io_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:\\Users\\jjc90\\Desktop\\iotest\\down.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\jjc90\\Desktop\\iotest\\outtest5.jpg");
		
		byte[] datas = new byte[100];
		
		for(int i=0; i<3168; i++) {
			if(i == 3167) {
				is.read(datas); //�а�
				os.write(datas,0,22); //����
			}else {
				is.read(datas);
				os.write(datas);
			}
		}
		System.out.println("���α׷� ����");
		is.close();
		os.close();
	}
}
