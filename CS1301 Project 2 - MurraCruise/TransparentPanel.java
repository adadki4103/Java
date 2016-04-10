// GUI Set up for Project 2. This is the Frame, BackGround Panel &  Image of the main frame. 
// Author: Adam Adkins
// Created: 10/12/2014

import javax.swing.*;
import java.awt.*;

class TransparentPanel extends JFrame
{
JPanel headerPanel; 

    public TransparentPanel()
    {
        createAndShowGUI();
    }    
    private void createAndShowGUI()
    {
        setTitle("Murratime Limited");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("shipicon.png"));
        setContentPane(new JLabel(new ImageIcon("boatbg.jpg")));
        setLayout(new FlowLayout());
        
        add(getContentPane().add(new cabinButtons()));

        setSize(992,773);
        setVisible(true);
        setResizable(false);
    }
}

