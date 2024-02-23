package clinic.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About() {
        setSize(700, 500);
        setLocation(300, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380, 5, 300, 400);
        add(image);
        
        JLabel head1 = new JLabel("CLINIC");
        head1.setBounds(30, 5, 320, 100);
        head1.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
        add(head1);
        
        JLabel head2 = new JLabel("MANAGEMENT");
        head2.setBounds(30, 60, 320, 100);
        head2.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
        head2.setForeground(Color.PINK);
        add(head2);
        
        JLabel head3 = new JLabel("SYSTEM");
        head3.setBounds(30, 120, 320, 100);
        head3.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
        add(head3);
        
        JLabel dev = new JLabel("Developed By : ");
        dev.setBounds(40, 220, 400, 40);
        dev.setFont(new Font("Footlight MT Light", Font.BOLD, 28));
        add(dev);
        
        JLabel name = new JLabel("Amit Gusain");
        name.setBounds(225, 220, 400, 40);
        name.setFont(new Font("Footlight MT Light", Font.BOLD, 28));
        name.setForeground(Color.BLUE);
        add(name);       
       
        JLabel rollno = new JLabel("Enrollment Number : 194409266");
        rollno.setBounds(70, 280, 400, 40);
        rollno.setFont(new Font("Gabriola", Font.PLAIN, 25));
        add(rollno);
        
        JLabel student = new JLabel("Enrolled In : BCA");
        student.setBounds(70, 310, 400, 40);
        student.setFont(new Font("Gabriola", Font.PLAIN, 25));
        add(student);
        
        JLabel Contact = new JLabel("Contact : 7289095248");
        Contact.setBounds(70, 340, 400, 40);
        Contact.setFont(new Font("Gabriola", Font.PLAIN, 25));
        add(Contact);
        
        JLabel email = new JLabel("Email : amit89339@gmail.com");
        email.setBounds(70, 370, 400, 40);
        email.setFont(new Font("Gabriola", Font.PLAIN, 25));
        add(email);
        
        JLabel note = new JLabel("NOTE : Amit Gusain is the sole owner and has all Authority");
        note.setBounds(110, 400, 600, 40);
        note.setFont(new Font("Bell MT", Font.BOLD, 17));
        add(note);
        
        JLabel copy = new JLabel("DO NOT COPY");
        copy.setBounds(550, 430, 600, 20);
        copy.setFont(new Font("Bell MT", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        copy.setForeground(Color.RED);
        add(copy);
        
        setLayout(null);
        
        setVisible(true);
        
         while (true) {
            name.setVisible(false);
            copy.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            name.setVisible(true);
            copy.setVisible(true);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        new About();
    }
}

