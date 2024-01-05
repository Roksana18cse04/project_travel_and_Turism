
package travelmanagementsystem;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;


public class About extends JFrame {
    
    
    
    About(){
        setBounds(300,200,500,550);
        setLayout(null);
        setBackground(Color.WHITE);
        
      
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200,10,200,40);
        l1.setBackground(Color.green);
        l1.setFont(new Font("Tahoma",Font.BOLD,25));
        add(l1);
        
        
        
       setVisible(true); 
    }
    

    
    
    public static void main(String[] args) {
        new About();
    }
}
