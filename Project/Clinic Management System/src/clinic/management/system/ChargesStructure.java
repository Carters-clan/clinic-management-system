package clinic.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ChargesStructure extends JFrame {
    
    ChargesStructure() {
        setSize(1000, 700);
        setLocation(200, 50);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Charges Struture");
        heading.setBounds(50, 10, 400, 30);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
        add(heading);    
        
        JTable table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from charges");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
          e.printStackTrace(); 
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 60, 1000, 700);
        add(jsp);
                
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ChargesStructure();
    }
    
}