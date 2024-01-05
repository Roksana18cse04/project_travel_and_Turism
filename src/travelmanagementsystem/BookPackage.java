
package travelmanagementsystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookPackage extends JFrame implements ActionListener{
    
    JLabel text,lblusername,lblid,lblPackage,lblnumber,lblTotal,lblPerson,lblphone,labelusername,labelid,labelphone,labelPrice,labelNumber;
    Choice cpack;
    JTextField tfPerson;
    JButton checkPrice,bookPackage,back;
    String username;
    
    BookPackage(String username){
        
        this.username=username;
        
        setBounds(350,200,1100,500);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
        setTitle("Book Package");
        setLayout(null);
        
        text  = new JLabel("BOOK PACKAGE");
        text.setBounds(400,10,200,30);
        text.setFont(new Font("Thoma",Font.BOLD,20));
        add(text);
        
        lblusername = new JLabel("UserName : ");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblusername);
        
        labelusername = new JLabel("");
        labelusername.setBounds(190,50,150,25);
        labelusername.setForeground(Color.black);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelusername);
        
        lblPackage = new JLabel("Select Package :");
        lblPackage.setBounds(30,90,150,25);
        lblPackage.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblPackage);
        
        
        cpack = new Choice();
        cpack.add("GOLD PACKAGE");
        cpack.add("SILVER PACKAGE");
        cpack.add("BRONZE PACKAGE");
        cpack.setBounds(190,90,150,25);
        add(cpack);
        
        lblPerson = new JLabel("Total Person : ");
        lblPerson.setBounds(30,130,150,25);
        lblPerson.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblPerson);
        
        tfPerson = new JTextField("1");
        tfPerson.setBounds(190,130,150,25);
        tfPerson.setForeground(Color.black);
        tfPerson.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfPerson);
        
        
        lblid = new JLabel("ID : ");
        lblid.setBounds(30,170,150,25);
        lblid.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblid);
        
        labelid = new JLabel("");
        labelid.setBounds(190,170,150,25);
        labelid.setForeground(Color.black);
        labelid.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelid);
        
        
        lblnumber = new JLabel("Number  : ");
        lblnumber .setBounds(30,210,150,25);
        lblnumber .setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblnumber );
        
        labelNumber  = new JLabel();
        labelNumber .setBounds(190,210,150,25);
        labelNumber .setForeground(Color.black);
        labelNumber .setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelNumber );
        
        
        
        lblphone = new JLabel("Phone: ");
        lblphone.setBounds(30,250,150,25);
        lblphone.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblphone);
        
        labelphone = new JLabel("");
        labelphone.setBounds(190,250,150,25);
        labelphone.setForeground(Color.black);
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelphone);
        
        lblTotal = new JLabel("Total Price : ");
        lblTotal.setBounds(30,290,150,25);
        lblTotal.setFont(new Font("Tahoma",Font.BOLD,14));
        add(lblTotal);
        
        labelPrice = new JLabel("");
        labelPrice.setBounds(190,290,150,25);
        labelPrice.setForeground(Color.black);
        labelPrice.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(labelPrice);
        
        
        try{
            Conn c = new Conn();
            String query = "select * from customer where username ='"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelNumber.setText(rs.getString("number"));
//                labelname.setText(rs.getString("name"));
//                cpack.setText(rs.getString("gender"));
                
                labelphone.setText(rs.getString("phone"));
                labelPrice.setText(rs.getString(""));
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        checkPrice = new JButton("Check Price");
        checkPrice.setBackground(Color.black);
        checkPrice.setForeground(Color.white);
        checkPrice.setBounds(60,380,120,25);
        checkPrice.addActionListener(this);
        add(checkPrice);
        
        
        bookPackage = new JButton("Book Package");
        bookPackage.setBackground(Color.black);
        bookPackage.setForeground(Color.white);
        bookPackage.setBounds(200,380,120,25);
        bookPackage.addActionListener(this);
        add(bookPackage);
        
        
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(350,380,120,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,40,600,330);
        add(image);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkPrice){
            String Pac = cpack.getSelectedItem();
             int cost=0;
            if(Pac.equals("GOLD PACKAGE")){
               cost +=12000;
            }else if(Pac.equals("SILVER PACKAGE")){
                cost +=20000;
            }else{
                cost +=32000;
            }
            
            int person=Integer.parseInt(tfPerson.getText());
            cost*=person;
            labelPrice.setText("BDT ."+cost+"/=");
            
        }else if(ae.getSource()==bookPackage){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpack.getSelectedItem()+"','"+tfPerson.getText()+"','"+labelid.getText()+"','"+labelNumber.getText()+"','"+labelphone.getText()+"','"+labelPrice.getText()+"')");
                
                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                setVisible(false);
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        
        new BookPackage("");
    }
}
