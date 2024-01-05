
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;

public class ViewCustomer extends JFrame implements ActionListener{
    JLabel lblusername,labelusername,lblID,labelID,lblname,labelname,lblNumber,labelNumber,lblgender ,labelgender,lblCountry,labelCountry,lblAddress,labelAddress,lblphone,labelphone,lblemail,labelemail;
    String username;
    JButton back;
    
    
    ViewCustomer(String username){
        setBounds(450,180,870,625);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
        setTitle("View Customer");
        setLayout(null);
        
        
        lblusername = new JLabel("UserName : ");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblusername);
        
        labelusername = new JLabel("");
        labelusername.setBounds(190,50,150,25);
        labelusername.setForeground(Color.black);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelusername);
        
        lblID = new JLabel("ID :");
        lblID.setBounds(30,90,150,25);
        lblID.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblID);
        
        labelID = new JLabel("");
        labelID.setBounds(190,90,150,25);
        labelID.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelID);
        
        lblNumber = new JLabel("Number : ");
        lblNumber.setBounds(30,130,150,25);
        lblNumber.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblNumber);
        
        labelNumber = new JLabel("");
        labelNumber.setBounds(190,130,150,25);
        labelNumber.setForeground(Color.black);
        labelNumber.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelNumber);
        
        
        lblname = new JLabel("Name : ");
        lblname.setBounds(30,170,150,25);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblname);
        
        labelname = new JLabel("");
        labelname.setBounds(190,170,150,25);
        labelname.setForeground(Color.black);
        labelname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelname);
        
        
        lblgender = new JLabel("Gender  : ");
        lblgender .setBounds(30,210,150,25);
        lblgender .setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblgender );
        
        labelgender  = new JLabel("");
        labelgender .setBounds(190,210,150,25);
        labelgender .setForeground(Color.black);
        labelgender .setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelgender );
        
        lblCountry = new JLabel("Country: ");
        lblCountry.setBounds(400,50,150,25);
        lblCountry.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblCountry);
        
        labelCountry = new JLabel("");
        labelCountry.setBounds(590,50,150,25);
        labelCountry.setForeground(Color.black);
        labelCountry.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelCountry);
        
        
        lblAddress = new JLabel("Address : ");
        lblAddress .setBounds(400,90,150,25);
        lblAddress .setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblAddress );
        
        labelAddress  = new JLabel("");
        labelAddress .setBounds(590,90,150,25);
        labelAddress .setForeground(Color.black);
        labelAddress .setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelAddress );
        
        lblphone = new JLabel("Phone: ");
        lblphone.setBounds(400,130,150,25);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblphone);
        
        labelphone = new JLabel("");
        labelphone.setBounds(590,130,150,25);
        labelphone.setForeground(Color.black);
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelphone);
        
        lblemail = new JLabel("Email : ");
        lblemail.setBounds(400,170,150,25);
        lblemail.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblemail);
        
        labelemail = new JLabel("");
        labelemail.setBounds(590,170,150,25);
        labelemail.setForeground(Color.black);
        labelemail.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelemail);
        
        
        back = new JButton("Back");
        back.setBounds(600,250,100,25);
        back.setBackground(new Color(0,0,0));
        back.setForeground(Color.white);
        back.setBorder(new LineBorder(new Color(0,0,0)));
        back.addActionListener(this);
        add(back);
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(90,400,600,200);
        add(image);
        
        try{
            Conn c = new Conn();
            String query = "select * from customer where username ='"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelID.setText(rs.getString("id"));
                labelNumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelCountry.setText(rs.getString("country"));
                labelAddress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
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
        new ViewCustomer("");
    }
    
}
