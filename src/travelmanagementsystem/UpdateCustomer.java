
package travelmanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;

public class UpdateCustomer extends JFrame implements ActionListener{
    
    
    JLabel labelusername,labelname,lblusername,lblname,lblID,lblNumber,lblGender,lblCountry,lblAddress,lblphone,lblemail;
    JTextField tfNumber,tfCountry,tfAddress,tfphone,tfemail,tfid,tfgender;
    JComboBox comboid; 
    JButton Update,back;
    JRadioButton rMale,rFemale,other;
    //String username;
    
    
    UpdateCustomer(String username){
        
//        this.username = lblusername;
        setBounds(450,200,850,550);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.GRAY);
        setTitle("Update Customer");
        setLayout(null);
        
        
        lblusername = new JLabel("UserName : ");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblusername);
        
        labelusername = new JLabel("");
        labelusername.setBounds(190,50,150,25);
        labelusername.setForeground(Color.black);
        labelusername.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelusername);
        
        
        lblID = new JLabel("ID :");
        lblID.setBounds(30,90,150,25);
        lblID.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblID);
        
        tfid = new JTextField();
        tfid.setBounds(190,90,150,25);
        tfid.setBorder(BorderFactory.createEmptyBorder());
        add(tfid);
       
        lblNumber = new JLabel("Number :");
        lblNumber.setBounds(30,130,150,25);
        lblNumber.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblNumber);
        
        tfNumber = new JTextField();
        tfNumber.setBounds(190,130,150,25);
        tfNumber.setBorder(BorderFactory.createEmptyBorder());
        add(tfNumber);
        
        lblname = new JLabel("Name : ");
        lblname.setBounds(30,170,150,25);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblname);
        
        labelname = new JLabel("");
        labelname.setBounds(190,170,150,25);
        labelname.setForeground(Color.black);
        labelname.setFont(new Font("Tahoma",Font.BOLD,14));
        add(labelname);
        
        
        lblGender = new JLabel("Gender : ");
        lblGender.setBounds(30,210,150,25);
        lblGender.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblGender);
        
        tfgender = new JTextField();
        tfgender.setBounds(190,210,150,25);
        tfgender.setBorder(BorderFactory.createEmptyBorder());
        add(tfgender);
        
        lblCountry = new JLabel("Country :");
        lblCountry.setBounds(30,250,150,25);
        lblCountry.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblCountry);
        
        tfCountry = new JTextField();
        tfCountry.setBounds(190,250,150,25);
        tfCountry.setBorder(BorderFactory.createEmptyBorder());
        add(tfCountry);
        
        
        
        lblAddress = new JLabel("Address :");
        lblAddress.setBounds(30,290,150,25);
        lblAddress.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblAddress);
        
        tfAddress = new JTextField();
        tfAddress.setBounds(190,290,150,25);
        tfAddress.setBorder(BorderFactory.createEmptyBorder());
        add(tfAddress);
        
        
        
        lblphone = new JLabel("Phone :");
        lblphone.setBounds(30,330,150,25);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(190,330,150,25);
        tfphone.setBorder(BorderFactory.createEmptyBorder());
        add(tfphone);
        
        
        
        lblemail = new JLabel("Email :");
        lblemail.setBounds(30,370,150,25);
        lblemail.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(190,370,150,25);
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        add(tfemail);
        
        Update = new JButton("Update");
        Update.setBounds(70,430,100,25);
        Update.setBackground(new Color(0,0,0));
        Update.setForeground(Color.white);
        Update.setBorder(new LineBorder(new Color(0,0,0)));
        Update.addActionListener(this);
        add(Update);
        
        back = new JButton("Back");
        back.setBounds(220,430,100,25);
        back.setBackground(new Color(0,0,0));
        back.setForeground(Color.white);
        back.setBorder(new LineBorder(new Color(0,0,0)));
        back.addActionListener(this);
        add(back);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(300,500,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,10,300,500);
        add(image);
        
        
        
        try{
            Conn c = new Conn();
            ResultSet rs =c.s.executeQuery("select * from customer where username ='"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfNumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfCountry.setText(rs.getString("country"));
                tfAddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Update){
            String username =labelusername.getText();
            String id =tfid.getText();
            String number =tfNumber.getText();
            String name =labelname.getText();
            String gender =tfgender.getText();
            
            String country =tfCountry.getText();
            String address =tfAddress.getText();
            String phone =tfphone.getText();
            String email=tfemail.getText();
            
            
            try{
                Conn c = new Conn();
                
                String query ="update customer set username='"+username+"',id='"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Customer Update Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
            
        }
    }
    
    
    public static void main(String[] args) {
        new UpdateCustomer("");
    }
}
