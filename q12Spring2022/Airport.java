package q12Spring2022;

public class Airport {
	private Flight[] flightSchedule = new Flight[2];
	private int numOfFlights;

	public Time firstFlightToPlace(String place) {
		Time first = null;

		for (int i = 0; i < numOfFlights; i++) {
			if (flightSchedule[i].getDestination().equals(place)) {
				first = flightSchedule[i].getDepartureTime();
				break;
			}
		}
		
		for (int i = 0; i < numOfFlights; i++) {
			if (flightSchedule[i].getDestination().equals(place)
					&& flightSchedule[i].getDepartureTime().before(first)) {
				first = flightSchedule[i].getDepartureTime();
			}
		}

		return first;
	}

	public boolean addFlight(Flight f) {
		if (numOfFlights < flightSchedule.length) {
			flightSchedule[numOfFlights++] = f;
			return true;
		}
		return false;
	}

	public boolean movePassengers(String codeF, int num) {
		String destination = "";
		Flight first = null;
		for (int i = 0; i < numOfFlights; i++) {
			if (flightSchedule[i].getCode().equals(codeF)) {
				first = flightSchedule[i];
				destination = first.getDestination();
			}
		}

		for (int i = 0; i < numOfFlights; i++) {
			Flight current = flightSchedule[i];
			if (current.getDestination().equals(destination) && current.addPassengers(num)
					&& current.getArrivalTime().before(first.getArrivalTime())) {
				System.out.println(current.getCode());
				return true;
			}
		}
		return false;
	}
}
