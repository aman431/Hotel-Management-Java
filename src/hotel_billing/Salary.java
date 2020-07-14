
package hotel_billing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Salary {
    
double Total1,Total2;
    
public final JFrame frame;
public final JFrame frame1;
public final JFrame frame2;

public final JMenuBar bar;
public final JMenu m1;
public final JMenuItem t1;
public final JMenuItem t2;
public final JMenuItem t3;
public final JMenuItem t4;

public JScrollPane p1;
public final JLabel l1;
public final JPanel panel;
public final JLabel l2;
public final JLabel l3;
public final JLabel l4;
public final JLabel l5;
public final JLabel l6;
public final JLabel l7;
public final JLabel l8;
public final JLabel l9;

public final JTextField e1;
public final JTextField e2;
public final JTextField e3;
public final JTextField e4;
public final JTextField e5;
public final JTextField e6;
public final JTextField e7;
public final JTextField e8;

public final JButton b1;
public final JButton b2;
public final JButton b3;
public final JButton b4;

public Salary()
{
    frame = new JFrame();
    frame1 = new JFrame();
    frame2 = new JFrame();
    p1 = new JScrollPane();
    
    bar = new JMenuBar();
    m1 = new JMenu("Further_Options");
    t1 = new JMenuItem("Show_Details");
    t2 = new JMenuItem("Personal_Details");
    t3 = new JMenuItem("Delete");
    t4 = new JMenuItem("Exit");
    
    l1 = new JLabel();
    panel = new JPanel();
    l2 = new JLabel();
    l3 = new JLabel();
    l4 = new JLabel();
    l5 = new JLabel();
    l6 = new JLabel();
    l7 = new JLabel();
    l8 = new JLabel();
    l9 = new JLabel();
    
    e1 = new JTextField();
    e2 = new JTextField();
    e3 = new JTextField();
    e4 = new JTextField();
    e5 = new JTextField();
    e6 = new JTextField();
    e7 = new JTextField();
    e8 = new JTextField();
    
    b1 = new JButton();
    b2 = new JButton();
    b3 = new JButton();
    b4 = new JButton();
}

public void launch()
{
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(1024,800));
    frame.setTitle("Salary");
    frame.setLayout(null);
    frame.setLocation(0,0);
    frame.pack();
    frame.setVisible(true);
    frame.add(p1);
    frame.add(l1);
    frame.add(panel);
    frame.setJMenuBar(bar);
    
      bar.add(m1);
      ImageIcon i9 = new ImageIcon(new ImageIcon("Menu.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
      m1.setIcon(i9);
      m1.add(t1);
      m1.setMnemonic('F');
      m1.add(t2);
      m1.add(t3);
      m1.add(t4);
    
    l1.setBounds(250,10,300,40);
    l1.setFont(new Font("Sans Serif ", Font.BOLD,20));
    l1.setText("SALARY OF WORKER");

    panel.setBounds(100,50,500,500);
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);
    panel.add(l2);
    panel.add(l3);
    panel.add(l4);
    panel.add(l5);
    panel.add(l6);
    panel.add(l7);
    panel.add(l8);
    panel.add(l9);
    panel.add(e1);
    panel.add(e2);
    panel.add(e3);
    panel.add(e4);
    panel.add(e5);
    panel.add(e6);
    panel.add(b1);
    panel.add(b2);
    panel.add(e7);
    panel.add(e8);


    l5.setBounds(150,50,100,30);
    l5.setText("Personal_ID");
    l2.setBounds(150,100,100,30);
    l2.setText("Name");
    l3.setBounds(150,150,100,30);
    l3.setText("Department");
    l4.setBounds(150,200,100,30);
    l4.setText("Salary");
    l6.setBounds(150,250,100,30);
    l6.setText("OverTime");
    l7.setBounds(150,300,100,30);
    l7.setText("Late Time");
    l8.setBounds(150,350,100,30);
    l8.setText("Total");
    l9.setBounds(10,10,30,30);
    l9.setText("ID:");
    
    e8.setBounds(30,15,40,20);
    e8.addKeyListener(new KeyAdapter()
    {
          @Override
          public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    e1.requestFocus();                
                }
            }
    });
    
    e1.setBounds(300,50,100,30);
    e1.addKeyListener(new KeyAdapter()
    {
          @Override
          public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode()==KeyEvent.VK_ENTER)
                {
                    e2.requestFocus();                
                }
            }
    });
    e2.setBounds(300,100,100,30);
    e2.addKeyListener(new KeyAdapter()
    {
        @Override
        public void keyPressed(KeyEvent ae)
        {
            if(ae.getKeyCode()==KeyEvent.VK_ENTER)
            {
            e3.requestFocus();
            }
        }
    });
    e3.setBounds(300,150,100,30);
    e3.addKeyListener(new KeyAdapter()
    {
        @Override
        public void keyPressed(KeyEvent ae)
        {
            if(ae.getKeyCode()==KeyEvent.VK_ENTER)
            {
            e4.requestFocus();
            }
        }
    });
    e4.setBounds(300,200,100,30);
    e4.addKeyListener(new KeyAdapter()
    {
        @Override
        public void keyPressed(KeyEvent ae)
        {
            if(ae.getKeyCode()==KeyEvent.VK_ENTER)
            {
            e5.requestFocus();
            }
        }
    });
    e5.setBounds(300,250,100,30);
    e5.addKeyListener(new KeyAdapter()
    {
        @Override
        public void keyPressed(KeyEvent ae)
        {
            if(ae.getKeyCode()==KeyEvent.VK_ENTER)
            {
            e6.requestFocus();
            }
        }
    });
    e6.setBounds(300,300,100,30);
    e6.addKeyListener(new KeyAdapter()
    {
        @Override
        public void keyPressed(KeyEvent ae)
        {
            if(ae.getKeyCode()==KeyEvent.VK_ENTER)
            {
            e7.requestFocus();
            }
        }
    });
    e7.setBounds(300,350,100,30);
    
    b1.setBounds(150,400,100,30);
    b1.setMnemonic('A');
    b1.setBorder(new RoundedBorder(25));
    b1.setText("Add");
    
    b2.setBounds(300,400,100,30);
    b2.setMnemonic('R');
    b2.setBorder(new RoundedBorder(25));
    b2.setText("Reset");
    
    b1.addActionListener((ActionEvent ae) -> {
        try
        {
Database d = new Database();
int id = Integer.parseInt(e8.getText());
int Personal_Id = Integer.parseInt(e1.getText());
String name = e2.getText();
String Department = e3.getText();
double Salary = Double.parseDouble(e4.getText());
double OverTime = Double.parseDouble(e5.getText());
double Late_Time = Double.parseDouble(e6.getText());

int i=1;
int cnt=0;
while(OverTime>=i)
{
    Total1 = Salary+cnt;
    cnt++;
    i++;  
}
e7.setText(String.valueOf(Total1));
double ans=Double.parseDouble(e7.getText());
int i1=1;
int cnt1=0;
while(Late_Time>=i1)
{
    Total2 = ans-cnt1;
    cnt1++;
    i1++;
}
e7.setText(String.valueOf(Total2));
double Total = Double.parseDouble(e7.getText());
String  s = "Insert into Details Values(?,?,?,?,?,?,?,?)";
PreparedStatement stmt2 = d.c.prepareStatement(s);
stmt2.setInt(1,id);
stmt2.setInt(2, Personal_Id);
stmt2.setString(3, name);
stmt2.setString(4, Department);
stmt2.setDouble(5, Salary);
stmt2.setDouble(6, OverTime);
stmt2.setDouble(7, Late_Time);
stmt2.setDouble(8, Total);
stmt2.execute();
        }
    
    catch(Exception e)
            {
            System.err.println(e);
        }
    });
    
    b2.addActionListener((ActionEvent ae) -> {
        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");
        e5.setText("");
        e6.setText("");
        e7.setText("");
        e8.setText("");
    });
    
    ImageIcon i11 = new ImageIcon(new ImageIcon("Search.png").getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT));
    t1.setIcon(i11);
    t1.setMnemonic('S');
    t1.addActionListener((ActionEvent ae) -> {
        try {
            Database d = new Database();
            String q = "select *from Details";
            PreparedStatement stmt2 = d.c.prepareStatement(q);
            DefaultTableModel model = new DefaultTableModel();
            String Column[]= {"Id","Personal_Id","Name","Department","Salary","OverTime","Late Time","Total"};
            model.setColumnIdentifiers(Column);
            JTable t5 = new JTable();
            t5.setModel(model);
            t5.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            t5.setFillsViewportHeight(true);
            JScrollPane scroll = new JScrollPane(t5);
            scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            t5.setBounds(0, 30, 700, 700);
            String id = "";
            String Personal_Id="";
            String Name = "";
            String Department = "";
            String Salary = "";
            String LateTime = "";
            String OverTime ="";
            String Total = "";
            
            JMenuBar bar1 = new JMenuBar();
            JMenu m2 = new JMenu("Click Me:");
            bar1.add(m2);
            ImageIcon i2 = new ImageIcon(new ImageIcon("Cross.png").getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT));
            m2.setIcon(i2); 
            JMenuItem t11 = new JMenuItem("Back");
            m2.add(t11);
            
            m2.setMnemonic('C');
            ImageIcon i = new ImageIcon(new ImageIcon("Back.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
            t11.setIcon(i);
            t11.setMnemonic('B');
            JFrame frame1 = new JFrame();
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setPreferredSize(new Dimension(1024,700));
            frame1.setLayout(new BorderLayout());
            frame1.setLocation(0,0);
            frame1.add(scroll);
            frame1.pack();
            frame1.setVisible(true);
            frame1.setJMenuBar(bar1);
            

ResultSet rs = stmt2.executeQuery();
while(rs.next())
{
    id = rs.getString("Id");
    Personal_Id=rs.getString("Personal_Id");
    Name = rs.getString("Name");
    Department = rs.getString("Department");
    Salary = rs.getString("Salary");
    OverTime = rs.getString("OverTime");
    LateTime = rs.getString("LateTime");
    Total = rs.getString("Total");
    model.addRow(new Object[]{id,Personal_Id,Name,Department,Salary,OverTime,LateTime,Total});
}

t11.addActionListener((ActionEvent ae1) -> {
    int x = JOptionPane.showConfirmDialog(frame1,"You want to exit","Exit",JOptionPane.YES_OPTION);
    if(x == JOptionPane.YES_OPTION)
    {
        frame1.dispose();
        frame.setVisible(true);
    }  
});            
    }     
        catch(Exception e)
        {
            System.err.println(e);
        }
        });
    ImageIcon i13 = new ImageIcon(new ImageIcon("Personal.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
    t2.setIcon(i13);
    t2.setMnemonic('P');
    t2.addActionListener((ActionEvent ae) -> {
        try {
            Database d = new Database();
            String ans = e1.getText();
            String q = "select *from Details where Personal_Id = ? ";
            PreparedStatement stmt2 = d.c.prepareStatement(q);
            stmt2.setString(1,ans);
            DefaultTableModel model = new DefaultTableModel();
            String Column[]= {"Id","Personal_Id","Name","Department","Salary","OverTime","Late Time","Total"};
            model.setColumnIdentifiers(Column);
            JTable t5 = new JTable();
            t5.setModel(model);
            t5.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            t5.setFillsViewportHeight(true);
            JScrollPane scroll = new JScrollPane(t5);
            scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            t5.setBounds(0, 30, 700, 700);
            String id = "";
            String Personal_Id = "";
            String Name = "";
            String Department = "";
            String Salary = "";
            String OverTime ="";
            String LateTime = "";
            String Total="";
            
            JMenuBar bar2 = new JMenuBar();
            JMenu m3 = new JMenu("Click Me:");
            ImageIcon i14 = new ImageIcon(new ImageIcon("Cross.png").getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT));
            m3.setIcon(i14);
            bar2.add(m3);
            JMenuItem t12 = new JMenuItem("Back");
            m3.add(t12);
            m3.setMnemonic('C');
            ImageIcon i = new ImageIcon(new ImageIcon("Back.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
            t12.setIcon(i);
            t12.setMnemonic('B');
            JFrame frame2 = new JFrame();
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame2.setPreferredSize(new Dimension(1024,700));
            frame2.setLocation(0,0);
            frame2.setJMenuBar(bar2);
            frame2.add(scroll);
            frame2.pack();
            frame2.setVisible(true);
            
            ResultSet rs = stmt2.executeQuery();
            while(rs.next())
            {
                id = rs.getString("Id");
                Personal_Id = rs.getString("Personal_Id");
                Name = rs.getString("Name");
                Department = rs.getString("Department");
                Salary = rs.getString("Salary");
                OverTime = rs.getString("OverTime");
                LateTime = rs.getString("LateTime");
                Total = rs.getString("Total");
                model.addRow(new Object[]{id,Personal_Id,Name,Department,Salary,OverTime,LateTime,Total});  
            }
            
           t12.addActionListener((ActionEvent ae1) -> {
               int x = JOptionPane.showConfirmDialog(frame1,"You want to exit","Exit",JOptionPane.YES_OPTION);
               if(x==JOptionPane.YES_OPTION)
               {
                   frame2.dispose();
                   frame.setVisible(true);
               }   });
      
        }catch(Exception e)
        {
            System.err.println(e);
        }
    });
    
    ImageIcon i15 = new ImageIcon(new ImageIcon("Delete.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
    t3.setIcon(i15);
    t3.setMnemonic('D');
    t3.addActionListener((ActionEvent ae) -> {
        try
        {
            int Id =Integer.parseInt(e1.getText());
            Database data = new Database();
            String q = " delete from Details where Personal_Id = ? ";
            PreparedStatement stmt2 = data.c.prepareStatement(q);
            stmt2.setInt(1, Id);
            stmt2.execute();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    });
    
    ImageIcon i14= new ImageIcon(new ImageIcon("Exit.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
    t4.setIcon(i14);
    t4.setMnemonic('E');
    t4.addActionListener((ActionEvent ae) -> {
        
//        UIManager ui = new UIManager();
//        ui.put("OptionPane.background", Color.BLACK);
////        ui.put("Panel.background", Color.WHITE);
        int x=JOptionPane.showConfirmDialog(frame,"Do You want to exit","Query",JOptionPane.YES_OPTION);
        if(x==JOptionPane.YES_OPTION)
        {
            frame.dispose();
            
        }

//          JDialog d = new JDialog(frame,"dialog box");
//          JLabel l = new JLabel("Do you want to exits");
//          d.add(l);
//          d.setSize(100,100);
//          d.setVisible(true);
          
    });   
            }
}
