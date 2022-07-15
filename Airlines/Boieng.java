package Airlines;
import flights.*;
import flights.Flightbooking;
import Exception.SeatUnavailableException;
public class Boieng extends flights implements Flightbooking {
  public Boieng(int flightnumber, int total_seats) {
    super(flightnumber,total_seats);
  }

  @Override
  public void booking(Integer booked) {
    try {
      super.booking(booked);
      System.out.println("Yor booked seat is "+ booked+" in Boieng.");
    } catch (SeatUnavailableException e) {
      System.out.println("No."+booked+ " Seat Unavailable in Boieng.");
    }
  }

  @Override
  public void booking(int flightnumber, int[] available_seats) throws SeatUnavailableException {

  }
}
