
package travelmanagementsystem;

import java.awt.Choice;
import java.awt.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class SignUp extends JFrame implements ActionListener{
    
    JButton Create,Back;
    JTextField tfusername,tfname,tfPass,tfAnswer;
    Choice security;
    
    SignUp(){
        
        setBounds(350,200,900,400);
        getContentPane().setBackground(new Color(204,255,153));
        setTitle("Sing-Up Page");
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblusername = new JLabel("UserName : ");
        lblusername.setBounds(30,20,125,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblusername);
        
        
        tfusername = new JTextField();
        tfusername.setBounds(190,20,200,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        JLabel lblname = new JLabel("Name : ");
        lblname.setBounds(30,60,125,25);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblname);
        
        
        tfname = new JTextField();
        tfname.setBounds(190,60,200,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        
        
        JLabel lblPass = new JLabel("Password : ");
        lblPass.setBounds(30,100,125,25);
        lblPass.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblPass);
        
        
        tfPass = new JTextField();
        tfPass.setBounds(190,100,200,25);
        tfPass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfPass);
        
        
        JLabel lblsecurity = new JLabel("Sequrity Question:");
        lblsecurity.setBounds(30,140,150,25);
        lblsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblsecurity);
        
        
        
        security = new Choice();
        security.add("whats you'r Hobby");
        security.add("Favourite turist Spot");
        security.add("You Lucky Number");
        security.add("you are childhood game");
        security.add("you are Phone NUmber");
        security.add("you are birth date");
        setBounds(190,140,200,25);
        p1.add(security);


        JLabel lblAnswer = new JLabel("Answer : ");
        lblAnswer.setBounds(30,180,125,25);
        lblAnswer.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblAnswer);
        
        
        tfAnswer = new JTextField();
        tfAnswer.setBounds(190,180,200,25);
        tfAnswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfAnswer);
        
        Create = new JButton("Create");
        Create.setBounds(80,250,100,30);
        Create.setBackground(new Color(25,51,0));
        Create.setForeground(Color.white);
        Create.setBorder(new LineBorder(new Color(25,51,0)));
        Create.addActionListener(this);
        p1.add(Create);
        
        
        Back = new JButton("Back");
        Back.setBounds(250,250,100,30);
        Back.setBackground(new Color(0,0,0));
        Back.setForeground(Color.white);
        Back.setBorder(new LineBorder(new Color(0,0,0)));
        Back.addActionListener(this);
        p1.add(Back);
        
        
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(204,255,153));
        p2.setBounds(400,30,450,300);
        add(p2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(180,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);
        p2.add(image);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Create){
            String username =tfusername.getText();
            String name =tfname.getText();
            String Pass =tfPass.getText();
            String Question =security.getSelectedItem();
            String Answer =tfAnswer.getText();
            
            
            String query = "insert into account values('"+username+"','"+name+"','"+Pass+"','"+Question+"','"+Answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==Back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new SignUp();
    }
}
