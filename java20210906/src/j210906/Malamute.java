package j210906;

public class Malamute extends KindaDog implements Pet,SledDog {
	
	@Override
	public void bark() {
		System.out.println("�۸�");
	}
	
	@Override
	public void sit() {
		System.out.println("�ڸ��� �ɽ��ϴ�.");
	}
	
	@Override
	public void pull() {
		System.out.println("��Ÿ� ���ϴ�.");
	}
}