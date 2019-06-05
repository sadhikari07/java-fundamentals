package inheritance;

public class Shop extends Business{
    private String description;
    private String price;

    public Shop(String name, String description, String price) {
        super(name);
        this.description = description;
        this.price = price;

    }

    public String toString(){
        return String.format("%s! Our current rating is %d. Our description: %s. Our shop is priced at %s. The following is a review from one of our customers %s: %s", this.getName(), this.getTotalRating(), this.description, this.price, reviewsFromCustomers.get(0).getAuthor(), reviewsFromCustomers.get(0).getBody());
    }

    public static class ReviewAll {

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
}
