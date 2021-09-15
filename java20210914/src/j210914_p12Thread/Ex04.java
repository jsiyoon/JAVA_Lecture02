package j210914_p12Thread;

import java.awt.Toolkit;

public class Ex04 {
	public static void main(String[] args) {
		Thread t1 = new NumberThread();
		Thread t2 = new BeepThread();
		
		t1.start();
		t2.start();
	}
}	
class NumberThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1000 milli second¸¸Å­ ¸ØÃß±â
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
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

