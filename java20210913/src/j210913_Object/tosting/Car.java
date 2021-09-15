package j210913_Object.tosting;

public class Car {
	private String model;
	private int Price;
	
	
	public Car(String model, int Price) {
		super();
		this.model = model;
		this.Price = Price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	
	public String toString() {
		return "회사 :" + this.model + ", 가격 :" + this.Price + "원";
	}
	
}
