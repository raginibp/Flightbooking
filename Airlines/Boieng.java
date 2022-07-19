package Airlines;
import flights.*;
import flights.Flightbooking;
import Exception.SeatUnavailableException;
public class Boieng extends flights implements Flightbooking {
  public Boieng(String flightnumber, int total_seats) {
    super(flightnumber,total_seats);
  }

  @Override
  public  int booking(int booked) {
    try {
      super.booking(booked);
      System.out.println("Yor booked seat is "+ booked+" in Boieng.");
    } catch (SeatUnavailableException e) {
      System.out.println("No."+booked+ " Seat Unavailable in Boieng.");
    }
    return 0;
  }

  @Override
  public void booking(int flightnumber, int[] available_seats) throws SeatUnavailableException {

  }
}
