package inheritance;

public class Review {


    private String author;
    private String body;
    private int stars;
    private Restaurant restaurant;

    public Review(){};

    public Review(String author, String body, int stars, Restaurant restaurant){
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public int getStars() {
        return stars;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String toString(){
        return String.format("%s has rated %s: %d. Following is his review: %s", this.author, this.restaurant.getName(), this.stars, this.body);
    }

}

