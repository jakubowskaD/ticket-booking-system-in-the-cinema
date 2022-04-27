package cinema;

import cinema.hall.Hall;
import cinema.hall.HallType;
import cinema.hall.Movie;

import java.util.*;

public class TicketOffice {

    List<Hall> halls = new ArrayList<>();
    Map<Integer, Movie> movies = new HashMap<>();

    public TicketOffice() {
        halls.add(new Hall(1, new Movie("Pulp Fiction"),5, HallType.rectangle));
        halls.add(new Hall(2,new Movie("Lion King"), 5, HallType.rectangle));
        halls.add(new Hall(3,new Movie("Ciacho"), 5, HallType.rectangle));
        halls.add(new Hall(4,new Movie("Star Wars - marathon"),10, HallType.triangle));
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean inOffice = true;
        while (inOffice){
            System.out.println("\nMovies:\n");
            for (int i=1; i<= movies.size();i++){
                System.out.println(i + ". " + halls.get(i).getMovieTitle() + "\n");
                movies.put(i, new Movie(halls.get(i).getMovieTitle()));
                halls.get(i).getSeats(halls.get(i).getHallType(), halls.get(i).getNumberOfSeats());
            }
            System.out.println("0. Off");
            String movieNumber = scanner.nextLine();
            if (movieNumber.equals("0")){
                System.exit(0);
            }
            seal(Integer.parseInt(movieNumber));
        }
    }
   public void seal(int movieNumber){
        if(halls.get(movieNumber).isFreeSeats()){
            System.out.println("Movie: " + halls.get(movieNumber).getMovieTitle());
            System.out.println(", hall: " + halls.get(movieNumber).getNumberOfSeats());

            System.out.println("We wish you a successful screening.");
        }else System.out.println("Sorry, no available seats.");
   }
}
