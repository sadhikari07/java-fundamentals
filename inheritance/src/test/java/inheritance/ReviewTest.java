package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testConstructor() {
        Review classUnderTest = new Review();
        Review michael = new Review("Michael Scott", "Really crappy restaurant", 1);
        assertEquals("Michael Scott has rated this restaurant 1. Following is his review: Really crappy restaurant", michael.toString());
    }
}