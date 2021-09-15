package s210903_3final;

public class Car {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.getModel());
		
	}
//	final private String model = "Cartest";
	private final String model;
	public Car() {
		model = "Kia";
	}
	public Car(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
}