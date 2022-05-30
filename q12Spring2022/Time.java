package q12Spring2022;

public class Time {
	private int hour;
	private int minute;

	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public boolean before(Time other) {
		if (this.hour < other.hour || (this.hour == other.hour && this.minute < other.minute)) {
			return true;
		} 
		return false;
	}

	public String toString() {
		return "Hour:" + hour + " Minutes:" + minute;
	}
}
