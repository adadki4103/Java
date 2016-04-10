// Bowman's CSCI1301 Project 2
// Adam Adkins
// 6/11/2015
// Main File for Statistics.java & StaSum.java

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main (String[] args){ 
    Random r = new Random();
    Scanner scan = new Scanner(System.in);
//----------------------------------------------------
//-------- Create Three Arrays For Test Purposes. ----
//---Array One----------------------------------------
    int[] array = new int[99]; 
    for(int i = 0; i < 99; i++) {
        array[i] = r.nextInt(500-10)+10;}
    Statistics stat = new Statistics(array);
    int min = stat.MinValue(array);
    int firstQuartile = stat.FirstQuartile(array);
    int median = stat.Median(array);
    int thirdQuartile = stat.ThirdQuartile(array);
    int max = stat.MaxValue(array);
    int range = stat.Range(array);
//--Array Two--(added 9/17/2015 for Statistics Class Testing Purposes)-----
// Essentially testing a known array instead of a randomly generated one. --
// Known set is {417,411,490,247}.
// Compute the mean, median, and mode.
    int[] array3 = new int[9];
    array3[0] = 3960;
    array3[1] = 4080;
    array3[2] = 3100;
    array3[3] = 3200;
    array3[4] = 2950;
    array3[5] = 3840;
    array3[6] = 4080;
    array3[7] = 4030;
    array3[8] = 3790;
    Statistics stat3 = new Statistics(array3);
    int median3 = stat3.Median(array3);
    double newMode3 = stat3.Mode(array3);
//---------------------------   
// Test Statistic's Methods.
//---------------------------
//-------------------ARRAY ONE----------------------------------------------------------------------------------------------------------------******
    System.out.println("-------------------ARRAY ONE---------------------------------------------------------------------------------------------");
    System.out.println("The Array: [10,500]");
    System.out.println(Arrays.toString(array));
    System.out.println();
    System.out.println("Max: "+max);
    System.out.println("Min: "+min);
    System.out.println("Range: "+range);
    System.out.println();
    System.out.println("Mean: "+(stat.Mean(array)));
    System.out.println("Median: "+median);
    System.out.println("Mode: "+(stat.Mode(array)));
    System.out.println();
    System.out.println("Standard Deviation: "+(stat.Deviation(array)));
    System.out.println();
    System.out.println("First Quartile: "+firstQuartile);
    System.out.println("Third Quartile: "+thirdQuartile);
    System.out.println();
    System.out.println("5-Number Summary: "+(Arrays.toString((stat.StatSum(min, firstQuartile, median, thirdQuartile, max)))));
    System.out.println();
    //---------------------------   
    // Divide the Array equally.
   //----------------------------
    System.out.println("How Many parts should we divide the array into? ");
    int userCount = scan.nextInt();
    int chunk = (array.length/userCount);
    System.out.println("Divided Array: ");
    int beanCount = 0;
    for(int i=0;i<array.length;i+=chunk){
    beanCount++;
    System.out.println(beanCount+". "+(Arrays.toString(Arrays.copyOfRange(array, i, i+chunk))));}
    System.out.println();
    System.out.println();
    System.out.println();
//-------------------ARRAY TWO----------------------------------------------------------------------------------------------------------------******
// Added 9/17/2015
    System.out.println("Known Set:"+Arrays.toString(array3)+".");
    System.out.println("Mean: "+(stat3.Mean(array3)));
    System.out.println("Median: "+median3);
    System.out.println("Mode: "+newMode3);
    
    scan.close();
  }
}