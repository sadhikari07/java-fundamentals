package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testConstructor() {

        Restaurant subway = new Restaurant("subway", 3, "$");
        Review michael = new Review("Michael Scott", "Really crappy restaurant", 1, subway);
        assertEquals("Michael Scott has rated subway: 1. Following is his review: Really crappy restaurant", michael.toString());
    }

    @Test
    public void testIfGettingRestaurant() {

        Restaurant subway = new Restaurant("New subway", 3, "$");
        Review michael = new Review("Michael Scott", "Really crappy restaurant", 1, subway);
        assertEquals("Michael Scott has rated New subway: 1. Following is his review: Really crappy restaurant", michael.toString());
    }

}