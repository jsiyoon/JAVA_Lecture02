package j210914_p12Thread;

public class Ex01 {
	public static void main(String[] args) {
		OtherThread t1 = new OtherThread();
		t1.start(); //thread���� start�޼��� �̹� ���ǵǾ��־� ��밡����.
		
		System.out.println("���α׷� ����");
		for(int i =0; i < 10000; i++) {
			System.out.println(i);
		}
		
		System.out.println("���α׷� ����");
		
		
	}
}

//ThreadŬ���� Ȱ��
class OtherThread extends Thread{
	@Override
	public void run() {//�츮�� ������ �ؾ��ϴ� �޼ҵ�
		System.out.println("�ٸ� ������ ����");
		for(int i = 10000_0000; i < 10001_0000; i++) {
			System.out.println(i);
		}
		System.out.println("�ٸ� ������ ����");
	}
}