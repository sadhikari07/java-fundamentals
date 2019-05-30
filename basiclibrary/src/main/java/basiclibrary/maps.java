package basiclibrary;
import java.util.*;

public class maps {
    public int[] temperatureEvaluator(int[][] weeklyMonthTemperatures) {
        int[] maxAndMinTemp = new int[2];
        int minTemperature = -100;
        int maxTemperature = 120;
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 0&& i ==0) {
                    minTemperature = weeklyMonthTemperatures[i][j];
                    maxTemperature = weeklyMonthTemperatures[i][j];
                } else if (weeklyMonthTemperatures[i][j] <= minTemperature) {
                    minTemperature = weeklyMonthTemperatures[i][j];
                } else if (weeklyMonthTemperatures[i][j] >= maxTemperature) {
                    maxTemperature = weeklyMonthTemperatures[i][j];
                }
            }
        }
        maxAndMinTemp[0] = minTemperature;
        maxAndMinTemp[1] = maxTemperature;
        System.out.println("High: " + minTemperature );
        System.out.println("Low: " + maxTemperature);
        return maxAndMinTemp;
    }
    public HashSet hashSetCreator(int[][] weeklyMonthTemperatures){

            HashSet<Integer> weeklyTempHash = new HashSet<Integer>();
            for (int[] arraysInside: weeklyMonthTemperatures){
                for(int temperature: arraysInside){
                    weeklyTempHash.add(temperature);
                }

            }
            System.out.println(weeklyTempHash);
            return weeklyTempHash;
    }

    public List<Integer> notIncludedTemps(int[][] weeklyMonthTemperatures){
        HashSet<Integer> weeklyTempHash = hashSetCreator(weeklyMonthTemperatures);
        int[] maxAndMinTemp = temperatureEvaluator(weeklyMonthTemperatures);
        List<Integer> notIncludedTempList = new ArrayList<>();
        for(int i = maxAndMinTemp[0]+1; i<maxAndMinTemp[1]; i++){
            if (!weeklyTempHash.contains(i)) {
                notIncludedTempList.add(i);
                System.out.println("Never saw temperature: " + i);
            }
        }
    return notIncludedTempList;
    }

    public String voteWinner(List<String> votes){
        HashMap<String, Integer> voteCount = new HashMap<>();
        for(String nominee: votes){
            voteCount.put(nominee,0);
        }
            for(String name: votes){
                if (voteCount.containsKey(name)) {
                    int votesSoFar = voteCount.get(name);
                    voteCount.put(name, votesSoFar +1);
                }
            }
        int maxVoteCount = 0;
        String winner = "";
        for(String name: votes){
            int tally = voteCount.get(name);
            if(tally>maxVoteCount){
                maxVoteCount = tally;
                winner = name;
            }
        }
        System.out.println(winner + " recieved the most votes!");
        return winner;
    }
}
