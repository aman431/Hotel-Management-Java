
package hotel_billing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class frame2 {
    
    public double result,ans,total,a12,e11,t;
    public int cnt=1,i=0,j=0;
    public JFrame frame;
    public Container contentpane;
    public JPanel panel;
    public JPanel panel1;
    public JPanel panel2;
    public JPanel panel3;
    public JPanel panel4;
    public JPanel panel5;
    public JPanel panel6;
    // Meals
    public JComboBox box;
    public JLabel l0;
    public JLabel l1;
    public JLabel l2;
    public JLabel l3;
    public JLabel l4;
    public JLabel l5;
    public JLabel l6;
     
    public JTextField e1;
    public JTextField e2;
    public JTextField e3;
    public JTextField e4;
    public JTextField e5;
    public JTextField e6;
    
    //Total 
    public JLabel ll1;
    public JLabel ll2;
    public JLabel ll3;
    
    public JTextField ee1;
    public JTextField ee2;
    public JTextField ee3;
    
    //Button
    public final JButton b1;
    public final JButton b2;
    public final JButton b3;
    public final JButton b4;
    
    //Recipt
    private final JLabel RL1;
    private final JLabel RL2;
    private final JLabel RL3;
    private final JLabel RL4;
    private final JLabel RL5;
    private final JLabel RL6;
    private final JLabel RL7;
    private final JLabel RL8;
    private final JLabel RL9;
    private final JLabel RL10;
    private final JLabel RL11;
    private final JLabel RL12;
    //Drink 
    public JLabel Dl0;
    public JLabel Dl1;
    public JLabel Dl2;
    public JLabel Dl3;
    public JLabel Dl4;
    public JLabel Dl5;
    
    public JTextField De0;
    public JTextField De1;
    public JTextField De2;
    public JTextField De3;
    public JTextField De4;
    public JTextField De5;
    
    public JLabel DDl1;
    public JLabel DDl2;
    public JLabel DDl3;
    
    public JTextField DDe1;
    public JTextField DDe2;
    public JTextField DDe3;
    
   public frame2()
   {
       frame = new JFrame("Hotel Management");
       contentpane = new Container();
       panel = new JPanel();
       panel1 = new JPanel();
       panel2 = new JPanel();
       panel3 = new JPanel();
       panel4 = new JPanel();
       panel5 = new JPanel();
       panel6 = new JPanel();
       
       l0 = new JLabel();
       l1 = new JLabel();
       l2 = new JLabel();
       l3 = new JLabel();
       l4 = new JLabel();
       l5 = new JLabel();
       l6 = new JLabel();
       
       e1 = new JTextField();
       e2 = new JTextField();
       e3 = new JTextField();
       e4 = new JTextField();
       e5 = new JTextField();
       e6 = new JTextField();
       
       ll1 = new JLabel();
       ll2 = new JLabel();
       ll3 = new JLabel();
       
       ee1 = new JTextField();
       ee2 = new JTextField();
       ee3 = new JTextField();
       
       b1 = new JButton("Total");
       b2 = new JButton("Receipt");
       b3 = new JButton("Reset");
       b4 = new JButton("Exit");
       
       //Receipt      
       RL1 = new JLabel();
       RL2 = new JLabel();
       RL3 = new JLabel();
       RL4 = new JLabel();
       RL5 = new JLabel();
       RL6 = new JLabel();
       RL7 = new JLabel();
       RL8 = new JLabel();
       RL9 = new JLabel();
       RL10 = new JLabel();
       RL11 = new JLabel();
       RL12 = new JLabel();
       //RL13= new JLabel();
       
       //Drink
       Dl0 = new JLabel();
       Dl1 = new JLabel();
       Dl2 = new JLabel();
       Dl3 = new JLabel();
       Dl4 = new JLabel();
       Dl5 = new JLabel();
       //Dl6 = new JLabel();
       
       De0 = new JTextField();
       De1 = new JTextField();
       De2 = new JTextField();
       De3 = new JTextField();
       De4 = new JTextField();
       De5 = new JTextField();
       
       DDl1 = new JLabel();
       DDl2 = new JLabel();
       DDl3 = new JLabel();
       
       DDe1 = new JTextField();
       DDe2 = new JTextField();
       DDe3 = new JTextField();
       
   }
       
       public void launch() throws InterruptedException
       {
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.setPreferredSize(new Dimension(1200,1200));
       //frame.setVisible(true);
       frame.setLocation(0,0);
       frame.pack();
       frame.setVisible(true);
       
       contentpane =  frame.getContentPane();
       contentpane.setBackground(Color.gray);
       contentpane.setLayout(null);
       contentpane.add(panel);
       contentpane.add(panel1);
       contentpane.add(panel2);
       contentpane.add(panel3);
       contentpane.add(panel4);
       contentpane.add(panel5);
       contentpane.add(panel6);
       
       
       panel.setBackground(Color.BLACK);
       //panel.setPreferredSize(new Dimension(1000,40));
       panel.setBounds(0,0,1100,50);
       panel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
       panel.setLayout(new FlowLayout());
       panel.add(l0);
        
//       String[] ans4 = {" ","Aman","Rahul","Abhishek","Futurejis"};
//       Scanner sc = new Scanner(System.in);
//       String n = sc.nextLine(); 
       String[] ans4 = {"Select Extra Dish","aman","rahul","Abhishek","futurejis"};
       JComboBox aman = new JComboBox<>(ans4);
       aman.setBounds(7,160,180,20);
       
       //panel1.setPreferredSize(new Dimension(100,50));
       panel1.setBounds(0,65,300,200);
       panel1.setLayout(null);
       panel1.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
       panel1.setBackground(Color.WHITE);
       panel1.add(l1);
       panel1.add(l2);
       panel1.add(l3);
       panel1.add(l4);
       panel1.add(l5);
       panel1.add(l6);
       panel1.add(aman);
       panel1.add(e1);
       panel1.add(e2);
       panel1.add(e3);
       panel1.add(e4);
       panel1.add(e5);
       panel1.add(e6);
       
       
       l0.setText("Restaurant Management System");
       l0.setBounds(0,0,1000,50);
       l0.setForeground(Color.WHITE);
       l0.setFont(new Font("Sans Serif", Font.BOLD,24));
         
       l1.setText("Meals");
       l1.setBounds(50,0,80,30);
       l1.setForeground(Color.BLACK);
       l1.setFont(new Font("Sans Serif",Font.BOLD,18));
       
       l2.setText("Filet-O-Fish");
       l2.setBounds(7,25,100,30);
       l2.setForeground(Color.BLACK);
       l2.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       l3.setText("Chicken Burger");
       l3.setBounds(7,50,125,30);
       l3.setForeground(Color.BLACK);
       l3.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       l4.setText("Chicken legend");
       l4.setBounds(7,75,125,30);
       l4.setForeground(Color.BLACK);
       l4.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       l5.setText("Chicken Burger Meal");
       l5.setBounds(7,100,150,30);
       l5.setForeground(Color.BLACK);
       l5.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       l6.setText("Bacon and Cheese Burger");
       l6.setBounds(7,125,200,30);
       l6.setForeground(Color.BLACK);
       l6.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
      
       
       e1.setBounds(250,25,45,20);
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
       e2.setBounds(250,50,45,20);
       e2.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   e3.requestFocus();
                }
            }
        });
       e3.setBounds(250,75,45,20);
       e3.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   e4.requestFocus();
                }
            }
        });
       e4.setBounds(250,100,45,20);
       e4.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   e5.requestFocus();
                }
            }
        });
       e5.setBounds(250,125,45,20);
       e5.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   e6.requestFocus();
                }
            }
        });
       e6.setBounds(250,160,45,20); 
       e6.addKeyListener(new KeyAdapter()
       {
           @Override
           public void keyPressed(KeyEvent ae)
           {
               if(ae.getKeyCode() == KeyEvent.VK_ENTER)
               {
               De0.requestFocus();
               }
           }
       });
          
       panel2.setBounds(0,275,300,100);
       panel2.setLayout(null);
       panel2.setBackground(Color.WHITE);
       panel2.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
       panel2.add(ll1);
       panel2.add(ll2);
       panel2.add(ll3);
       panel2.add(ee1);
       panel2.add(ee2);
       panel2.add(ee3);
       
       ll1.setBounds(7,7,100,20);
       ll1.setText("Cost of Meal");
       ll1.setForeground(Color.BLACK);
       ll1.setFont(new Font("Sans Serifs",Font.CENTER_BASELINE,12));
       
       ll2.setBounds(7,28,100,20);
       ll2.setText("Cost of Drink");
       ll2.setForeground(Color.BLACK);
       ll2.setFont(new Font("Sans Serifs",Font.CENTER_BASELINE,12));
       
       ll3.setBounds(7,48,150,20);
       ll3.setText("Total Cost of Items");
       ll3.setForeground(Color.BLACK);
       ll3.setFont(new Font("Sans Serifs",Font.CENTER_BASELINE,12));
              

       ee1.setBounds(230,7,65,20); 
       ee2.setBounds(230,28,65,20);
       ee3.setBounds(230,48,65,20);
       
       panel3.setBounds(0,385,615,75);
       panel3.setLayout(null);
       panel3.setBackground(Color.WHITE);
       panel3.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
       panel3.add(b1);
       panel3.add(b2);
       panel3.add(b3);
       panel3.add(b4);
       
       panel4.setBounds(625,65,400,395);
       panel4.setLayout(null);
       panel4.setBackground(Color.WHITE);
       panel4.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
       panel4.add(RL1);
       panel4.add(RL2);
       panel4.add(RL3);
       panel4.add(RL4);
       panel4.add(RL5);
       panel4.add(RL6);
       panel4.add(RL7);
       panel4.add(RL8);
       panel4.add(RL9);
       panel4.add(RL10);
       panel4.add(RL11);
       panel4.add(RL12);
       
       String[] ans5 = {"Select Extra Dish","aman","rahul","Abhishek","futurejis"};
       JComboBox aman1 = new JComboBox<>(ans5);
       aman1.setBounds(7,160,200,20);
       
       panel5.setBounds(310,65,305,200);
       panel5.setLayout(null);
       panel5.setBackground(Color.WHITE);
       panel5.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
       panel5.add(Dl0);
       panel5.add(Dl1);
       panel5.add(Dl2);
       panel5.add(Dl3);
       panel5.add(Dl4);
       panel5.add(Dl5);
       panel5.add(De0);
       panel5.add(De1);
       panel5.add(De2);
       panel5.add(De3);
       panel5.add(De4);
       panel5.add(De5);
       panel5.add(aman1);
       
       
       
       Dl0.setBounds(50,0,80,30);
       Dl0.setText("Drinks");
       Dl0.setForeground(Color.BLACK);
       Dl0.setFont(new Font("Sans Serif",Font.BOLD,18));
       
       Dl1.setBounds(7,25,80,30);
       Dl1.setText("Milk Shake");
       Dl1.setForeground(Color.BLACK);
       Dl1.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       Dl2.setBounds(7,50,125,30);
       Dl2.setText("Vanilla Cone");
       Dl2.setForeground(Color.BLACK);
       Dl2.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       Dl3.setBounds(7,75,150,30);
       Dl3.setText("Classic Vanilla");
       Dl3.setForeground(Color.BLACK);
       Dl3.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       Dl4.setBounds(7,100,200,30);
       Dl4.setText("Vanilla Milk Shake");
       Dl4.setForeground(Color.BLACK);
       Dl4.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       Dl5.setBounds(7,125,200,30);
       Dl5.setText("Chocolate Milk Shake");
       Dl5.setForeground(Color.BLACK);
       Dl5.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       
       
       panel6.setBounds(310,275,305,100);
       panel6.setLayout(null);
       panel6.setBackground(Color.WHITE);
       panel6.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
       panel6.add(DDl1);
       panel6.add(DDl2);
       panel6.add(DDl3);
       panel6.add(DDe1);
       panel6.add(DDe2);
       panel6.add(DDe3);
       
       DDl1.setBounds(7,7,30,20);
       DDl1.setText("Tax");
       DDl1.setForeground(Color.BLACK);
       DDl1.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       DDl2.setBounds(7,28,70,20);
       DDl2.setText("SubTotal");
       DDl2.setForeground(Color.BLACK);
       DDl2.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       DDl3.setBounds(7,48,40,20);
       DDl3.setText("Total");
       DDl3.setForeground(Color.BLACK);
       DDl3.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       DDe1.setBounds(230,7,65,20);      
       DDe2.setBounds(230,28,65,20);
       DDe3.setBounds(230,48,65,20);
       
       De0.setBounds(255,25,45,20);
       De0.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   De1.requestFocus();
                }
            }
        });
       De1.setBounds(255,50,45,20);
       De1.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   De2.requestFocus();
                }
            }
        });
       De2.setBounds(255,75,45,20);
       De2.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   De3.requestFocus();
                }
            }
        });
       De3.setBounds(255,100,45,20);
       De3.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   De4.requestFocus();
                }
            }
        });
       De4.setBounds(255,125,45,20);
       De4.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {                    
                    De5.requestFocus();
                }
                   

            }
        });
       
       De5.setBounds(255,160,45,20);
       De5.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    
                   try{
                        
                        Database data = new Database();
                        
//                   b1.requestFocus();
          Double a = Double.parseDouble(e1.getText());
          Double b = Double.parseDouble(e2.getText());
          Double c = Double.parseDouble(e3.getText());
          Double d = Double.parseDouble(e4.getText());
          Double e = Double.parseDouble(e5.getText());
          Double f = Double.parseDouble(e6.getText());
          // int a1 = Integer.parseInt(Dl1.getText());
          result = a+b+c+d+e+f;
          ee1.setText(String.valueOf("Rs "+result));          
          
           String s1 = "Insert into meal3 Values(?,?,?,?,?,?,?,?)";
          PreparedStatement stmt2 = data.c.prepareStatement(s1);
          stmt2.setInt(1,i);
          stmt2.setDouble(2, a);
          stmt2.setDouble(3, b);
          stmt2.setDouble(4, c);
          stmt2.setDouble(5, d);
          stmt2.setDouble(6, e);
          stmt2.setDouble(7,f);
          stmt2.setDouble(8,result);
          i++;
          stmt2.execute();
          
                    }
                    catch(Exception e)
                    {
                        System.err.println(e);
                    }
                    
          //Drinking
          
          try
          {
              
          Database data = new Database();    
          double a1 = Double.parseDouble(De0.getText());
          double a2 = Double.parseDouble(De1.getText());
          double a3 = Double.parseDouble(De2.getText());
          double a4 = Double.parseDouble(De3.getText());
          double a5 = Double.parseDouble(De4.getText());
          double a6 = Double.parseDouble(De5.getText());
          
          ans = a1+a2+a3+a4+a5+a6;
          ee2.setText(String.valueOf("Rs "+ans));
          String  s = "Insert into Drink Values(?,?,?,?,?,?,?,?)";
          PreparedStatement stmt2 = data.c.prepareStatement(s);
          stmt2.setInt(1, j);
          stmt2.setDouble(2, a1);
          stmt2.setDouble(3, a2);
          stmt2.setDouble(4, a3);
          stmt2.setDouble(5, a4);
          stmt2.setDouble(6, a5);
          stmt2.setDouble(7, a6);
          stmt2.setDouble(8, ans);
          j++;
          stmt2.execute();   
          }
          
          catch(Exception e)
          {
              System.err.println(e);
          }
          // Total Coast
          total = ans+result;
          ee3.setText(String.valueOf("Rs "+total));
          //Subtotal
          
          DDe2.setText(ee3.getText());
         double gst = 0;
         double r1 = 0;
         if(total>100)
         {
             gst = 10.0/100.0;
             r1 = ((total*gst)/100.0);
             t=total+r1;
         }
         else
         {
             t=0.0;
         }
         DecimalFormat df2 = new DecimalFormat("#.##");
         
          DDe1.setText(String.valueOf("Rs "+df2.format(r1)));
          a12 =   total+t;
          DDe3.setText(String.valueOf("Rs "+df2.format(a12)));

                }                   
            }
        });
       
       RL1.setBounds(60,10,300,30);
       RL1.setForeground(Color.BLACK);
       RL1.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       RL2.setBounds(7,35,100,30);
       RL2.setForeground(Color.BLACK);
       RL2.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       
       RL3.setBounds(250,35,30,30);
       RL3.setForeground(Color.BLACK);
       RL3.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       
       RL4.setBounds(7,55,800,20);
       RL4.setForeground(Color.BLACK);
       RL4.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       RL5.setBounds(7,85,500,40);
       RL5.setForeground(Color.BLACK);
       RL5.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       RL6.setBounds(7,125,500,40);
       RL6.setForeground(Color.BLACK);
       RL6.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
      // RL6.setText("Drinks:");
       
       RL7.setBounds(7,165,500,40);
       RL7.setForeground(Color.BLACK);
       RL7.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       //RL7.setText("Coast of Item:");
       
       RL8.setBounds(7,205,500,40);
       RL8.setForeground(Color.BLACK);
       RL8.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       //RL8.setText("Coast of Item:");
       
       RL9.setBounds(7,245,500,40);
       RL9.setForeground(Color.BLACK);
       RL9.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       //RL8.setText("Coast of Item:");
       
       RL10.setBounds(7,285,500,40);
       RL10.setForeground(Color.BLACK);
       RL10.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       //RL8.setText("Coast of Item:");
       
       RL11.setBounds(7,330,500,40);
       RL11.setForeground(Color.BLACK);
       RL11.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
       
       RL12.setBounds(280,350,250,30);
       RL12.setForeground(Color.BLACK);
       RL12.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
//       RL12.setText("Date:");

       
       ImageIcon i1 = new ImageIcon(new ImageIcon("Total.png").getImage().getScaledInstance(34,34, Image.SCALE_DEFAULT));
       b1.setBounds(30,20,120,30);
       b1.setMnemonic('T');
       b1.setIcon(i1);
       b1.setBorder(new RoundedBorder(20));
       
       ImageIcon i12 = new ImageIcon(new ImageIcon("Recipet.png").getImage().getScaledInstance(32,32, Image.SCALE_DEFAULT));
       b2.setBounds(170,20,130,30);
       b2.setIcon(i12);
       b2.setMnemonic('R');
       b2.setBorder(new RoundedBorder(20));
       
       ImageIcon i3 = new ImageIcon(new ImageIcon("Reset.png").getImage().getScaledInstance(34,34, Image.SCALE_DEFAULT));
       b3.setBounds(310,20,130,30);
       b3.setIcon(i3);
       b3.setMnemonic('A');
       b3.setBorder(new RoundedBorder(20));
       
       ImageIcon i4 = new ImageIcon(new ImageIcon("exit.png").getImage().getScaledInstance(34,34, Image.SCALE_DEFAULT));
       b4.setBounds(450,20,130,30);
       b4.setIcon(i4);
       b4.setMnemonic('E');
       b4.setBorder(new RoundedBorder(20));
       
      b1.addActionListener((ActionEvent ae) -> {
          //Meals
          
          try 
          {
              Database data = new Database();              
              
          Double a = Double.parseDouble(e1.getText());
          Double b = Double.parseDouble(e2.getText());
          Double c = Double.parseDouble(e3.getText());
          Double d = Double.parseDouble(e4.getText());
          Double e = Double.parseDouble(e5.getText());
          Double f = Double.parseDouble(e6.getText());
          result = a+b+c+d+e+f;
          ee1.setText(String.valueOf("Rs "+result));
          
          
          String s1 = "Insert into meal3 Values(?,?,?,?,?,?,?,?)";
          PreparedStatement stmt2 = data.c.prepareStatement(s1);
          stmt2.setInt(1,i);
          stmt2.setDouble(2, a);
          stmt2.setDouble(3, b);
          stmt2.setDouble(4, c);
          stmt2.setDouble(5, d);
          stmt2.setDouble(6, e);
          stmt2.setDouble(7,f);
          stmt2.setDouble(8,result);
          i++;
          stmt2.execute();
          
//          result = a+b+c+d+e+f;
//          ee1.setText(String.valueOf("Rs "+result));
          }
          catch(Exception a)
          {
              System.err.println(a);
          }
          //Drinking
          
          try
          {
              Database data = new Database();
          double a1 = Double.parseDouble(De0.getText());
          double a2 = Double.parseDouble(De1.getText());
          double a3 = Double.parseDouble(De2.getText());
          double a4 = Double.parseDouble(De3.getText());
          double a5 = Double.parseDouble(De4.getText());
          double a6 = Double.parseDouble(De5.getText());
          
          ans = a1+a2+a3+a4+a5+a6;
          ee2.setText(String.valueOf("Rs "+ans));
          String  s = "Insert into Drink Values(?,?,?,?,?,?,?,?)";
          PreparedStatement stmt2 = data.c.prepareStatement(s);
          stmt2.setInt(1, i);
          stmt2.setDouble(2, a1);
          stmt2.setDouble(3, a2);
          stmt2.setDouble(4, a3);
          stmt2.setDouble(5, a4);
          stmt2.setDouble(6, a5);
          stmt2.setDouble(7,a6);
          stmt2.setDouble(8, ans);
          j++;
          stmt2.execute();
          }
          catch(Exception r)
          {
              System.err.println(r);
          }
          
          total = ans+result;
          ee3.setText(String.valueOf("Rs "+total));
          DDe2.setText(ee3.getText());
          double gst = 0;
          double r1 = 0;
          if(total>100)
          {
             gst = 10.0/100.0;
             r1 = ((total*gst)/100.0);
             t=total+r1;
          }
          DecimalFormat df2 = new DecimalFormat("#.##");
          DDe1.setText(String.valueOf(df2.format(r1)));
          e11 = Double.parseDouble(DDe1.getText());
          // Total coast and Gst
          a12 =   total+t;
          DDe3.setText(String.valueOf("Rs "+df2.format(a12)));
       });
      
      b2.addActionListener((ActionEvent ae) -> {
          
          try 
          {
              
           Database data = new Database();   
          String pattern = "dd-MM-yyyy";
          SimpleDateFormat date1 = new SimpleDateFormat(pattern);
          String date = date1.format(new Date());
          RL1.setText("Restaurant Management System :");
          RL2.setText("Reference :");
          RL3.setText(String.valueOf(cnt));
          RL4.setText("----------------------------------------------------------");
          RL5.setText("Meals:                    Rs: "+result);
          RL6.setText("Drinks:                   Rs: "+ans);
          RL7.setText("Coast of Items:     Rs: "+total);
          RL8.setText("----------------------------------------------------------");
          RL9.setText("Tax:                          Rs: "+t);
          RL10.setText("Subtotal:                 Rs: " +total);
          RL11.setText("Total:                       Rs: "+a12);
          RL12.setText("Date:"+date);

          String q = "Insert into Recipet Values(?,?,?,?,?,?,?)";
          PreparedStatement stmt2= data.c.prepareStatement(q);
          stmt2.setInt(1, cnt);
          stmt2.setDouble(2, result);
          stmt2.setDouble(3, ans);
          stmt2.setDouble(4, total);
          stmt2.setDouble(5, t);
          stmt2.setDouble(6, total);
          stmt2.setDouble(7,a12);
          cnt=cnt+1;
          
          stmt2.execute();
          }
          
          catch(Exception e)
          {
              System.err.println(e);
          }
       });
      
      b3.addActionListener((ActionEvent ae) -> {
          result=0;
          e1.setText("");
          e2.setText("");
          e3.setText("");
          e4.setText("");
          e5.setText("");
          e6.setText("");
          ee1.setText("");
          ee2.setText("");
          ee3.setText("");
          RL1.setText("Restaurant Management System :");
          RL2.setText("Reference :");
          //RL3.setText(String.valueOf(cnt));
          RL4.setText("----------------------------------------------------------");
          RL5.setText("Meals:                 ");
          //RL5.setText("Meals:                    Rs: "+result);
          RL6.setText("Drinks:                    ");
          RL7.setText("Coast of Items:        ");
          RL8.setText("----------------------------------------------------------");
          RL9.setText("Tax:                       ");
          RL10.setText("Subtotal:                 ");
          RL11.setText("Total:                    ");
          De0.setText("");
          De1.setText("");
          De2.setText("");
          De3.setText("");
          De4.setText("");
          De5.setText("");
          DDe1.setText("");
          DDe2.setText("");
          DDe3.setText("");
       });
      
      b4.addActionListener((ActionEvent ae) -> {
          // frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         int x=JOptionPane.showConfirmDialog(contentpane,"Do you want to Terminate","Query",JOptionPane.YES_NO_OPTION);
         if(x==JOptionPane.YES_OPTION)
         {
          Introduction i = new Introduction();
          i.launch();
          frame.dispose();
         }
         else if(x==JOptionPane.NO_OPTION)
         {
          frame.setVisible(true); 
         }
       });
       
       }    
}