
package travelmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;


public class CheckPackage extends JFrame implements ActionListener{
    
    
    String[] Package1 = {"Gold Package ","6Days & 7 Nights","Airport Assistance","Half day City Tour","Daily Buffet","Soft Drinks free","Full Day 3 Turist Sopt Visit","Turist Guide","Book Now","Summer Spical","BDT. 12,000/=","package1.jpg"};
    String[] Package2 = {"Silver Package","4Days & 5 Nights","Toll free","Entrance free ticket","Meet and Greet At Airport ","Welcome drinks of arraival","Night sufari","Criuse with Diner","Book Now","Winter Spical","BDT. 20,000/=","package2.jpg"};
    String[] Package3 = {"Bronze Package","5Days & 5 Nights","Return AireFare","Free clumbing Horse riding","River Rafting","Hard drink","Daily buffet","BBQ Dinner","Book now","Winter Spical","BDT. 32,000/=","package3.jpg"};
            
    
    JTabbedPane tab;
    JButton back;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    
    CheckPackage(){
        
        setBounds(450,200,900,600);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
        setTitle("Check Package");
//        setLayout(null);
        
        tab = new JTabbedPane();
        JPanel p1 = CreatePackage(Package1);
      
        tab.addTab("Package 1", null,p1);
        
        
        JPanel p2 = CreatePackage(Package2);
        tab.addTab("Package 2", null,p2);
        
        
        JPanel p3 = CreatePackage(Package3);
        tab.addTab("Package 3", null,p3);
        
        add(tab);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public JPanel CreatePackage(String[] Pack){
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
//        p1.setBounds(0,0,1600,60);
        p1.setLayout(null);
        
        
        l1 = new JLabel(Pack[0]);
        l1.setBounds(50,5,300,35);
        l1.setForeground(Color.yellow);
        l1.setFont(new Font("Thoma",Font.BOLD,30));
        p1.add(l1);
        
        
        l2 = new JLabel(Pack[1]);
        l2.setBounds(30,60,300,35);
        l2.setForeground(Color.red);
        l2.setFont(new Font("Thoma",Font.BOLD,20));
        p1.add(l2);
        
        
        l3 = new JLabel(Pack[2]);
        l3.setBounds(30,100,300,35);
        l3.setForeground(Color.GREEN);
        l3.setFont(new Font("Thoma",Font.BOLD,20));
        p1.add(l3);
        
        
        l4 = new JLabel(Pack[3]);
        l4.setBounds(30,140,300,35);
        l4.setForeground(Color.red);
        l4.setFont(new Font("Thoma",Font.BOLD,20));
        p1.add(l4);
        
        
        l5 = new JLabel(Pack[4]);
        l5.setBounds(30,180,300,35);
        l5.setForeground(Color.GREEN);
        l5.setFont(new Font("Thoma",Font.BOLD,20));
        p1.add(l5);
        
        
        l6 = new JLabel(Pack[5]);
        l6.setBounds(30,220,300,35);
        l6.setForeground(Color.red);
        l6.setFont(new Font("Thoma",Font.BOLD,20));
        p1.add(l6);
        
        
        l7 = new JLabel(Pack[6]);
        l7.setBounds(30,260,300,35);
        l7.setForeground(Color.green);
        l7.setFont(new Font("Thoma",Font.BOLD,20));
        p1.add(l7);
        
        
        l8 = new JLabel(Pack[7]);
        l8.setBounds(30,300,300,35);
        l8.setForeground(Color.red);
        l8.setFont(new Font("Thoma",Font.BOLD,20));
        p1.add(l8);
        
        l9 = new JLabel(Pack[8]);
        l9.setBounds(60,430,300,35);
        l9.setForeground(Color.blue);
        l9.setFont(new Font("Thoma",Font.BOLD,30));
        p1.add(l9);
        
        
        l10 = new JLabel(Pack[9]);
        l10.setBounds(80,480,300,35);
        l10.setForeground(Color.green);
        l10.setFont(new Font("Thoma",Font.BOLD,30));
        p1.add(l10);
        
        
        l11 = new JLabel(Pack[10]);
        l11.setBounds(500,480,300,35);
        l11.setForeground(Color.green);
        l11.setFont(new Font("Thoma",Font.BOLD,30));
        p1.add(l11);
        
        back = new JButton("Back");
        back.setBounds(600,380,100,25);
        back.setBackground(new Color(0,0,0));
        back.setForeground(Color.white);
        back.setBorder(new LineBorder(new Color(0,0,0)));
        back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+Pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350,40,500,300);
        add(l12);
        
        return p1;
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new CheckPackage();
    }
}
