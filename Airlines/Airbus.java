package Airlines;
import flights.*;
import flights.Flightbooking;
import Exception.SeatUnavailableException;
public class Airbus extends flights implements Flightbooking {
public Airbus(int flightnumber, int total_seats) {
  super(flightnumber,total_seats);
}

  @Override
  public void booking(Integer booked)  {
    try {
      super.booking(booked);
      System.out.println("Yor booked seat is "+ booked+" in Airbus.");
    } catch (SeatUnavailableException e) {
      System.out.println("No."+booked+ " Seat Unavailable in Airbus.");
    }


  }

  @Override
  public void booking(int flightnumber, int[] available_seats) throws SeatUnavailableException {

  }
}
