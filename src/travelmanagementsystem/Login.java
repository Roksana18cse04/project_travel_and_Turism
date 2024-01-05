
package travelmanagementsystem;

import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java .sql.*;
import javax.swing.border.LineBorder;
public class Login extends JFrame implements ActionListener{
    JTextField tfusername,tfPassword;
    JButton login,signup,fpass;
    Login(){
        
        setSize(900,400);
        setLocation(350,200);
        setTitle("Login Frame");
        setLayout(null);
        
        
        getContentPane().setBackground(new Color(204,255,153));
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);
        p1.add(image);
        
        

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(204,255,153));
        p2.setBounds(400,30,450,300);
        add(p2);      
        
        
        JLabel lblusername = new JLabel("UserName : ");
        lblusername.setBounds(60,20,115,20);
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        p2.add(lblusername);
        
        
        tfusername = new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        
        
        JLabel lblPassword = new JLabel("Password : ");
        lblPassword.setBounds(60,110,115,20);
        lblPassword.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        p2.add(lblPassword);
        
        
        tfPassword = new JTextField();
        tfPassword.setBounds(60,150,300,30);
        tfPassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfPassword);
        
        
        
        login = new JButton("Login");
        login.setBounds(60,200,110,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.white);
        login.setBorder(new LineBorder(new Color(133,193,233)));
        login.addActionListener(this);
        p2.add(login);
        
        
        
        signup = new JButton("SignUp");
        signup.setBounds(230,200,110,30);
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.white);
        signup.setBorder(new LineBorder(new Color(133,193,233)));
        signup.addActionListener(this);
        p2.add(signup);
        
        
        fpass = new JButton("Forgate Password");
        fpass.setBounds(130,250,110,30);
        fpass.setBackground(new Color(133,193,233));
        fpass.setForeground(Color.white);
        fpass.setBorder(new LineBorder(new Color(133,193,233)));
        fpass.addActionListener(this);
        p2.add(fpass);
        
        
        JLabel text = new JLabel("Trouble in Login....");
        text.setBounds(300,250,150,20);
        
        p2.add(text);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            try{
                String username = tfusername.getText();
                String Pass = tfPassword.getText();
                
                String query = "Select * from account where username = '"+username+"'AND Pass = '"+Pass+"'";
                
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Loading(username);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalide Username or Password");
                }
                
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==signup){
            setVisible(false);
            new SignUp();
        }else{
           setVisible(false);
           new ForgatePassword();
        }
    }
    public static void main(String[] args) {
        
        Login l = new Login();
      
        
        
        
    }

}
