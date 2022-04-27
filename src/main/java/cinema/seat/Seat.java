package cinema.seat;

public class Seat {
    private int row;
    private int place;

    public Seat(int row, int place) {
        this.row = row;
        this.place = place;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}
