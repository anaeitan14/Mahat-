package q1summer2021;

import java.util.Scanner;

public class GarbageTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Garbage[] cans = new Garbage[3];
		for (int i = 0; i < cans.length; i++) {
			System.out.println("Name for can");
			String location = s.nextLine();
			System.out.println("Capacity for can");
			double capacity = s.nextDouble();
			System.out.println("Quantity for can");
			double quantity = s.nextDouble();
			cans[i] = new Garbage(location, capacity, quantity);
			s.nextLine();
		}

		String[] newLocations = emptyGarbageCan(cans);
		for (int i = 0; i < newLocations.length; i++) {
			System.out.println(newLocations[i]);
		}

	}

	public static String[] emptyGarbageCan(Garbage[] cans) {
		int size = 0;
		for (int i = 0; i < cans.length; i++) {
			double currentCapacity = cans[i].getCapacity();
			double currentQuantity = cans[i].getQuantity();
			if (currentQuantity > currentCapacity / 2) {
				size++;
			}
		}

		String[] arr = new String[size];

		for (int i = 0, j = 0; i < cans.length; i++) {
			double currentCapacity = cans[i].getCapacity();
			double currentQuantity = cans[i].getQuantity();
			if (currentQuantity > currentCapacity / 2) {
				arr[j] = cans[i].getLocation();
				j++;
			}
		}

		return arr;
	}

}
