package j210907_4;

import textbook.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
//		rc = new RemoteControl(); // x
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("메소드 구현");
				
			}

			@Override
			public void turnOff() {
				System.out.println("메소드 구현");
				
			}

			@Override
			public void setVolume(int Volume) {
				System.out.println("메소드 구현");
				
			}
			
		};
	}
}
