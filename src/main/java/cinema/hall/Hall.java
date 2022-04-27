package cinema.hall;

public class Hall {
    private final int hallNumber;
    private String movieTitle;
    private final int numberOfSeats;

    public Hall(int hallNumber, String movieTitle, int numberOfSeats) {
        this.hallNumber = hallNumber;
        this.movieTitle = movieTitle;
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


}
