package p01review;

public class C03Polymorphism {
	public static void main(String[] args) {
		
		Gun g1 = new Gun();
		
		Hero hero = new Hero();
		hero.setGun(g1);
		
		System.out.println("-�����մϴ�.");
		hero.attack();
		
		System.out.println("-������ �����ߴ�.");
		hero.setGun(new FireGun());
		
		System.out.println("-�ٽ� �����մϴ�.");
		hero.attack();
	}
}

class Hero{
	private Gun gun;

	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void attack() {
		gun.fire();
	}
}

class Gun{
	public void fire() {
		System.out.println("���� ���ϴ�.");
	}
}

class FireGun extends Gun{
	@Override
	public void fire() {
		System.out.println("���� ���ϴ�.");
	}
}