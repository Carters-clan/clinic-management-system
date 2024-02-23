package clinic.management.system;

import java.awt.Choice;
import java.awt.Color;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientDetails extends JFrame implements ActionListener {
    
    Choice patientID;
    JTable table;
    JButton search, print, update, add, cancel;
    
    PatientDetails(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
                
        JLabel heading = new JLabel("Search by Patient ID");
        heading.setBounds(20, 20, 150, 20);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
        add(heading);
        
        patientID = new Choice();
        patientID.setBounds(180, 20, 150, 20);
        add(patientID);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from patient");
            while(rs.next()) {
                patientID.add(rs.getString("patientID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from patient");
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
        
        //Update Button
        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        update.addActionListener(this);
        add(update);
        
        //Add Button
        add = new JButton("Add");
        add.setBounds(320, 70, 80, 20);
        add.addActionListener(this);
        add(add);
        
        //Cancel Button
        cancel = new JButton("Cancel");
        cancel.setBounds(420, 70, 80, 20);
        cancel.addActionListener((ActionListener) this);
        add(cancel);
        
        setSize(900, 600);
        setLocation(220, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String query = "select * from patient where patientID = '"+patientID.getSelectedItem()+"'";
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
            new AddPatient();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new UpdatePatient();
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new PatientDetails();
    }
}