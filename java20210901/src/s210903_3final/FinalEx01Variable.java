package s210903_3final;

public class FinalEx01Variable {
	public static void main(String[] args) {
		//������ final�� �Ҵ� �޴� ��ȸ �� �ѹ�
		final int var1 = 100;
		System.out.println(var1);
		
//		var1 = 10; //final�� ���� �� �Ҵ� ���� ����.
		System.out.println(var1);
		
		method02(3);
		method02(33);
	}
	public static void method02(final int param) {
//		param = 5;
		System.out.println(param);
	}
}
