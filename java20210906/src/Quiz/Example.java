package Quiz;

public class Example {
	public static void main(String[] args) {
		//���� : 
		//interface Sword�����
		//���� Ŭ����
		//FireSword, RainbowSword
		
		//��°��:
		//�Ұ� �����մϴ�.
		//�����մϴ�.
//		�Ұ���
		//���������� �����մϴ�.
//		�����մϴ�.
//		������ ����
		Hero hero = new Hero();
		
		System.out.println("�Ұ��� �����մϴ�.");
		hero.setSword(new FireSword());
		
		System.out.println("�����մϴ�.");
		hero.attack();
		
		System.out.println("���������� �����մϴ�.");
		hero.setSword(new RainbowSword());
		
		System.out.println("�����մϴ�.");
		hero.attack();
		
		System.out.println("������ �����մϴ�.");
		hero.setSword(new WaterSwoard());
		
		System.out.println("�����մϴ�.");
		hero.attack();
	}
}
