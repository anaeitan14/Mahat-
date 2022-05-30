package q8spring2022;

public class Test {

	public static void main(String[] args) {
		Participant eitan = new Participant("Eitan", "209850684", 250);
		Participant john = new Participant("John", "20984", 200);
		Participant tom = new Participant("Tom", "24", 160);
		Participant shay = new Participant("shay", "25684", 290);

		VickeryAuction auction = new VickeryAuction("PS5", 300);

		System.out.println(auction.canAdd(eitan));
		System.out.println(auction.canAdd(john));
		System.out.println(auction.canAdd(shay));
		System.out.println(auction.canAdd(tom));
		Winner auctionWinner = auction.aucWinner();
		
		System.out.println(auctionWinner.getName());
		}

}
