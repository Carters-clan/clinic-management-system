package clinic.management.system;

import java.awt.Choice;
import java.awt.Color;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PaymentRecord extends JFrame implements ActionListener {
    
    Choice cdesease;
    JTable table;
    JButton search, print,  add, cancel;
    
    PaymentRecord(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Search by Desease");
        heading.setBounds(20, 20, 150, 20);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
        add(heading);
        
        cdesease = new Choice();
        cdesease.setBounds(180, 20, 150, 20);
        add(cdesease);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from payment");
            while(rs.next()) {
                cdesease.add(rs.getString("desease"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from payment");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Scroll Bar
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 500);
        add(jsp);
        
        //Search Button
        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);
        
        //Print Button
        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);
        
        //Add Button
        add = new JButton("Add");
        add.setBounds(220, 70, 80, 20);
        add.addActionListener(this);
        add(add);
        
        //Cancel Button
        cancel = new JButton("cancel");
        cancel.setBounds(320, 70, 80, 20);
        cancel.addActionListener(this);
        add(cancel);
                        
        setSize(900, 600);
        setLocation(220, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "select * from payment where desease = '"+cdesease.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == add) {
            setVisible(false);
            new PaymentGateway();
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new PaymentRecord();
    }
}
