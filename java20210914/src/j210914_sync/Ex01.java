package j210914_sync;

public class Ex01 {
	public static int value = 0;
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10000; i++) {
					value++;
				}
			}
		});
		t.start();
		try {
			t.join(); //t thread�� ������ ��ٸ�.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(value);
		System.out.println("���α׷� ����");
	}
}
