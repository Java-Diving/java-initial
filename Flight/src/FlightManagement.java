public class FlightManagement {
	private static final int TOTAL_CAPACITY = 150;
	private int totalCheckedBags;
	private int totalPassengers;
	
	public void addOnePasssenger(int bags, int carryOns) {
		int totalBags = bags;
		if(carryOns > 2) {
			totalBags = bags + carryOns - 2;
		}
		
		addOnePassenger(totalBags);
	}

	public void addOnePassenger(int bags) {
		if(isSeatAvaiable()) {
			addOnePassenger();
			totalCheckedBags += bags;
		}
	}

	public void addOnePassenger() {
		if(isSeatAvaiable()) {
			totalPassengers += 1;
		}
	}

	private boolean isSeatAvaiable() {
		return totalCheckedBags < TOTAL_CAPACITY;
	}
	
	public int getTotalCheckedBags() {
		return totalCheckedBags;
	}
	
	public int getTotalPassengers() {
		return totalPassengers;
	}
}
