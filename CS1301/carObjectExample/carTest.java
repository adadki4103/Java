// This test the car.java.
// Author: Adam Adkins
// Created: 10/1/2014

public class carTest
{
  public static void main (String[] args)
  {
  
  //Creates some cars. Make, Model,Year,Antique(Y/N)?
  {
    car auto1 = new car("Ford","Model B",1932);
    car auto2 = new car("Honda","Civic",1995);
    car auto3 = new car("Toyota","Corolla",1974);
    car auto4 = new car("Dodge","Viper",1996);
    
    System.out.print("Car 1");                    
    System.out.println(auto1);
    System.out.println("Antique: "+(auto1.isAntique())+"\n");
    
    System.out.print("Car 2");                    
    System.out.println(auto2);
    System.out.println("Antique: "+(auto2.isAntique())+"\n");
    
    System.out.print("Car 3");                    
    System.out.println(auto1);
    System.out.println("Antique: "+(auto3.isAntique())+"\n");
    
    
    System.out.print("Car 4");                    
    System.out.println(auto1);
    System.out.println("Antique: "+(auto4.isAntique())+"\n");
    
   
 }
}
}