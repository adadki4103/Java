// This program is designed to allow a user choose between 3 flights, each with 6 available seats. And then returns
// the information back as a boarding pass. 
// Author: Adam Adkins
// Created: 9/23/2014

import java.util.*;
import java.text.*;

public class boardingPass
{
  public static void main(String[] args)
  {
    NumberFormat cashfomat = NumberFormat.getCurrencyInstance();
    String userName;
    String departureDate;
    String gate = null;
    int bagNum;
    //Intro.
    System.out.println("Thank you for choosing Delta Airlines for your flight from: Atlanta to Honolulu.");
    System.out.println(" _________________________  ");
    System.out.println(" | Departing:Oct 6,2014   | ");
    System.out.println(" | Returning:Oct 10,2014  | ");
    System.out.println(" |________________________| ");    
    System.out.println("      Keep Climbing!\n");
    //Get userName
    System.out.println("This program should help you make a flight selection.\n \nFirst, Enter your First & Last Name: \n ((For Example: John Smith))");
    Scanner nameScan = new Scanner(System.in);
    userName = nameScan.nextLine(); 
    //Get bagNum
    System.out.println("How many bags do you have?");
    Scanner bagScan = new Scanner(System.in);
    bagNum = bagScan.nextInt(); 
    //Wait for them to press enter before displaying the ticket-choices.
    System.out.println("Great !"+userName+", let's find you a flight.\nThere are 3 options available.\nPress Enter to continue...");
    Scanner keyboardWait = new Scanner(System.in);
    keyboardWait.nextLine();

// Show Ticket Options. 

    bomarMonk flightOne = new bomarMonk("1",(userName),1157.17,"ATL","HNL", "6","10","Atlanta,GA","Los Angeles,CA","ATL","LAX","3:00pm","5:09pm",
                                        "Honolulu,HI","Seattle,WA","HNL","SEA","8:45pm","5:23pm",
                                        "370","Boegin 737","2246","Boegin 757",
                                        "Los Angeles,CA","Seattle,WA","Los Angeles,CA","Honolulu,HI",
                                        "LAX","HNL","5:55pm","8:38pm","Seattle,WA","Atanta,GA","SEA",
                                        "ATL","6:30am","2:08pm","1149","Boeing 757","1887","Boeing 737");
    bomarMonk flightTwo = new bomarMonk("2",(userName),1129.23,"ATL","HNL","6","10","Atlanta,GA","Los Angeles,CA","ATL","LAX","8:25am","10:25am",
                                        "Honolulu,HI","Los Angeles,CA","HNL","LAX","9:30pm","5:55am","110","Boeing 757","1212","Boeing 757","Los Angeles,CA",
                                        "Los Angeles,CA", "Los Angeles, CA","Honolulu,HI","LAX","HNL","11:40am","2:20pm","Los Angeles,CA","Atlanta,GA","LAX","ATL","6:30am",
                                        "1:39pm","2578","Boeing 757","2154","Boeing 757");
    bomarMonk flightThree = new bomarMonk("3",(userName),1232.04,"ATL","HNL","6","10","Atlanta,GA","Seattle,WA","ATL","SEA","1:20pm","3:39pm","Honolulu,HI",
                                          "Los Angeles,CA","HNL","LAX","7:45am","4:14pm","2429","Boeing 757","1150","Boeing 757","Seattle,WA","Los Angeles,CA","Seattle,WA",
                                          "Honolulu,HI","SEA","HNL","5:10pm","8:13pm","Los Angeles,CA","Atlanta,GA","LAX","ATL","4:52pm","11:59pm","2237","Boeing 757",
                                          "1454","Boeing 737");
  
    System.out.println(flightOne);
    System.out.println(flightTwo);
    System.out.println(flightThree);
    
// User Flight Choice.
// Bag/ Math Variables
    System.out.println("Please choose flight 1, 2 or 3");
    Scanner planeChoice = new Scanner (System.in);
      int userPlaneChoice = planeChoice.nextInt();
      double orginalPrice = 0.00;
      double taxRate = 0.7;
      //bagRate && bagFlatRate double values needs to be pinned down more precisely. Would expect these rates to be provided. 
      double bagRate = 0.07;
      double bagFlatRate = 40.00;
      NumberFormat cashfomt = NumberFormat.getCurrencyInstance();
      
// Sets Up orginalPrice  & gate based on flight choice.
      if(userPlaneChoice == 1){
       gate = "G27";
       orginalPrice = 1157.17;
      }
      else if(userPlaneChoice == 2){
       orginalPrice = 1129.23;
       gate = "F19";
      }
      else if(userPlaneChoice == 3){
       orginalPrice = 1232.04;
       gate = "H11";
      }
// Start Plane One.         
      if(userPlaneChoice == 1){
      System.out.println("You chose Flight One.");
      System.out.println("There are 6 avaiable seats. Please choose one of the following:");
      System.out.println((flightOne.toFlightOne()));
    Scanner seatChoice1 = new Scanner (System.in);
      int schoice1 = seatChoice1.nextInt();
      if(schoice1 == 1){
        System.out.println(flightOne);
        System.out.println("Gate:"+gate+"   Seat:D4           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice1 == 2){
        System.out.println(flightOne);
        System.out.println("Gate:"+gate+"   Seat:N6           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice1 == 3){
        System.out.println(flightOne);
        System.out.println("Gate:"+gate+"   Seat:M3           Num. of bags:"+bagNum+"\n");
       System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice1 == 4){
        System.out.println(flightOne);
        System.out.println("Gate:"+gate+"   Seat:L7           Num. of bags:"+bagNum+"\n");
         System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(orginalPrice*taxRate)+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
      }
      
      else if(schoice1 == 5){
        System.out.println(flightOne);
        System.out.println("Gate:"+gate+"  Seat:B9           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+(bagRate*orginalPrice)+orginalPrice)+"   <--Total Price\n\n");
        
      }
      else if(schoice1 == 6){
        System.out.println(flightOne);
        System.out.println("Gate:"+gate+"  Seat:C12           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else{
        System.out.println("That was not an option!");
      }
      }
//End Plane One.
//Start Plane Two. 
    else if(userPlaneChoice == 2){
      System.out.println("There are 6 avaiable seats. Please choose one of the following:");
      System.out.println((flightTwo.toFlightTwo()));
      Scanner seatChoice2 = new Scanner (System.in);
      int schoice2 = seatChoice2.nextInt();
      if(schoice2 == 1){
        System.out.println(flightTwo);
        System.out.println("Gate:"+gate+"   Seat:S3           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");

      }
      else if(schoice2 == 2){      
        System.out.println(flightTwo);
        System.out.println("Gate:"+gate+"   Seat:Q4           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice2 == 3){
        System.out.println(flightTwo);
        System.out.println("Gate:"+gate+"   Seat:Z9           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice2 == 4){
        System.out.println(flightTwo);
        System.out.println("Gate:"+gate+"   Seat:N7           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice2 == 5){
        System.out.println(flightTwo);
        System.out.println("Gate:"+gate+"   Seat:C3           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice2 == 6){
        System.out.println(flightTwo);
        System.out.println("Gate:"+gate+"   Seat:P0           Num. of bags:"+bagNum+"\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else{
        System.out.println("That was not an option!");
      }
    }
//End Plane 2.
//Start Plane 3.
    else if(userPlaneChoice == 3){
      System.out.println("There are 6 avaiable seats. Please choose one of the following:");
      System.out.println((flightThree.toFlightThree()));
      Scanner seatChoice3 = new Scanner (System.in);
      int schoice3 = seatChoice3.nextInt();
      if(schoice3 == 1){
        System.out.println(flightThree);
        System.out.println("Gate:"+gate+"   Seat:R2\n");
       System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice3 == 2){
        System.out.println(flightThree);
        System.out.println("Gate:"+gate+"   Seat:D2\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice3 == 3){
        System.out.println(flightThree);
        System.out.println("Gate:"+gate+"   Seat:Y0\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice3 == 4){
        System.out.println(flightThree);
        System.out.println("Gate:"+gate+"   Seat:D4\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice3 == 5){
        System.out.println(flightThree);
        System.out.println("Gate:"+gate+"   Seat:I8\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else if(schoice3 == 6){
        System.out.println(flightThree);
        System.out.println("Gate:"+gate+"   Seat:G8\n");
        System.out.println(cashfomt.format(orginalPrice)+"   <--Price before Taxes & Fees\n"+cashfomt.format(((orginalPrice*taxRate)))+"  <--Tax\n"+cashfomt.format((bagRate*bagNum)+(orginalPrice*bagRate)+bagFlatRate)+"   <--Bag Fees\n"+cashfomt.format((orginalPrice*taxRate)+orginalPrice+(bagRate*orginalPrice))+"   <--Total Price\n\n");
        
      }
      else{
        System.out.println("That was not an option!");
      }
    }
    else{
      System.out.println("That was not an option!");
    }
//End Plane Three.    

}       
 
}
