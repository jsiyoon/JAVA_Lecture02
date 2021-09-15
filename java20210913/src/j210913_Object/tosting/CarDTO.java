package j210913_Object.tosting;

public class CarDTO {
	private String model;
	private String Company;
	private int Price;
	private long id;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "CarDTO [model=" + model + ", Company=" + Company + ", Price=" + Price + ", id=" + id + "]";
	}
	
	
}
