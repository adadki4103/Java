// This program is designed to take 2 Integers from the user and then ouput the sum of their cubes.
//Author: Adam Adkins
//Created: 9.16.2014

import java.util.Scanner;

public class CubeSums
{
  public static void main (String[] args)

  {
    int userInputOne ;
    int userInputTwo ; 
    int endValue ; 
    
    
    
    Scanner scan = new Scanner (System.in);
    System.out.println("This Program will take two numbers and give the results of the sum of their Cubes.");
    System.out.println("For Example, if we enter in 2 & 3, we get:  (-2)^3 + (3)^3  = 35. ");
    System.out.println("Enter your first number.");
    
    userInputOne = scan.nextInt();
    
    System.out.println("Enter your second number.");
    
    userInputTwo = scan.nextInt();
    
    endValue = (int)Math.pow(userInputOne,3) + (int)Math.pow(userInputTwo,3); 
      
    System.out.println("The Sum of ( " + userInputOne + " )^3 & ( " + userInputTwo + " )^3 is: " + endValue + "." );
    System.out.println("        or     ");
    System.out.println("(" + userInputOne + ")^3 + (" + userInputTwo + ")^3 = " + endValue + ".");
    

  }
}

    