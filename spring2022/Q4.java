package spring2022;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] cinema = new int[6];

		int userHall = 0;
		int tickets;
		int tropit = 0;
		int pizza = 0;

		do {
			System.out.println("Enter your hall number");
			userHall = s.nextInt();
			if (userHall > 6 || userHall < 0) {
				break;
			}
			System.out.println("Enter how many tickets");
			tickets = s.nextInt();
			cinema[userHall - 1] += tickets;
			if (userHall == 1) {
				tropit += tickets;
				pizza += tickets;
			}

		} while (userHall <= 6 && userHall >= 1);

		for (int i = 0; i < cinema.length; i++) {
			if (cinema[i] < 10) {
				System.out.printf("No screening at hall %d\n", i + 1);
			} else {
				System.out.printf("There are %d free seats in hall %d\n", 200 - cinema[i], i + 1);
			}
		}
		System.out.printf("Order %d tropit boxes\n", tropit / 20 + 1);
		System.out.printf("Order %d pizza boxes\n", pizza / 8 + 1);
	}
}
