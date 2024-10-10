
public class FlightDemo {

	public static void main(String[] args) {
		FlightManagement flight = new FlightManagement();
		
		flight.addOnePassenger();
		flight.addOnePassenger(140);
		flight.addOnePasssenger(3, 10);
		
		int totalCheckedBags = flight.getTotalCheckedBags();
		
		System.out.println("Total Checked Bags = " + totalCheckedBags);
		
		int totalPassengers = flight.getTotalPassengers();
		
		System.out.println("Total Passengers = " + totalPassengers);
	}

}
