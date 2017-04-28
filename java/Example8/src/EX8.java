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
 

public class Ex8 extends Frame {
   
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
 
   
   public AWTCounterAnonymousInnerClass () {
      setLayout(new FlowLayout());  
      add(new Label("Counter"));    
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);   
      add(tfCount);                
 
      btnCount = new Button("Count");
      add(btnCount);               
      btnCount.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
 
      setTitle("AWT Counter");
      setSize(250, 100);
      setVisible(true);
   }
 
   
   public static void main(String[] args) {
      new AWTCounterAnonymousInnerClass(); 
   }
}
