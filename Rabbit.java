package Rabbit;

public class Rabbit {
	private String name;
	private double[] time = new double[3];

	public Rabbit(String name, double firstRace, double secondRace, double thirdRace) {
		this.name = name;
		time[0] = firstRace;
		time[1] = secondRace;
		time[2] = thirdRace;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTimeCarrot() {
		return time[0];
	}

	public double getTimeCruv() {
		return time[1];

	}

	public double getTimeBrocolli() {
		return time[2];
	}

	public void setTime(double[] time) {
		this.time = time;
	}

	public double lowestTime() {
		double lowest = time[0];
		for (int i = 0; i < time.length; i++) {
			if (time[i] < lowest) {
				lowest = time[i];
			}
		}
		return lowest;
	}

	public double averageTime() {
		double avg = 0.0;
		for (int i = 0; i < time.length; i++) {
			avg += time[i];
		}
		avg /= 3;
		return avg;
	}
}
