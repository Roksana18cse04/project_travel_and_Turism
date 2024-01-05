
package travelmanagementsystem;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;


public class Payment extends JFrame implements ActionListener{
    
    JButton pay,back;
    
    Payment(){
        setBounds(300,200,800,600);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        
        
        pay= new JButton("Pay");
        pay.setBounds(520,10,80,40);
        pay.setBackground(Color.black);
        pay.setForeground(Color.white);
        pay.addActionListener(this);
        image.add(pay);
        
        back = new JButton("Back");
        back.setBounds(620,10,80,40);
        back.setBackground( Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==pay){
            setVisible(false);
            new PayTm();
        }else{
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args) {
        new Payment();
    }
}
