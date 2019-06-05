package inheritance;

public class Review extends ReviewAll {

    private String movieWatched;

    public Review(String author, String body, int stars, Business business, String movieWatched){
        super(author, body, stars, business);
        this.movieWatched = movieWatched;
    }

    //Following is review constructor for theater without the name of the movie
    public Review(String author, String body, int stars, Business business){
        super(author, body, stars, business);
    }

    public String toString(){
        return String.format("%s has posted following review for %s: %s, and has given %d rating", this.getAuthor(), this.getBusiness().getName(), this.getBody(), this.getStars());
    }

}

