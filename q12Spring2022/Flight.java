package q12Spring2022;

public class Flight {
	private final int MAX_CAPACITY = 150;
	private String code;
	private String destination;
	private Time departureTime;
	private int duration;
	private int numOfPassengers;
	private boolean isFull;

	public Flight(String code, String destination, int hourLeave, int minuteLeave, int duration, int numOfPassengers) {
		this.code = code;
		this.destination = destination;
		this.departureTime = new Time(hourLeave, minuteLeave);
		this.duration = duration;
		this.numOfPassengers = numOfPassengers;
		if (numOfPassengers >= MAX_CAPACITY) {
			isFull = true;
		} else {
			isFull = false;
		}
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public String toString() {
		return code + destination + departureTime.toString() + duration + numOfPassengers + isFull;
	}

	public boolean addPassengers(int num) {
		if (!isFull && num + numOfPassengers < MAX_CAPACITY) {
			numOfPassengers += num;
			return true;
		}
		if (!isFull && num + numOfPassengers == MAX_CAPACITY) {
			numOfPassengers += num;
			isFull = true;
			return true;
		}

		return false;
	}
	
	public Time getArrivalTime() { //flight duration 180 minutes, current time is 23:00
		int hours = (duration/60+departureTime.getHour())%24;
		int minutes = (departureTime.getMinute()+duration%60)%60;
		int minuteExtra = (departureTime.getMinute()+duration%60)/60;
		return new Time(hours+minuteExtra, minutes);
	}
}
