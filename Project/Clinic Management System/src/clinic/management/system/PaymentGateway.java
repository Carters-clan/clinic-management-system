package clinic.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class PaymentGateway extends JFrame implements ActionListener {
    
    Choice cdesease;
    JLabel  labelfare, labeltime, labelmedicine;
    JButton pay, back;
    
    PaymentGateway() {
         setSize(900, 500);
         setLocation(200, 100);
         setLayout(null);
         getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/payment.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 290, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 80, 500, 290);
        add(image);
        
        JLabel heading = new JLabel("Payment");
        heading.setBounds(80, 10, 400, 80);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 80));
        add(heading);   
        
        JLabel lbldesease= new JLabel("Select Desease");
        lbldesease.setBounds(40, 150, 150, 30);
        lbldesease.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        add(lbldesease);
        
        cdesease = new Choice();
        cdesease.setBounds(200, 150, 150, 25);
        add(cdesease);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from charges");
            while(rs.next()) {
                cdesease.add(rs.getString("desease"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Medicine
        JLabel lblmedicine = new JLabel("Medicine");
        lblmedicine.setBounds(40, 200, 150, 25);
        lblmedicine.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        add(lblmedicine);
        
        labelmedicine = new JLabel();
        labelmedicine.setBounds(200, 200, 150, 25);
        labelmedicine.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
        add(labelmedicine);
        
        // Fare
        JLabel lblfare = new JLabel("Cost");
        lblfare.setBounds(40, 250, 150, 25);
        lblfare.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        add(lblfare);
        
        labelfare = new JLabel();
        labelfare.setBounds(200, 250, 150, 25);
        labelfare.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
        add(labelfare);
        
        // Duration
        JLabel lbltime = new JLabel("Duration");
        lbltime.setBounds(40, 300, 150, 25);
        lbltime.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        add(lbltime);
        
        labeltime = new JLabel();
        labeltime.setBounds(200, 300, 150, 25);
        labeltime.setFont(new Font("Goudy Old Style", Font.PLAIN, 25));
        add(labeltime);
        
        try{
            Conn c = new Conn();
            String query = "select * from charges where desease='"+cdesease.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelmedicine.setText(rs.getString("Medicine"));
                labelfare.setText(rs.getString("fare"));
                labeltime.setText(rs.getString("Duration"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cdesease.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try{
            Conn c = new Conn();
            String query = "select * from charges where desease='"+cdesease.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelmedicine.setText(rs.getString("Medicine"));
                labelfare.setText(rs.getString("fare"));
                labeltime.setText(rs.getString("Duration"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            }
        });     
                             
        pay = new JButton("PAY");
        pay.setBounds(40, 380, 150, 25);
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.WHITE);
        pay.addActionListener(this);
        pay.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(pay);
        
        back = new JButton("BACK");
        back.setBounds(200, 380, 150, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(back);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == pay) {
            String desease = cdesease.getSelectedItem();
            String medicine = labelmedicine.getText();
            String fare = labelfare.getText();
            String duration = labeltime.getText();
            
            try {
                Conn c = new Conn();
                
                String query = "insert into payment values('"+desease+"', '"+medicine+"', '"+fare+"', '"+duration+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Payment Done Succussfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args) {
        new PaymentGateway();
    }
}
