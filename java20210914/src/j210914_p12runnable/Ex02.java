package j210914_p12runnable;

import java.awt.Toolkit;

public class Ex02 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() { //이름없는 인스턴스사용
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep(); //소리내기
					try {
						Thread.sleep(1000); //1초에 한번씩 쉼
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start(); //숫자가 1초에 한번씩 출력
		Thread t2 = new Thread(r2);
		t2.start(); //띠링 소리가 1초에 한번씩 다섯번 출력
	}
}
