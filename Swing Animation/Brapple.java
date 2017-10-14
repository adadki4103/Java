// 3/3/2015
// Adam Adkins

import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class Brapple extends Applet implements KeyListener
{
  Graphics bufferGraphics;
  Image offscreen;
  Dimension dim;
  int curX=5, curY=270;
  boolean isJumpPressed=false, isLeftPressed=false, isRightPressed=false;
  boolean gameLoop=true;
  
  public void init()
  {
    dim = getSize();
    setBackground(Color.black);
    offscreen = createImage(dim.width,dim.height);
    bufferGraphics = offscreen.getGraphics();
    addKeyListener(this);
  }
  
  public void paint(Graphics g)
  {
// Frame Box
    bufferGraphics.clearRect(0,0,dim.width,dim.width);
 // Text up top
    bufferGraphics.setColor(Color.green);
    bufferGraphics.drawString("What's Up gitHub?",(getWidth()/2)-15,30);
    bufferGraphics.setColor(Color.orange);
    bufferGraphics.drawString("Spacebar = Jump",(getWidth()/2)-195,50);
    bufferGraphics.drawString("D = Right",(getWidth()/2)-195,70);
    bufferGraphics.drawString("A = Left",(getWidth()/2)-195,90);   
// Runner Body
    bufferGraphics.setColor(Color.green);
    bufferGraphics.fillRect(curX,curY,20,20);
// Runner Left Eye  
    bufferGraphics.setColor(Color.black);
    if(isRightPressed == true)
    {
    bufferGraphics.fillRect(curX+4,curY+2,5,5);
    }
    else if(isRightPressed == false)
    {
    bufferGraphics.fillRect(curX+3,curY+2,5,5);
    }
// Runner Right Eye
    bufferGraphics.setColor(Color.black);
    if(isRightPressed == true)
    {
    bufferGraphics.fillRect(curX+14,curY+2,5,5);
    }
    else if(isRightPressed == false)
    {
      bufferGraphics.fillRect(curX+11,curY+2,5,5);
    }
// Runner Mouth
    bufferGraphics.setColor(Color.black);
    if(isRightPressed == true)
    {
    bufferGraphics.fillRect(curX+10,curY+10,5,7);
    }
    else if(isRightPressed == false)
    {
      bufferGraphics.fillRect(curX+6,curY+10,5,7);
    }
// Floor Square
    bufferGraphics.setColor(Color.gray);
    bufferGraphics.fillRect(0,290,dim.width,10);

    g.drawImage(offscreen,0,0,this);
  }
  
  public void update(Graphics g)
  {
    paint(g);
  }
  
  public void keyPressed(KeyEvent event)
  {
    char goRight = 'd';
    char goLeft = 'a';
    
   if(event.getKeyChar()==event.VK_SPACE)
    {
     if(curY <=220){
       curY-=40;}
     else{ curY=230; }
    }
   if(event.getKeyChar()==goLeft)
   {
     isRightPressed=false;
   }
   if(event.getKeyChar()==goRight)
   {
     isRightPressed=true;
   }
   repaint();
  }
  public void keyReleased(KeyEvent event)
  {
    char goRight = 'd';
    char goLeft = 'a';

    if(event.getKeyChar()==event.VK_SPACE)
    {
      curY+=40;
    }
    repaint();
  }
  public void keyTyped(KeyEvent event)
  {
        char goRight = 'd';
        char goLeft = 'a';
  if(event.getKeyChar()==goRight)
  {
    if(curX==380){
      curX=380;}
    else{curX+=5;}
  }
  else if(event.getKeyChar()==goLeft)
  {
    if(curX==0){
      curX=0;}
    else{curX-=5;}
  }
   if(event.getKeyChar()==goRight)
   {
     isRightPressed=true;
   }
   if(event.getKeyChar()==goLeft)
   {
     isRightPressed=false;
   }
  repaint();
  }
}