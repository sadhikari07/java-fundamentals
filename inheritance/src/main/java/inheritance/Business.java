package inheritance;

import java.util.ArrayList;

public class Business {

    private String name;
    ArrayList<Review> reviewsFromCustomers;
    private int rating;

    public Business(String name) {
        this.name = name;
        this.reviewsFromCustomers = new ArrayList<Review>();
        this.rating = getRating();
    }

    public void addReview(Review review){
        reviewsFromCustomers.add(review);
    }

    public String getName() {
        return name;
    }

    public int getRating(){
        return rating;
    }


    public int getTotalRating(){
        int rating = 0;
        if(reviewsFromCustomers.size()<=0){
            throw new IllegalArgumentException("Not valid");
        }
        for(int i = 0; i<reviewsFromCustomers.size(); i++){
            rating = rating+(reviewsFromCustomers.get(i).getStars());
        }
        rating = rating/(reviewsFromCustomers.size());
        return rating;
    }

    public ArrayList<Review> getReviewsFromCustomers() {
        return reviewsFromCustomers;
    }

}
