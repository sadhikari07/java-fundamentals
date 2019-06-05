package inheritance;

public class ReviewAll {

    private String author;
    private String body;
    private int stars;

    public ReviewAll(String author, String body, int stars){
        this.author = author;
        this.body = body;
        this.stars = stars;
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
}
