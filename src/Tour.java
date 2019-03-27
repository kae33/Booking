import java.time.LocalDate;

public class Tour {
	private LocalDate date;
	private String location;
	private int price;
	
	public Tour(
			LocalDate date,
			String location,
			int price) {
		date = this.date;
		location = this.location;
		price = this.price;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getLocation() {
		return location;
	}
	
	public int getPrice() {
		return price;
	}

}
