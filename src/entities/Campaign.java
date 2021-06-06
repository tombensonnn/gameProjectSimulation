package entities;

public class Campaign {
	private int id;
	private String name;
	private double discountRate;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, double discountRate) {
		this.id = id;
		this.discountRate = discountRate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
