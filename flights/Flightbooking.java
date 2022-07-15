package flights;
import Exception.SeatUnavailableException;
public interface Flightbooking {

  public void booking(int flightnumber,int[] available_seats) throws SeatUnavailableException;
}
