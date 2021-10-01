package j211001_Network;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) throws Exception{
		int port = 0;
		InetSocketAddress endpoint = new InetSocketAddress("192.168.123.104",port);
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(endpoint);
		System.out.println("연결준비");
		
		Socket socket = serverSocket.accept();
		System.out.println("연결 종료");
		
		socket.close();
		serverSocket.close();
	}
}
