package s210903_4static;

public class StaticEx06Member {
	//����ƽ(Ŭ����)���(�޼ҵ�, �ʵ�)������
	//�ν��Ͻ� ���(�޼ҵ�,�ʵ�)���� �Ұ�
	public int val1; //�ν��Ͻ� ���
	public static int val2 ; //����ƽ���
	
	public void method1() { //�ν��Ͻ� �޼���
		System.out.println(val1);
		System.out.println(val2);
	}
	public static void method2() { //����ƽ �޼���
//		System.out.println(val1); //static�޼��忡�� �ν��Ͻ� ��� ���ٺҰ�.
		System.out.println(val2);
	}
}
