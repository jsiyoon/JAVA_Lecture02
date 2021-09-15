package textbook;

public interface RemoteControl {
	public int MAX_VOLUME = 10; //public static final
	public int MIN_VOLUME = 0; //public static final
	public void turnOn();
	public void turnOff();
	public void setVolume(int Volume);
	
	default void setMute(boolean mute) {//����Ʈ �޼ҵ�
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}
		else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//�����޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
