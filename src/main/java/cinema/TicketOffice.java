package cinema;

import cinema.hall.Hall;
import cinema.hall.Movie;

import java.util.*;

public class TicketOffice {

    List<Hall> halls = new ArrayList<>();
    Map<Integer, Movie> movies = new HashMap<>();

    public TicketOffice() {
        movies.put(1,new Movie("Pulp Fiction", 1));
        movies.put(2,new Movie("Lion King", 2));
        movies.put(3,new Movie("Ciacho", 3));
        movies.put(4,new Movie("Star Wars - marathon", 4));
        halls.add(new Hall(1,movies.get(1).getTitle(),30));
        halls.add(new Hall(2,movies.get(2).getTitle(), 15));
        halls.add(new Hall(3,movies.get(3).getTitle(), 20));
        halls.add(new Hall(4,movies.get(4).getTitle(),25));
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean inOffice = true;
        while (inOffice){
            System.out.println("\nMovies:\n");
            for (int i=1; i<= movies.size();i++){
                System.out.println(i + ". " + movies.get(i).getTitle() + "\n");
            }
            System.out.println("0. Off");
            String movieNumber = scanner.nextLine();
//            commands.get(scanner.nextLine()).run(this);
        }
    }
   public void seal(int movieNumber){
        if(movies.get(movieNumber).isFreeSeats()){
            System.out.println("Movie: " + movies.get(movieNumber).getTitle() + ", hall: " + movies.get(movieNumber).getHallNumber());
        }else System.out.println("Sorry, no available seats.");
   }
}
