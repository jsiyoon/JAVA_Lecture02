package p01review;

public class C02Polymorphism {
	//������
	
	//1.����Ÿ������ �ڵ� ��ȯ(�� �Ҵ�)
	//2.�޼���� �ν��Ͻ� �޼ҵ�� ����ȴ�.
	public static void main(String[] args) {
		Animal al = new Animal();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		Animal a2 = c1;
		Animal a3 = d1;
		
		a2.cry();
		a3.cry();
	}
}
class Animal{
	public void cry() {
		System.out.println("������ ��ϴ�.");
	}
}
class Cat extends Animal{
	@Override
	public void cry() {
		System.out.println("����̰� ��ϴ�.");
	}
}
class Dog extends Animal{
	public void AutoControl() {
		System.out.println("�ڵ�����");
	}
}
