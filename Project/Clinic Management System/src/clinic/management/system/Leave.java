package clinic.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class Leave extends JFrame implements ActionListener {
    
    Choice cEmpId, ctime;
    JDateChooser dcdate;
    JButton submit, cancel;
    
    Leave() {
     
        setSize(500, 550);
        setLocation(450, 100);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("APPLY LEAVE");
        heading.setBounds(40, 50, 350, 30);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 24));
        add(heading);
        
        JLabel lblrollno = new JLabel("Search by Employee ID");
        lblrollno.setBounds(60, 100, 200, 20);
        lblrollno.setFont(new Font("Goudy Old Style", Font.BOLD, 18));
        add(lblrollno);
        
        cEmpId = new Choice();
        cEmpId.setBounds(60, 130, 200, 20);
        add(cEmpId);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from staff");
            while(rs.next()) {
                cEmpId.add(rs.getString("empId"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60, 180, 200, 20);
        lbldate.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(lbldate);
        
        dcdate = new JDateChooser();
        dcdate.setBounds(60, 210, 200, 20);
        add(dcdate);
        
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60, 260, 200, 20);
        lbltime.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(lbltime);
        
        ctime = new Choice();
        ctime.setBounds(60, 290, 200, 20);
        ctime.add("Half Day");
        ctime.add("Full Day");
        add(ctime);
        
        submit = new JButton("Submit");
        submit.setBounds(60,350, 100, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(200, 350, 100, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/leave.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 500, 550);
        add(image);
        
        setVisible(true);
        
    }
    
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == submit) {
              String empId = cEmpId.getSelectedItem();
              String date = ((JTextField)dcdate.getDateEditor().getUiComponent()).getText();
              String duration = ctime.getSelectedItem();
              
              String query = "insert into StaffLeave values('"+empId+"', '"+date+"', '"+duration+"')";
              
              try {
                  Conn c = new Conn();
                  c.s.executeUpdate(query);
                  JOptionPane.showMessageDialog(null, "Leave Confirmed");
                  setVisible(false);
              } catch (Exception e) {
                  e.printStackTrace();
              }
              
            } else {
                setVisible(false);
            }
        }
    
        public static void main(String[] args) {
        new Leave();
    }
}