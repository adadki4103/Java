// This program creates a listing of Pilots & Passengers For the first six Virgin Galactic flights to space.
// and creates and prints the names of the Pilots & Passengers to a text file.
// CSC1301 MW 10-12. CRN:4340
// Project3_AdamAdkins_Part1
// Author: Adam Adkins
// Created: 11/11/2014

import java.io.*;

public class Project3_1_AdamAdkins
{
  public static void main(String[] args) throws IOException
  {
 Zaphod[][] Beeblebrox;
 
 int xBound = 6 ;  
 int yBound = 8 ;  
 
 Beeblebrox = new Zaphod[xBound][yBound];  
 
 // Flight 1
      //Pilots
 Beeblebrox[0][0] = new Zaphod("001","Roger","Wilco","Pilot","28","Sludge Vohaul","610-0340","973-0375","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
 Beeblebrox[0][1] = new Zaphod("002","Major","Tom","Pilot","45","Ziggy Stardust","606-0842","777-9311","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
      //Customers
 Beeblebrox[0][2] = new Zaphod("001","Adam","Adkins","N/A","N/A","Barbara Adkins","314-2121","341-1231","01","VISA","ADAM D ADKINS","8765432178654","896","03/17","YES");
 Beeblebrox[0][3] = new Zaphod("002","Pinal","Patel","N/A","N/A","Pinal's Mom","123-4452","718-6452","02","VISA","PINAL M PATEL","9872838491028","871","09/16","YES");
 Beeblebrox[0][4] = new Zaphod("003","Bruce","Wayne","N/A","N/A","Alfred","762-8423","765-0987","03","WAYNE EXPRESS","I AM BATMAN","0000000000001","012","01/35","YES");
 Beeblebrox[0][5] = new Zaphod("004","Racer","X","N/A","N/A","N/A","654-0987","N/A","04","Discover","GO SPEED GO","8765432123456","321","04/19","YES");
 Beeblebrox[0][6] = new Zaphod("005","Luke","Skywalker","N/A","N/A","Obi Wan","909-6521","Use the Force.","05","N/A","N/A","JEDI MIND","TRICK","06/72","NOT THE DROIDS WE'RE LOOKING FOR");
 Beeblebrox[0][7] = new Zaphod("006","Geordi","La Forge","N/A","N/A","Jean-Luc Picard","876-2341","subspace 123095719","06","UFP","GEORDI LA FORGE","7657890123475","017","07/67","YES");
 
  // Flight 2
      //Pilots
 Beeblebrox[1][0] = new Zaphod("003","Flash","Gordon","Pilot","12","Ming the Merciless","756-8765","432-8724","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
 Beeblebrox[1][1] = new Zaphod("004","Han","Solo","Pilot","26","Chewbacca","Rrr-Ghgh","492-7272","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
      //Customers
 Beeblebrox[1][2] = new Zaphod("007","Q"," ","N/A","N/A","The Continuum","712-9821","123-8764","01","TCE","JOHN DE LANCIE","8765423786123","875","06/36","NO");
 Beeblebrox[1][3] = new Zaphod("008","Data"," ","N/A","N/A","Dr. Noonian Soong","712-3131","Follow Lore.","02","UFP","DATA","6543786253490","189","05/19","YES");
 Beeblebrox[1][4] = new Zaphod("009","Bob","Bjorn","N/A","N/A","Sally Bjorn","213-4121","123-3311","03","VISA","BOB J BJORN","7864529738491","641","03/16","YES");
 Beeblebrox[1][5] = new Zaphod("010","Commander","Shepard","N/A","N/A","Geth Fleet","523-2341","719-3820","04","American Express","THE SHEPARD","8764123840901","042","02/27","YES");
 Beeblebrox[1][6] = new Zaphod("011","Richard","Branson","N/A","N/A","The Pope","235-1251","515-1241","05","Union Pay","RICHARD BRANSON","1236820192312","792","10/19","YES");
 Beeblebrox[1][7] = new Zaphod("012","IG","88","N/A","N/A","The Hutts","575-8332","235-7262","06","JCB","IG-88","180385032007","891","05/32","YES");
 
  // Flight 3
      //Pilots
 Beeblebrox[2][0] = new Zaphod("005","Gold","Leader","Pilot","2","Admiral Ackbar","312-8765","756-6452","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
 Beeblebrox[2][1] = new Zaphod("006","The Mighty","Skeletor","Pilot","23","Prince Adam","987-2929","312-0976","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
      //Customers
 Beeblebrox[2][2] = new Zaphod("013","Clark","Kent","N/A","N/A","Kael","555-1231","850-1238","01","BOK,","JAELL","8765237862910","841","05/63","YES");
 Beeblebrox[2][3] = new Zaphod("014","Finn","the Human","N/A","N/A","BMO","582-8741","840-2411","02","BoO","FINN","71623938929341","213","02/23","YES");
 Beeblebrox[2][4] = new Zaphod("015","Jake","the Dog","N/A","N/A","BMO","582-8741","840-2411","03","BoO","JAKE","71623938926541","793","03/23","YES");
 Beeblebrox[2][5] = new Zaphod("016","Kismet","the Cat","N/A","N/A","Dana Mclendon","762-3131","198-8765","04","MOB","PRINCESS KISMET","7816182928700","786","06/26","NO");
 Beeblebrox[2][6] = new Zaphod("017","Fluff","McGruff","N/A","N/A","Adam Adkins","892-9976","768-2981","05","MOB","FLUFF MCGRUFF","7657875498761","987","07/16","YES");
 Beeblebrox[2][7] = new Zaphod("018", "Wompa","Stompa","N/A","N/A","Jerod James","092-7871","123-8459","06","MOB","WOMPA STOMPA","7654267839006","941","02/23","YES");
 
  // Flight 4
      //Pilots
 Beeblebrox[3][0] = new Zaphod("007","James","Bond","Pilot","53","Q","321-7564","867-9864","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
 Beeblebrox[3][1] = new Zaphod("008","Bill"," ","Pilot","??","M","756-0987","987-0986","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
      //Customers
 Beeblebrox[3][2] = new Zaphod("019","Joe","Moses","N/A","N/A","Jimbo","555-1121","870-9038","01","BOK,","JOE MOSES","8700876000541","141","06/13","NO");
 Beeblebrox[3][3] = new Zaphod("020","Ralph","Wigum","N/A","N/A","Cheif Wigum","523-81231","820-2411","02","BoO","RALF","71623931239341","213","02/13","YES");
 Beeblebrox[3][4] = new Zaphod("021","Bender","Rodreigez","N/A","N/A","Fry","553-2341","840-2111","03","BoO","BITEMYSHINYMETA","71623938123541","513","03/23","YES");
 Beeblebrox[3][5] = new Zaphod("022","Phillip","J. Fry","N/A","N/A","Lela","723-2431","198-8325","04","MOB","PJ FRY","7816181231700","136","08/16","NO");
 Beeblebrox[3][6] = new Zaphod("023","Zoid","Burg","N/A","N/A","Noone","832-2276","N/A","05","N/A","N/A","N/A","N/A","N/A","NO");
 Beeblebrox[3][7] = new Zaphod("024", "Professor","Fondsworth","N/A","N/A","Zoidburg","492-4471","123-8459","06","MOB","THE PROFESSOR","7654267839006","921","02/13","YES");
 
  // Flight 5
      //Pilots
 Beeblebrox[4][0] = new Zaphod("009","Skeleton","Jack ","Pilot","33","M","256-2987","982-0226","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
 Beeblebrox[4][1] = new Zaphod("010","Anousheh","Ansari","Pilot","17","Xenu","345-0980","086-9821","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
      //Customers
 Beeblebrox[4][2] = new Zaphod("025","Random","Tandom","N/A","N/A","Cpt. Chaos","565-1121","870-9038","01","JRK,","JOE MOSES","8700876765541","141","06/13","NO");
 Beeblebrox[4][3] = new Zaphod("026","The Space","Whale","N/A","N/A","Ziltoid","523-81661","820-2411","02","SPO","RALF","71623931239341","213","02/13","YES");
 Beeblebrox[4][4] = new Zaphod("027","Holy","Moses","N/A","N/A","Sacred Sally","553-2661","840-2111","03","VISA","7864982640912","71628768123541","513","03/23","YES");
 Beeblebrox[4][5] = new Zaphod("028","St.","Francis of Cici","N/A","N/A","Yoda","726-2431","198-8325","04","MasterCard","ST.FRANCIS OF CICI","7816112331700","136","08/16","YES");
 Beeblebrox[4][6] = new Zaphod("029","Dave","Lister","N/A","N/A","Kryten","832-2666","762-9876","05","BExpress","LISTY","764872098712","123","07/94","YES");
 Beeblebrox[4][7] = new Zaphod("030", "Arnold","Rimmer","N/A","N/A","Holly","466-4461","123-8459","06","MOB","ARNOLD J RIMMER","7654267652006","921","02/13","NO");
 
  // Flight 6
      //Pilots
 Beeblebrox[5][0] = new Zaphod("011","Arthur","Dent","Pilot","33","Ford Prefect","123-4567","891-0111","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
 Beeblebrox[5][1] = new Zaphod("012","Ford","Prefect","Pilot","42","Zaphod","Good Question","123-4567","N/A","N/A","N/A","N/A","N/A","N/A","N/A");
      //Customers
 Beeblebrox[5][2] = new Zaphod("031","James T.","Kirk","N/A","N/A","Spock","565-3321","870-9128","01","SPK,","CPTN KIRK","1231876765541","231","04/53","YES");
 Beeblebrox[5][3] = new Zaphod("032","Jean-Luc","Picard","N/A","N/A","StarFleet Command","523-81661","720-2651","02","SPO","LOCOUTUS","71623931777341","222","03/13","YES");
 Beeblebrox[5][4] = new Zaphod("033","Benjamen","Sisko","N/A","N/A","The Major","553-2661","890-2111","03","VISA","THEPROPHET","71628766623541","413","03/25","YES");
 Beeblebrox[5][5] = new Zaphod("034","Kathryn","Janeway","N/A","N/A","N/A","726-2431","198-925","04","MasterCard","BORGKILLER","7816112331700","029","03/26","YES");
 Beeblebrox[5][6] = new Zaphod("035","Dana","Mclendon","N/A","N/A","Adam Adkins","832-2666","772-9996","05","BExpress","DANA K MCLENDON","764872088812","123","03/64","YES");
 Beeblebrox[5][7] = new Zaphod("036", "Jon","Phillips","N/A","N/A","Amanda Phillips","466-4461","623-6759","06","MOB","JON PHILLIPS","7654666652006","721","04/44","YES");
//*****************************************************************************************************************************************************************************
 
 
// Prints everything in a text file. in the same folder as the .java. 
// will overwreite falconPunch.txt if it already exits. will create it, if it doesn't. 
PrintWriter out = new PrintWriter(new FileWriter("falconPunch.txt")); 

      out.println("**************************************************************\n");
//fnum here acts as the flight number in final output. 
 for (int xcount = 0; xcount < xBound; xcount++)  // x location in the array
    { 
      int fnum = xcount + 1;
      out.println("                Flight Number: "+fnum+"                            \n");
      out.println("**************************************************************\n");
      for (int ycount = 0; ycount < yBound; ycount++)  // y location in the array 
      {   
       out.print(Beeblebrox[xcount][ycount]);
      }    
      out.println("**************************************************************\n");
    } 
 //close it. just to get rid of that annoying message if nothing else. 
    out.close();
    System.out.println("Done. falconPunch.txt created.");
  }
}