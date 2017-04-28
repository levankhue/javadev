



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
public class Example1  extends Frame implements ActionListener {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;
    
    
    public AWTCounter () {
    setLayout(new FlowLayout());
    lblCount = new Label("Counter");
    add(lblCount);
    
    tfCount = new TextField("0", 10);
    tfCount.setEditable(false);
    add(tfCount);
    
    btnCount = new Button("Count");
    add(btnCount);
    
    
    btnCount.addActionListener(this);
    
    
    setTitle("AWT Counter");
    setSize(250, 100);
    System.out.println(this);
    System.out.println(lblCount);
    System.out.println(tfCount);
    System.out.println(btnCount);
    setVisible(true);
    
    System.out.println(this);
    System.out.println(lblCount);
    System.out.println(tfCount);
    System.out.println(btnCount);
    
    
    
    
    }
     
    public static void main(String[] args){
        AWTCounter app = new AWTCounter();
    }
    
    @Override
    public void actionPerFormed(ActionEvent evt){
        ++count;
        tfCount.setText(count + "");
    }
    
}
