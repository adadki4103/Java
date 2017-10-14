// A text field that generates a JPanel with the entered text. 
// Then allows the user to Drag and Drop that newly generated JPanel
// Author: Adam Adkins
// Created: 3/15/2015
//---------------------------------------------------------------------------------

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DragAndDropTextBoxes extends JFrame
{
//Conjure Global things  
  JFrame frame = new JFrame();
  JButton theButton;
  JTextArea textField;
  JPanel screen, temp;
  ArrayList<JPanel> createdPanels = new ArrayList<JPanel>();
  int posX, posY, tempX, tempY, tempWidth;
  
  public DragAndDropTextBoxes(){
    
// Conjure Things.
    JPanel leftSpacer, middleSpacer, rightSpacer, insideSpacer;
    JPanel secondInsideSpacer, thirdInsideSpacer;
    JLabel textLabel;
    
// Set Up Frame -----------------------------------------------------------------
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new JLabel(new ImageIcon("background2.jpg")));
    frame.setTitle("Word Dragon");
    frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png")); 
    frame.setSize(992,773);
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setLayout(new FlowLayout());
  
// Set Up Panels  ---------------------------------------------------------------
     screen = new JPanel();
     screen.setPreferredSize(new Dimension(980,653));
     //screen.setBackground(Color.black);
     screen.setOpaque(false);
     screen.setLayout(null);
     
     leftSpacer = new JPanel();
     leftSpacer.setPreferredSize(new Dimension(270,120));
     leftSpacer.setBackground(Color.red);
     //leftSpacer.setForeground(Color.white);
     leftSpacer.setOpaque(false);
     
     middleSpacer = new JPanel();
     middleSpacer.setPreferredSize(new Dimension(410,120));
     middleSpacer.setForeground(Color.white);
     //middleSpacer.setBackground(Color.yellow);
     middleSpacer.setOpaque(false);
     
     rightSpacer = new JPanel();
     rightSpacer.setPreferredSize(new Dimension(270,120));
     //rightSpacer.setBackground(Color.blue);
     rightSpacer.setOpaque(false);
     
     insideSpacer = new JPanel();
     insideSpacer.setPreferredSize(new Dimension(405,40));
     //insideSpacer.setBackground(Color.orange);
     insideSpacer.setOpaque(false);
     
     secondInsideSpacer = new JPanel();
     secondInsideSpacer.setPreferredSize(new Dimension(260,50));
     //secondInsideSpacer.setBackground(Color.magenta);
     secondInsideSpacer.setOpaque(false);
     
     thirdInsideSpacer = new JPanel();
     thirdInsideSpacer.setPreferredSize(new Dimension(120,40));
     //thirdInsideSpacer.setBackground(Color.white);
     thirdInsideSpacer.setOpaque(false);
     
// Set Up Text Fields ----------------------------------------------------------
     textField = new JTextArea();
     textField.setWrapStyleWord(true);
     textField.setLineWrap(true);
     textField.setPreferredSize(new Dimension(300,40));
     textField.setBorder(BorderFactory.createEmptyBorder());
     textField.setOpaque(false);
    // textField.setBackground(Color.black);
     textField.setForeground(Color.white);
     textField.setDragEnabled(true);
     
     
// Set Up Labels  --------------------------------------------------------------
     textLabel = new JLabel();
     textLabel.setText("Enter Text: ");
     textLabel.setForeground(Color.white);
  
// Set Up Buttons --------------------------------------------------------------
     theButton = new JButton("Press");
     theButton.setPreferredSize(new Dimension(70,30));
     theButton.setBackground(new Color(50,122,55));
     theButton.setForeground(Color.white);
     theButton.setBorder(BorderFactory.createEmptyBorder());
     // Add Listener to the Button
     listen lis = new listen();
     theButton.addActionListener(lis);
     textField.addKeyListener(lis);
     
     
// Set Up middleSpacer insides -------------------------------------------------
      middleSpacer.add(insideSpacer);
      middleSpacer.add(textLabel);
      middleSpacer.add(textField);
// Set Up rightSpacer insides --------------------------------------------------
      rightSpacer.add(secondInsideSpacer);
      rightSpacer.add(theButton);
      rightSpacer.add(thirdInsideSpacer);
    
// Add Panels to Frame ---------------------------------------------------------
     frame.add(screen);
     frame.add(leftSpacer);
     frame.add(middleSpacer);
     frame.add(rightSpacer);
     
// Add MouseListener && MouseMotionListener to screen Panel
     listen lis2 = new listen();
     screen.addMouseMotionListener(lis2);
     screen.addMouseListener(lis2);
    
// Show Frame -------------------------------------------------------------------                      
    frame.pack();
  }
// Listener Guts ----------------------------------------------------------------
  public class listen implements ActionListener, MouseListener, MouseMotionListener, KeyListener {
    public void actionPerformed(ActionEvent e){
      Object source = e.getSource();
      if(source == theButton){
        // entText = The Text the User inputs into the JTextField ( textField )-- 
        String entText = textField.getText();
        textField.setText("");
          // Random ranges for JPanel background colors
        Random r = new Random();
        int randomRed = Math.abs(r.nextInt(255-0));
        int randomBlue = Math.abs(r.nextInt(255-0));
        int randomGreen = Math.abs(r.nextInt(255-0));
          // tempWidth == value that changes with the length of entText. Used for the JPanel Width.
         tempWidth = (entText.length())*8;
          // Takes entText and makes it the JLabel on the new JPanel.
        JLabel tempText = new JLabel(" "+entText+" ");
        tempText.setForeground(Color.white);
          // This is the Panel that gets created everytime the button is pressed. 
        JPanel temp = new JPanel();
        temp.setPreferredSize(new Dimension(tempWidth,25));
        temp.setBackground(new Color(randomRed,randomBlue,randomGreen));
         // Put Focus back on Text Area after Button is pressed
        textField.requestFocus();
        
        // Randomly Place JPanel in Screen
        int appearX = Math.abs(r.nextInt(980-30));
        int appearY = Math.abs(r.nextInt(653-30));
          temp.setBounds(appearX,appearY,tempWidth,25);
          
          // Drag And Drop Attempt./ Experiment
           tempX = temp.getX();
           tempY = temp.getY();
           System.out.println("Panel is located at:("+tempX+","+tempY+")");

        
        
        // Put it all Together.
        // Put the entered Text on the JPanel
        temp.add(tempText);
         // new JPanel into ArrayList of JPanels
        createdPanels.add(temp);
        // throw it on the 'screen'Panel.
        screen.add(temp);
        
        
        //repaint
        frame.pack();
      }
    }
    
//*******---------------experimental -------------------------**************************************************
//----Mouse Listener Guts---------------------------------------------------------------------------------------   
    public void mouseExited(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { 
      posX = Math.abs(e.getX());
      posY = Math.abs(e.getY());
      System.out.println("Mouse Pressed is located at:("+ posX+","+posY+")  <--Pressed");
    }
    public void mouseClicked(MouseEvent e) { }
    public void mouseMoved(MouseEvent e) { }
    public void mouseDragged(MouseEvent e) {
   // temp.setLocation(e.getXOnScreen() - posX , e.getYOnScreen() - posY);
      posX = Math.abs(e.getX());
      posY = Math.abs(e.getY());
      System.out.println("Mouse Dragged is located at:("+ posX+","+posY+")  <--Drag");
      //temp.setBounds(posX,posY,tempWidth,25);
    }
    public void mouseReleased(MouseEvent e) {
      posX = Math.abs(e.getX());
      posY = Math.abs(e.getY());
      System.out.println("Mouse Released is located at:("+ posX+","+posY+") <--Release");
     // temp.setBounds(posX,posY,tempWidth,25);

    }
//---------------------------------------------------------------------------------------------------------    
//---- Key Listener Guts ----------------------------------------------------------------------------------
    public void keyPressed(KeyEvent e){
      if (e.getKeyChar()==e.VK_ENTER){
        // entText = The Text the User inputs into the JTextField ( textField )-- 
        String entText = textField.getText();
        textField.setText("");
          // Random ranges for JPanel background colors
        Random r = new Random();

        int randomRed = Math.abs(r.nextInt(255-0));
        int randomBlue = Math.abs(r.nextInt(255-0));
        int randomGreen = Math.abs(r.nextInt(255-0));
          // tempWidth == value that changes with the length of entText. Used for the JPanel Width.
        int tempWidth = (entText.length())*8;
          // Takes entText and makes it the JLabel on the new JPanel.
        JLabel tempText = new JLabel(" "+entText+" ");
        tempText.setForeground(Color.white);
          // This is the Panel that gets created everytime the button is pressed. 
        JPanel temp = new JPanel();
        temp.setPreferredSize(new Dimension(tempWidth,25));
        temp.setBackground(new Color(randomRed,randomBlue,randomGreen));
        
        
        // Randomly place Panel in screen. 
        int appearX = Math.abs(r.nextInt(980-30));
        int appearY = Math.abs(r.nextInt(653-30));
          temp.setBounds(appearX,appearY,tempWidth,25);
          
          // Drag And Drop Attempt./ Experiment
           tempX = temp.getX();
           tempY = temp.getY();
           System.out.println("Panel is located at:("+tempX+","+tempY+")");


      // Put it all Together.
        // Put the entered Text on the JPanel
        temp.add(tempText);
         // new JPanel into ArrayList of JPanels
        createdPanels.add(temp);
        // throw it on the 'screen'Panel.
        screen.add(temp);
        
        //repaint
        frame.pack();
      }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
  } 
}

 
  
  