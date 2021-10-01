package j210929_ioQuiz;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) throws Exception{
		OutputStream os = getOutputStream("C:\\Users\\jjc90\\Desktop\\iotest\\outtestI.txt");
		Writer wr = new OutputStreamWriter(os);
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.print("입력:");
			String input = scan.nextLine();
			
			if(!input.equals("exit")) {
				wr.write(input);
				wr.write("\n");
			}else {
				run = false;
				break;
			}
		}
		
		System.out.println("종료");
		wr.close();
		scan.close();
		os.close();
	}
	public static OutputStream getOutputStream(String file) throws Exception {
		return new FileOutputStream(file);
	}
}
