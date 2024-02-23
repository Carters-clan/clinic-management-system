package clinic.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Account extends JFrame implements ActionListener {
    
    JButton create, cancel;
    JTextField tfusername,tfanswer;
    JPasswordField tfpassword, tfrepassword;
    JComboBox cbquestion;
    
    Account() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //Username
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(160, 20, 150, 20);
        add(tfusername);
        
        //Password
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 50, 100, 20);
        add(lblpassword);
                
        tfpassword = new JPasswordField();
        tfpassword.setBounds(160, 50, 150, 20);
        add(tfpassword);
        
         //Re-Password
        JLabel lblrepassword = new JLabel("Re-Password");
        lblrepassword.setBounds(40, 80, 120, 20);
        add(lblrepassword);
                
        tfrepassword = new JPasswordField();
        tfrepassword.setBounds(160, 80, 150, 20);
        add(tfrepassword);
        
        JLabel lblquestion = new JLabel("Security Question");
        lblquestion.setBounds(40, 110, 120, 20);
        add(lblquestion);
        
        String course[] = {"Your Nickname?", "What is your Dream Car?", "Favourite Sport?", "Your Favourite Quezine?", "Your 10th Percentage?" };
        cbquestion = new JComboBox(course);
        cbquestion.setBounds(160, 110, 150, 20);
        cbquestion.setBackground(Color.WHITE);
        add(cbquestion);
        
        //Security Answer
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(40, 140, 150, 20);
        add(lblanswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(160, 140, 150, 20);
        add(tfanswer);
        
        create = new JButton("Create");
        create.setBounds(40, 185, 120, 30);
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.addActionListener(this);
        create.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(create);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180, 185, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signin.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 210, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 15, 200, 200);
        add(image);
        
        setSize(600, 300);
        setLocation(400, 250);
        setVisible(true);
        
    }
  
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            String repassword = tfrepassword.getText();
            String question = (String)cbquestion.getSelectedItem();
            String answer = tfanswer.getText();
            
             if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Name Should not be Empty");
            return;
            } if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password Should not be Empty");
            return;
            } if (repassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill Password Again");
            return;
            } if (answer.equals("")) {
            JOptionPane.showMessageDialog(null, "Answer Should not be Empty");
            return;
            }
            
             try {
               String query = "insert into account values('"+username+"', '"+password+"','"+repassword+"', '"+question+"', '"+answer+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "User Inserted Successfully");
                new Login();
                setVisible(false);
                                
            } catch(Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String [] args) {
    new Account();
    }    
    
}