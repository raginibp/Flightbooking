package flights;
import Exception.*;

import java.util.ArrayList;
public abstract class flights {
  int flightnumber;
  int total_seats;
  ArrayList<Integer> available_seats = new ArrayList<Integer>();
  ArrayList<Integer> booked_seats = new ArrayList<Integer>();


  //  ArrayList<Integer> available_seats = new ArrayList<Integer>();
  public flights(int flightnumber, int total_seats) {
    this.flightnumber = flightnumber;
    this.total_seats = total_seats;
    for (Integer i = 0; i < total_seats; i++) {
      this.available_seats.add(i+1);
    }
    System.out.println(available_seats);
  }


  public void booking(Integer booked) throws SeatUnavailableException{
    boolean flag=true;
      for (int element : this.available_seats) {
        if (element == booked) {
          booked_seats.add(booked);
          booked = 0;
          available_seats.set(element - 1, booked);
          flag = false;
          break;
        }
      }
      try {
        if (flag == true) {
          throw new SeatUnavailableException("Unavailable seat!!");
        }
      } catch (SeatUnavailableException e) {
        e.getMessage();
        throw new SeatUnavailableException("Unavailable seat!!");
      }

  }
}




