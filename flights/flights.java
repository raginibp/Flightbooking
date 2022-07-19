package flights;

import Exception.SeatUnavailableException;
public abstract class flights {
  String flightnumber;
  int total_seats;
  int[] booked_seats;
  int[] available_seats;

  public flights(String flightnumber, int total_seats) {
    this.flightnumber = flightnumber;
    this.total_seats = total_seats;
    this.booked_seats = new int[total_seats];
    this.available_seats = new int[total_seats];
    for (int i = 0; i < total_seats; i++) {
      this.available_seats[i] = i + 1;
    }

  }

  public synchronized int booking(int booked) throws SeatUnavailableException {
    boolean flag = true;



    for (int element : this.available_seats) {
      if (element == booked) {
        booked_seats[element - 1] = booked;
        booked = 0;
        available_seats[element - 1] = booked;
        flag = false;
        break;
      }
    }
    // booking_cancel(booked);
    try {
      if (flag == true) {
        throw new SeatUnavailableException("Unavailable seat!! for thread "+ Thread.currentThread().getName());
      }
    } catch (SeatUnavailableException e) {
      e.getMessage();
      throw new SeatUnavailableException("Unavailable seat!! for thread "+ Thread.currentThread().getName());
    }
    try {
      Thread.sleep((long) (Math.random() * 5000));
    } catch (Exception e) {
      System.out.println(e);
    }
    return 0;
  }

  //    try{
//      if(flag==false){
//        booked_seats[booked-1] = 0;
//      System.out.println("Booking cancel for Thread " + Thread.currentThread().getName());
//     //Thread.currentThread().stop();
//      available_seats[booked-1]=booked;
//      booking(booked);
//      }
//    } catch (Exception e) {
//      System.out.println("Seat is not booked");
//    }
//      return 0;
//}
  public synchronized void booking_cancel(int booked) throws SeatUnavailableException {
    boolean flag = true;
    try {
      if (booking(booked) == 0) {
        booked_seats[booked - 1] = 0;
        System.out.println("Booking cancel for Thread " + Thread.currentThread().getName());
        //Thread.currentThread().stop();
        available_seats[booked - 1] = booked;
        booking(booked);
//        Thread.currentThread().start();
      }
    } catch (Exception e) {
      System.out.println("Seat is not booked");
    }
  }
}





