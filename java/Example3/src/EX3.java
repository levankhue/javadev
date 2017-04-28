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
public class EX3 extends Frame
      implements ActionListener, WindowListener {
     private TextField tfCount; 
   private Button btnCount;   
   private int count = 0;      
 
  
   public WindowEventDemo() {
      setLayout(new FlowLayout()); 
 
      add(new Label("Counter"));   
 
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);     
      add(tfCount);                     
 
      btnCount = new Button("Count");  
      add(btnCount);                 
 
      btnCount.addActionListener(this);
        
       
 
      addWindowListener(this);
 
      setTitle("WindowEvent Demo");
      setSize(250, 100);            
      setVisible(true);            
   }
 
   // The entry main() method
   public static void main(String[] args) {
      new WindowEventDemo(); 
   }
 
  
   @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0);  // Terminate the program
   }
 
   // Not Used, but need to provide an empty body to compile.
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   @Override public void windowIconified(WindowEvent evt) { }
   @Override public void windowDeiconified(WindowEvent evt) { }
   @Override public void windowActivated(WindowEvent evt) { }
   @Override public void windowDeactivated(WindowEvent evt) { }
}
    

