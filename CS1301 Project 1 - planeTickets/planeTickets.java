// This program is designed to format a Boarding Pass, based on user selections. 
//Author: Adam Adkins
//Created: 9/17/14
//Notes: - Finished v1.0 9/22/14. Not ideal, uses a LOT of if, else-if's. Does what it's supposed to though. Plans for 
//         a second, more obj heavy version soon.  Also should add calender to this for 'recieptTime'. 


//Need Scanner, NumberFormat
import java.util.*;
import java.text.*;

public class planeTickets
{
  public static void main(String[] args)
  {

    // Looked up Delta's Current Slogan. "Keep Climbing"
    // Get the User Name, Introduction. 
    
    // Variable 1
    String userFullName;
    System.out.println("Thank you for choosing Delta Airlines for your flight from: Atlanta to Honolulu.");
    System.out.println(" _________________________  ");
    System.out.println(" | Departing:Oct 6,2014   | ");
    System.out.println(" | Returning:Oct 10,2014  | ");
    System.out.println(" |________________________| ");    
    System.out.println("      Keep Climbing!\n");
    System.out.println("This program should help you make a flight selection.\n \nFirst, Enter your First & Last Name: \n ((For Example: John Smith))");
    // First Class.
    Scanner scan = new Scanner(System.in);
    userFullName = scan.nextLine(); 
    System.out.println("Thanks, " + userFullName + "." +" Now let\'s find you a flight."); 
    // Wait for user to press enter
    System.out.println("Please press enter to continue...");
    Scanner keyboard = new Scanner(System.in);
    keyboard.nextLine();


    //Obtained data from (google.com/flights), searched "Atlanta to Honolulu".
    //flightInfoA     $1157                                                              flightInfoB     $1129                  
    System.out.println("[Flight 1]                                                     [Flight 2]");
    System.out.println(" *****************************************************          ******************************************************             ");
    System.out.println("** Delta        ((Round Trip))    ATL-HNL    $1,157  **        ** Delta        ((Round Trip))    ATL-HNL    $1,129   **");  
    System.out.println("** Departure: Mon,Oct 6 2014                         **        ** Departure: Mon,Oct 6 2014                          **");
    System.out.println("**  _______________________________________________  **        **  ________________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  3:00pm-5:09pm | **        **  | Atlanta - Los Angeles·ATL-LAX  8:25am-10:25am | **");
    System.out.println("**  | Delta 370 · Economy · Boeing 737             | **        **  | Delta 110 · Economy · Boeing 757              | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                      | **        **  |   (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 5:55pm-8:38pm | **        **  | Los Angeles - Honolulu·LAX-HNL 11:40am-2:20pm | **");
    System.out.println("**  | Delta 1149 · Economy · Boeing 757            | **        **  | Delta 2578 · Economy · Boeing 757             | **");
    System.out.println("**  |______________________________________________| **        **  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                          **        ** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  _______________________________________________  **        **  _______________________________________________   **");
    System.out.println("**  | Honolulu – Seattle · HNL–SEA 8:45pm-5:23pm   | **        **  | Honolulu - Los Angeles·HNL-LAX 9:30pm-5:55am |  **");
    System.out.println("**  | Delta 2246 · Economy · Boeing 757            | **        **  | Delta 1212 · Economy · Boeing 757            |  **");
    System.out.println("**  |  (1 Stop @ Seattle)                          | **        **  |   (1 Stop @ Los Angeles)                     |  **");
    System.out.println("**  | Seattle - Atlanta·SEA-ATL 6:30am-2:08pm      | **        **  | Los Angeles - Atlanta·LAX-ATL 6:30am-1:39pm |  **");
    System.out.println("**  | Delta 1887 · Economy · Boeing 737            | **        **  | Delta 2154 · Economy · Boeing 757            |  **");
    System.out.println("**  |______________________________________________| **        **  |______________________________________________|  **");
    System.out.println(" *****************************************************          ****************************************************** ");
    // Average Screen size. Needed to put Flight3 below Flight1 & Flight2. 
    System.out.println();
    //flightInfoC     $1232
    System.out.println("                              [Flight 3]");
    System.out.println("                               ****************************************************** ");
    System.out.println("                              ** Delta        ((Round Trip))    ATL-HNL    $1,232   **");
    System.out.println("                              ** Departure: Mon, Oct 6 2014                         **");
    System.out.println("                              **  ________________________________________________  **");
    System.out.println("                              **  | Atlanta – Seattle · ATL–SEA 1:20pm-3:39pm     | **");
    System.out.println("                              **  | Delta 2429 · Economy · Boeing 757             | **");
    System.out.println("                              **  |   (1 Stop @ Seattle)                          | **");
    System.out.println("                              **  | Seattle - Honolulu·SEA-HNL 5:10pm-8:13pm      | **");
    System.out.println("                              **  | Delta 2237 · Economy · Boeing 757             | **");
    System.out.println("                              **  |_______________________________________________| **");
    System.out.println("                              ** Return: Fri, Oct 10 2014                           **");
    System.out.println("                              **  ________________________________________________  **");
    System.out.println("                              **  | Honolulu - Los Angeles·HNL-LAX 7:45am-4:14pm  | **");
    System.out.println("                              **  | Delta 1150 · Economy · Boeing 757             | **");
    System.out.println("                              **  |  (1 Stop @ Los Angeles)                       | **");
    System.out.println("                              **  | Los Angeles-Atlanta·LAX-ATL 4:52pm-11:59pm    | **");
    System.out.println("                              **  | Delta 1454 · Economy · Boeing 737             | **");
    System.out.println("                              **  |_______________________________________________| **");
    System.out.println("                               ****************************************************** ");
    System.out.println();
    System.out.println();
    System.out.println("                 *Prices shown here do not reflect the final price. Taxes & Fees Apply");
    System.out.println();


    System.out.println("Please select flight: 1, 2, or 3 .");  
    Scanner inputNumber = new Scanner (System.in);
    int userFlightChoice = inputNumber.nextInt();
   
// The Math  
    int flightFee = 53;
    int orgPriceA = 1157;
    int orgPriceB = 1129;
    int orgPriceC = 1232;
    double taxRate1 = ((.7)*(orgPriceA));
    double taxRate2 = ((.7)*(orgPriceB));
    double taxRate3 = ((.7)*(orgPriceC));
    double endPrice1 = ((taxRate1 + orgPriceA)+flightFee);
    double endPrice2 = ((taxRate2 + orgPriceB)+flightFee);
    double endPrice3 = ((taxRate3 + orgPriceC)+flightFee);
    NumberFormat cashfmt = NumberFormat.getCurrencyInstance();
    
//*************************************************************************************************************  
//******************************** User Flight Choice 1 *******************************************************
//*************************************************************************************************************     
if(userFlightChoice  == 1){
      System.out.println("You chose flight:"+ userFlightChoice+". Thanks," +userFullName+ ".");
      System.out.println("Now, let's find you a seat.  You have 6 choices available for flight "+userFlightChoice+".");
      System.out.println("Please Choose One of the following:");
      System.out.println("1.  A1");
      System.out.println("2.  B3");
      System.out.println("3.  A6");
      System.out.println("4.  C7");
      System.out.println("5.  A2");
      System.out.println("6.  B5");
      Scanner seatChoice = new Scanner (System.in);
      int userSeatChoice = seatChoice.nextInt();
      if(userSeatChoice == 1){
        System.out.println("You chose option 1. Seat: A1. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();                
    System.out.println("[Flight 1   "+userFullName+" ]");
    System.out.println(" *****************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL   "+cashfmt.format(endPrice1)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                         **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  3:00pm-5:09pm | **");
    System.out.println("**  | Delta 370 · Economy · Boeing 737             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 5:55pm-8:38pm | **");
    System.out.println("**  | Delta 1149 · Economy · Boeing 757            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                          **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Honolulu – Seattle · HNL–SEA 8:45pm-5:23pm   | **");
    System.out.println("**  | Delta 2246 · Economy · Boeing 757            | **");
    System.out.println("**  |  (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Atlanta·SEA-ATL 6:30am-2:08pm      | **");
    System.out.println("**  | Delta 1887 · Economy · Boeing 737            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("**   Seat: A1                                        **");
    System.out.println(" *****************************************************");
      } 
      else if(userSeatChoice == 2){
        System.out.println("You chose option 2. Seat: B3. Thanks, " +userFullName+".");
           System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();                 
    System.out.println("[Flight 1   "+userFullName+" ]");
    System.out.println(" *****************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL   "+cashfmt.format(endPrice1)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                         **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  3:00pm-5:09pm | **");
    System.out.println("**  | Delta 370 · Economy · Boeing 737             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 5:55pm-8:38pm | **");
    System.out.println("**  | Delta 1149 · Economy · Boeing 757            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                          **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Honolulu – Seattle · HNL–SEA 8:45pm-5:23pm   | **");
    System.out.println("**  | Delta 2246 · Economy · Boeing 757            | **");
    System.out.println("**  |  (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Atlanta·SEA-ATL 6:30am-2:08pm      | **");
    System.out.println("**  | Delta 1887 · Economy · Boeing 737            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("**   Seat: B3                                        **");
    System.out.println(" *****************************************************");
      }
      else if(userSeatChoice == 3){
        System.out.println("You chose option 3. Seat: A6. Thanks, " +userFullName+".");
           System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();                
    System.out.println("[Flight 1   "+userFullName+" ]");
    System.out.println(" *****************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL   "+cashfmt.format(endPrice1)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                         **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  3:00pm-5:09pm | **");
    System.out.println("**  | Delta 370 · Economy · Boeing 737             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 5:55pm-8:38pm | **");
    System.out.println("**  | Delta 1149 · Economy · Boeing 757            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                          **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Honolulu – Seattle · HNL–SEA 8:45pm-5:23pm   | **");
    System.out.println("**  | Delta 2246 · Economy · Boeing 757            | **");
    System.out.println("**  |  (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Atlanta·SEA-ATL 6:30am-2:08pm      | **");
    System.out.println("**  | Delta 1887 · Economy · Boeing 737            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("**   Seat: A6                                        **");
    System.out.println(" *****************************************************");
      }
      else if(userSeatChoice == 4){
        System.out.println("You chose option 4. Seat: C7. Thanks, " +userFullName+".");
           System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();                
    System.out.println("[Flight 1   "+userFullName+" ]");
    System.out.println(" *****************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL   "+cashfmt.format(endPrice1)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                         **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  3:00pm-5:09pm | **");
    System.out.println("**  | Delta 370 · Economy · Boeing 737             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 5:55pm-8:38pm | **");
    System.out.println("**  | Delta 1149 · Economy · Boeing 757            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                          **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Honolulu – Seattle · HNL–SEA 8:45pm-5:23pm   | **");
    System.out.println("**  | Delta 2246 · Economy · Boeing 757            | **");
    System.out.println("**  |  (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Atlanta·SEA-ATL 6:30am-2:08pm      | **");
    System.out.println("**  | Delta 1887 · Economy · Boeing 737            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("**   Seat: C7                                        **");
    System.out.println(" *****************************************************");
      }
      else if(userSeatChoice == 5){
        System.out.println("You chose option 5. Seat: A2. Thanks, " +userFullName+".");
           System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();                
    System.out.println("[Flight 1   "+userFullName+" ]");
    System.out.println(" *****************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL   "+cashfmt.format(endPrice1)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                         **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  3:00pm-5:09pm | **");
    System.out.println("**  | Delta 370 · Economy · Boeing 737             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 5:55pm-8:38pm | **");
    System.out.println("**  | Delta 1149 · Economy · Boeing 757            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                          **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Honolulu – Seattle · HNL–SEA 8:45pm-5:23pm   | **");
    System.out.println("**  | Delta 2246 · Economy · Boeing 757            | **");
    System.out.println("**  |  (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Atlanta·SEA-ATL 6:30am-2:08pm      | **");
    System.out.println("**  | Delta 1887 · Economy · Boeing 737            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("**   Seat: A2                                        **");
    System.out.println(" *****************************************************");
      }
      else if(userSeatChoice == 6){
        System.out.println("You chose option 6. Seat: B5. Thanks, " +userFullName+".");
           System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();               
    System.out.println("[Flight 1   "+userFullName+" ]");
    System.out.println(" *****************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL   "+cashfmt.format(endPrice1)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                         **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  3:00pm-5:09pm | **");
    System.out.println("**  | Delta 370 · Economy · Boeing 737             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 5:55pm-8:38pm | **");
    System.out.println("**  | Delta 1149 · Economy · Boeing 757            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                          **");
    System.out.println("**  _______________________________________________  **");
    System.out.println("**  | Honolulu – Seattle · HNL–SEA 8:45pm-5:23pm   | **");
    System.out.println("**  | Delta 2246 · Economy · Boeing 757            | **");
    System.out.println("**  |  (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Atlanta·SEA-ATL 6:30am-2:08pm      | **");
    System.out.println("**  | Delta 1887 · Economy · Boeing 737            | **");
    System.out.println("**  |______________________________________________| **");
    System.out.println("**   Seat: B5                                        **");
    System.out.println(" *****************************************************");
      }
      else{
        System.out.println("Sorry that was not an option.");
      }
}
//*************************************************************************************************************  
//******************************** User Flight Choice 2 *******************************************************
//*************************************************************************************************************  
  else if(userFlightChoice == 2){
      System.out.println("You chose flight:"+ userFlightChoice+". Thanks," +userFullName+ ".");
      System.out.println("Now, let's find you a seat.  You have 6 choices available for flight "+userFlightChoice+".");
      System.out.println("Please Choose One of the following:");
      System.out.println("1.  D1");
      System.out.println("2.  Z37");
      System.out.println("3.  A12");
      System.out.println("4.  J7");
      System.out.println("5.  Y0");
      System.out.println("6.  D4");
      Scanner seatChoice2 = new Scanner (System.in);
      int userSeatChoice2 = seatChoice2.nextInt();
      if(userSeatChoice2 == 1){
        System.out.println("You chose option 1. Seat: D1. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard3 = new Scanner(System.in);
        keyboard3.nextLine();                 
    System.out.println("[Flight 2   "+userFullName+" ]");
    System.out.println(" ******************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                          **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  8:25am-10:25am | **");
    System.out.println("**  | Delta 110 · Economy · Boeing 757              | **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 11:40am-2:20pm | **");
    System.out.println("**  | Delta 2578 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  _______________________________________________   **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 9:30pm-5:55am |  **");
    System.out.println("**  | Delta 1212 · Economy · Boeing 757            |  **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                     |  **");
    System.out.println("**  | Los Angeles - Atlanata·LAX-ATL 6:30am-1:39pm |  **");
    System.out.println("**  | Delta 2154 · Economy · Boeing 757            |  **");
    System.out.println("**  |______________________________________________|  **");
    System.out.println("**   Seat: D1                                         **");
    System.out.println(" ****************************************************** ");
      }
      else if(userSeatChoice2 == 2){
        System.out.println("You chose option 2. Seat: Z37. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard4 = new Scanner(System.in);
        keyboard4.nextLine();
          System.out.println("[Flight 2   "+userFullName+" ]");
    System.out.println(" ******************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                          **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  8:25am-10:25am | **");
    System.out.println("**  | Delta 110 · Economy · Boeing 757              | **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 11:40am-2:20pm | **");
    System.out.println("**  | Delta 2578 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  _______________________________________________   **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 9:30pm-5:55am |  **");
    System.out.println("**  | Delta 1212 · Economy · Boeing 757            |  **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                     |  **");
    System.out.println("**  | Los Angeles - Atlanata·LAX-ATL 6:30am-1:39pm |  **");
    System.out.println("**  | Delta 2154 · Economy · Boeing 757            |  **");
    System.out.println("**  |______________________________________________|  **");
    System.out.println("**   Seat: Z37                                        **");
    System.out.println(" ****************************************************** ");
      }
      else if(userSeatChoice2 == 3){
        System.out.println("You chose option 3. Seat: A12. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard5 = new Scanner(System.in);
        keyboard5.nextLine();
          System.out.println("[Flight 2   "+userFullName+" ]");
    System.out.println(" ******************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                          **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  8:25am-10:25am | **");
    System.out.println("**  | Delta 110 · Economy · Boeing 757              | **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 11:40am-2:20pm | **");
    System.out.println("**  | Delta 2578 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  _______________________________________________   **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 9:30pm-5:55am |  **");
    System.out.println("**  | Delta 1212 · Economy · Boeing 757            |  **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                     |  **");
    System.out.println("**  | Los Angeles - Atlanata·LAX-ATL 6:30am-1:39pm |  **");
    System.out.println("**  | Delta 2154 · Economy · Boeing 757            |  **");
    System.out.println("**  |______________________________________________|  **");
    System.out.println("**   Seat: A12                                        **");
    System.out.println(" ****************************************************** ");
      }
      else if(userSeatChoice2 == 4){
        System.out.println("You chose option 4. Seat: J7. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard6 = new Scanner(System.in);
        keyboard6.nextLine();
          System.out.println("[Flight 2   "+userFullName+" ]");
    System.out.println(" ******************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                          **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  8:25am-10:25am | **");
    System.out.println("**  | Delta 110 · Economy · Boeing 757              | **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 11:40am-2:20pm | **");
    System.out.println("**  | Delta 2578 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  _______________________________________________   **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 9:30pm-5:55am |  **");
    System.out.println("**  | Delta 1212 · Economy · Boeing 757            |  **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                     |  **");
    System.out.println("**  | Los Angeles - Atlanata·LAX-ATL 6:30am-1:39pm |  **");
    System.out.println("**  | Delta 2154 · Economy · Boeing 757            |  **");
    System.out.println("**  |______________________________________________|  **");
    System.out.println("**   Seat: J7                                         **");
    System.out.println(" ****************************************************** ");
      }
      else if(userSeatChoice2 == 5){
        System.out.println("You chose option 5. Seat: Y0. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard7 = new Scanner(System.in);
        keyboard7.nextLine();
          System.out.println("[Flight 2   "+userFullName+" ]");
    System.out.println(" ******************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                          **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  8:25am-10:25am | **");
    System.out.println("**  | Delta 110 · Economy · Boeing 757              | **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 11:40am-2:20pm | **");
    System.out.println("**  | Delta 2578 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  _______________________________________________   **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 9:30pm-5:55am |  **");
    System.out.println("**  | Delta 1212 · Economy · Boeing 757            |  **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                     |  **");
    System.out.println("**  | Los Angeles - Atlanata·LAX-ATL 6:30am-1:39pm |  **");
    System.out.println("**  | Delta 2154 · Economy · Boeing 757            |  **");
    System.out.println("**  |______________________________________________|  **");
    System.out.println("**   Seat: Y0                                         **");
    System.out.println(" ****************************************************** ");
      }
      else if(userSeatChoice2 == 6){
        System.out.println("You chose option 6. Seat: D4. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard8 = new Scanner(System.in);
        keyboard8.nextLine();
    System.out.println("[Flight 2   "+userFullName+" ]");
    System.out.println(" ******************************************************");
    System.out.println("** Delta      ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"  **");  
    System.out.println("** Departure: Mon,Oct 6 2014                          **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta - Los Angeles·ATL-LAX  8:25am-10:25am | **");
    System.out.println("**  | Delta 110 · Economy · Boeing 757              | **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                      | **");
    System.out.println("**  | Los Angeles - Honolulu·LAX-HNL 11:40am-2:20pm | **");
    System.out.println("**  | Delta 2578 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  _______________________________________________   **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 9:30pm-5:55am |  **");
    System.out.println("**  | Delta 1212 · Economy · Boeing 757            |  **");
    System.out.println("**  |   (1 Stop @ Los Angeles)                     |  **");
    System.out.println("**  | Los Angeles - Atlanata·LAX-ATL 6:30am-1:39pm |  **");
    System.out.println("**  | Delta 2154 · Economy · Boeing 757            |  **");
    System.out.println("**  |______________________________________________|  **");
    System.out.println("**   Seat: D4                                         **");
    System.out.println(" ****************************************************** ");
      }
      else{
        System.out.println("Sorry that was not an option.");}
  }
//*************************************************************************************************************  
//******************************** User Flight Choice 3 *******************************************************
//*************************************************************************************************************
  else if(userFlightChoice == 3){
      System.out.println("You chose flight:"+ userFlightChoice+". Thanks," +userFullName+ ".");
      System.out.println("Now, let's find you a seat.  You have 6 choices available for flight "+userFlightChoice+".");
      System.out.println("Please Choose One of the following:");
      System.out.println("1.  1G");
      System.out.println("2.  B8");
      System.out.println("3.  R2");
      System.out.println("4.  D2");
      System.out.println("5.  C3");
      System.out.println("6.  P0");
      Scanner seatChoice3 = new Scanner (System.in);
      int userSeatChoice3 = seatChoice3.nextInt();      
   if(userSeatChoice3 == 1){
        System.out.println("You chose option 1. Seat: 1G. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();
    System.out.println("[Flight 3   "+userFullName+" ]");
    System.out.println(" ****************************************************** ");
    System.out.println("** Delta     ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"   **");
    System.out.println("** Departure: Mon, Oct 6 2014                         **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta – Seattle · ATL–SEA 1:20pm-3:39pm     | **");
    System.out.println("**  | Delta 2429 · Economy · Boeing 757             | **");
    System.out.println("**  |   (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Honolulu·SEA-HNL 5:10pm-8:13pm      | **");
    System.out.println("**  | Delta 2237 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 7:45am-4:14pm  | **");
    System.out.println("**  | Delta 1150 · Economy · Boeing 757             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                       | **");
    System.out.println("**  | Los Angeles-Atlanta·LAX-ATL 4:52pm-11:59pm    | **");
    System.out.println("**  | Delta 1454 · Economy · Boeing 737             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("**   Seat: 1G                                         **");
    System.out.println("****************************************************** ");
      }
      else if(userSeatChoice3 == 2){
         System.out.println("You chose option 2. Seat: B8. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();
    System.out.println("[Flight 3   "+userFullName+" ]");
    System.out.println(" ****************************************************** ");
    System.out.println("** Delta     ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"   **");
    System.out.println("** Departure: Mon, Oct 6 2014                         **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta – Seattle · ATL–SEA 1:20pm-3:39pm     | **");
    System.out.println("**  | Delta 2429 · Economy · Boeing 757             | **");
    System.out.println("**  |   (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Honolulu·SEA-HNL 5:10pm-8:13pm      | **");
    System.out.println("**  | Delta 2237 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 7:45am-4:14pm  | **");
    System.out.println("**  | Delta 1150 · Economy · Boeing 757             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                       | **");
    System.out.println("**  | Los Angeles-Atlanta·LAX-ATL 4:52pm-11:59pm    | **");
    System.out.println("**  | Delta 1454 · Economy · Boeing 737             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("**   Seat: B8                                         **");
    System.out.println("****************************************************** ");
      }
      else if(userSeatChoice3 == 3){
         System.out.println("You chose option 3. Seat: R2. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();
    System.out.println("[Flight 3   "+userFullName+" ]");
    System.out.println(" ****************************************************** ");
    System.out.println("** Delta     ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"   **");
    System.out.println("** Departure: Mon, Oct 6 2014                         **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta – Seattle · ATL–SEA 1:20pm-3:39pm     | **");
    System.out.println("**  | Delta 2429 · Economy · Boeing 757             | **");
    System.out.println("**  |   (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Honolulu·SEA-HNL 5:10pm-8:13pm      | **");
    System.out.println("**  | Delta 2237 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 7:45am-4:14pm  | **");
    System.out.println("**  | Delta 1150 · Economy · Boeing 757             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                       | **");
    System.out.println("**  | Los Angeles-Atlanta·LAX-ATL 4:52pm-11:59pm    | **");
    System.out.println("**  | Delta 1454 · Economy · Boeing 737             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("**   Seat: R2                                         **");
    System.out.println("****************************************************** ");
      }
      else if(userSeatChoice3 == 4){
         System.out.println("You chose option 4. Seat: D2. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();
    System.out.println("[Flight 3   "+userFullName+" ]");
    System.out.println(" ****************************************************** ");
    System.out.println("** Delta     ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"   **");
    System.out.println("** Departure: Mon, Oct 6 2014                         **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta – Seattle · ATL–SEA 1:20pm-3:39pm     | **");
    System.out.println("**  | Delta 2429 · Economy · Boeing 757             | **");
    System.out.println("**  |   (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Honolulu·SEA-HNL 5:10pm-8:13pm      | **");
    System.out.println("**  | Delta 2237 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 7:45am-4:14pm  | **");
    System.out.println("**  | Delta 1150 · Economy · Boeing 757             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                       | **");
    System.out.println("**  | Los Angeles-Atlanta·LAX-ATL 4:52pm-11:59pm    | **");
    System.out.println("**  | Delta 1454 · Economy · Boeing 737             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("**   Seat: D2                                         **");
    System.out.println("****************************************************** ");
      }
      else if(userSeatChoice3 == 5){
         System.out.println("You chose option 5. Seat: C3. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();
    System.out.println("[Flight 3   "+userFullName+" ]");
    System.out.println(" ****************************************************** ");
    System.out.println("** Delta     ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"   **");
    System.out.println("** Departure: Mon, Oct 6 2014                         **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta – Seattle · ATL–SEA 1:20pm-3:39pm     | **");
    System.out.println("**  | Delta 2429 · Economy · Boeing 757             | **");
    System.out.println("**  |   (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Honolulu·SEA-HNL 5:10pm-8:13pm      | **");
    System.out.println("**  | Delta 2237 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 7:45am-4:14pm  | **");
    System.out.println("**  | Delta 1150 · Economy · Boeing 757             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                       | **");
    System.out.println("**  | Los Angeles-Atlanta·LAX-ATL 4:52pm-11:59pm    | **");
    System.out.println("**  | Delta 1454 · Economy · Boeing 737             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("**   Seat: C3                                         **");
    System.out.println("****************************************************** ");
      }
      else if(userSeatChoice3 == 6){
         System.out.println("You chose option 6. Seat: P0. Thanks, " +userFullName+".");
        System.out.println("Please press enter to continue...");
        Scanner keyboard2 = new Scanner(System.in);
        keyboard2.nextLine();
    System.out.println("[Flight 3   "+userFullName+" ]");
    System.out.println(" ****************************************************** ");
    System.out.println("** Delta     ((Round Trip))    ATL-HNL    "+cashfmt.format(endPrice2)+"   **");
    System.out.println("** Departure: Mon, Oct 6 2014                         **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Atlanta – Seattle · ATL–SEA 1:20pm-3:39pm     | **");
    System.out.println("**  | Delta 2429 · Economy · Boeing 757             | **");
    System.out.println("**  |   (1 Stop @ Seattle)                          | **");
    System.out.println("**  | Seattle - Honolulu·SEA-HNL 5:10pm-8:13pm      | **");
    System.out.println("**  | Delta 2237 · Economy · Boeing 757             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("** Return: Fri, Oct 10 2014                           **");
    System.out.println("**  ________________________________________________  **");
    System.out.println("**  | Honolulu - Los Angeles·HNL-LAX 7:45am-4:14pm  | **");
    System.out.println("**  | Delta 1150 · Economy · Boeing 757             | **");
    System.out.println("**  |  (1 Stop @ Los Angeles)                       | **");
    System.out.println("**  | Los Angeles-Atlanta·LAX-ATL 4:52pm-11:59pm    | **");
    System.out.println("**  | Delta 1454 · Economy · Boeing 737             | **");
    System.out.println("**  |_______________________________________________| **");
    System.out.println("**   Seat: P0                                         **");
    System.out.println("****************************************************** ");
      }
      else{
        System.out.println("Sorry that was no an option.");
      }

   
}
    else{
   if(userFlightChoice <1 || userFlightChoice >3);{ 
        System.out.println("Sorry that was not a choice.");
      } 

    }
//Add Calender ReceiptTime here. 
System.out.println();
System.out.println("        Thanks. Have a pleasent flight! "); 
System.out.println();
}
}
  

  



