// Random Work Load Counter for the Student IT desk. 
// Author: Adam Adkins
// 5/25/2015

import javax.swing.*;
import java.awt.*;

public class workLoadCounter extends JFrame 
{
  public static void main(String[] args) throws Exception
  {
    JFrame frame = new JFrame();
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new JLabel(new ImageIcon("background.jpg")));
    frame.setTitle("Work Load Counter - Student Worker - IT Helpdesk");
    frame.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
    frame.setSize(800,600);
    frame.setResizable(false);
    frame.setVisible(true);
    frame.setLayout(new FlowLayout());
    frame.add(new theInsides());
    
    frame.pack();
  }
}
