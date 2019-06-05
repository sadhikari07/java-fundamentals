package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void testConstructor() {
        // Restaurant to test
        Shop walmart = new Shop("Walmart", "cheap", "$");

        // Review to test (review is given a restaurant)
        Review michael = new Review("Michael Scott", "Really cheap stuff out here.", 3, walmart);

        // Review to test (review is given a restaurant)
        Review dwight = new Review("Dwight Schrute", "I can't find holster for my gun here.", 1, walmart);

        // Add the review to the restaurant

        walmart.addReview(michael);
        walmart.addReview(dwight);

        // Actual test
        assertEquals("Walmart! Our current rating is 2. Our description: cheap. Our shop is priced at $. The following is a review from one of our customers Michael Scott: Really cheap stuff out here.", walmart.toString());
    }

    @Test
    public void testUpdatedShopRating() {
        Shop walmart = new Shop("Walmart", "cheap", "$");
        Review michael = new Review("Michael Scott", "Really cheap stuff out here.", 3, walmart);
        Review dwight = new Review("Dwight Schrute", "I can't find holster for my gun here.", 1, walmart);
        walmart.addReview(michael);
        walmart.addReview(dwight);
        assertEquals("Total review should be 2", 2, walmart.getTotalRating());
    }

    @Test
    public void testIfMultipleShopReviewsAdded() {
        Shop walmart = new Shop("Walmart", "cheap", "$");
        Review michael = new Review("Michael Scott", "Really cheap stuff out here.", 3, walmart);
        Review dwight = new Review("Dwight Schrute", "I can't find holster for my gun here.", 1, walmart);
        Review kevin = new Review("Kevin Malone", "Its like a vending machine.", 5, walmart);
        walmart.addReview(michael);
        walmart.addReview(dwight);
        walmart.addReview(kevin);
        assertEquals("There should be three reviews in storage", 3, walmart.reviewsFromCustomers.size());
    }

}