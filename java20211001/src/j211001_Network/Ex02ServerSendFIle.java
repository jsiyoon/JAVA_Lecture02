package j211001_Network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//누군가 나의 클라이언트로 연결하려 한다면 설정한 폴더에 있는 jpg파일 받을수 있음.
public class Ex02ServerSendFIle {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.123.104", 33333));
		
		Socket socket = serverSocket.accept();
		
		InputStream is = new FileInputStream("C:\\Users\\jjc90\\Desktop\\iotest\\down.jpg");
		BufferedInputStream bis = new BufferedInputStream(is);
		
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		System.out.println("파일 전송 시작 ====");
		int data = 0;
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		
		bos.close();
		bis.close();
		
		socket.close();
		serverSocket.close();
	}
}
