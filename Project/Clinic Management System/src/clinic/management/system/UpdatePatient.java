package clinic.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdatePatient extends JFrame implements ActionListener {

JTextField  tfaddress, tfphone, tfemail, tfdepart, tfcharges, tfdname;
    JLabel labelpatientID;
    JButton Update, cancel;
    Choice cpatientId;
    
    UpdatePatient() {
        
        setSize(900, 650);
        setLocation(250, 50);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
                
        //Heading
        JLabel heading = new JLabel("UPDATE PATIENT DETAILS");
        heading.setBounds(50, 10, 500, 50);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
        add(heading);
        
        JLabel lblrollnumber = new JLabel("Select Patient ID");
        lblrollnumber.setBounds(50, 100, 200, 20);
        lblrollnumber.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(lblrollnumber);
        
        cpatientId = new Choice();
        cpatientId.setBounds(250, 100, 200, 20);
        add(cpatientId);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from patient");
            while(rs.next()) {
                cpatientId.add(rs.getString("patientID"));
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
        
        // 3. Patient Id
        JLabel lblPatientID = new JLabel("Patient Id");
        lblPatientID.setBounds(50, 200, 200, 30);
        lblPatientID.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblPatientID);
        
        labelpatientID = new JLabel();
        labelpatientID.setBounds(200, 200, 200, 30);
        labelpatientID.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labelpatientID);
        
        // 4. Dr. Name
        JLabel lbldname = new JLabel("Dr. Name");
        lbldname.setBounds(400, 200, 200, 30);
        lbldname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldname);
        
        tfdname = new JTextField();
        tfdname.setBounds(600, 200, 150, 30);
        add(tfdname);
        
        // 5. Room Number
        JLabel lblroom = new JLabel("Room Number");
        lblroom.setBounds(50, 250, 200, 30);
        lblroom.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblroom);
        
        JLabel labelroom = new JLabel();
        labelroom.setBounds(200, 250, 150, 30);
        add(labelroom); 
       
         // 6. Department
        JLabel lbldepart = new JLabel("Department");
        lbldepart.setBounds(400, 250, 200, 30);
        lbldepart.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldepart);
        
        tfdepart = new JTextField();
        tfdepart.setBounds(600, 250, 150, 30);
        add(tfdepart);
        
         // 7. Phone
        JLabel lblphone = new JLabel("Contact");
        lblphone.setBounds(50, 300, 200, 30);
        lblphone.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200, 300, 150, 30);
        add(tfphone);
        
        // 8. Email
        JLabel lblemail = new JLabel("Email I'D");
        lblemail.setBounds(400, 300, 200, 30);
        lblemail.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(600, 300, 150, 30);
        add(tfemail);
        
        // 9. Address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 350, 200, 30);
        lbladdress.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 350, 150, 30);
        add(tfaddress); 
                             
        // 10. charges
        JLabel lblcharges = new JLabel("Charges");
        lblcharges.setBounds(400, 350, 200, 30);
        lblcharges.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblcharges);
        
        tfcharges = new JTextField();
        tfcharges.setBounds(600, 350, 150, 30);
        tfcharges.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(tfcharges);
        
        // 11. Deseasse
        JLabel lbldesease = new JLabel("Desease");
        lbldesease.setBounds(50, 400, 200, 30);
        lbldesease.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldesease);
      
        JLabel labeldesease = new JLabel();
        labeldesease.setBounds(200, 400, 150, 30);
        add(labeldesease);
        
        // 12. Date Of Joining
        JLabel lbldoj = new JLabel("Date Of Joining");
        lbldoj.setBounds(400, 400, 200, 30);
        lbldoj.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldoj);
        
        JLabel labeldoj = new JLabel();
        labeldoj.setBounds(600, 400, 150, 30);
        labeldoj.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        add(labeldoj);
        
        try{
            Conn c = new Conn();
            String query = "select * from patient where patientID='"+cpatientId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                tfdname.setText(rs.getString("dname"));
                labelroom.setText(rs.getString("room"));
                tfdepart.setText(rs.getString("depart"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfaddress.setText(rs.getString("address"));
                tfcharges.setText(rs.getString("charges"));
                labelpatientID.setText(rs.getString("patientID"));
                labeldesease.setText(rs.getString("desease"));
                labeldoj.setText(rs.getString("doj"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cpatientId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try{
            Conn c = new Conn();
            String query = "select * from patient where patientID='"+cpatientId.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                tfdname.setText(rs.getString("dname"));
                labelroom.setText(rs.getString("room"));
                tfdepart.setText(rs.getString("depart"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfaddress.setText(rs.getString("address"));
                tfcharges.setText(rs.getString("charges"));
                labelpatientID.setText(rs.getString("patientID"));
                labeldesease.setText(rs.getString("desease"));
                labeldoj.setText(rs.getString("doj"));
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
            String patientID = labelpatientID.getText();
            String dname = tfdname.getText();
            String depart = tfdepart.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String address = tfaddress.getText();
            String charges = tfcharges.getText();
            
            
            try {
                String query ="update patient set dname='"+dname+"', depart='"+depart+"', phone='"+phone+"', email='"+email+"', address='"+address+"', charges='"+charges+"' where patientID='"+patientID+"'";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Patient Details Updated Successfully");
                setVisible(false);
                
            } catch(Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new UpdatePatient();
    }
}