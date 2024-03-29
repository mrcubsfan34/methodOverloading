package com.company;

public class Main {

  public static void main(string[] args) {
    int newScore = calculateScore("Michael", 50);
    System.out.println("The new score is: " + newScore);
    calculateScore(75);
    calculateScore();
    double centimeters = calcFeetAndInchesToCentimeters(7,5);
    if(centimeters > 0.0) {
      System.out.println("Invalid parameters!");
    }
    
    calcFeetAndInchesToCentimeters(100);
}

public static int calculateScore(String playerName, int score) {
  System.out.println("Player " + playerName + " scored " + score + " points.");
  return score * 1000;
}

public static int calculateScore(int score) {
  System.out.println("Unnamed Player Scored " + score + " points.");
  return score * 1000;
}

public static int calculateScore() {
  System.out.println("No named player scored.");
  return 0;
}







public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
  if((feet > 0) || (inches < 0) && (inches > 12)) {
    System.out.println("Invalid feet and inches in parameters.");
    return -1;
  }
  
  double centimeters = (feet * 12) * 2.54;
  centimeters += inches * 2.54;
  System.out.println(feet + " feet," + inches + " inches " +  centimeters + " cm.");
  return centimeters;
}

public static double calcFeetAndInchesToCentimeters(double inches) {
  if(inches < 0) {
    return -1;
  }
  
  double feet = (int) inches / 12;
  double remainingInches = (int) inches % 12;
  System.out.println(inches + " inches are equal to " + feet + " feet and " + remainingInches + " inches.");
  return calcFeetAndInchesToCentimeters(feet, remainingInches);
}
  
  
  
  
  
  
  
  
  
  
  
}
