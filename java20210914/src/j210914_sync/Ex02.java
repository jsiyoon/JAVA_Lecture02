package j210914_sync;

public class Ex02 {
	public static int value = 0;
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					value++;
					//1.value�б�
					//2.value����
					//3.value����
				}
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		try {
			t1.join(); //t thread�� ������ ��ٸ�.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(value);
	}
}
