package j210907_3;

import j210907.Bus;
import j210907.Vehicle;

public class Example {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Vehicle v1 = new Bus();
		
		driver.drive(v1);
		
		Vehicle v2 = new Taxi();
		driver.drive(v2);
	}
}
