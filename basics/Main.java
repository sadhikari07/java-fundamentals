import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    pluralize(0,"dog");
    pluralize(1,"dog");
    pluralize(5,"dog");
    pluralize(-1,"dog");
    flipNHeads(1);
    flipNHeads(2);
    clock();
  }

  public static void pluralize(int wordCount, String word) {
    if(wordCount == 1){
      System.out.println("I own " + wordCount + " " + word+".");
    }
    else if(wordCount == 0 || wordCount > 1){
      System.out.println("I own " + wordCount + " " + word +"s.");
    }
    else{
      System.out.println("Please enter a valid number.");
    }
  }

//Some portions of the following codes have been referenced from https://stackoverflow.com/questions/41050833/three-heads-in-a-row-java-program

  public static void flipNHeads(int n){
    int numberOfHeadsFlippedInRow = 0;
    int notHeads = 0;
    int totalFlips = 0;
    while(numberOfHeadsFlippedInRow < n){
      if(randomBetween0and1()<0.5){
        System.out.println("Tails");
        numberOfHeadsFlippedInRow = 0;
      }
      else{
        System.out.println("Heads");
        numberOfHeadsFlippedInRow++;
      }
      totalFlips++;
    }
    System.out.println("It took " + totalFlips + " flips to flip " + numberOfHeadsFlippedInRow + " heads in a row.");
  }

 public static double randomBetween0and1(){
    double randomNumber = (Math.random()*(1));
    return randomNumber;
}

public static void clock(){
  int infiniteLooper = 1;
  int previousSecond = 0;
  while (infiniteLooper > 0){
    LocalDateTime currentTime = LocalDateTime.now();
    int currentSecond = currentTime.getSecond();
    String time = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));  
    if(previousSecond != currentSecond){
      System.out.println(time);
      previousSecond = currentSecond;
    }
  }
}
}