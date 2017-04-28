/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lekimloitcu
 */

import java.awt.*;
import java.awt.event.*;
public class EX4 extends Frame implements MouseListener {
    
     private TextField tfMouseX; 
   private TextField tfMouseY; 
 
  
   public MouseEventDemo() {
      setLayout(new FlowLayout());
 
      
      add(new Label("X-Click: ")); 
      tfMouseX = new TextField(10); 
      tfMouseX.setEditable(false); 
      add(tfMouseX);               
      add(new Label("Y-Click: ")); 
 
      // TextField
      tfMouseY = new TextField(10);
      tfMouseY.setEditable(false);  
      add(tfMouseY);                
 
      addMouseListener(this);
        
 
      setTitle("MouseEvent Demo"); 
      setSize(350, 100);           
      setVisible(true);           
   }
 
   public static void main(String[] args) {
      new MouseEventDemo(); 
   }
 
   
   @Override
   public void mouseClicked(MouseEvent evt) {
      tfMouseX.setText(evt.getX() + "");
      tfMouseY.setText(evt.getY() + "");
   }
 
  
   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }
}
    
}
