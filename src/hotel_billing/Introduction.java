
package hotel_billing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Introduction {
    
    public final JFrame frame;
    public final JLabel label;
    public final JLabel label1;
    public final JPanel panel;
    public final JPanel panel2;
    public final JPanel panel3;
    public final JButton b1;
    public final JButton b2;
    public final JButton b3;
    public final JButton b4;
    
    public Introduction()
    {
        frame = new JFrame();
        label = new JLabel();
        label1 = new JLabel();
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        b1 = new JButton("Billing");
        b2 = new JButton("Salary");
        b4 = new JButton("Booking");
        b3 = new JButton("Exit");
    }
    
    public void launch()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1024,800));
        frame.setLocation(0,0);
        frame.setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.pack();
        frame.setVisible(true);
        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        
        panel.setBounds(0,60,1024,500);
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
        panel.add(label);
        
        ImageIcon i = new ImageIcon(new ImageIcon("A4.jpg").getImage().getScaledInstance(1024, 500, Image.SCALE_DEFAULT));
        label.setIcon(i);
        label.setBounds(0,30,1024,500);
        
        panel2.setBounds(0,540,1024,500);
        panel2.setLayout(null);
        panel2.setBackground(Color.BLACK);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        
        panel3.setBounds(0,0,1024,60);
        panel3.setLayout(null);
        panel3.setBackground(Color.BLACK);
        panel3.add(label1);
        
        label1.setBounds(300,0,1024,100);
        label1.setForeground(Color.WHITE);
        label1.setText("WELCOME TO THE RESTAURANT");
        label1.setFont(new Font("Sans Serif ", Font.BOLD,25));
        
        
        b1.setBounds(200,50,130,30);
        b1.setMnemonic('B');
        ImageIcon i1 = new ImageIcon(new ImageIcon("Billing.jpg").getImage().getScaledInstance(25,25, Image.SCALE_DEFAULT));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createLineBorder(Color.GRAY,3));
        b1.setBorder(new RoundedBorder(20));

        b2.setBounds(400,50,130,30);
        b2.setMnemonic('S');
        ImageIcon i2 = new ImageIcon(new ImageIcon("Salary.jpg").getImage().getScaledInstance(25,25, Image.SCALE_DEFAULT));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBorder(BorderFactory.createLineBorder(Color.white,3));
        b2.setBorder(new RoundedBorder(20));
        
        b3.setBounds(800,50,130,30);
        b3.setMnemonic('E');
        ImageIcon i3 = new ImageIcon(new ImageIcon("Exit.jpg").getImage().getScaledInstance(25,25, Image.SCALE_DEFAULT));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBorder(BorderFactory.createLineBorder(Color.white,3));
        b3.setBorder(new RoundedBorder(20));
        
        b4.setBounds(600,50,130,30);
        b4.setMnemonic('B');
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
        b4.setBorder(new RoundedBorder(20));
        
        b1.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent ae)
            {
                if(ae.getKeyCode()==KeyEvent.VK_ENTER)
                {
                frame2 f = new frame2();
                try {
                    f.launch();
                } catch (InterruptedException ex) 
                    {
                       System.err.println(ex);
                }
                    
                }
            }
       }); 
        
        b1.addActionListener((ActionEvent ae) -> {
            frame.dispose();
            frame2 f = new frame2();
            try {
                f.launch();
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
        });
        
        b2.addActionListener((ActionEvent ae) -> {
            Salary s = new Salary();
            s.launch();
        });
        
        b3.addActionListener((ActionEvent ae) -> {
            int x=JOptionPane.showConfirmDialog(frame,"You wants to Terminate:","Query",JOptionPane.YES_OPTION);
            if(x==JOptionPane.YES_OPTION)
            {
                frame.dispose();
            }
        });
        
        b4.addActionListener((ActionEvent ae) -> {
            Booking b = new Booking();
            b.launch();
        });
    }
    
    
}
