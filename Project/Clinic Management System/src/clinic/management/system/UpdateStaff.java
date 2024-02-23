package clinic.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateStaff extends JFrame implements ActionListener {
  
    JTextField  tfaddress, tfphone, tfemail, tfdepartment, tfqualification, tfsalary, tfshift;
    JLabel labelempId;
    JButton Update, cancel;
    Choice cEmpId;
    
    UpdateStaff() {
        
        setSize(900, 650);
        setLocation(250, 50);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
                
        //Heading
        JLabel heading = new JLabel("UPDATE STAFF DETAILS");
        heading.setBounds(50, 10, 500, 50);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        add(heading);
        
        JLabel lblrollnumber = new JLabel("Select Employee ID");
        lblrollnumber.setBounds(50, 100, 200, 20);
        lblrollnumber.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(lblrollnumber);
        
        cEmpId = new Choice();
        cEmpId.setBounds(250, 100, 200, 20);
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
        
        // 1. Name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(200, 150, 150, 30);
        labelname.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelname);
        
        // 2. Father Name
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblfname);
        
        JLabel labelfname = new JLabel();
        labelfname.setBounds(600, 150, 150, 30);
        labelfname.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelfname);
        
        // 3. Employee Id
        JLabel lblempid = new JLabel("Employee Id");
        lblempid.setBounds(50, 200, 200, 30);
        lblempid.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblempid);
        
        labelempId = new JLabel();
        labelempId.setBounds(200, 200, 200, 30);
        labelempId.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelempId);
        
         // 4. Date Of Joining
        JLabel lbldoj = new JLabel("Date Of Birth");
        lbldoj.setBounds(400, 200, 200, 30);
        lbldoj.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldoj);
        
        JLabel labeldoj = new JLabel();
        labeldoj.setBounds(600, 200, 150, 30);
        labeldoj.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labeldoj);
        
        // 5. Address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        // 6. Phone
        JLabel lblphone = new JLabel("Contact");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        // 7. Email
        JLabel lblemail = new JLabel("Email I'D");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        // 8. Shift
        JLabel lblshift = new JLabel("Shift");
        lblshift.setBounds(400, 300, 200, 30);
        lblshift.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblshift);
                        
        tfshift = new JTextField();
        tfshift.setBounds(600, 300, 150, 30);
        add(tfshift);
                
        // 9. Qualification
        JLabel lblqualification = new JLabel("Qualification");
        lblqualification.setBounds(50, 350, 200, 30);
        lblqualification.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblqualification);
        
        tfqualification = new JTextField();
        tfqualification.setBounds(200, 350, 150, 30);
        tfqualification.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(tfqualification);
        
        // 10. Salary
        JLabel lblsalary = new JLabel("Salary");
        lblsalary.setBounds(400, 350, 200, 30);
        lblsalary.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 350, 150, 30);
        tfsalary.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(tfsalary);
        
        // 11. Designation
        JLabel lbldesignation = new JLabel("Designation");
        lbldesignation.setBounds(50, 400, 200, 30);
        lbldesignation.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldesignation);
      
        JLabel labeldesignation = new JLabel();
        labeldesignation.setBounds(200, 400, 150, 30);
        add(labeldesignation);
        
        // 12. Department
        JLabel lbldepartment = new JLabel("Department");
        lbldepartment.setBounds(400, 400, 200, 30);
        lbldepartment.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldepartment);
        
        tfdepartment = new JTextField();
        tfdepartment.setBounds(600, 400, 150, 30);
        add(tfdepartment);
        
        try{
            Conn c = new Conn();
            String query = "select * from staff where empId='"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldoj.setText(rs.getString("doj"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfshift.setText(rs.getString("shift"));
                tfqualification.setText(rs.getString("qualification"));
                tfsalary.setText(rs.getString("salary"));
                labelempId.setText(rs.getString("empId"));
                labeldesignation.setText(rs.getString("designation"));
                tfdepartment.setText(rs.getString("department"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try{
            Conn c = new Conn();
            String query = "select * from staff where empId='"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldoj.setText(rs.getString("doj"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfshift.setText(rs.getString("shift"));
                tfqualification.setText(rs.getString("qualification"));
                tfsalary.setText(rs.getString("salary"));
                labelempId.setText(rs.getString("empId"));
                labeldesignation.setText(rs.getString("degination"));
                tfdepartment.setText(rs.getString("department"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
            }
        });
        
        Update = new JButton("Update");
        Update.setBounds(250, 500, 120, 30);
        Update.setBackground(Color.BLACK);
        Update.setForeground(Color.WHITE);
        Update.addActionListener(this);
        Update.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(Update);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 500, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 650);
        add(image);
        
                                        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == Update) {
            String empId = labelempId.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String shift = tfshift.getText();
            String qualification = tfqualification.getText();
            String salary = tfsalary.getText();
            String department = tfdepartment.getText();
            
            try {
                String query ="update staff set address='"+address+"', phone='"+phone+"', email='"+email+"', shift='"+shift+"', qualification='"+qualification+"', salary='"+salary+"', department='"+department+"' where empId='"+empId+"'";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "staff Details Updated Successfully");
                setVisible(false);
                
            } catch(Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new UpdateStaff();
    }
}
