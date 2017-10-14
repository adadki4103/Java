//Author: Adam Adkins
//StudentID: adadki4103@ung.edu 
//Created: 1/14/2015
//Objective: This program is to figure out the smallest possible number of coins based on a given amount
//          (input from keyboard) and display the combinations of these coins. 

import java.util.Scanner;
import java.text.NumberFormat;

public class moneyTime  {
  public static void main(String[] args) {
    
   float userInput;
   float currentValue;
   
   int tenThousandDollarBill =0;
   int fiveThousandDollarBill =0;
   int thousandDollarBill =0;
   int fiveHundredDollarBill =0;
   int hundredDollarBill  =0;
   int fiftyDollarBill =0;
   int twentyDollarBill =0;
   int tenDollarBill =0;
   int fiveDollarBill =0;
   int oneDollarBill =0;
   int quarterCent =0;
   int dimeCent =0;
   int nickelCent =0;
   int pennyCent =0 ; 
   
   String penny =" Penny";
   Scanner obj = new Scanner(System.in);
   NumberFormat fmt = NumberFormat.getCurrencyInstance();
   
// Ask for user input.
   System.out.println("---Money Organizer---");
   System.out.println("Please enter a monetary value to see it organized by bill & coin.");
   System.out.println("For example: \"42.26\" ");
   userInput = obj.nextFloat();
   currentValue = userInput;
   
// the Math.  
   if(currentValue >= 10000){
     tenThousandDollarBill = (int)currentValue/10000;
     currentValue -= (tenThousandDollarBill*10000);
   }
   
   if(currentValue >= 5000){
     fiveThousandDollarBill = (int)currentValue/5000;
     currentValue -= (fiveThousandDollarBill*5000);
   }
   
   if(currentValue >= 1000){
     thousandDollarBill = (int)currentValue/1000;
     currentValue -= (thousandDollarBill*1000);
   }
   
   if(currentValue >= 500){
     fiveHundredDollarBill = (int)currentValue/500;
     currentValue -= (fiveHundredDollarBill*500);
   }
   
   if(currentValue >= 100){
     hundredDollarBill = (int)currentValue/100;
     currentValue -= (hundredDollarBill*100);
   }
   
   if(currentValue >= 50){
     fiftyDollarBill = (int)currentValue/50;
     currentValue -= (fiftyDollarBill*50);
   }
   
   if(currentValue >= 20){
     twentyDollarBill = (int)currentValue/20;
     currentValue -= (twentyDollarBill*20);
   }
   
   if(currentValue >= 10){
     tenDollarBill = (int)currentValue/10;
     currentValue -= (tenDollarBill*10);
   }
  
   if(currentValue >= 5){
     fiveDollarBill = (int)currentValue/5;
     currentValue -= (fiveDollarBill * 5);
   }
  
   if(currentValue >= 1) {
     oneDollarBill =(int)currentValue/1;
     currentValue -=(oneDollarBill);
   }
  
   if(currentValue >= 0.25){
      quarterCent = (int)((currentValue*100)/25);
      currentValue -=(quarterCent * 0.25);
   }
  
   if(currentValue >=0.10){
      dimeCent = (int)((currentValue*100)/10);
      currentValue -=(dimeCent * 0.10);
   }
  
   if(currentValue >=0.05){
         nickelCent = (int)((currentValue*100)/5);
         currentValue -=(nickelCent * 0.05);
   }
  
   if(currentValue >=0.01){
    pennyCent = (int)(currentValue*100)/1; 
    currentValue -=(pennyCent * 0.01);
   } 
  
   if(currentValue >=0.001){
    pennyCent++;
  }

//The results.  
   System.out.println(" "+fmt.format(userInput) + " Comes out to be .... ");
   System.out.println("");
   if(tenThousandDollarBill > 0){
     System.out.print(" "+tenThousandDollarBill + " Ten Thousand Dollar Bill");
     if(tenThousandDollarBill >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(fiveThousandDollarBill > 0){
     System.out.print(" "+fiveThousandDollarBill + " Five Thousand Dollar Bill");
     if(fiveThousandDollarBill >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(thousandDollarBill > 0){
     System.out.print(" "+thousandDollarBill + " One Thousand Dollar Bill");
     if(thousandDollarBill >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(fiveHundredDollarBill > 0){
     System.out.print(" "+fiveHundredDollarBill + " Five Hundred Dollar Bill");
     if(fiveHundredDollarBill >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(hundredDollarBill > 0){
     System.out.print(" "+hundredDollarBill + " Hundred Dollar Bill");
     if(hundredDollarBill >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(twentyDollarBill > 0){
     System.out.print(" "+twentyDollarBill + " Twenty Dollar Bill");
     if(twentyDollarBill >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(tenDollarBill > 0){
     System.out.print(" "+tenDollarBill + " Ten Dollar Bill");
     if(tenDollarBill >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(fiveDollarBill > 0){
     System.out.print(" "+fiveDollarBill + " Five Dollar Bill");
     if(fiveDollarBill >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(oneDollarBill > 0){
     System.out.print(" "+oneDollarBill + " One Dollar Bill");
     if(oneDollarBill >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(quarterCent > 0){
     System.out.print(" "+quarterCent + " Quarter");
     if(quarterCent >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(dimeCent > 0){
     System.out.print(" "+dimeCent + " Dime");
     if(dimeCent >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(nickelCent > 0){
     System.out.print(" "+nickelCent + " Nickel");
     if(nickelCent >= 2){
       System.out.print("s");}
     System.out.print(".\n");}
   if(pennyCent > 0){
     System.out.print(" "+pennyCent);
     if(pennyCent == 1){
       System.out.print(penny);}
     else if(pennyCent >= 2){
       System.out.print(penny.replace("y","ies"));}
   System.out.print(".\n");}
   
   obj.close();
 
   }
}

