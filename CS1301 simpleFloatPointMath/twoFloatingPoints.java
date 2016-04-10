// This is a program that reads two float points from the user and then prints the Sum, Differences, and Products. 
//Author: Adam Adkins
//Created: 9/10/2014

import java.util.Scanner;

public class twoFloatingPoints  {
  public static void main(String[] args) {
    
     float userFloatInputA;
     float userFloatInputB; 
     float inputAplusB;
     float inputAtimesB;
     float inputAminusB;
     float inputBminusA;
     
    // Get two floats from the user.
    Scanner obj = new Scanner(System.in);
    System.out.println("This program will quickly calculate complex numbers.");
    System.out.println("Please enter a number: ");
    System.out.println("For Example: 3.14 , 2 , 7.4 , or 4.2 ");
    userFloatInputA = obj.nextFloat();
    
    System.out.println("Please enter another number: ");
    userFloatInputB = obj.nextFloat();
    
    // The Math.
    inputAplusB = userFloatInputA + userFloatInputB ;
    inputAtimesB = userFloatInputA * userFloatInputB;
    inputAminusB = userFloatInputA - userFloatInputB;
    inputBminusA = userFloatInputB - userFloatInputA;
    
    
    // The Results.
    System.out.println("Here are thr results!");
    System.out.println("The Sum of your numbers: " + userFloatInputA + " + " +userFloatInputB + " = " + inputAplusB + ".");
    System.out.println("The Product of your numbers: " + userFloatInputA + " x " + userFloatInputB + " = " + inputAtimesB + ".");
    System.out.println("The Difference of your numbers: "+ userFloatInputA + " - " +userFloatInputB + " = " + inputAminusB + ".");
    System.out.println("or: " + userFloatInputB + " - " + userFloatInputA + " = " + inputBminusA + " . ");
  }
}