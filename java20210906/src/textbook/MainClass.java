package textbook;

public class MainClass {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc = new Audio();
		
		System.out.println(rc instanceof RemoteControl);
		System.out.println(rc instanceof Audio);
		
		System.out.println(rc instanceof Television);
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
	}
}
