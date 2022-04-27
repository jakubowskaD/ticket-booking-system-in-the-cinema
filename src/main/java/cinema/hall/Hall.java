package cinema.hall;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private final int hallNumber;
    private int numberOfSeats;
    public List<Seat> seats = new ArrayList<>();
    Movie movie;

    public Hall(int hallNumber, Movie movie, int numberOfSeats) {
        this.hallNumber = hallNumber;
        this.movie = movie;
        this.numberOfSeats = numberOfSeats;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfFreeSeats(){
        int allSeats = seats.size();
//        int allSeats = getNumberOfSeats();
        int freeSeats = allSeats;
        for (Seat seat : seats) {
            if (!seat.isAvailable) {
                freeSeats -= 1;
            }
        }
        return freeSeats;
    }
    public boolean isFreeSeats(){
        return getNumberOfFreeSeats() > 0;
//        return true;
    }

    public List<Seat> getSeats(int numberOfSeats){

    }
}
