package s210903_4static;

public class StaticEx04ClassInstance {
	public static void main(String[] args) {
		Class04.value2 = 10000;
//		Class04.value1 = 20000; �ν��Ͻ� �־�߸� ����
		
		Class04 c1 = new Class04();
		c1.value1 = 20000;
		System.out.println(c1.value1);

		Class04 c2 = new Class04();
		c2.value1 = 10000;
		System.out.println(c2.value1);
		
		System.out.println(Class04.value2);
		
		System.out.println(c1.value2);
		System.out.println(c2.value2);
	}
}
class Class04{
	//�ν��Ͻ�����, �ν��Ͻ��ʵ�, �������
	public int value1;
	//����ƽ����, Ŭ���� ����, Ŭ���� �ʵ�, Ŭ���� �������
	public static int value2;
	
}