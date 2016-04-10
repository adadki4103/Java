// Sets up the RadioButtons & Panels for the Main Frame.
// Author: Adam Adkins
// Created: 10/11/2014
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

public class cabinButtons extends JPanel
{
   final private JLabel label, l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
   final private JLabel qlabel;
   final private JRadioButton cabin1, cabin2, cabin3, cabin4, cabin5, cabin6, cabin7, cabin8, cabin9, cabin10, cabin11, cabin12;
   private JPanel buttonPanel , labelPanel;
   private JPanel c1, c2 ,c3 ,c4 ,c5 ,c6, topper, topperLeft, qpanel;
   private JPanel c7 ,c8 ,c9 ,c10 ,c11 ,c12, middleSpacer, middleSpacer2,middleSpacer3;
   private JPanel topLeftSpacer, topLeftSpacer2, topRightSpacer2, topRightSpacer , bottomRightSpacer, holder,anotherSpacer;
   private static int gMax = 1;
   private static int cSelect, cSel;

  public cabinButtons()  
   {
       setBackground(new Color(243,243,243,0));

       cabin1 = new JRadioButton("Cabin 1"); //create a radio button object
       cabin2 = new JRadioButton("Cabin 2"); 
       cabin3 = new JRadioButton("Cabin 3"); 
       cabin4 = new JRadioButton("Cabin 4"); 
       cabin5 = new JRadioButton("Cabin 5");
       cabin6 = new JRadioButton("Suite 1"); 
       cabin7 = new JRadioButton("Cabin 6"); 
       cabin8 = new JRadioButton("Cabin 7"); 
       cabin9 = new JRadioButton("Cabin 8");
       cabin10 = new JRadioButton("Cabin 9"); 
       cabin11 = new JRadioButton("Cabin 10"); 
       cabin12 = new JRadioButton("Suite 2"); 
              
       cabin1.setForeground(Color.white); //Change the text color
       cabin2.setForeground(Color.white);
       cabin3.setForeground(Color.white);
       cabin4.setForeground(Color.white);
       cabin5.setForeground(Color.white);
       cabin6.setForeground(Color.white);
       cabin7.setForeground(Color.white);
       cabin8.setForeground(Color.white);
       cabin9.setForeground(Color.white);
       cabin10.setForeground(Color.white);
       cabin11.setForeground(Color.white);
       cabin12.setForeground(Color.white);

       cabin1.setBackground(new Color(0,19,127)); //Change the background color
       cabin2.setBackground(new Color(0,19,127));
       cabin3.setBackground(new Color(0,19,127));
       cabin4.setBackground(new Color(0,19,127));
       cabin5.setBackground(new Color(0,19,127));
       cabin6.setBackground(new Color(0,19,127));
       cabin7.setBackground(new Color(0,19,127));
       cabin8.setBackground(new Color(0,19,127));
       cabin9.setBackground(new Color(0,19,127));
       cabin10.setBackground(new Color(0,19,127));
       cabin11.setBackground(new Color(0,19,127));
       cabin12.setBackground(new Color(0,19,127));
       
// Puts all the RadioButtons in a Single Group so they act right.     
       ButtonGroup the_group = new ButtonGroup();
       the_group.add(cabin1); 
       the_group.add(cabin2);
       the_group.add(cabin3);
       the_group.add(cabin4);
       the_group.add(cabin5); 
       the_group.add(cabin6);
       the_group.add(cabin7);
       the_group.add(cabin8);
       the_group.add(cabin9); 
       the_group.add(cabin10);
       the_group.add(cabin11);
       the_group.add(cabin12);

       //The following block of code creates an event when a button is
       //selected.
       cabinListener the_seat = new cabinListener(); //this is a defined class in this file
       cabin1.addActionListener(the_seat);
       cabin2.addActionListener(the_seat);
       cabin3.addActionListener(the_seat);
       cabin4.addActionListener(the_seat);
       cabin5.addActionListener(the_seat);
       cabin6.addActionListener(the_seat);
       cabin7.addActionListener(the_seat);
       cabin8.addActionListener(the_seat);
       cabin9.addActionListener(the_seat);
       cabin10.addActionListener(the_seat);
       cabin11.addActionListener(the_seat);
       cabin12.addActionListener(the_seat);
       
       cabinListener2 the_seat2 = new cabinListener2(); //<-- 2nd Listener. Likely redundant
       cabin1.addActionListener(the_seat2);             //  Linked to Color Swapping Panels
       cabin2.addActionListener(the_seat2);             //  that sits on top of the boat img.
       cabin3.addActionListener(the_seat2);              
       cabin4.addActionListener(the_seat2);
       cabin5.addActionListener(the_seat2);
       cabin6.addActionListener(the_seat2);
       cabin7.addActionListener(the_seat2);
       cabin8.addActionListener(the_seat2);
       cabin9.addActionListener(the_seat2);
       cabin10.addActionListener(the_seat2);
       cabin11.addActionListener(the_seat2);
       cabin12.addActionListener(the_seat2);
//***********************************************************************
//  Build Everything.
//***********************************************************************
    holder = new JPanel();
    holder.setPreferredSize(new Dimension(900,700));
    holder.setBackground(new Color(0,0,0,0));
    topper = new JPanel();
    topper.setPreferredSize(new Dimension(900,135));
    topper.setBackground(new Color(0,19,127,0));
    
    topperLeft = new JPanel();
    topperLeft.setPreferredSize(new Dimension(900,50));
    topperLeft.setBackground(new Color(0,0,0,0));
    
    l1 = new JLabel("<html><body> C1</body></html>");
    l1.setPreferredSize(new Dimension(50,95));
    
    l2 = new JLabel("<html><body> C2</body></html>");
    l2.setPreferredSize(new Dimension(50,95));
    
    l3 = new JLabel("<html><body> C3</body></html>");
    l3.setPreferredSize(new Dimension(50,95));
    
    l4 = new JLabel("<html><body> C4</body></html>");
    l4.setPreferredSize(new Dimension(50,95));
    
    l5 = new JLabel("<html><body> C5</body></html>");
    l5.setPreferredSize(new Dimension(50,95));
    
    l6 = new JLabel("<html><body> S1</body></html>");
    l6.setPreferredSize(new Dimension(50,95));
    
    l7 = new JLabel("<html><body> C6</body></html>");
    l7.setPreferredSize(new Dimension(50,95));
    
    l8 = new JLabel("<html><body> C7</body></html>");
    l8.setPreferredSize(new Dimension(50,95));
    
    l9 = new JLabel("<html><body> C8</body></html>");
    l9.setPreferredSize(new Dimension(50,95));
    
    l10 = new JLabel("<html><body> C9</body></html>");
    l10.setPreferredSize(new Dimension(50,95));
    
    l11 = new JLabel("<html><body> C10</body></html>");
    l11.setPreferredSize(new Dimension(50,95));
    
    l12 = new JLabel("<html><body> S2</body></html>");
    l12.setPreferredSize(new Dimension(50,95));
    
    c1 = new JPanel();
    c1.setPreferredSize(new Dimension(50,95));
    c1.setBackground(Color.white);
    c1.setForeground(Color.black);
    c1.add(l1);

    c2 = new JPanel();
    c2.setPreferredSize(new Dimension(50,95));
    c2.setBackground(Color.white);
    c2.setForeground(Color.black);
    c2.add(l2);

    c3 = new JPanel();
    c3.setPreferredSize(new Dimension(50,95));
    c3.setBackground(Color.white);
    c3.setForeground(Color.black);
    c3.add(l3);

    c4 = new JPanel();
    c4.setPreferredSize(new Dimension(50,95));
    c4.setBackground(Color.white);
    c4.setForeground(Color.black);
    c4.add(l4);

    c5 = new JPanel();
    c5.setPreferredSize(new Dimension(50,95));
    c5.setBackground(Color.white);
    c5.setForeground(Color.black);
    c5.add(l5);

    c6 = new JPanel();
    c6.setPreferredSize(new Dimension(65,95));
    c6.setBackground(Color.white);
    c6.setForeground(Color.black);
    c6.add(l6);
    
    topRightSpacer = new JPanel();
    topRightSpacer.setPreferredSize(new Dimension(114,95));
    topRightSpacer.setBackground(new Color(0,122,234,0));
    
    topRightSpacer2 = new JPanel();
    topRightSpacer2.setPreferredSize(new Dimension(124,95));
    topRightSpacer2.setBackground(new Color(0,122,234,0));
    
    anotherSpacer = new JPanel();
    anotherSpacer.setPreferredSize(new Dimension(20,95));
    anotherSpacer.setBackground(new Color(0,122,234,0));
    
    topLeftSpacer = new JPanel();
    topLeftSpacer.setPreferredSize(new Dimension(230,95));
    topLeftSpacer.setBackground(new Color(192,0,38,0));
    
    topLeftSpacer2 = new JPanel();
    topLeftSpacer2.setPreferredSize(new Dimension(230,80));
    topLeftSpacer2.setBackground(new Color(195,12,27,0));

    c7 = new JPanel();
    c7.setPreferredSize(new Dimension(50,95));
    c7.setBackground(Color.white);
    c7.setForeground(Color.black);
    c7.add(l7);

    c8 = new JPanel();
    c8.setPreferredSize(new Dimension(50,95));
    c8.setBackground(Color.white);
    c8.setForeground(Color.black);
    c8.add(l8);

    c9 = new JPanel();
    c9.setPreferredSize(new Dimension(50,95));
    c9.setBackground(Color.white);
    c9.setForeground(Color.black);
    c9.add(l9);

    c10 = new JPanel();
    c10.setPreferredSize(new Dimension(50,95));
    c10.setBackground(Color.white);
    c10.setForeground(Color.black);
    c10.add(l10);

    c11 = new JPanel();
    c11.setPreferredSize(new Dimension(50,95));
    c11.setBackground(Color.white);
    c11.setForeground(Color.black);
    c11.add(l11);

    c12 = new JPanel();
    c12.setPreferredSize(new Dimension(65,95));
    c12.setBackground(Color.white);
    c12.setForeground(Color.black);
    c12.add(l12);
    
    middleSpacer = new JPanel();
    middleSpacer.setPreferredSize(new Dimension(900,22));
    middleSpacer.setBackground(new Color(0,0,0,0));
    
    middleSpacer2 = new JPanel();
    middleSpacer2.setPreferredSize(new Dimension(900,50));
    middleSpacer2.setBackground(new Color(0,0,0,0));
    
    middleSpacer3 = new JPanel();
    middleSpacer3.setPreferredSize(new Dimension(900,75));
    middleSpacer3.setBackground(new Color(0,0,0,0));
       
    label = new JLabel();
    label.setPreferredSize (new Dimension(140,135));
    label.setForeground(Color.white);
     
    qpanel = new JPanel();
    qpanel.setPreferredSize(new Dimension(250,130));
    qpanel.setBackground(new Color(0,19,127));
    qpanel.setForeground(Color.white);
    
    qlabel = new JLabel("<html><body><p align=center>Please Choose a<br>Cabin or a Suite.<br><br></p></body></html>");
    qlabel.setForeground(Color.white);
    qlabel.setBackground(new Color(0,19,127));
    qpanel.add(qlabel);
    
    labelPanel = new JPanel();
    labelPanel.setPreferredSize (new Dimension(140,115));
    labelPanel.setBackground(new Color(0,19,127));
    labelPanel.setForeground(Color.white);
    labelPanel.add(label);
    
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize (new Dimension(400, 135));
    buttonPanel.setBackground(new Color(0,0,0,0));
    
// Put it all together.
    buttonPanel.add(cabin1);
    buttonPanel.add(cabin2);
    buttonPanel.add(cabin3);
    buttonPanel.add(cabin4);
    buttonPanel.add(cabin5);
    buttonPanel.add(cabin7);
    buttonPanel.add(cabin8);
    buttonPanel.add(cabin9);
    buttonPanel.add(cabin10);
    buttonPanel.add(cabin11);
    buttonPanel.add(cabin6);
    buttonPanel.add(cabin12);
    holder.add(topperLeft);
    holder.add(topper);
    holder.add(c1);
    holder.add(c2);
    holder.add(c3);
    holder.add(c4);
    holder.add(c5);
    holder.add(topRightSpacer);
    holder.add(c6);
    holder.add(topLeftSpacer);
    holder.add(middleSpacer);
    holder.add(anotherSpacer);
    holder.add(c7);
    holder.add(c8);
    holder.add(c9);
    holder.add(c10);
    holder.add(c11);
    holder.add(topRightSpacer2);
    holder.add(c12);
    holder.add(topLeftSpacer2);
    holder.add(middleSpacer2);
    holder.add(middleSpacer3);
    holder.add(qpanel);
    holder.add(labelPanel);
    holder.add(buttonPanel);

    add(holder);
 
  }
  //Listener that changed Radio Background
  // Sets int gMax ( cabin Max Capacity ) 
  // & Sets int cSelect ( cabin Numerical value ) 
       private class cabinListener implements ActionListener 
       {
          public void actionPerformed(ActionEvent event)
          {
           Object source = event.getSource(); //grab the user selection  
           if (source == cabin1)
           { 
             cabin1.setBackground(Color.red);  //Cabin 1
             cabin2.setBackground(new Color(0,19,127)); 
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127));
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 1<br><br>Max Occupancy: 2<br><br>Cost: $1200</p></body></html>");
             gMax = 2;
             cSelect = 1;
           }  
           else if (source == cabin2)
           { 
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(Color.red); //Cabin 2 
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127));
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 2<br><br>Max Occupancy: 3<br><br>Cost: $1400</p></body></html>");
             gMax = 3;
             cSelect = 2;
           }  
           else if (source == cabin3)
           { 
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(Color.red); //Cabin 3
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127));
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 3<br><br>Max Occupancy: 3<br><br>Cost: $1400</p></body></html>");
             gMax = 3;
             cSelect = 3;
           }  
           else if (source == cabin4)
           { 
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(Color.red); //Cabin 4
             cabin5.setBackground(new Color(0,19,127));
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 4<br><br>Max Occupancy: 2<br><br>Cost: $1250</p></body></html>");
             gMax = 2;
             cSelect = 4;
           }
           else if (source == cabin5)
           {
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(Color.red); //Cabin 5
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 5<br><br>Max Occupancy: 4<br><br>Cost: $1600</p></body></html>");
             gMax = 4;
             cSelect = 5;
           }
              else if (source == cabin6)
           {
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127)); 
             cabin6.setBackground(Color.red); // Cabin 6
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Suite 1<br><br>Max Occupancy: 6<br><br>Cost: $8000</p></body></html>");
             gMax = 6;
             cSelect = 6;
           }
              else if (source == cabin7)
           {
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127)); 
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(Color.red); //Cabin 7
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 6<br><br>Max Occupancy: 4<br><br>Cost: $1200</p></body></html>");
             gMax = 4;
             cSelect = 7;
           }
              else if (source == cabin8)
           {
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127));
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(Color.red); // Cabin 8
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 7<br><br>Max Occupancy: 3<br><br>Cost: $1400</p></body></html>");
             gMax = 3;
             cSelect = 8;
           }
              else if (source == cabin9)
           {
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127)); 
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(Color.red); ///Cabin 9
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 8<br><br>Max Occupancy: 3<br><br>Cost: $1400</p></body></html>");
             gMax = 3;
             cSelect = 9;
           }
              else if (source == cabin10)
           {
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127));
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(Color.red);// Cabin 10
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 9<br><br>Max Occupancy: 2<br><br>Cost: $1250</p></body></html>");
             gMax = 2;
             cSelect = 10;
           }
              else if (source == cabin11)
           {
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127)); 
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(Color.red); //Cabin 11
             cabin12.setBackground(new Color(0,19,127));
             label.setText("<html><body><p align=center>Cabin 10<br><br>Max Occupancy: 4<br><br>Cost: $1600</p></body></html>");
             gMax = 4;
             cSelect = 11;
           }
                else if (source == cabin12)
           {
             cabin1.setBackground(new Color(0,19,127));
             cabin2.setBackground(new Color(0,19,127));
             cabin3.setBackground(new Color(0,19,127));
             cabin4.setBackground(new Color(0,19,127));
             cabin5.setBackground(new Color(0,19,127));
             cabin6.setBackground(new Color(0,19,127));
             cabin7.setBackground(new Color(0,19,127));
             cabin8.setBackground(new Color(0,19,127));
             cabin9.setBackground(new Color(0,19,127));
             cabin10.setBackground(new Color(0,19,127));
             cabin11.setBackground(new Color(0,19,127));
             cabin12.setBackground(Color.red); //Cabin 12
             label.setText("<html><body><p align=center>Suite 2<br><br>Max Occupancy: 6<br><br>Cost: $8000</p></body></html>");
             gMax = 6;
             cSelect = 12;
           }
          } 
       }
//*************************************************************************
//  Changes the color of the Panels over the boat image.
// & Sets the text in qLabel. (( to the left of the radio buttons on the GUI ))
//************************************************************************
        private class cabinListener2 implements ActionListener 
       {
          public void actionPerformed(ActionEvent event)
          {
           Object source = event.getSource(); //grab the user selection
           if (cabin1.isSelected())
           { 
             c1.setBackground(Color.red);
             l1.setBackground(Color.red);
             l1.setForeground(Color.white);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 1</p></body></html>");
           }
           else if (cabin2.isSelected())
           {
             c2.setBackground(Color.red);
             l2.setBackground(Color.red);
             l2.setForeground(Color.white);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 2</p></body></html>");
           }
             else if (cabin3.isSelected())
           {
             c3.setBackground(Color.red);
             l3.setBackground(Color.red);
             l3.setForeground(Color.white);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 3</p></body></html>");
           }
             else if (cabin4.isSelected())
           {
             
             c4.setBackground(Color.red);
             l4.setBackground(Color.red);
             l4.setForeground(Color.white);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 4</p></body></html>");
           }
               else if (cabin5.isSelected())
           {
             c5.setBackground(Color.red);
             l5.setBackground(Color.red);
             l5.setForeground(Color.white);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 5</p></body></html>");
           }
              else if (cabin6.isSelected())
           {
             c6.setBackground(Color.red);
             l6.setBackground(Color.red);
             l6.setForeground(Color.white);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Suite 1</p></body></html>");
           }
            else if (cabin7.isSelected())
           { 
             c7.setBackground(Color.red);
             l7.setBackground(Color.red);
             l7.setForeground(Color.white);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 6</p></body></html>");
           }
             else if (cabin8.isSelected())
           { 
             c8.setBackground(Color.red);
             l8.setBackground(Color.red);
             l8.setForeground(Color.white);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 7</p></body></html>");
           }
            else if (cabin9.isSelected())
           { 
             c9.setBackground(Color.red);
             l9.setBackground(Color.red);
             l9.setForeground(Color.white);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 8</p></body></html>");
           }
             else  if (cabin10.isSelected())
           { 
             c10.setBackground(Color.red);
             l10.setBackground(Color.red);
             l10.setForeground(Color.white);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 9</p></body></html>");
           }
            else if (cabin11.isSelected())
           { 
             c11.setBackground(Color.red);
             l11.setBackground(Color.red);
             l11.setForeground(Color.white);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             c12.setBackground(Color.white);
             l12.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Cabin 10</p></body></html>");
           }
            else if (cabin12.isSelected())
           { 
             c12.setBackground(Color.red);
             l12.setBackground(Color.red);
             l12.setForeground(Color.white);
             c2.setBackground(Color.white);
             l2.setForeground(Color.black);
             c3.setBackground(Color.white);
             l3.setForeground(Color.black);
             c4.setBackground(Color.white);
             l4.setForeground(Color.black);
             c5.setBackground(Color.white);
             l5.setForeground(Color.black);
             c6.setBackground(Color.white);
             l6.setForeground(Color.black);
             c7.setBackground(Color.white);
             l7.setForeground(Color.black);
             c8.setBackground(Color.white);
             l8.setForeground(Color.black);
             c9.setBackground(Color.white);
             l9.setForeground(Color.black);
             c10.setBackground(Color.white);
             l10.setForeground(Color.black);
             c11.setBackground(Color.white);
             l11.setForeground(Color.black);
             c1.setBackground(Color.white);
             l1.setForeground(Color.black);
             qlabel.setText("<html><body><p align=center>You Have Selected Suite 2</p></body></html>");
           }
             System.out.println("");
       // Calls abnd. The chosen cabin number value from userInput.
       // assigns it to abnd2.
             userInput blarg = new userInput();
             int abnd2 = userInput.theNum();
       // Depending on which number is sent back, which only happens if yes is the answer to Continue? Question, 
       // disables the radio button that isSelected(). 
              if(abnd2 == 1)
             {
                cabin1.setEnabled(false);
             }
             else if(abnd2 == 2)
             {
               cabin2.setEnabled(false);
             }
             else if(abnd2 == 3)
             {
               cabin3.setEnabled(false);
             }
             else if(abnd2 == 4)
             {
               cabin4.setEnabled(false);
             }
             else if(abnd2 == 5)
             {
               cabin5.setEnabled(false);
             }
             else if(abnd2 == 6)
             {
               cabin6.setEnabled(false);
             }
             else if(abnd2 == 7)
             {
               cabin7.setEnabled(false);
             }
             else if(abnd2 == 8)
             {
               cabin8.setEnabled(false);
             }
             else if(abnd2 == 9)
             {
               cabin9.setEnabled(false);
             }
             else if(abnd2 == 10)
             {
               cabin10.setEnabled(false);
             }
             else if(abnd2 == 11)
             {
               cabin11.setEnabled(false);
             }
             else if(abnd2 == 12)
             {
               cabin12.setEnabled(false);
             }    
          }
          }       
 // Method to Return gMax.  gMax is the Cabin Max Capacity that gets set per Cabin selected. 
 // Do this to include gMax in the Math used in userInput class. 
        public static int getMax()
        {
        return gMax;
        }
      
// Method to return cSelect. cSelect is the numerical value assigned to each Cabin. ex: Cabin1 = 1. 
// Do this so I can tell which Cabin is selected. & use that in userInput.
        public static int cChoice()
        {
          return cSelect;
        }

// *********************************************************************************************************

}

        
        


        
