
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;


public class ViewBookedHotel extends JFrame implements ActionListener{
    
    JButton back;
    JLabel text, lblusername, lbldays,labeldays, lblroomtype, labelroomtype,lblfood,labelfood, lblid, lblHotel,labelhotelname, lblnumber, lblTotal, lblPerson,labelPerson, lblphone, labelusername, labelid, labelphone, labelPrice, labelNumber;
    
    
    ViewBookedHotel( String username){
        setBounds(200,100,900,600);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
        setTitle("View Book Hotel");
        setLayout(null);
        
        text  = new JLabel("View Book Hotel Details");
        text.setBounds(300,0,300,30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setForeground(Color.black);
        add(text);
        
        lblusername = new JLabel("UserName : ");
        lblusername.setBounds(30, 50, 150, 25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblusername);

        labelusername = new JLabel("");
        labelusername.setBounds(190, 50, 150, 25);
        labelusername.setForeground(Color.black);
        labelusername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labelusername);

        lblHotel = new JLabel("Hotel Name :");
        lblHotel.setBounds(30, 90, 150, 25);
        lblHotel.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblHotel);
        
        labelhotelname = new JLabel("");
        labelhotelname.setBounds(190, 90, 150, 25);
        labelhotelname.setForeground(Color.black);
        labelhotelname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labelhotelname);
        
        
        lblPerson = new JLabel("Total Person : ");
        lblPerson.setBounds(30, 130, 150, 25);
        lblPerson.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblPerson);

        labelPerson = new JLabel("");
        labelPerson.setBounds(190, 130, 150, 25);
        labelPerson.setForeground(Color.black);
        labelPerson.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labelPerson);

        lbldays = new JLabel("No.OF Days : ");
        lbldays.setBounds(30, 170, 150, 25);
        lbldays.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbldays);

        labeldays = new JLabel("");
        labeldays.setBounds(190, 170, 150, 25);
        labeldays.setForeground(Color.black);
        labeldays.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labeldays);

        lblroomtype = new JLabel("Ac/no-Ac Room : ");
        lblroomtype.setBounds(30, 210, 150, 25);
        lblroomtype.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblroomtype);

        labelroomtype = new JLabel("");
        labelroomtype.setBounds(190, 210, 150, 25);
        labelroomtype.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labelroomtype);

        lblfood = new JLabel("Food Include : ");
        lblfood.setBounds(30, 250, 150, 25);
        lblfood.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblfood);

        labelfood = new JLabel("");
        labelfood.setBounds(190, 250, 150, 25);
        labelfood.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labelfood);

        lblid = new JLabel("ID : ");
        lblid.setBounds(30, 340, 150, 25);
        lblid.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblid);

        labelid = new JLabel("");
        labelid.setBounds(190, 340, 150, 25);
        labelid.setForeground(Color.black);
        labelid.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labelid);

        lblnumber = new JLabel("Number  : ");
        lblnumber.setBounds(30, 370, 150, 25);
        lblnumber.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblnumber);

        labelNumber = new JLabel("");
        labelNumber.setBounds(190, 370, 150, 25);
        labelNumber.setForeground(Color.black);
        labelNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labelNumber);

        lblphone = new JLabel("Phone: ");
        lblphone.setBounds(30, 410, 150, 25);
        lblphone.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblphone);

        labelphone = new JLabel("");
        labelphone.setBounds(190, 410, 150, 25);
        labelphone.setForeground(Color.black);
        labelphone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labelphone);

        lblTotal = new JLabel("Total Price : ");
        lblTotal.setBounds(30, 460, 150, 25);
        lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblTotal);

        labelPrice = new JLabel("");
        labelPrice.setBounds(190, 460, 150, 25);
        labelPrice.setForeground(Color.black);
        labelPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(labelPrice);
        

        
        back = new JButton("Back");
        back.setBounds(80,490,100,25);
        back.setBackground(new Color(0,0,0));
        back.setForeground(Color.white);
        back.setBorder(new LineBorder(new Color(0,0,0)));
        back.addActionListener(this);
        add(back);
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewbook.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,40,450,500);
        
        add(image);
        
        try{
            Conn c = new Conn();
            String query = "select * from bookhotel where username ='"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelhotelname.setText(rs.getString("hotelname"));
                labelPerson.setText(rs.getString("totalperson"));
                labeldays.setText(rs.getString("noOfDays"));
                labelroomtype.setText(rs.getString("roomtype"));
                labelfood.setText(rs.getString("foodincluded"));
                labelid.setText(rs.getString("id"));
                labelNumber.setText(rs.getString("number"));
                labelPrice.setText(rs.getString("totalprice"));
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
        new ViewBookedHotel("");
    }
}
