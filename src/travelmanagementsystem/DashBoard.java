
package travelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;



public class DashBoard extends JFrame implements ActionListener{
    JButton AddPersonDetails,UpdatePersonDetails,ViewPersonDetails,DeletePersonDetails,CheckPackage,BookPackage,ViewPackage,ViewHotels ,BookHotel,ViewBookedHotel,Destination,Calculator,Payment,NotePad,About;
    String username;
    
    DashBoard(String username){
//        setBounds(0,0,1600,1000);

        
        this.username=username;
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
        setTitle("DashBoard");
        setLayout(null);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0,0,0));
        p1.setBounds(0,0,1600,60);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/DashBoard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        
        JLabel Heading = new JLabel("DASHBOARD");
        Heading.setBounds(80,10,300,40);
        Heading.setForeground(Color.WHITE);
        Heading.setFont(new Font("Railway",Font.BOLD,35));
        p1.add(Heading);
        
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(0,153,0));
        p2.setBounds(0,60,300,900);
        p2.setLayout(null);
        add(p2);
        
        AddPersonDetails = new JButton("Add Person Details");
        AddPersonDetails.setBackground(new Color(0,153,0));
        AddPersonDetails.setForeground(Color.BLACK);
        AddPersonDetails.setBounds(0,0,300,50);
        AddPersonDetails.setFont(new Font("Thoma",Font.PLAIN,20));
        AddPersonDetails.setMargin(new Insets(0,0,0,60));
//        AddPersonDetails.setBorder(new LineBorder(new Color(0,153,0)));
        AddPersonDetails.addActionListener(this);
        p2.add(AddPersonDetails);
        
        
        
        UpdatePersonDetails = new JButton("Update Person Details");
        UpdatePersonDetails.setBackground(new Color(0,153,0));
        UpdatePersonDetails.setForeground(Color.BLACK);
        UpdatePersonDetails.setBounds(0,50,300,50);
        UpdatePersonDetails.setFont(new Font("Thoma",Font.PLAIN,20));
        UpdatePersonDetails.setMargin(new Insets(0,0,0,30));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        UpdatePersonDetails.addActionListener(this);
        p2.add(UpdatePersonDetails);
        
        
        
        
        ViewPersonDetails = new JButton("View Person Details");
        ViewPersonDetails.setBackground(new Color(0,153,0));
        ViewPersonDetails.setForeground(Color.BLACK);
        ViewPersonDetails.setBounds(0,100,300,50);
        ViewPersonDetails.setFont(new Font("Thoma",Font.PLAIN,20));
        ViewPersonDetails.setMargin(new Insets(0,0,0,50));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        ViewPersonDetails.addActionListener(this);
        p2.add(ViewPersonDetails);
        
        
         
        DeletePersonDetails = new JButton("Delete Person Details");
        DeletePersonDetails.setBackground(new Color(0,153,0));
        DeletePersonDetails.setForeground(Color.BLACK);
        DeletePersonDetails.setBounds(0,150,300,50);
        DeletePersonDetails.setFont(new Font("Thoma",Font.PLAIN,20));
        DeletePersonDetails.setMargin(new Insets(0,0,0,40));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        DeletePersonDetails.addActionListener(this);
        p2.add(DeletePersonDetails);
        
        
        
        CheckPackage = new JButton("Check Package");
        CheckPackage.setBackground(new Color(0,153,0));
        CheckPackage.setForeground(Color.BLACK);
        CheckPackage.setBounds(0,200,300,50);
        CheckPackage.setFont(new Font("Thoma",Font.PLAIN,20));
        CheckPackage.setMargin(new Insets(0,0,0,90));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        CheckPackage.addActionListener(this);
        p2.add(CheckPackage);
        
        
        
        BookPackage = new JButton("Book Package");
        BookPackage.setBackground(new Color(0,153,0));
        BookPackage.setForeground(Color.BLACK);
        BookPackage.setBounds(0,250,300,50);
        BookPackage.setFont(new Font("Thoma",Font.PLAIN,20));
        BookPackage.setMargin(new Insets(0,0,0,100));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        BookPackage.addActionListener(this);
        p2.add(BookPackage);
        
        
        ViewPackage = new JButton("View Package");
        ViewPackage.setBackground(new Color(0,153,0));
        ViewPackage.setForeground(Color.BLACK);
        ViewPackage.setBounds(0,300,300,50);
        ViewPackage.setFont(new Font("Thoma",Font.PLAIN,20));
        ViewPackage.setMargin(new Insets(0,0,0,100));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        ViewPackage.addActionListener(this);
        p2.add(ViewPackage);
        
        
        ViewHotels = new JButton("View Hotels ");
        ViewHotels.setBackground(new Color(0,153,0));
        ViewHotels.setForeground(Color.BLACK);
        ViewHotels.setBounds(0,350,300,50);
        ViewHotels.setFont(new Font("Thoma",Font.PLAIN,20));
        ViewHotels.setMargin(new Insets(0,0,0,110));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        ViewHotels.addActionListener(this);
        p2.add(ViewHotels);
        
        
        
        BookHotel = new JButton("Book Hotel");
        BookHotel.setBackground(new Color(0,153,0));
        BookHotel.setForeground(Color.BLACK);
        BookHotel.setBounds(0,400,300,50);
        BookHotel.setFont(new Font("Thoma",Font.PLAIN,20));
        BookHotel.setMargin(new Insets(0,0,0,120));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        BookHotel.addActionListener(this);
        p2.add(BookHotel);
        
        
        ViewBookedHotel = new JButton("View Booked Hotels");
        ViewBookedHotel.setBackground(new Color(0,153,0));
        ViewBookedHotel.setForeground(Color.BLACK);
        ViewBookedHotel.setBounds(0,450,300,50);
        ViewBookedHotel.setFont(new Font("Thoma",Font.PLAIN,20));
        ViewBookedHotel.setMargin(new Insets(0,0,0,40));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        ViewBookedHotel.addActionListener(this);
        p2.add(ViewBookedHotel);
        

        
        Destination = new JButton("Destination");
        Destination.setBackground(new Color(0,153,0));
        Destination.setForeground(Color.BLACK);
        Destination.setBounds(0,500,300,50);
        Destination.setFont(new Font("Thoma",Font.PLAIN,20));
        Destination.setMargin(new Insets(0,0,0,130));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        Destination.addActionListener(this);
        p2.add(Destination);
        
        
        
        
        
        Payment = new JButton("Payment Option");
        Payment.setBackground(new Color(0,153,0));
        Payment.setForeground(Color.BLACK);
        Payment.setBounds(0,550,300,50);
        Payment.setFont(new Font("Thoma",Font.PLAIN,20));
        Payment.setMargin(new Insets(0,0,0,90));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        Payment.addActionListener(this);
        p2.add(Payment);
        
        
        
        Calculator= new JButton("Calculator");
        Calculator.setBackground(new Color(0,153,0));
        Calculator.setForeground(Color.BLACK);
        Calculator.setBounds(0,600,300,50);
        Calculator.setFont(new Font("Thoma",Font.PLAIN,20));
        Calculator.setMargin(new Insets(0,0,0,140));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        Calculator.addActionListener(this);
        p2.add(Calculator);
        
        NotePad = new JButton("NotePad");
        NotePad.setBackground(new Color(0,153,0));
        NotePad.setForeground(Color.BLACK);
        NotePad.setBounds(0,650,300,50);
        NotePad.setFont(new Font("Thoma",Font.PLAIN,20));
        NotePad.setMargin(new Insets(0,0,0,150));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        NotePad.addActionListener(this);
        p2.add(NotePad);
        
        
        About = new JButton("About");
        About.setBackground(new Color(0,153,0));
        About.setForeground(Color.BLACK);
        About.setBounds(0,700,300,50);
        About.setFont(new Font("Thoma",Font.PLAIN,20));
        About.setMargin(new Insets(0,0,0,160));
//        AddPersonDetails.setBorder(new LineBorder(new Color(131,193,233)));
        About.addActionListener(this);
        p2.add(About);
        
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 =new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        
        JLabel text = new JLabel("Travel And Turisom Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(new Color(102,0,51));
        text.setFont(new Font("Railway",Font.BOLD,55));
        image.add(text);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==AddPersonDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==UpdatePersonDetails){
            //new class  object
            new UpdateCustomer(username);
        }else if(ae.getSource()==ViewPersonDetails){
            new ViewCustomer(username);
        }else if(ae.getSource()==DeletePersonDetails){
            //new class  object
        }else if(ae.getSource()==CheckPackage){
            //new class  object
            new CheckPackage();
        }else if(ae.getSource()==BookPackage){
            //new class  object
            new BookPackage(username);
        }else if(ae.getSource()==ViewPackage){
            //new class  object
            new ViewPackage(username);
        }else if(ae.getSource()==ViewHotels){
            //new class  object
            new CheckHotels();
        }else if(ae.getSource()==BookHotel){
            //new class  object
            new BookHotel(username);
        }else if(ae.getSource()==ViewBookedHotel){
            //new class  object
            new ViewBookedHotel(username);
        }else if(ae.getSource()==Destination){
            //new class  object
            new Destination();
        }else if(ae.getSource()==Payment){
            //new class  object
            new Payment();
        }else if(ae.getSource()==Calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e){
                e.printStackTrace();
            }
            //new class  object
        }else if(ae.getSource()==NotePad){
            //new class  object
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            //new object Class
            new About();
        }
    }
    
    public static void main(String[] args) {
        new DashBoard("");
    }
}
