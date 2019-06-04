package inheritance;

public class Review {
    private String author;
    private String body;
    private int stars;

    public Review(){};
    public Review(String author, String body, int stars){
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public String toString(){
        return String.format("%s has rated this restaurant %d. Following is his review: %s", this.author, this.stars, this.body);
    }
}
