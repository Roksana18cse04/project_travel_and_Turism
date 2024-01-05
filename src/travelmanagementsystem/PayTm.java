
package travelmanagementsystem;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;



public class PayTm extends JFrame implements ActionListener{
    
    JEditorPane pane;
    JButton back;
    PayTm(){
        setBounds(500,200,800,600);
        
        
        pane = new JEditorPane();
        pane.setEditable(false);
        try{
            pane.setPage("https://nagad.com.bd");
        }catch(Exception e){
            pane.setContentType("text/html");
            pane.setText("<html>could not load,Error 404</html>");
        }
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        
        
        back = new JButton("Back");
        back.setBounds(620,10,80,40);
        back.setBackground( Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        pane.add(back);
        
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            
        
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args) {
        new PayTm();
    }
}
