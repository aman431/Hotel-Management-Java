
package hotel_billing;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Hotel_Billing {

    public String s;
    private final JFrame frame;
    private final JPanel panel;
    private final JPanel panel1;
    private final JPanel panel2;
    private  JPanel panel3;
    private Container cpane;
    private final JButton b1;
    private final JButton b2;
    private final JLabel l0;
    private final JLabel l1;
    private final JLabel l2;
    private final JLabel l3;
    private final  JLabel label;
    private final JTextField e1;
    private final JTextField e2;
    
    
    public Hotel_Billing()
    {
        frame = new JFrame("Login Form");
        cpane = new Container();
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        l0 = new JLabel();
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        e1 = new JTextField();
        e2 = new JPasswordField();
        b1 = new JButton();
        b2 = new JButton();
       label = new JLabel();
    }
    
    public void LaunchFrame() 
    {  
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,300));
        frame.setLocation(200,200);
        frame.setBackground(Color.BLUE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        
       
        cpane = frame.getContentPane();
        cpane.setLayout(new FlowLayout());
        cpane.setBackground(Color.BLACK);
        cpane.setPreferredSize(new Dimension(500,500));
        cpane.add(panel);
        cpane.add(panel1);
        
        panel.setPreferredSize(new Dimension(500,30));
        panel.setBackground(Color.BLACK);
        panel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        panel.setLayout(new FlowLayout());
        panel.add(l0);
        
        
        panel1.setPreferredSize(new Dimension(500,250));
        panel1.setBackground(Color.BLACK);
        panel1.setLayout(null);
       
        panel1.add(l1);
        panel1.add(l2);
        panel1.add(e1);
        panel1.add(e2);
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(label);
       
        
        ImageIcon i = new ImageIcon(new ImageIcon("A3.png").getImage().getScaledInstance(145, 145, Image.SCALE_DEFAULT));
        label.setIcon(i);
        label.contains(0, 100);
        label.setBounds(10,50,135,180);

       
        
        panel2.setPreferredSize(new Dimension(500,300));
        panel2.setBackground(Color.BLUE);
        panel2.add(l3);
        
        
        l0.setText("LOGIN SYSTEM");
        l0.setFont(new Font("Sans Serif", Font.ROMAN_BASELINE,20));
        l0.setForeground(Color.BLUE);
        
        l1.setText("Username ");
        l1.setFont(new Font("Sans Serif ", Font.ROMAN_BASELINE,15));
        l1.setForeground(Color.WHITE);
        l1.setBounds(200,50,100,30);
       
        l2.setText("Password ");
        l2.setFont(new Font("Sans Serif", Font.ROMAN_BASELINE , 15));
        l2.setForeground(Color.WHITE);
        l2.setBounds(200,100,80,30);
        
        e1.setBounds(300,50,150,30);
        e1.setFont(new Font("Sans Serif", Font.CENTER_BASELINE,12));

        e2.setBounds(300,100,150,30);
        e2.setFont(new Font("Sans Serif", Font.CENTER_BASELINE,12));
        
        b1.setText("Login");
        b1.setMnemonic('L');
        ImageIcon i1 = new ImageIcon(new ImageIcon("A9.jpg").getImage().getScaledInstance(25,25, Image.SCALE_DEFAULT));
        b1.setIcon(i1);
        b1.setAlignmentX(0);
        b1.setBackground(Color.BLACK);
        b1.setBorder(new RoundedBorder(25));
        b1.setForeground(Color.WHITE);
        b1.setBounds(200,170,120,40);
        
        b2.setText("Cancel");
        b2.setMnemonic('C');
        ImageIcon i2 = new ImageIcon(new ImageIcon("A7.jpg").getImage().getScaledInstance(25,25, Image.SCALE_DEFAULT));
        b2.setHorizontalAlignment(SwingConstants.LEFT);
        b2.setIcon(i2);
        b2.setForeground(Color.WHITE);
        b2.setBorder(BorderFactory.createLineBorder(Color.GRAY,3));
        b2.setBorder(new RoundedBorder(25));
        b2.setBackground(Color.BLACK);
        b2.setBounds(350,170,130,40);
        
        b1.addActionListener((ActionEvent ae) -> {         
            try {
                Database d = new Database();
                   String ans =  e1.getText();
                    String ans1 = e2.getText();                  
                    String q = "select * from login where name = ? and password = ?" ;
                    PreparedStatement stmt2 = d.c.prepareStatement(q);  
                    stmt2.setString(1, ans);
                    stmt2.setString(2, ans1);
                    ResultSet rs = stmt2.executeQuery();
            
            if(rs.next()) {
                frame.dispose();
                Introduction z= new Introduction();
                z.launch();
            }
            else
            {
                if(ans.isEmpty() && ans1.isEmpty())
                {
                int x=JOptionPane.showConfirmDialog(cpane,"Username and Password is Empty:","Query",JOptionPane.YES_OPTION); 
                 if(x==JOptionPane.YES_OPTION)
                 {               
                  e1.setText("");
                  e2.setText("");            
                 }
                 else
                 {
                    frame.dispose();
                 }
                }
                if(ans.length()>1)
                {
                    if(!ans.equals("aman"))
                    {
                        int x=JOptionPane.showConfirmDialog(cpane,"Username is wrong: You like to continue","Query",JOptionPane.YES_OPTION);
                        if(x==JOptionPane.YES_OPTION)
                        {
                            e1.setText("");
                            e2.setText("");
                        }
                        else
                        {
                            frame.dispose();
                        }
                    }
                }
                if(ans1.length()>1){
                    if(!ans1.equals("123"))
                    {
                        int x=JOptionPane.showConfirmDialog(cpane,"Password is wrong: You like to continue","Query",JOptionPane.YES_OPTION);
                        if(x==JOptionPane.YES_OPTION)
                        {
                            e1.setText("");
                            e2.setText("");            
                        }
                        else
                        {
                            frame.dispose();
                        }
                    }
                }
            
            }
            }
            catch(Exception e)
            {
                System.err.println(e);
            }
         
        });        
        b1.addKeyListener(new KeyAdapter()
                {
                    @Override
                    public void keyPressed(KeyEvent ae)
                    {
                        if(ae.getKeyCode()==KeyEvent.VK_ENTER)
                        {
                                                         
                    }
                    }
                });
        
        e1.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   e2.requestFocus();
                }
            }
        });
        
        e2.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {           
                if(ae.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    try
                    {
                    String ans = e1.getText();
                    String ans1 = e2.getText();
                    Database d = new Database();
                    String q = "select * from login where name = ? and password = ?" ;
                    PreparedStatement stmt2 = d.c.prepareStatement(q);  
                    stmt2.setString(1, ans);
                    stmt2.setString(2, ans1);
                    ResultSet rs = stmt2.executeQuery();          
                    if(rs.next()) {
                      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                      frame.dispose();
                      Introduction z = new Introduction();
                      z.launch();
                }
            else
            {
                if(!ans.equals("aman"))
                {
                int x=JOptionPane.showConfirmDialog(cpane," Username is Wrong: Do you want to Continue","Query",JOptionPane.YES_OPTION);
                if(x==JOptionPane.YES_OPTION)
                {
                frame.setVisible(true);
                e1.setText("");
                e2.setText("");
                }
                else if(x==JOptionPane.NO_OPTION)
                {
                    frame.dispose();
                }
                }
                else
                {
                int x=JOptionPane.showConfirmDialog(cpane,"Password is Wrong: Do you want to Continue","Query",JOptionPane.YES_OPTION);
                if(x==JOptionPane.YES_OPTION)
                {
                frame.setVisible(true);
                e1.setText("");
                e2.setText("");
                }
                else if(x==JOptionPane.NO_OPTION)
                {
                    frame.dispose();
                }
                }
            }
                    }
                    catch(Exception e)
                    {
                        System.err.println(e);
                    }
                }
            }
         
        });
        
        
        b2.addActionListener((ActionEvent ae) -> {
            frame.dispose();
        });
     
    }   
    public static void main(String[] args) throws IOException {
        Hotel_Billing b1 = new Hotel_Billing();
        b1.LaunchFrame();
    }
    
}
