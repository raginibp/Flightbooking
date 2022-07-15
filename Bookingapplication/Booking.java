package Bookingapplication;
import Airlines.*;
import Exception.SeatUnavailableException;
public class Booking {

  public static void main(String[] args) {
    Airbus Airbus = new Airbus(1, 15 );
    Boieng boieng = new Boieng(5, 20);

    boieng.booking(20);
    Airbus.booking(2);
    Airbus.booking(20);
  }
}
