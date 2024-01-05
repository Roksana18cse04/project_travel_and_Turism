package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener {

    JLabel text, lblusername, lbldays, lblroomtype, lblfood, lblid, lblHotel, lblnumber, lblTotal, lblPerson, lblphone, labelusername, labelid, labelphone, labelPrice, labelNumber;
    Choice cHotel, cAc, cfood;

    JTextField tfPerson, tfdays, tffood;
    JButton checkPrice, bookHotel, back;
    String username;

    BookHotel(String username) {

        this.username = username;

        setBounds(200, 100, 800, 600);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
        setTitle("Book Hotel");
        setLayout(null);

        text = new JLabel("BOOK HOTEL");
        text.setBounds(400, 10, 200, 30);
        text.setFont(new Font("Thoma", Font.BOLD, 20));
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

        lblHotel = new JLabel("Select Hotel :");
        lblHotel.setBounds(30, 90, 150, 25);
        lblHotel.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblHotel);

        cHotel = new Choice();
        cHotel.setBounds(190, 90, 150, 25);
        add(cHotel);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");

            while (rs.next()) {

                cHotel.add(rs.getString("name"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        lblPerson = new JLabel("Total Person : ");
        lblPerson.setBounds(30, 130, 150, 25);
        lblPerson.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblPerson);

        tfPerson = new JTextField("1");
        tfPerson.setBounds(190, 130, 150, 25);
        tfPerson.setForeground(Color.black);
        tfPerson.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(tfPerson);

        lbldays = new JLabel("No.OF Days : ");
        lbldays.setBounds(30, 170, 150, 25);
        lbldays.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbldays);

        tfdays = new JTextField("");
        tfdays.setBounds(190, 170, 150, 25);
        tfdays.setForeground(Color.black);
        tfdays.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(tfdays);

        lblroomtype = new JLabel("Ac/no-Ac Room : ");
        lblroomtype.setBounds(30, 210, 150, 25);
        lblroomtype.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblroomtype);

        cAc = new Choice();
        cAc.setBounds(190, 210, 150, 25);
        cAc.add("AC");
        cAc.add("Non-AC");
        add(cAc);

        lblfood = new JLabel("Food Include : ");
        lblfood.setBounds(30, 250, 150, 25);
        lblfood.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblfood);

        cfood = new Choice();
        cfood.setBounds(190, 250, 150, 25);
        cfood.add("Yes");
        cfood.add("No");
        add(cfood);

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

        try {
            Conn c = new Conn();
            String query = "select * from customer where username ='" + username + "'";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelNumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
//                labelPrice.setText(rs.getString(""));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        checkPrice = new JButton("Check Price");
        checkPrice.setBackground(Color.black);
        checkPrice.setForeground(Color.white);
        checkPrice.setBounds(30, 520, 110, 25);
        checkPrice.addActionListener(this);
        add(checkPrice);

        bookHotel = new JButton("Book Hotel");
        bookHotel.setBackground(Color.black);
        bookHotel.setForeground(Color.white);
        bookHotel.setBounds(160, 520, 120, 25);
        bookHotel.addActionListener(this);
        add(bookHotel);

        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(300, 520, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(430, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(390, 40, 430, 300);
        add(image);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == checkPrice) {
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel where name ='"+cHotel.getSelectedItem()+"'");
                
                while(rs.next()){
                    int cost =Integer.parseInt(rs.getString("costPerPerson"));
                    int ac =Integer.parseInt(rs.getString("acroom"));
                    int food =Integer.parseInt(rs.getString("foodincluded"));
                    
                    
                    
                    int person =Integer.parseInt(tfPerson.getText());
                    int days =Integer.parseInt(tfdays.getText());
                    
                    String acselected = cAc.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();
                    if(person*days>0){
                        int total =0;
                        
                        total +=acselected.equals("AC")?ac:0;
                        total +=foodselected.equals("Yes")?food:0;
                        
                        total +=cost;
                        total = total*person*days;
                        labelPrice.setText("BDT."+total+"/=");
                    }else{
                        JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
                    }
                    
                }
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == bookHotel) {
            try {
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel values('" + labelusername.getText() + "','" + cHotel.getSelectedItem() + "','" + tfPerson.getText() + "','" + tfdays.getText() + "','" + cAc.getSelectedItem() + "','" + cfood.getSelectedItem() + "','" + labelid.getText() + "','" + labelNumber.getText() + "','" + labelphone.getText() + "','" + labelPrice.getText() + "')");

                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {

        new BookHotel("");
    }
}
