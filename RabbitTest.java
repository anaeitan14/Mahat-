package Rabbit;

import java.util.Scanner;

public class RabbitTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the amount of contestants");
		int num = s.nextInt();
		s.nextLine();

		Rabbit[] rabbits = new Rabbit[num];

		for (int i = 0; i < rabbits.length; i++) {
			System.out.println("Enter the name for contestant number: " + (i + 1));
			String name = s.nextLine();
			System.out.println("Enter carrot time");
			double carrot = s.nextDouble();
			System.out.println("Enter kruv time");
			double kruv = s.nextDouble();
			System.out.println("Enter brocolli time");
			double brocolli = s.nextDouble();
			s.nextLine();
			rabbits[i] = new Rabbit(name, carrot, kruv, brocolli);
		}

		firstMedal(rabbits);
		secondMedal(rabbits);

	}

	public static void firstMedal(Rabbit[] rabbits) {
		double lowestAvg = rabbits[0].averageTime();
		int lowestAvgIndex = 0;

		for (int i = 0; i < rabbits.length; i++) {
			if (rabbits[i].averageTime() < lowestAvg) {
				lowestAvg = rabbits[i].averageTime();
				lowestAvgIndex = i;
			}
		}
		System.out.println(
				"The first medal goes to " + rabbits[lowestAvgIndex].getName() + " with an average of: " + lowestAvg);
	}

	public static void secondMedal(Rabbit[] rabbits) {
		double lowestTime = rabbits[0].getTimeCarrot();
		int lowestTimeIndex = 0;
		for (int i = 0; i < rabbits.length; i++) {
			if (rabbits[i].lowestTime() < lowestTime) {
				lowestTime = rabbits[i].lowestTime();
				lowestTimeIndex = i;
			}
		}

		System.out.println("The second medal goes to " + rabbits[lowestTimeIndex].getName()
				+ " with the lowest time of: " + lowestTime);
	}
}
