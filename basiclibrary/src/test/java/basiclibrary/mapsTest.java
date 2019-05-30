package basiclibrary;
import java.util.ArrayList;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class mapsTest {

    @Test
    public void arraysTest() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] expecxtedOutput = new int[]{51, 72};
        maps classUnderTest = new maps();
        assertArrayEquals("Minimum and maximum temperature expected", expecxtedOutput, classUnderTest.temperatureEvaluator(weeklyMonthTemperatures));
    }

    @Test
    public void hashTest() {
        maps classUnderTest = new maps();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int expectedOutput = 18;
//        HashSet expecxtedOutput = new HashSet [64, 65, 66, 70, 71, 72, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62];
        assertEquals("Should return set of unique temperatures", expectedOutput, classUnderTest.hashSetCreator(weeklyMonthTemperatures).size());

    }

    @Test
    public void hashTestHasAllItems(){
        maps classUnderTest = new maps();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arrayOfHashed = {64, 65, 66, 70, 71, 72, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62};
        HashSet<Integer> expectedOutput = classUnderTest.hashSetCreator(weeklyMonthTemperatures);
        for(int temperature: arrayOfHashed){
            assertTrue("Item must be included in hash set", expectedOutput.contains(temperature));
        }
    }

    @Test
    public void testNotIncluded(){
        maps classUnderTest = new maps();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
       int [] arrayOfNotIncluded = {63, 67, 68, 69};
       List<Integer> expectedOutcome = classUnderTest.notIncludedTemps(weeklyMonthTemperatures);
       for(int notUpInHere:arrayOfNotIncluded){
           assertTrue("It should't be here", expectedOutcome.contains(notUpInHere));
       }
    }

    @Test
    public void testTally(){
        maps classUnderTest = new maps();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String expectedOutcome = "Bush";
        assertEquals("test strings", expectedOutcome, classUnderTest.voteWinner(votes));
    }



}