package s210903_4static;

public class StaticEx01Field {
	public static void main(String[] args) {
		Class01.id = 3;
		System.out.println(Class01.id);
		
		Class01 c1 = new Class01();
		Class01 c2 = new Class01();
		
		System.out.println(c1.id);
		System.out.println(c2.id);
	}
}

class Class01{
	//static field(���� �������, �����ʵ�, ����ƽ �ʵ�, ��������)
	static int id;
}
