package clinic.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JTextField username;
    JPasswordField password;
    JButton login, cancel, signin;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20, 100, 30);
        add(user);
        
        username = new JTextField();
        username.setBounds(150, 20, 150, 30);
        add(username);
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(40, 70, 100, 30);
        add(pass);
        
        password = new JPasswordField();
        password.setBounds(150, 70, 150, 30);
        add(password);
        
        login = new JButton("LOGIN");
        login.setBounds(40, 150, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        cancel = new JButton("CANCEL");
        cancel.setBounds(180, 150, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);    
        add(cancel);
        
        signin = new JButton("Sign In");
        signin.setBounds(110, 190, 120, 30);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        signin.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(signin);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 200, 200);
        add(image);
        
        
        setBounds(500, 200, 600, 300);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String user = username.getText();
            String pass = password.getText();
            
            if (user.equals("")) {
            JOptionPane.showMessageDialog(null, "Name Should not be Empty");
            return;
            } if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Password Should not be Empty");
            return;
            }
            
            try{
                Conn c = new Conn();
                
                String query = "select * from account where username = '" + user + "' and password = '" +  pass + "'";
                
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Project();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    return;
                }
                
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == signin) {
            setVisible(false);
            new Account();
        }else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login(); 
    }
    
}
