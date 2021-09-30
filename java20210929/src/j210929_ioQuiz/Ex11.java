package j210929_ioQuiz;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) throws Exception{
		String name = "C:\\Users\\jjc90\\Desktop\\iotest\\outtestD.txt";
		Writer wr = new FileWriter(name);
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.print("입력:");
			String s = scan.nextLine();
			if(s.equals("exit")) {
				run = false;
				break;
			}else {
				wr.write(s);
				wr.write("\n");
				wr.flush();
			}
		}
		
		wr.close();
		scan.close();
	}
}
