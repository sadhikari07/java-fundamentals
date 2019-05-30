/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lintr;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testTooManyErrors() {
            App classUnderTest = new App();
            int expectedOutput = 46;
            assertEquals("Number of errors should be 46", expectedOutput, (classUnderTest.findLintrErrors("src/main/resources/gates.js")));
    }

    @Test
    public void testOneError() {
        App classUnderTest = new App();
        int expectedOutput = 1;
        assertEquals("Number of errors should be 1", expectedOutput, (classUnderTest.findLintrErrors("src/main/resources/oneError.js")));
    }

    @Test
    public void testNoErrors() {
        App classUnderTest = new App();
        int expectedOutput = 0;
        assertEquals("Number of errors should be 1", expectedOutput, (classUnderTest.findLintrErrors("src/main/resources/noErrors.js")));
    }

    @Test
    public void testEmpty() {
        App classUnderTest = new App();
        int expectedOutput = 0;
        assertEquals("Number of errors should be 1", expectedOutput, (classUnderTest.findLintrErrors("src/main/resources/empty.js")));
    }

    @Test
    public void fewErrors() {
        App classUnderTest = new App();
        int expectedOutput = 4;
        assertEquals("Number of errors should be 1", expectedOutput, (classUnderTest.findLintrErrors("src/main/resources/fewErrors.js")));
    }

}

