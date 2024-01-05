
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.sql.*;


public class ForgatePassword extends JFrame implements ActionListener{
    
    JTextField tfusername,tfname,tfquestion,tfAnswer,tfPass;
    JButton Search,retrive,Back;
    
    ForgatePassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.white);
        setTitle("Find Password ");
        setLayout(null);
        
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(204,255,153));
        p1.setBounds(0,0,500,380);
        add(p1);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);
        
        
        
        JLabel lblusername = new JLabel("UserName :");
        lblusername.setBounds(40,20,100,25);
        lblusername.setFont(new Font("Thoma",Font.BOLD,14));
        p1.add(lblusername);
        
        
        tfusername = new JTextField();
        tfusername.setBounds(160,20,150,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        
        Search = new JButton("Search");
        Search.setBackground(Color.blue);
        Search.setForeground(Color.white);
        Search.setBounds(320,20,100,25);
        Search.setBorder(new LineBorder(Color.blue));
        Search.addActionListener(this);
        p1.add(Search);
        
        
        JLabel lblname = new JLabel("Name :");
        lblname.setBounds(40,60,100,25);
        lblname.setFont(new Font("Thoma",Font.BOLD,14));
        p1.add(lblname);
        
        
        tfname = new JTextField();
        tfname.setBounds(160,60,150,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        
        JLabel lblquestion = new JLabel("S-Question:");
        lblquestion.setBounds(40,100,100,25);
        lblquestion.setFont(new Font("Thoma",Font.BOLD,14));
        p1.add(lblquestion);
        
        
        tfquestion = new JTextField();
        tfquestion.setBounds(160,100,150,25);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);
        
        JLabel lblAnswer = new JLabel("Answer:");
        lblAnswer.setBounds(40,140,100,25);
        lblAnswer.setFont(new Font("Thoma",Font.BOLD,14));
        p1.add(lblAnswer);
        
        
        tfAnswer = new JTextField();
        tfAnswer.setBounds(160,140,150,25);
        tfAnswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfAnswer);
        
        retrive = new JButton("Retrive");
        retrive.setBackground(Color.blue);
        retrive.setForeground(Color.white);
        retrive.setBounds(320,140,100,25);
        retrive.setBorder(new LineBorder(Color.blue));
        retrive.addActionListener(this);
        p1.add(retrive);
        
        
        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(40,180,100,25);
        lblPass.setFont(new Font("Thoma",Font.BOLD,14));
        p1.add(lblPass);
        
        
        tfPass = new JTextField();
        tfPass.setBounds(160,180,150,25);
        tfPass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfPass);
        
        
        Back = new JButton("Back");
        Back.setBackground(Color.blue);
        Back.setForeground(Color.white);
        Back.setBounds(150,300,100,25);
        Search.setBorder(new LineBorder(Color.blue));
        Back.addActionListener(this);
        p1.add(Back);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==Search){
            try{
                String query ="select * from account where username = '"+tfusername.getText()+"'";
                Conn c = new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                    tfname.setText(rs.getString("name"));
                    tfquestion.setText(rs.getString("security"));
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() ==retrive){
           try{
                String query ="select * from account where Answer = '"+tfAnswer.getText()+"'";
                Conn c = new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                    tfPass.setText(rs.getString("Pass"));                    
                }
            }catch(Exception e){
                e.printStackTrace();
            } 
        }
       else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new ForgatePassword();
    }
}
