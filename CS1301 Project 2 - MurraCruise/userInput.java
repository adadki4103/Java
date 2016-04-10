// Sets up the Frame for User Input.
// Author: Adam Adkins
// Created: 10/18/2014

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

// Trip Leaves From Fort Lauderdale, Flordia, USA.  
// Travels for 5 days to Barcelona, Spain.  ((Base Price is. $ 4,150 / per person ))
// FROM:  http://www.silversea.com/destinations/plan-voyage/?voyage=1510&year=2015
// 
// First Stop or Destination 1:  Gibraltar, UK
// FROM: http://www.visitgibraltar.gi/
// Option 1A: St. Michael's Cave Tour - $155 / per person
// Option 1B: Great Seige Tunnels Tour - $130 / per person
// Option 1C: Moorish Castle Tour - $85 / per person
// Option 1D: Shopping Center Trip - $35 / per person
// Option NONE

// Second Stop or Destination 2: Malaga, Spain
// FROM: http://www.visitcostadelsol.com/
// Option 2A: El Meson de Cervantes Resaurant Trip - $35 / per person
// Option 2B: Bioparc Guengirola Zoo Trip - $22 / per person
// Option 2C: Aula del Mar Alborania Museum Trip - $8 / per person
// Option NONE

// Third Stop or Destination 3: Cartagena, Spain
// FROM: http://www.cartagenaspaintours.com/ 
// && http://www.virtualtourist.com/travel/Europe/Spain/Murcia/Cartagena-272003/Things_To_Do-Cartagena-TG-C-1.html
// Option 3A: Cartagena Walking Tour - $12 / per person
// Option 3B: Historic Bus Tour - $35 / per person
// Option 3C: Torres Park Trip - $10 / per person
// Option 3D: Roman Theatre Guide - $55 / per person
// Option 3E: Cathedral Tour - $30 / per person
// Option NONE

// Excursion Prices I made up when a price wasn't avaiable. 
public class userInput extends JFrame
{
 final JFrame inputFrame;
 JPanel primary, blankSpace, blankSpace2, blankSpace3 ,blankSpace4 ,blankSpace5 ,blankSpace6, blankSpace7 ,topTitle, firstNamePanel, lastNamePanel;
 JPanel dinnerPanel, cityNamePanel, stateNamePanel, exc1Panel, exc2Panel, exc3Panel, buttonPanel;
 JLabel topText, firstNameText, lastNameText, dinnerText, cityNameText, stateNameText, exc1Text, exc2Text, exc3Text, buttonText;
 JTextField firstName, lastName, cityName, stateName; 
 final JRadioButton din1, din2;
 final JRadioButton exc1A,exc1B,exc1C,exc1D,exc1None;
 final JRadioButton exc2A, exc2B, exc2C, exc2None;
 final JRadioButton exc3A, exc3B, exc3C, exc3D, exc3E, exc3None;
 JButton bigButton;
 String dTime, exc1Cho, exc2Cho, exc3Cho;
 String conAns;
 int gNum;
 static int abnd;
 static int cNum;
 double fPrice, basePrice = 4150.00, excPrice, exc2Price, exc3Price;
 
public userInput()
{
   inputFrame = new JFrame("Enter Your Information Please.");
   inputFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("listicon.png"));
  
   primary = new JPanel();
   primary.setPreferredSize(new Dimension(520,720));
   primary.setBackground(new Color(0,19,127)); 
   primary.setBorder(new LineBorder(Color.white, 8, true));
   
   blankSpace = new JPanel();
   blankSpace.setPreferredSize(new Dimension(50,50));
   blankSpace.setBackground(new Color(0,0,0,0));
   
   blankSpace2 = new JPanel();
   blankSpace2.setPreferredSize(new Dimension(50,50));
   blankSpace2.setBackground(new Color(0,0,0,0));
   
   blankSpace3 = new JPanel();
   blankSpace3.setPreferredSize(new Dimension(420,10));
   blankSpace3.setBackground(new Color(0,0,0,0));
   
   blankSpace4 = new JPanel();
   blankSpace4.setPreferredSize(new Dimension(420,3));
   blankSpace4.setBackground(new Color(0,0,0,0));
   
   blankSpace5 = new JPanel();
   blankSpace5.setPreferredSize(new Dimension(400,3));
   blankSpace5.setBackground(new Color(0,0,0,0));
   
   blankSpace6 = new JPanel();
   blankSpace6.setPreferredSize(new Dimension(400,3));
   blankSpace6.setBackground(new Color(0,0,0,0));
   
   blankSpace7 = new JPanel();
   blankSpace7.setPreferredSize(new Dimension(200,80));
   blankSpace7.setBackground(new Color(0,0,0,0));
   
   topTitle = new JPanel();
   topTitle.setPreferredSize(new Dimension (290,40));
   topTitle.setBackground(new Color(0,19,127));
   
   firstNamePanel = new JPanel();
   firstNamePanel.setPreferredSize(new Dimension(200,40));
   firstNamePanel.setBackground(new Color(0,19,127));
   firstNamePanel.setBorder(new LineBorder(Color.white,1,false));
   
   dinnerPanel = new JPanel();
   dinnerPanel.setPreferredSize(new Dimension(250,40));
   dinnerPanel.setBackground(new Color(0,19,127));
   dinnerPanel.setBorder(new LineBorder(Color.white,1,false));
   
   lastNamePanel = new JPanel();
   lastNamePanel.setPreferredSize(new Dimension(200,40));
   lastNamePanel.setBackground(new Color(0,19,127));
   lastNamePanel.setBorder(new LineBorder(Color.white,1,false));
   
   cityNamePanel = new JPanel();
   cityNamePanel.setPreferredSize(new Dimension(200,40));
   cityNamePanel.setBackground(new Color(0,19,127));
   cityNamePanel.setBorder(new LineBorder(Color.white,1,false));
   
   stateNamePanel = new JPanel();
   stateNamePanel.setPreferredSize(new Dimension(200,40));
   stateNamePanel.setBackground(new Color(0,19,127));
   stateNamePanel.setBorder(new LineBorder(Color.white,1,false));
   
   exc1Panel = new JPanel();
   exc1Panel.setPreferredSize(new Dimension(210,220));
   exc1Panel.setBackground(new Color(0,19,127));
   exc1Panel.setBorder(new LineBorder(Color.white,1,false));
   
   exc2Panel = new JPanel();
   exc2Panel.setPreferredSize(new Dimension(275,220));
   exc2Panel.setBackground(new Color(0,19,127));
   exc2Panel.setBorder(new LineBorder(Color.white,1,false));
   
   exc3Panel = new JPanel();
   exc3Panel.setPreferredSize(new Dimension(210,245));
   exc3Panel.setBackground(new Color(0,19,127));
   exc3Panel.setBorder(new LineBorder(Color.white,1,false));
   
   buttonPanel = new JPanel();
   buttonPanel.setPreferredSize(new Dimension(210,245));
   buttonPanel.setBackground(new Color(0,19,127));
   buttonPanel.setBorder(new LineBorder(Color.white,1,false));
   
   topText = new JLabel();
   topText.setText("<html><body><p align=center>Please Follow the Instructions<br><u>Fort Lauderdale, Flordia, USA. ~> Barvelona, Spain</u></p></body><html>");
   topText.setForeground(Color.white);
   
   firstNameText = new JLabel();
   firstNameText.setText("First Name: ");
   firstNameText.setForeground(Color.white);
   
   lastNameText = new JLabel();
   lastNameText.setText("Last Name: ");
   lastNameText.setForeground(Color.white);
   
   dinnerText = new JLabel();
   dinnerText.setText(" Dining Time ?");
   dinnerText.setForeground(Color.white);
   
   cityNameText = new JLabel();
   cityNameText.setText("City: ");
   cityNameText.setForeground(Color.white);
   
   stateNameText = new JLabel();
   stateNameText.setText("State: ");
   stateNameText.setForeground(Color.white);
   
   exc1Text = new JLabel();
   exc1Text.setText("<html><body><p align=center>Destination One<br>Gibraltar, UK<br><font size =2><tt><u>All Prices Per Person</u><font></tt></p></body></html>");
   exc1Text.setForeground(Color.white);
   
   exc2Text = new JLabel();
   exc2Text.setText("<html><body><p align=center>Destination Two<br>Malaga, Spain<br><font size =2><tt><u>All Prices Per Person</u><font></tt></p></body></html>");
   exc2Text.setForeground(Color.white);
   
   exc3Text = new JLabel();
   exc3Text.setText("<html><body><p align=center>Destination Three<br>Cartagena, Spain<br><font size =2><tt><u>All Prices Per Person</u><font></tt></p></body></html>");
   exc3Text.setForeground(Color.white);
   
   buttonText = new JLabel();
   buttonText.setText("<html><body><p align=center>Press Next<br>to Continue</p></body></html>");
   buttonText.setForeground(Color.white);
   
   din1 = new JRadioButton("7 PM");
   din2 = new JRadioButton("9 PM");
   exc1A = new JRadioButton("St. Michael's Cave Tour - $155");
   exc1B = new JRadioButton("Great Seige Tunnels Tour - $130");
   exc1C = new JRadioButton("Moorish Castle Tour - $85");
   exc1D = new JRadioButton("Shopping Center Trip - $35");
   exc1None = new JRadioButton (" NONE");
   exc2A = new JRadioButton("El Meson de Cervantes Resaurant Trip - $35");
   exc2B = new JRadioButton("Bioparc Guengirola Zoo Trip - $22");
   exc2C = new JRadioButton("Aula del Mar Alborania Museum Trip - $8");
   exc2None = new JRadioButton(" NONE");
   exc3A = new JRadioButton ("Cartagena Walking Tour - $12");
   exc3B = new JRadioButton ("Historic Bus Tour - $35");
   exc3C = new JRadioButton ("Torres Park Trip - $10");
   exc3D = new JRadioButton ("Roman Theatre Guide - $55");
   exc3E = new JRadioButton ("Cathedral Tour - $30");
   exc3None = new JRadioButton (" NONE");
   
   bigButton = new JButton(" Next ");
   bigButton.setPreferredSize(new Dimension(100,80));
   
   din1.setForeground(Color.white);
   din2.setForeground(Color.white);
   din1.setBackground(new Color(0,19,127));
   din2.setBackground(new Color(0,19,127));
   
   exc1A.setForeground(Color.white);
   exc1B.setForeground(Color.white);
   exc1C.setForeground(Color.white);
   exc1D.setForeground(Color.white);
   exc1None.setForeground(Color.white);
   exc1A.setBackground(new Color(0,19,127));
   exc1B.setBackground(new Color(0,19,127));
   exc1C.setBackground(new Color(0,19,127));
   exc1D.setBackground(new Color(0,19,127));
   exc1None.setBackground(new Color(0,19,127));
   
   exc2A.setForeground(Color.white);
   exc2B.setForeground(Color.white);
   exc2C.setForeground(Color.white);
   exc2None.setForeground(Color.white);
   exc2A.setBackground(new Color(0,19,127));
   exc2B.setBackground(new Color(0,19,127));
   exc2C.setBackground(new Color(0,19,127));
   exc2None.setBackground(new Color(0,19,127));
   
   exc3A.setForeground(Color.white);
   exc3B.setForeground(Color.white);
   exc3C.setForeground(Color.white);
   exc3D.setForeground(Color.white);
   exc3E.setForeground(Color.white);
   exc3None.setForeground(Color.white);
   exc3A.setBackground(new Color(0,19,127));
   exc3B.setBackground(new Color(0,19,127));
   exc3C.setBackground(new Color(0,19,127));
   exc3D.setBackground(new Color(0,19,127));
   exc3E.setBackground(new Color(0,19,127));
   exc3None.setBackground(new Color(0,19,127));
   
   ButtonGroup dinGroup = new ButtonGroup();
   dinGroup.add(din1);
   dinGroup.add(din2);
   
   ButtonGroup excursionOne = new ButtonGroup();
   excursionOne.add(exc1A);
   excursionOne.add(exc1B);
   excursionOne.add(exc1C);
   excursionOne.add(exc1D);
   excursionOne.add(exc1None);
   
   ButtonGroup excursionTwo = new ButtonGroup();
   excursionTwo.add(exc2A);
   excursionTwo.add(exc2B);
   excursionTwo.add(exc2C);
   excursionTwo.add(exc2None);
   
   ButtonGroup excursionThree = new ButtonGroup();
   excursionThree.add(exc3A);
   excursionThree.add(exc3B);
   excursionThree.add(exc3C);
   excursionThree.add(exc3D);
   excursionThree.add(exc3E);
   excursionThree.add(exc3None);
// ********************Tieing LISTENERS To Stuff****************************
   liz listen = new liz();
   
   firstName = new JTextField(9);
   firstName.addActionListener(listen);
   
   lastName = new JTextField(9);
   lastName.addActionListener(listen);
   
   cityName = new JTextField(9);
   cityName.addActionListener(listen);
   
   stateName = new JTextField(2);
   stateName.addActionListener(listen);

   bigButton.addActionListener(listen);
 
   din1.addActionListener(listen);
   din2.addActionListener(listen);
   
   exc1A.addActionListener(listen);
   exc1B.addActionListener(listen);
   exc1C.addActionListener(listen);
   exc1D.addActionListener(listen);
   exc1None.addActionListener(listen);
   
   exc2A.addActionListener(listen);
   exc2B.addActionListener(listen);
   exc2C.addActionListener(listen);
   exc2None.addActionListener(listen);
   
   exc3A.addActionListener(listen);
   exc3B.addActionListener(listen);
   exc3C.addActionListener(listen);
   exc3D.addActionListener(listen);
   exc3E.addActionListener(listen);
   exc3None.addActionListener(listen);  
//*********************************************************** 
   topTitle.add(topText);
   firstNamePanel.add(firstNameText);
   firstNamePanel.add(firstName);
   lastNamePanel.add(lastNameText);
   lastNamePanel.add(lastName);
   cityNamePanel.add(cityNameText);
   cityNamePanel.add(cityName);
   stateNamePanel.add(stateNameText);
   stateNamePanel.add(stateName);
   
   dinnerPanel.add(dinnerText);
   dinnerPanel.add(din1);
   dinnerPanel.add(din2);
   
   exc1Panel.add(exc1Text);
   exc1Panel.add(exc1A);
   exc1Panel.add(exc1B);
   exc1Panel.add(exc1C);
   exc1Panel.add(exc1D);
   exc1Panel.add(exc1None);
   
   exc2Panel.add(exc2Text);
   exc2Panel.add(exc2A);
   exc2Panel.add(exc2B);
   exc2Panel.add(exc2C);
   exc2Panel.add(exc2None);
   
   exc3Panel.add(exc3Text);
   exc3Panel.add(exc3A);
   exc3Panel.add(exc3B);
   exc3Panel.add(exc3C);
   exc3Panel.add(exc3D);
   exc3Panel.add(exc3E);
   exc3Panel.add(exc3None);
   
   buttonPanel.add(buttonText);
   buttonPanel.add(blankSpace7);
   buttonPanel.add(bigButton);
   
   primary.add(blankSpace);
   primary.add(topTitle);
   primary.add(blankSpace2);
   primary.add(blankSpace3);

   primary.add(firstNamePanel);
   primary.add(lastNamePanel);
   primary.add(cityNamePanel);
   primary.add(stateNamePanel);
   primary.add(blankSpace4);
   primary.add(dinnerPanel);
   primary.add(blankSpace5);
   primary.add(exc1Panel);
   primary.add(exc2Panel);
   primary.add(blankSpace6);
   primary.add(exc3Panel);
   primary.add(buttonPanel);

   inputFrame.add(primary);
   inputFrame.pack();
   inputFrame.setResizable(false);
   inputFrame.setVisible(true);
 }
// Listener.
private class liz implements ActionListener 
      {
          public void actionPerformed(ActionEvent e)
          {
           Object source = e.getSource(); //grab the user selection
           // set exc1, exc2, & exc3 price and text based on selection
//********************************************************Excursion 1
           if(source == exc1A){
             exc1Cho = "St. Michael's Cave Tour";
             excPrice = 155.00;
           }
           else if(source == exc1B){
             exc1Cho = "Great Siege Tunnels Tour";
             excPrice = 130.00;
           }
           else if(source == exc1C){
             exc1Cho = "Moorish Castle Tour";
             excPrice = 85.00;
           }
           else if(source == exc1D){
             exc1Cho = "Shopping Center Trip";
             excPrice = 35.00;
           }
           else if(source == exc1None){
             exc1Cho = " NONE ";
             excPrice = 0.00;
           }
//**********************************************************Excursion 2
           if(source == exc2A){
             exc2Cho = "El Meson de Cervantes Restaurant Trip";
             exc2Price = 35.00;
           }
           else if(source == exc2B){
             exc2Cho = "Bioparc Guengirola Zoo Trip";
             exc2Price = 22.00;
           }
           else if(source == exc2C){
             exc2Cho = "Aula del Mar Alborania Museum Trip";
             exc2Price = 8.00;
           }
           else if(source == exc2None){
             exc2Cho = " NONE ";
             exc2Price = 0.00;
           }
 //********************************************************Excursion 3
           if(source == exc3A){
             exc3Cho = "Cartagena Walking Tour";
             exc3Price = 12.00;
           }
           else if(source == exc3B){
             exc3Cho = "Historic Bus Tour";
             exc3Price = 35.00;
           }
           else if(source == exc3C){
             exc3Cho = "Torres Park Trip";
             exc3Price = 10.00;
           }
           else if(source == exc3D){
             exc3Cho = "Roman Theatre Guided Tour";
             exc3Price = 55.00;
           }
           else if(source == exc3E){
             exc3Cho = "Cathedral Tour";
             exc3Price = 30.00;
           }           
           else if(source == exc3None){
             exc3Cho = " NONE ";
             exc3Price = 0.00;
           }
//**********************************************************Dinner Choices 
         if(source == din1){
            dTime = "7PM";
         }
         else if(source == din2){
            dTime = "9PM";
         }
 // Brings in cabinButtons so I can get the Selected Cabin Number from cabinButtons & assigns it to int abnd. in
 // if statement that is tied to The "Do You Wish to Continue?" question
         cabinButtons cMax = new cabinButtons();
         final int cNum = cabinButtons.cChoice();
//*********************************************************************************************************************
//*********     This is what happens when the user presses the "Next" Button.                  ************************
//*********************************************************************************************************************
         if(source == bigButton){
  //  Gets from JTextField(s), assigns to new Strings created here.
  //  String fname, lname, cname, sname;
  //  Resets JTextField(s) to blank.  Spits The obtained information out on the console. 
            Scanner scan = new Scanner(System.in);
            String fname = firstName.getText();
            firstName.setText("");
            String lname = lastName.getText();
            lastName.setText("");
            String cname = cityName.getText();
            cityName.setText("");
            String sname = stateName.getText();
            stateName.setText("");
            System.out.println("First Name: "+fname);
            System.out.println("Last Name: "+lname);
            System.out.println("City Name: "+cname);
            System.out.println("State Name: "+sname);
            System.out.println("Dining Time: "+dTime);
            System.out.println("Excursion One Choice: "+exc1Cho);
            System.out.println("Excursion Two Choice: "+exc2Cho);
            System.out.println("Excursion Three Choice: "+exc3Cho);
            System.out.println("");
  //  Scan for a solid int number as the number of guest. 
            final int theMax = cabinButtons.getMax();
            System.out.println("Cabin Max: "+theMax);
            System.out.println("How many Guest are in your party ? ");
            gNum = scan.nextInt(); 
 // Decide what to do based on gNum ( Guest Number, what they type in )
   // if Guest Number (is greater than) the Cabin Maximum ) 
     // Make the user try again. 
            if (gNum > theMax)
            {
              System.out.println("Not a valid number of people.");
              System.out.println("Please Try Again.");
              gNum = scan.nextInt();
            }
   // if Guest Number (is less than or equal to) the Cabin Maximum )
    // Ask the user if they wish to continue
            if(gNum <= theMax)
            {
           // Gets the Cabin number of the selected Cabin from cabinButtons.
           final int cabCho = cabinButtons.cChoice();
           System.out.println("Cabin Choice: #"+cabCho);
           System.out.println("Cabin Max: "+theMax);
           // Creates proper currency Format for the prices displayed.
           NumberFormat cashfomat = NumberFormat.getCurrencyInstance();
// *********************************************************************************************
// *************************         THE_MATH      *********************************************
// *********************************************************************************************
           double subPrice = (excPrice * gNum);
           double bcPrice = (basePrice * gNum);
           fPrice =(basePrice * gNum)+(excPrice * gNum)+(exc2Price * gNum)+(exc3Price * gNum);
           System.out.println("Base Price: "+cashfomat.format(bcPrice));
           System.out.println("Excursion(s) Price: "+cashfomat.format(subPrice));
           System.out.println("Total Price: "+cashfomat.format(fPrice));
           System.out.println("");
           System.out.println(" Do you wish to book another Cabin or Suite ? (Y/N)");
           conAns = scan.next();
           //   If  Yes: SHOULD --->: Close userInput Frame. /  Assign a value to abnd, based on cabin selection
           // If neither yes or no: Won't take an answer until it fits the critera. Keeps trying until it does. 
           while(!conAns.equalsIgnoreCase("N") && !conAns.equalsIgnoreCase("Y") )
           {
             System.out.println("Sorry. That was not an option. Please Try again.");
             conAns = scan.next();
           } 
           if(conAns.equalsIgnoreCase("Y"))
           {
             System.out.println("Great! Please make another Cabin or Suite selection.");
             inputFrame.dispatchEvent(new WindowEvent(inputFrame, WindowEvent.WINDOW_CLOSING));
             if(cNum == 1)
             {
               abnd = 1;
             }
             else if(cNum == 2)
             {
               abnd = 2;
             }
             else if(cNum == 3)
             {
               abnd = 3;
             }
             else if(cNum == 4)
             {
               abnd = 4;
             }
             else if(cNum == 5)
             {
               abnd = 5;
             }
             else if(cNum == 6)
             {
               abnd = 6;
             }
             else if(cNum == 7)
             {
               abnd = 7;
             }
             else if(cNum == 8)
             {
               abnd = 8;
             }
             else if(cNum == 9)
             {
               abnd = 9;
             }
             else if(cNum == 10)
             {
               abnd = 10;
             }
             else if(cNum == 11)
             {
               abnd = 11;
             }
             else if(cNum == 12)
             {
               abnd = 12;
             }
           } 
// If No: Thank the user. SHOULD --->: Shut down Main Frame & Input Frame. 
           else if(conAns.equalsIgnoreCase("N"))
           {
             System.out.println("Thanks for booking with Murratime Unlimited!");
           }


            }

           

// *********************************************************************************************
}
 } 
  }
// Returns abnd , which is the numerical value assign to each cabin.  This allows me to send abnd back to cabinButtons, where I can
// disable the RadioButton selected >> IF << Yes is selected. 
        public static int theNum()
        {
        return abnd;
        } 
 }
   



 


  