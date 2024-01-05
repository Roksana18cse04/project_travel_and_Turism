
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;


public class ViewPackage extends JFrame implements ActionListener{
    
    JButton back;
    JLabel text,lblusername,labelusername,lblpackage,labelPackage,lblPerson,labelPerson,lblid,labelid,lblNumber,labelNumber,labelphone,lblphone,labelprice,lblprice;
    
    
    ViewPackage( String username){
        setBounds(450,200,900,450);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
        setTitle("View Package");
        setLayout(null);
        
        text  = new JLabel("View Package");
        text.setBounds(300,0,300,30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setForeground(Color.white);
        add(text);
        
        lblusername = new JLabel("UserName : ");
        lblusername.setBounds(30,50,150,25);
        lblusername.setForeground(Color.white);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblusername);
        
        labelusername = new JLabel("");
        labelusername.setBounds(190,50,150,25);
        labelusername.setForeground(Color.white);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelusername);
        
        lblpackage = new JLabel("Package");
        lblpackage.setBounds(30,90,150,25);
        lblpackage.setForeground(Color.white);
        lblpackage.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblpackage);
        
        labelPackage = new JLabel("");
        labelPackage.setBounds(190,90,150,25);
        labelPackage.setForeground(Color.white);
        labelPackage.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelPackage);
        
        lblPerson = new JLabel("Total Person :");
        lblPerson.setBounds(30,130,150,25);
        lblPerson.setForeground(Color.white);
        lblPerson.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblPerson);
        
        labelPerson = new JLabel("");
        labelPerson.setBounds(190,130,150,25);
        labelPerson.setForeground(Color.white);
        labelPerson.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelPerson);
        
        lblprice = new JLabel("Price : ");
        lblprice.setBounds(30,170,150,25);
        lblprice.setForeground(Color.white);
        lblprice.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblprice);
        
        labelprice = new JLabel("");
        labelprice.setBounds(190,170,150,25);
        labelprice.setForeground(Color.white);
        labelprice.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelprice);
        
        
        lblphone = new JLabel("Phone: ");
        lblphone.setBounds(550,50,150,25);
        lblphone.setForeground(Color.black);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblphone);
        
        labelphone = new JLabel("");
        labelphone.setBounds(690,50,150,25);
        labelphone.setForeground(Color.black);
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelphone);
        
        
        lblid = new JLabel("ID : ");
        lblid.setBounds(550,90,150,25);
        lblid.setForeground(Color.black);
        lblid.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblid);
        
        labelid = new JLabel("");
        labelid.setBounds(690,90,150,25);
        labelid.setForeground(Color.BLACK);
        labelid.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelid);
        
        
        
        lblNumber = new JLabel("Number : ");
        lblNumber.setBounds(550,130,150,25);
        lblNumber.setForeground(Color.black);
        lblNumber.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblNumber);
        
        labelNumber = new JLabel("");
        labelNumber.setBounds(690,130,150,25);
        labelNumber.setForeground(Color.black);
        labelNumber.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelNumber);
        

        
        back = new JButton("Back");
        back.setBounds(750,350,100,25);
        back.setBackground(new Color(0,0,0));
        back.setForeground(Color.white);
        back.setBorder(new LineBorder(new Color(0,0,0)));
        back.addActionListener(this);
        add(back);
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,450,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,450);
        
        add(image);
        
        try{
            Conn c = new Conn();
            String query = "select * from bookpackage where username ='"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelPackage.setText(rs.getString("package"));
                labelPerson.setText(rs.getString("person"));
                labelid.setText(rs.getString("id"));
                labelNumber.setText(rs.getString("number"));
                labelprice.setText(rs.getString("price"));
                labelphone.setText(rs.getString("phone"));
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new ViewPackage("");
    }
}
