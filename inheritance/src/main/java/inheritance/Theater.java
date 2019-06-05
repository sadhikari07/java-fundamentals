package inheritance;

import java.util.ArrayList;

public class Theater extends Business{
    private ArrayList<String> movies = new ArrayList<String>();

    public Theater(String name, ArrayList<String> movies) {
        super(name);
        this.movies = movies;
    }

    public void addMovie(String newMovie){
       movies.add(newMovie);
    }

    public void removeMovie(String oldMovie){
        movies.remove(oldMovie);
    }


    public String toString(){
        return String.format("Welcome to %s. The following are the review from one of our customers %s: %s", this.getName(), reviewsFromCustomers.get(0).getAuthor(), reviewsFromCustomers.get(0).getBody());
    }
}
