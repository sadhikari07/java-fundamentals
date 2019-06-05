package inheritance;

public class ReviewAll {

    private String author;
    private String body;
    private int stars;
    private Business business;

    public ReviewAll(String author, String body, int stars, Business business){
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.business = business;
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

    public Business getBusiness(){return business;}
}
