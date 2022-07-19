package Airlines;
import flights.*;
import flights.Flightbooking;
import Exception.SeatUnavailableException;
public class Airbus extends flights implements Flightbooking {
public Airbus(String flightnumber, int total_seats) {
  super(flightnumber,total_seats);
}

  @Override
  public synchronized int booking(int booked)  {
    try {
      super.booking(booked);
      System.out.println("Yor booked seat is "+ booked+" in Airbus for Thread "+Thread.currentThread().getName());
    } catch (SeatUnavailableException e) {
    System.out.println("No."+booked+ " Seat Unavailable in Airbus for Thread "+Thread.currentThread().getName());
    }

return 0;
  }

//  @Override
//  public void  booking_cancel(int booked) throws SeatUnavailableException {
//    super.booking_cancel(booked);
//  }

  @Override
  public void booking(int flightnumber, int[] available_seats) throws SeatUnavailableException {

  }
}
