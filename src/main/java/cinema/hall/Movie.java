package cinema.hall;

public class Movie extends Hall {
    public String title;

    public Movie(String title, int hallNumber) {
        super(hallNumber);
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

}
