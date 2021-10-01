package j211001_Network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;



public class Ex03ClientDownloadFile {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket();
		
		System.out.println("연결 시도+++++");
		socket.connect(new InetSocketAddress("192.168.123.104",33333));
		System.out.println("연결 성공+++++");
		
		OutputStream os = new FileOutputStream("C:\\Users\\jjc90\\Desktop\\iotest\\down.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(os);
		InputStream is = socket.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		
		System.out.println("파일 받기 시작++++");
		int data = 0;
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		System.out.println("파일 ");
		
		bos.close();
		bis.close();
		os.close();
		is.close();
		socket.close();
		
	}
}
