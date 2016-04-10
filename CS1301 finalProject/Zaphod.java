// Constructor + toString();
// Set up for what gets put into the .txt file.
// Author: Adam Adkins
// Created: 11/11/2014

public class Zaphod{
 
  private String theNum, firstName, lastName, jobtitle, yearsOfService, emgContactName, emgContactNum, cellNumber, seatNumber, credCardBrand;     
  private String credCardFullName, credCardNumber, credCardVerifNumber, credCardExpDate, approvedYesorNo;

  
public Zaphod(String tnum,String fname,String lname,String jtitle,String yofserv,String emgname,String emgnum,String cellnum,
              String seatnum,String ccBrand,String ccfname,String ccNum,String ccVNum,String ccdate,String appr) 
  {
    theNum = tnum; 
    firstName = fname; 
    lastName = lname; 
    jobtitle = jtitle; 
    yearsOfService = yofserv; 
    emgContactName = emgname;
    emgContactNum = emgnum;
    cellNumber = cellnum;
    seatNumber = seatnum;
    credCardBrand = ccBrand;
    credCardFullName = ccfname;
    credCardNumber = ccNum; 
    credCardVerifNumber = ccVNum;
    credCardExpDate = ccdate;
    approvedYesorNo = appr;
  }

// Only returns first & last names. Assignment instructions say so. Understandable. Otherwise the GUI would be very cluttered.
 public String toString()
 {     
     return " "+firstName+" "+lastName+"\r\n" ;
 }

}
