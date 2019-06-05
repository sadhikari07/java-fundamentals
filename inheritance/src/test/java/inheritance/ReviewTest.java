package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReviewTest {


    @Test
    public void testConstructorRestaurantReview() {
        Restaurant subway = new Restaurant("subway", 3, "$");
        Review michael = new Review("Michael Scott", "Really crappy restaurant", 1, subway);
        assertEquals("Michael Scott has posted following review: Really crappy restaurant, and has given 1 rating", michael.toString());
    }


    @Test
    public void testConstructorShopReview() {
        Shop walmart = new Shop("Walmart", "We sell cheap stuff.", "$");
        Review michael = new Review("Michael Scott", "I dont like it", 1, walmart);
        assertEquals("Michael Scott has posted following review: I dont like it, and has given 1 rating", michael.toString());
    }

    @Test
    public void testConstructorTheaterReviewWithoutMovie() {
        ArrayList<String> moviesPlaying = new ArrayList<>();
        moviesPlaying.add("Xmen");
        Theater regal = new Theater("Regal", moviesPlaying);
        Review michael = new Review("Michael Scott", "Bad movie", 1, regal);
        assertEquals("Michael Scott has posted following review: Bad movie, and has given 1 rating", michael.toString());
    }

    @Test
    public void testConstructorTheaterReviewWithMovie() {
        ArrayList<String> moviesPlaying = new ArrayList<>();
        moviesPlaying.add("Xmen");
        Theater regal = new Theater("Regal", moviesPlaying);
        Review michael = new Review("Michael Scott", "Bad movie", 1, regal, "Xmen");
        assertEquals("Michael Scott has posted following review: Bad movie, and has given 1 rating", michael.toString());
    }


}