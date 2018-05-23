package demo.main;

import demo.model.Availability;
import demo.model.Seat;

public class SeatingArrangement {
	private Seat seatArray[][];
	private static char rowId ='A';
	
	public SeatingArrangement( ) {
		
	}
	
	public void createSeatArray(int numOfRows, int maximumSeats) {
		seatArray = new Seat[numOfRows][maximumSeats];
		int seatsForRow = maximumSeats;
		for(int i=0; i<numOfRows;i++)
		{
			for(int j=0;j<seatsForRow;j++)
			{
				Seat seat = new Seat();
				seat.setSeatNumber(j);
				seat.setAvailabiltyStatus(Availability.A);
				seatArray[i][j]=seat;
				seatsForRow -=2;
			}
		}
	}
	
	public void displaySeatArray() {
		for(int i=0; i<seatArray.length;i++)
		{
			System.out.println(rowId);
			for(int j=1;j<=seatArray[i].length;j++)
			{
				System.out.print(seatArray[i][j]);
			}
			rowId++;
		}
	}
}
