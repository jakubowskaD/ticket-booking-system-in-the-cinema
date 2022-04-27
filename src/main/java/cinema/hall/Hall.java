package cinema.hall;

public class Hall {
    private String movieTitle;
    private final int numberOfSeats;

    public Hall(String movieTitle, int numberOfSeats) {
        this.movieTitle = movieTitle;
        this.numberOfSeats = numberOfSeats;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


}
