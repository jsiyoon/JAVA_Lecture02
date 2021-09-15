package Quiz;

public class Example {
	public static void main(String[] args) {
		//할일 : 
		//interface Sword만들고
		//구현 클래스
		//FireSword, RainbowSword
		
		//출력결과:
		//불검 장착합니다.
		//공격합니다.
//		불공격
		//무지개검을 장착합니다.
//		공격합니다.
//		무지개 공격
		Hero hero = new Hero();
		
		System.out.println("불검을 장착합니다.");
		hero.setSword(new FireSword());
		
		System.out.println("공격합니다.");
		hero.attack();
		
		System.out.println("무지개검을 장착합니다.");
		hero.setSword(new RainbowSword());
		
		System.out.println("공격합니다.");
		hero.attack();
		
		System.out.println("물검을 장착합니다.");
		hero.setSword(new WaterSwoard());
		
		System.out.println("공격합니다.");
		hero.attack();
	}
}
