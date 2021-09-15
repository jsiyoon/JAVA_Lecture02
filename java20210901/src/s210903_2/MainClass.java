package s210903_2;

public class MainClass {
	public static void main(String[] args) {
//		Phone p1 = new Phone(); //추상화클래스는 생성불가
		Telephone p2 = new Telephone();
		SmartPhone p3 = new SmartPhone();
		
		p2.turnOn();
		p2.autoAnswering();
		
		p3.turnOn();
		p3.internetSearch();
		
		System.out.println("========================");
//		Telephone t1 = (Telephone)p2;
//		t1.autoAnswering();
		((Telephone)p2).autoAnswering();
		
		SmartPhone s1 = (SmartPhone)p3;
		s1.internetSearch();
	}
}
