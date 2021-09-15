package j210914_p12runnable;

import java.awt.Toolkit;

public class Ex02 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() { //�̸����� �ν��Ͻ����
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
					toolkit.beep(); //�Ҹ�����
					try {
						Thread.sleep(1000); //1�ʿ� �ѹ��� ��
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start(); //���ڰ� 1�ʿ� �ѹ��� ���
		Thread t2 = new Thread(r2);
		t2.start(); //�층 �Ҹ��� 1�ʿ� �ѹ��� �ټ��� ���
	}
}
