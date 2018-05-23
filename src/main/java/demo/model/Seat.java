package demo.model;

public class Seat {
	
	private int seatNumber;
	
	private Availability availabiltyStatus;
	
	public int getSeatNumber() {
		return seatNumber;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	public Availability getAvailabiltyStatus() {
		return availabiltyStatus;
	}
	
	public void setAvailabiltyStatus(Availability availabiltyStatus) {
		this.availabiltyStatus = availabiltyStatus;
	}

	@Override
	public String toString() {
		return "Seat [seatNumber=" + seatNumber + ", availabiltyStatus=" + availabiltyStatus + "]";
	}
	
	
	
}
