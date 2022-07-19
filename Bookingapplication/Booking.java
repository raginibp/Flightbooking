package Bookingapplication;
import Exception.SeatUnavailableException;
import Airlines.Airbus;
import Airlines.Boieng;
public class Booking {

  public static void main(String[] args) {
    Airbus Airbus = new Airbus("AA521", 15 );
    Boieng boieng = new Boieng("AR345", 20);
    Thread T1 = new Thread(()->{
      Airbus.booking(5);

    });
    Thread T2 = new Thread(()->{
      Airbus.booking(5);
//      try {
//        Airbus.booking_cancel(5);
//      } catch (SeatUnavailableException e) {
//      }

    });
    Thread T3 = new Thread(()->{
      Airbus.booking(5);
      try {
        Airbus.booking_cancel(5);
      } catch (SeatUnavailableException e) {
        System.out.println("Set is not booked");
      }


    });

    T1.setName("C1");
    T2.setName("C2");
    T3.setName("C3");

    T3.start();
    T1.start();
    T2.start();

/*
    boieng.booking(20);
    Airbus.booking(2);
    Airbus.booking(20);
*/
  }
}
