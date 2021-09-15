package j210914_p12Thread;

import java.awt.Toolkit;

public class Ex03 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1000 milli second만큼 멈추기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //소리발생
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
