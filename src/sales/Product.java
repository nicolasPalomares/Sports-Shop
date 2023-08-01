package sales;

public class Product {
	
	private String name;
	private double price;
	private String id;
	
	public Product(String name, double price, String id) {
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
		
		try {
			if(this.price < 0) {
				throw new IllegalArgumentException("Price can't be negative");
			}
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String productData() {
		return "\n\tName: " + this.name + "\n\tPrice: $" + this.price + "\n\tID: " + this.id + "\n";
	}

}
