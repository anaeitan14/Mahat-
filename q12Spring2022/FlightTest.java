package q12Spring2022;

public class FlightTest {

	public static void main(String[] args) {
		Flight myFlight = new Flight("2NE32", "Vancouber", 23, 32, 351, 86);
		Time leave = myFlight.getArrivalTime();
		System.out.println(leave.toString());

		Airport benGurion = new Airport();
		benGurion.addFlight(myFlight);
		Time flightTo = benGurion.firstFlightToPlace("Vancouber");
		System.out.println(flightTo.toString());
		
		Time t1 = new Time(18,45);
		Time t2 = new Time(19,45);
		System.out.println("Time 1 before time 2");
		System.out.println(t1.before(t2));

	}

}
