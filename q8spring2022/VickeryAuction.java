package q8spring2022;

public class VickeryAuction {
	private String product;
	private int realPrice;
	private Participant[] participants;
	private int currentPartic;
	
	
	public VickeryAuction(String product, int realPrice) {
		this.product = product;
		this.realPrice = realPrice;
		participants = new Participant[100];
		currentPartic = 0;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getRealPrice() {
		return realPrice;
	}

	public void setRealPrice(int realPrice) {
		this.realPrice = realPrice;
	}

	public boolean canAdd(Participant p) {
		if (currentPartic < participants.length && p.getPrice() > realPrice * 0.5) {
			participants[currentPartic++] = p;
			return true;
		}
		return false;
	}

	public Winner aucWinner() {
		int max = participants[0].getPrice(), secondMax = max;
		String name = participants[0].getName();

		for (int i = 1; i < currentPartic; i++) {
			if (participants[i].getPrice() > max) {
				secondMax = max;
				max = participants[i].getPrice();
			} 
			if (participants[i].getPrice() > secondMax && participants[i].getPrice() < max) {
				secondMax = participants[i].getPrice();
				name = participants[i].getName();
			}
		}

		return new Winner(name, secondMax);
	}
}
