package cinema.hall;

import java.util.ArrayList;
import java.util.List;

import static cinema.hall.HallType.rectangle;
import static cinema.hall.HallType.triangle;

public class Hall {
    private final int hallNumber;
    private final int numberOfSeats;
    public List<Seat> seats = new ArrayList<>();
    Movie movie;
    HallType hallType;

    public Hall(int hallNumber, Movie movie, int numberOfSeats, HallType hallType) {
        this.hallNumber = hallNumber;
        this.movie = movie;
        this.numberOfSeats = numberOfSeats;
        this.hallType = hallType;
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public HallType getHallType() {
        return hallType;
    }

    public int getNumberOfFreeSeats(){
        int allSeats = seats.size();
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
    }

    public List<Seat> getSeats(HallType hallType, int numberOfSeats){
        if(this.hallType == rectangle){
            for (int i=1; i<=numberOfSeats;i++){
                seats.add(new Seat(1,i,true));
            }return seats;

        } else if (this.hallType == triangle){
            for (int i=1; i<=numberOfSeats;i++){
                for (int j=1;j<=i;j++){
                    seats.add(new Seat(i,j,true));
                }
            }return seats;

        }else throw new IllegalArgumentException("Nie ma takiej sali");
    }
}
