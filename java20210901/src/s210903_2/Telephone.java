package s210903_2;

public class Telephone extends Phone{
	
	void autoAnswering() {
		System.out.println("자동 응답합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("자동응답전화기가 켜집니다.");
	}
}
