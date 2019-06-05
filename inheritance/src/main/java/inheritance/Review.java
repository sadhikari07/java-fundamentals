package inheritance;

public class Review extends ReviewAll {

    private Restaurant restaurant;
    private Shop shop;
    private Theater theater;
    private String movieWatched;

//Following is review constructor for restaurant
    public Review(String author, String body, int stars, Restaurant restaurant){
        super(author, body, stars);
        this.restaurant = restaurant;
    }

    //Following is review constructor for Shop
    public Review(String author, String body, int stars, Shop shop){
        super(author, body, stars);
        this.shop = shop;
    }

    //Following is review constructor for theater with name of movie
    public Review(String author, String body, int stars, Theater theater, String movieWatched){
        super(author, body, stars);
        this.theater = theater;
        this.movieWatched = movieWatched;
    }

    //Following is review constructor for theater without the name of the movie
    public Review(String author, String body, int stars, Theater theater){
        super(author, body, stars);
        this.theater = theater;
    }

    public String toString(){
        return String.format("%s has posted following review: %s, and has given %d rating", this.getAuthor(), this.getBody(), this.getStars());
    }

}

