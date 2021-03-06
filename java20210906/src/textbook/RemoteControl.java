package textbook;

public interface RemoteControl {
	public int MAX_VOLUME = 10; //public static final
	public int MIN_VOLUME = 0; //public static final
	public void turnOn();
	public void turnOff();
	public void setVolume(int Volume);
	
	default void setMute(boolean mute) {//디폴트 메소드
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
