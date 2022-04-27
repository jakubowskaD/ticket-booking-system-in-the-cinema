package cinema.hall;

public class Seat {
    private int row;
    private int place;
    public boolean isAvailable;

    public Seat(int row, int place, boolean isAvailable) {
        this.row = row;
        this.place = place;
        this.isAvailable = isAvailable;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
