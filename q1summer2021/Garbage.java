package q1summer2021;

public class Garbage {
	private String location;
	private double capacity;
	private double quantity;

	public String getLocation() {
		return this.location;
	}

	public double getCapacity() {
		return this.capacity;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public Garbage(String location, double capacity, double quantity) {
		this.location = location;
		this.capacity = capacity;
		this.quantity = quantity;
	}

}
