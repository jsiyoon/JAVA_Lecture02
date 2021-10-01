package j211001_Network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex04ServerSendText {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.123.104",33333));
		
		System.out.println("연결 준비=====");
		Socket socket = serverSocket.accept();
		System.out.println("연결 성공=====");
		
		Scanner scan = new Scanner(System.in);
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String input = null;
		boolean run = true;
		while(run) {
			System.out.println("입력:");
			input = scan.nextLine();
			
			if(input.equals("exit")) break;
			
			bw.write(input);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		scan.close();
		socket.close();
		serverSocket.close();
	}
}
