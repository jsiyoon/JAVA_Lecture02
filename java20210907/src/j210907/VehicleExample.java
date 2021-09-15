package j210907;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.ride();
		
//		vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
		
	}
}
