package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test
    public void testConstructor() {
        ArrayList<String> moviesPlaying = new ArrayList<>();
        moviesPlaying.add("Xmen");

        // Theatre to test
        Theater regal = new Theater("regal", moviesPlaying);
        regal.addMovie("Xmen");
        regal.addMovie("Hangover");
        regal.addMovie("Office");
        regal.addMovie("Star Wars");

        // Review to test (review is given a theater)
        Review michael = new Review("Michael Scott", "Nobody should go to work thinking oh this is the place that I might die today.", 1, regal, "Xmen");
        // Review to test (review is given a theater)
        Review dwight = new Review("Dwight Schrute", "I still dont know who Justice beaver is.", 10, regal);

        // Add the review to the theater
        regal.addReview(michael);
        regal.addReview(dwight);
        // Actual test
        assertEquals("Welcome to regal. The following are the review from one of our customers Michael Scott: Nobody should go to work thinking oh this is the place that I might die today.", regal.toString());
    }

    @Test
    public void testUpdatedTheaterRating() {
        ArrayList<String> moviesPlaying = new ArrayList<>();
        moviesPlaying.add("Xmen");

        // Theatre to test
        Theater regal = new Theater("regal", moviesPlaying);
        regal.addMovie("Xmen");
        regal.addMovie("Hangover");
        regal.addMovie("Office");
        regal.addMovie("Star Wars");
        // Review to test (review is given a theater)
        Review michael = new Review("Michael Scott", "Nobody should go to work thinking oh this is the place that I might die today.", 2, regal, "Xmen");
        // Review to test (review is given a theater)
        Review dwight = new Review("Dwight Schrute", "I still dont know who Justice beaver is.", 10, regal);

        // Add the review to the theater
        regal.addReview(michael);
        regal.addReview(dwight);
        // Actual test

        assertEquals("Review should be 6", 6, regal.getTotalRating());
    }

    @Test
    public void testIfMultipleTheaterReviewsAdded() {
        ArrayList<String> moviesPlaying = new ArrayList<>();
        moviesPlaying.add("Xmen");

        // Theatre to test
        Theater regal = new Theater("regal", moviesPlaying);
        regal.addMovie("Xmen");
        regal.addMovie("Hangover");
        regal.addMovie("Office");
        regal.addMovie("Star Wars");
        // Review to test (review is given a theater)
        Review michael = new Review("Michael Scott", "Nobody should go to work thinking oh this is the place that I might die today.", 2, regal, "Xmen");
        // Review to test (review is given a theater)
        Review dwight = new Review("Dwight Schrute", "I still dont know who Justice beaver is.", 10, regal);

        // Add the review to the theater
        regal.addReview(michael);
        regal.addReview(dwight);
        // Actual test

        assertEquals("Review size should be 2", 2, regal.reviewsFromCustomers.size());
    }

}