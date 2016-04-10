// This program is designed to convert Miles to Kilometers.
//Author: Adam Adkins
//Created: 9/10/2014

import java.util.Scanner;

public class convertMilestoKilometers  {
  public static void main(String[] args) {
   
    final double kilometers = 1.60935;
    double userInputMiles; 
    double milesToKilometers;
//Get userInput     
    Scanner obj = new Scanner(System.in);
    System.out.println("This is a program that will convert Miles to Kilometers.");
    System.out.println("Please enter Miles: ");
    userInputMiles = obj.nextDouble();
//The Math.    
    milesToKilometers = userInputMiles * kilometers ; 
//The Results.
    System.out.println(userInputMiles + " Miles. = " + milesToKilometers  + " Kilometers.");
    
 
  }
}