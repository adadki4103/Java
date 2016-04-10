//Methods,Constructor,Variables for Car class
//Author: Adam Adkins
//Created: 10/1/2014

public class car
{
  private String carMake, carModel, antAns;
  private int carYear;
  private final int antiqueYear = 1969;
  public boolean isAntique;
  
// Sets up car details
  public car(String cmake, String cmodel, int cyear)
  {
    carMake = cmake;
    carModel = cmodel;
    carYear = cyear;

  }
  
// Is it antique? Antique year is 1969.
public boolean isAntique()
{
  if(carYear <= antiqueYear){
    
    return true ;
  }
  return false ;
}
  


// Return it.
public String toString()
{
  return "\nMake: "+carMake+"\nModel: "+carModel+"\nYear: "+carYear;
}
}
 
    