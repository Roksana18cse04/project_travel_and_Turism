
package travelmanagementsystem;

import java.awt.*;
import javax.swing.*;


public class Loading extends JFrame implements Runnable{
    Thread thread;
    JProgressBar bar;
    String username;
    
    Loading(String username){
        
        this.username=username;
        thread = new Thread(this);
        
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.white);
        setTitle("Loading..");
        setLayout(null);
        
        
        JLabel text = new JLabel("Travel and Turism Application");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Railway",Font.BOLD,35));
        add(text);
        
        
        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        
        JLabel loading = new JLabel("Loading,Please wait...");
        loading.setBounds(200,140,200,30);
        loading.setForeground(Color.ORANGE);
        loading.setFont(new Font("Railway",Font.BOLD,16));
        add(loading);
        
        
        
        JLabel lblusername = new JLabel("Wel-Come,"+username);
        lblusername.setBounds(50,200,400,40);
        lblusername.setForeground(Color.GREEN);
        lblusername.setFont(new Font("Railway",Font.BOLD,35));
        add(lblusername);
        
        thread.start();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int max =bar.getMaximum();//100
                int value = bar.getValue();
                
                if(value<max){
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                    //new class object
                    new DashBoard(username);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Loading("");
    }
}
