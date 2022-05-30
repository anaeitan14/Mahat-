package q8spring2022;

public class Winner {
	private String name;
	private int lastPrice;

	public Winner(String name, int lastPrice) {
		this.name = name;
		this.lastPrice = lastPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(int lastPrice) {
		this.lastPrice = lastPrice;
	}
}
