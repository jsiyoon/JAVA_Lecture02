package s210903_4static;

public class StaticEx02Method {
	public static void main(String[] args) {
		//static method02�� �ν��Ͻ� �������� method02�ٷ� ���.
		Class02.method02();
		System.out.println(Math.random());
		
		//�ν��Ͻ� ����� �ְ� �������ִ� method01
		Class02 c1 = new Class02();
		c1.method01();
	}
}

class Class02{
	//static method,�����޼ҵ�,Ŭ���� �޼ҵ�
	
	//�ν��Ͻ� ���� �����ؾ��ϴ� �޼ҵ�
	void method01() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
	//static method02�� static method�� �ν��Ͻ� ���� �ʿ����.
	static void method02() {
		System.out.println("����ƽ �޼ҵ�");
	}
}
