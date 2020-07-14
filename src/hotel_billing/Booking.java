
package hotel_billing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Booking {
    
    public final JFrame frame;
    
    public final JMenuBar bar;
    public final JMenu menu;
    public final JMenuItem t1,t2,t3;
    
    public final JComboBox e9,e6;
    public final JButton b1;
    
    public final JPanel panel;
    public final JPanel panel1;
    public final JPanel panel2,Panel1;
    
    public final JLabel Username;
    public final JLabel Address;
    public final JLabel c_no;
    public final JLabel Rooms;
    public final JLabel Guests;
    public final JLabel Username_Details;
    public final JLabel name;
    public final JLabel l2;
    public final JLabel type;
    
    public final JTextField e0;
    public final JTextField e1;
    public final JTextField e2;
    public final JTextField e3;
    public final JTextField e4;
    public final JTextField e5;
    public final JTextField e7;
    
    public final JButton save;
    public final JButton Reset;
    public final JPanel B1_Panel;
    
    public Booking()
    {
        frame = new JFrame();
        b1 = new JButton();
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        Panel1 = new JPanel();
        B1_Panel = new JPanel();
        Address = new JLabel();
        c_no = new JLabel();
        Rooms = new JLabel();
        Guests = new JLabel();
        Username = new JLabel();
        Username_Details = new JLabel();
        name  = new JLabel();
        type = new JLabel();
        l2 = new JLabel();
        save = new JButton("Save");
        Reset = new JButton();
        
         e9 = new JComboBox();
        bar = new JMenuBar();
        menu = new JMenu("Options");
        t1 = new JMenuItem("User_Record");
        t2 = new JMenuItem("Room_Available");
        t3 = new JMenuItem("Exit");
        
        e0 = new JTextField();
        e1 = new JTextField();
        e2 = new JTextField();
        e3 = new JTextField();
        e4 = new JTextField();
        e5 = new JTextField();
        String[] list1 = {"","On Spot","On Call","Online","Other"};
        e6 = new JComboBox(list1);
        e7 = new JTextField();
        
    }
    public void launch()
    {
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Booking");
        frame.setPreferredSize(new Dimension(1024,700));
        frame.setLocation(0,0);
        frame.setLayout(null);
        frame.pack();
        frame.setVisible(true);
        frame.add(panel);
        frame.setJMenuBar(bar);
        frame.add(B1_Panel);
        frame.add(panel2);
        
        
        ImageIcon i1 = new ImageIcon(new ImageIcon("Menu.png").getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT));
        bar.add(menu);
        menu.setIcon(i1);
        menu.add(t1);
        menu.add(t2);
        menu.add(t3);
        
        ImageIcon i = new ImageIcon(new ImageIcon("user.png").getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
        JLabel label = new JLabel();
        label.setIcon(i);
        label.setBounds(10,0,200,100);
        label.setBackground(Color.RED);
        
        B1_Panel.setBounds(30,30,200,150);
        B1_Panel.setBackground(Color.BLUE);
        B1_Panel.setLayout(null);
        B1_Panel.add(b1);
        B1_Panel.add(label);

        
        l2 .setBounds(150,50,300,40);
        l2.setText("BOOKING SYSTEM");            
        l2.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,25));
        
        b1.setBounds(0,120,200,30);
        b1.setBackground(Color.ORANGE);
        
        b1.setText("User Details");
        b1.setHorizontalAlignment(SwingConstants.LEFT);
        b1.setForeground(Color.BLACK);
        

        b1.addActionListener((ActionEvent ae) -> {
            String[] box = {" ","AC","NON-AC","ON SPOT"};
            final DefaultComboBoxModel model = new DefaultComboBoxModel(box);
            JComboBox b = new JComboBox(model);
            b.setEditable(false);
            JButton search = new JButton();
            search.setBounds(250,160,140,20);
            search.setText("Search Rooms");
            search.setHorizontalAlignment(SwingConstants.LEFT);
            JLabel Id = new JLabel();
            Id.setBounds(300,10,20,30);
            Id.setText("Id:");
            JTextField e8;
            e8 = new JTextField();
            e8.setBounds(130, 240, 100, 20);
            e8.add(b);
            panel.setBounds(10,200,400,400);
            panel.setBackground(Color.WHITE);
            panel.setBackground(Color.LIGHT_GRAY);
            panel.setLayout(null);
            panel.add(Username);
            panel.add(Username_Details);
            panel.add(name);
            panel.add(Address);
            panel.add(c_no);
            panel.add(Rooms);
            panel.add(Guests);
            panel.add(type);
            panel.add(Id);
            panel.add(e0);
            panel.add(e1);
            panel.add(e2);
            panel.add(e3);
            panel.add(e4);
            panel.add(e5);
            panel.add(e6);
            panel.add(save);
            panel.add(Reset);
            panel.add(search);


            Username_Details.setBounds(10,0,150,30);
            Username_Details.setText("New Booking:");
            Username_Details.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,12));
            Username_Details.setForeground(Color.BLACK);
            Username.setBounds(10,40,100,30);
            Username.setText("Name");
            Username.setForeground(Color.BLACK);
            
            Address.setBounds(10,80,100,30);
            Address.setText("Address");
            Address.setForeground(Color.BLACK);
            
            c_no.setBounds(10,120,100,30);
            c_no.setText("Contact_No");
            c_no.setForeground(Color.BLACK);
            
            Rooms.setBounds(10,160,100,30);
            Rooms.setText("Rooms");
            Rooms.setForeground(Color.BLACK);
            
            Guests.setBounds(10,200,100,30);
            Guests.setText("Guets");
            Guests.setForeground(Color.BLACK);
            
            type.setBounds(10,240,100,30);
            type.setText("Type");
            type.setForeground(Color.BLACK);
            
            e0.setBounds(330,10,30,30);
            e0.addKeyListener(new KeyAdapter()
            {
                @Override
                public void keyPressed(KeyEvent ae)
                {
                    if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                    {
                        e1.requestFocus();
                    }
                }
            });  
            
            e1.setBounds(130,40,100,20);
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
            
            e2.setBounds(130,80,100,20);
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
            
            
            e3.setBounds(130,120,100,20);
            e3.addKeyListener(new KeyAdapter()
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
            e4.setBounds(130,160,100,20);
            
            e5.setBounds(130,200,100,20);
            e5.addKeyListener(new KeyAdapter()
            {
                @Override
                public void keyPressed(KeyEvent ae)
                {
                    if(ae.getKeyCode() == KeyEvent.VK_ENTER)
                    {
                        
                        e6.requestFocus();
                        panel2.setVisible(false);
                    }
                }
            });  
            
            e6.setBounds(130,240,100,20);
            
            Reset.setBounds(130,300,100,30);
            Reset.setText("Reset");
            Reset.setMnemonic('R');
            Reset.setBackground(Color.GREEN);
            
            save.setBounds(30,300,100,30);
            save.setText("Save");
            save.setMnemonic('S');
            save.setBackground(Color.GREEN);
            save.addActionListener((ActionEvent ae1) -> {
                if(e0.getText().isEmpty() || e2.getText().isEmpty() || e4.getText().isEmpty() || e5.getText().isEmpty())
                {     
                    JOptionPane.showMessageDialog(panel,"Field Should not be a Empty","Error",JOptionPane.ERROR_MESSAGE);          
                }
                else
                {
                try 
                {                    
                    long id = Integer.parseInt(e0.getText());
                    String name1 = e1.getText();
                    String Address1 = e2.getText();
                    String Rooms1 = e4.getText();
                    String Guests1 = e5.getText();
                    String Type = e6.getSelectedItem().toString();
                    Database data = new Database();
                    String q = "insert into user values(?,?,?,?,?,?,?)";
                    PreparedStatement stmt2 = data.c.prepareStatement(q);
                    stmt2.setLong(1,id);
                    stmt2.setString(2, name1);
                    stmt2.setString(3, Address1);
                    stmt2.setLong(4, Long.parseLong(e3.getText()));
                    stmt2.setString(5, Rooms1);
                    stmt2.setString(6, Guests1);
                    stmt2.setString(7,Type);
                    stmt2.execute();
                    
                        String q1 = "delete from Rooms where Rooms = ?";                           
                        PreparedStatement stmt = data.c.prepareStatement(q1);
                        stmt.setString(1,e9.getSelectedItem().toString());
                        stmt.execute();
                      
                }
                catch(Exception e)
                {
                    System.err.println(e);
                }
                }
            });
            
            Reset.addActionListener((ActionEvent ae1) -> {
                e0.setText("");
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");
                e6.addItem("");
                e7.setText("");
                e9.addItem("");
            });
            
            search.setMnemonic('E');
            search.addActionListener((ActionEvent ae1) -> {
                JLabel l;
                l = new JLabel();
                l.setBounds(10,5,400,20);
                l.setText("Search user (Type ID of the user Key)");
                
                e8.setBounds(10, 25, 200, 20);
                
                JPanel panel11 = new JPanel();
                panel11.setBounds(0,0,500,50);
                panel11.setBackground(Color.GREEN);
                panel11.setLayout(null);
                panel11.add(l);
                panel11.add(e8);
                
                JLabel l1 ;
                l1 = new JLabel();
                l1.setBounds(0,0,150,20);
                l1.setText("Available Rooms:");
                
                e9.setBounds(10, 30, 480, 30);
                e9.setFont(new Font("Sans Serif",Font.CENTER_BASELINE,20));
                e9.setEditable(false);
                
                JButton b2 = new JButton();
                b2.setBounds(100, 70, 100, 20);
                b2.setBorder(new RoundedBorder(10));
                b2.setText("search");
                
                JButton b3 = new JButton();
                b3.setBounds(50, 120, 400, 30);
                b3.setText("Add Room(s) to the Room Field");
                b3.setBackground(Color.GREEN);
                
                JButton b4 = new JButton();
                b4.setBounds(50, 160, 400, 30);
                b4.setBackground(Color.GREEN);
                b4.setText("Allocated Room to be Free");
                
                JPanel panel3 = new JPanel();
                panel3.setBounds(0, 80, 500, 400);
                panel3.setBackground(Color.LIGHT_GRAY);
                panel3.setLayout(null);
                panel3.add(e9);
                panel3.add(l1);
                panel3.add(b2);
                panel3.add(b3);
                panel3.add(b4);
                panel2.setBounds(450,200,500,300);
                panel2.setBackground(Color.WHITE);
                panel2.setLayout(null);
                panel2.add(panel11);
                panel2.add(panel3);
                
                b2.addActionListener((ActionEvent ae2) -> {
                    try {
                        Database data = new Database();
                        String q = "select *from Rooms";
                        PreparedStatement stmt = data.c.prepareStatement(q);
                        String id ;
                        String Rooms2 = "";
                        ResultSet rs = stmt.executeQuery();
                        while (rs.next()) {
                            e9.addItem(rs.getString("Rooms"));
                        }
                    }
                    catch(Exception er)
                    {
                        System.err.println(er);
                    } 
                });
                
                b3.addActionListener((ActionEvent ae2) -> {
                    try 
                    {                        
                        e4.setText(e9.getSelectedItem().toString());
                        Database d = new Database();
                        String q = "delete from Rooms where Rooms = ?";                           
                        PreparedStatement stmt = d.c.prepareStatement(q);
                        stmt.setString(1,e9.getSelectedItem().toString());
                        stmt.execute();
                    }
                    
                    catch(Exception err)
                    {
                        System.err.println(err);
                    }
                });
                
                b4.addActionListener((ActionEvent ae2) -> {
                    try {
                        Database data = new Database();
                        int ans = Integer.parseInt(e8.getText());
                        String q1 = "select * from user where Id = ? ";
                        PreparedStatement stmt = data.c.prepareStatement(q1);
                        stmt.setInt(1,ans);
                        ResultSet rs = stmt.executeQuery();
                        String a1 = "";
                        String a2 = "";
                        while(rs.next())
                        {
                            a1 = rs.getString("Id");
                            a2 = rs.getString("Room");
                        }
                        String d = "insert into Rooms values(?,?)";
                        PreparedStatement stmt2 = data.c.prepareStatement(d);
                        stmt2.setString(1, a1);
                        stmt2.setString(2, a2);
                        stmt2.execute();
                        
                        String q ="delete from user where Id = ?";
                        PreparedStatement stmt3 = data.c.prepareStatement(q);
                        stmt3.setInt(1,ans);
                        stmt3.execute();
                    }catch(Exception a1)
                    {
                        System.err.println(a1);
                    }
                });
            });
        });        
        t1.addActionListener((ActionEvent ae) -> {
            try {
                Database data  = new Database();
                String q = "select *from user";
                PreparedStatement stmt = data.c.prepareStatement(q);
                DefaultTableModel model = new DefaultTableModel();
                String Column[]= {"Id","Name","Address","Phone_No","Room","Type"};
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
                String Name = "";
                String Address1 = "";
                String No ="";
                String Room = "";
                String Type = "";
                
                
                JMenuBar bar = new JMenuBar();
                JMenu menu = new JMenu("Back");
                JMenuItem t1;
                t1 = new JMenuItem("Close");
                bar.add(menu);
                menu.add(t1);
                
                JFrame frame1 = new JFrame();
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setPreferredSize(new Dimension(700,300));
                frame1.setLayout(new BorderLayout());
                frame1.setLocation(0,0);
                frame1.add(scroll);
                frame1.pack();
                frame1.setJMenuBar(bar);
                frame1.setVisible(true);
                
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    id = rs.getString("Id");
                    Name = rs.getString("Name");
                    Address1 = rs.getString("Address");
                    No = rs.getString("Contact_NO");
                    Room = rs.getString("Room");
                    Type = rs.getString("Type");
                    model.addRow(new Object[]{id, Name, Address1, No, Room, Type});
                }
                
                t1.addActionListener((ActionEvent ae1) -> {
                    frame1.dispose();
                });
                
            }
            
            catch(Exception e)
            {
                System.err.println(e);
            }
        });
        
        t2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try
                {
                    Database data  = new Database();
                    String q = "select *from Rooms";
                    PreparedStatement stmt = data.c.prepareStatement(q);
                    DefaultTableModel model = new DefaultTableModel();
                    String Column[]= {"Id","Rooms"};
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
                    String Rooms = "";
                    
                    JMenuBar bar = new JMenuBar();
                    JMenu menu = new JMenu("Back");
                    JMenuItem t1;
                    t1 = new JMenuItem("Close");
                    bar.add(menu);
                    menu.add(t1);
                    JFrame frame1 = new JFrame();
                    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame1.setPreferredSize(new Dimension(700,300));
                    frame1.setLayout(new BorderLayout());
                    frame1.setLocation(0,0);
                    frame1.add(scroll);
                    frame1.pack();
                    frame1.setVisible(true);
                    frame1.setJMenuBar(bar);
                    
                    ResultSet rs = stmt.executeQuery();
                    while(rs.next())
                    {
                        id = rs.getString("Id");
                        Rooms = rs.getString("Rooms");
                        model.addRow(new Object[]{id,Rooms});
                    }
                    t1.addActionListener((ActionEvent ae1) -> {
                        frame1.dispose();
                    });
                }
                catch(Exception e)
                {
                System.err.println(e);
                }
            }
        });
        
        t3.addActionListener((ActionEvent ae) -> {
            frame.dispose();
            Introduction i2 = new Introduction();
            i2.launch();
        });
    }

       
    }
    

