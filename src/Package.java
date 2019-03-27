public class Package {
	private Flight arrival;
	private Flight departure;
	private Hotel hotel;
	private Tour[] tour;
	
	public Package(
			Flight arrival,
			Flight departure,
			Hotel hotel,
			Tour[] tour) {
		arrival = this.arrival;
		departure = this.departure;
		hotel = this.hotel;
		tour = this.tour;
	}
	
	public Flight getArrival() {
		return arrival;
	}
	
	public Flight getDeparture() {
		return departure;
	}
	
	public Hotel getHotel() {
		return hotel;
	}
	
	public Tour[] getTour() {
		return tour;
	}
}
