// Constructor, Methods, a variety of variables. 
// Used the Students & University in class examples as a guide. 
//Author: Adam Adkins
//Created: 9/24/2014


//
//  ***************************************************************************************************
// ********(Strings)******************(Ints)********************(Doubles*******************************
// *******|userName = uname            departDate = ddate        orginalPrice = oprice |***************
// *******|departAbrv = dabrv          arrivalDate = adate       taxFee = tfee         |***************
// *******|arrivalAbrv = aabrv         passNum = pnum            flightFee = ffee      |***************
// *******|departTime = dtime                                    endPrice = eprice     |***************
// *******|arrivalTime = atime                                                         |***************
// *******|flightNum = fnum                                                            |***************
// *******|flightPlaneType = fptype                                                    |***************
// *******|departName = dname                                                          |***************
// *******|arrivalName = aname                                                         |***************
//  ******|stopLocation = sloc                                                         |**************
//  *************************************************************************************************
public class bomarMonk
{
private double orginalPrice, endPrice;
private String passNum, userName, departAbrv, arrivalAbrv, departDate, returnDate, departName, arrivalName, departAbrv2, arrivalAbrv2, departTime, arrivalTime;
private String departName2, arrivalName2, departAbrv3, arrivalAbrv3, departTime2, arrivalTime2, flightNum, flightPlaneType, flightNum2, flightPlaneType2;
private String stopLocation, stopLocation2, departName3, arrivalName3, departAbrv4, arrivalAbrv4, departTime3, arrivalTime3, departName4, arrivalName4, departAbrv5, arrivalAbrv5, departTime4, arrivalTime4;
private String flightNum3, flightPlaneType3, flightNum4, flightPlaneType4;

//Constructor.
  
public bomarMonk(String pnum,String uname, double oprice,
String dabrv, String aabrv,
String ddate, String rdate,
String dname, String aname, String dabrv2, String aabrv2, String dtime, String atime, String dname2, String aname2, String dabrv3, String aabrv3, String dtime2, String atime2,
String fnum, String fptype, String fnum2, String fptype2,
String sloc, String sloc2,
String dname3, String aname3, String dabrv4, String aabrv4, String dtime3, String atime3, String dname4, String aname4, String dabrv5, String aabrv5, String dtime4, String atime4,
String fnum3, String fptype3, String fnum4, String fptype4)
{
orginalPrice = oprice;
passNum = pnum;
userName = uname;
departAbrv = dabrv;
arrivalAbrv = aabrv;
departDate = ddate;
returnDate = rdate;
departName = dname;
arrivalName = aname;
departAbrv2 = dabrv2;
arrivalAbrv2 = aabrv2;
departTime = dtime;
arrivalTime = atime;
departName2 = dname2;
arrivalName2 = aname2;
departAbrv3 = dabrv3;
arrivalAbrv3 = aabrv3;
departTime2 = dtime2;
arrivalTime2 = atime2;
flightNum = fnum;
flightPlaneType = fptype;
flightNum2 = fnum2;
flightPlaneType2 = fptype2;
stopLocation = sloc;
stopLocation2 = sloc2;
departName3 = dname3;
arrivalName3 = aname3;
departAbrv4 = dabrv4;
arrivalAbrv4 = aabrv4;
departTime3 = dtime3;
arrivalTime3 = atime3;
departName4 = dname4;
arrivalName4 = aname4;
departAbrv5 = dabrv5;
arrivalAbrv5 = aabrv5;
departTime4 = dtime4;
arrivalTime4 = atime4;
flightNum3 = fnum3;
flightPlaneType3 = fptype3;
flightNum4 = fnum4;
flightPlaneType4 =fptype4;
  
 
  
}
// Method for printing ticket layout. 
public String toString()
{
  return"\n\n\n    [Flight "+passNum+"]    Passenger:"+userName+"         $"+orginalPrice+"\n"+   
    "**************************************************************************************************************************************\n"+
    "                                          Delta        ((Round Trip))      "+departAbrv+"-"+arrivalAbrv+"\n"+
    "Departure:   Oct "+departDate+" 2014                           "+"                   Return:   Oct "+returnDate+" 2014                           \n"+
    "_____________________________________________________ "+"    ________________________________________________________________ \n"+
    "  "+departName+" – "+arrivalName+" · "+departAbrv2+"–"+arrivalAbrv2+" "+departTime+"-"+arrivalTime+"     "+"          "+departName2+" – "+arrivalName2+" · "+departAbrv3+"–"+arrivalAbrv3+" "+departTime2+"-"+arrivalTime2+"      \n"+
    "  Delta "+flightNum+"    · Economy ·    "+flightPlaneType+"             "+"                Delta "+flightNum2+"    · Economy ·    "+flightPlaneType2+"              \n"+
    "_____________________________________________________ "+"    ________________________________________________________________ \n"+
    "(1 Stop @ "+stopLocation+")                                 "+ "           (1 Stop @ "+stopLocation2+")                                 \n"+                                                               
    "______________________________________________________"+"     ________________________________________________________________  \n"+
    "  "+departName3+" – "+arrivalName3+" · "+departAbrv4+"–"+arrivalAbrv4+" "+departTime3+"-"+arrivalTime3+"      "+ "       "+departName4+" – "+arrivalName4+" · "+departAbrv5+"–"+arrivalAbrv5+" "+departTime4+"-"+arrivalTime4+"      \n"+
    "  Delta "+flightNum3+"    · Economy ·    "+flightPlaneType3+"              "+"              Delta "+flightNum4+"    · Economy ·    "+flightPlaneType4+"              \n"+
    "______________________________________________________"+"     ________________________________________________________________ \n"+
    
     "**************************************************************************************************************************************";
 
}

//Methods for showing Seats.  1 Method per Flight
public String toFlightOne()
{
  return"1. D4 \n"+"2. N6 \n"+"3. M3 \n"+"4. L7 \n"+"5. B9 \n"+"6. C12 \n";

}
public String toFlightTwo()
{
  return"1. S3 \n"+"2. Q4 \n"+"3. Z9 \n"+"4. N7 \n"+"5. C3 \n"+"6. P0 \n";

}
public String toFlightThree()
{
  return"1. R2 \n"+"2. D2 \n"+"3. Y0 \n"+"4. D4 \n"+"5. I8 \n"+"6. G8 \n";
}
}
