package s210903_2;

public class Telephone extends Phone{
	
	void autoAnswering() {
		System.out.println("�ڵ� �����մϴ�.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("�ڵ�������ȭ�Ⱑ �����ϴ�.");
	}
}
