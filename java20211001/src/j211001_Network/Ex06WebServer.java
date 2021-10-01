package j211001_Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06WebServer {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.123.104",33333));
		
		System.out.println("연결준비====");
		Socket socket = serverSocket.accept();
		
		InputStream is = socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		
		serverSocket.close();
		socket.close();
		br.close();
	}
}
