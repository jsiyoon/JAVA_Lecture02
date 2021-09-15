package j210906_1;

public interface Pet {
	void sit();
	default void roll() {//항상 public 디폴트 메서드
		System.out.println("구릅니다.");
	}
	
}
