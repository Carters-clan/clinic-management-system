package clinic.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddPatient extends JFrame implements ActionListener {
  
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfdname, tfcharges;
    JLabel labelpatient, labelroom;
    JDateChooser dcdoj;
    JComboBox  cbdepart, cbdesease;
    JButton submit, cancel;
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    Random room = new Random();
    long first2 = Math.abs((room.nextLong() % 90L) + 100L);
    
    AddPatient() {
        
        setSize(900, 700);
        setLocation(250, 50);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        //Heading 
        JLabel heading = new JLabel("NEW PATIENT DETAILS");
        heading.setBounds(220, 30, 500, 50);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 40));
        add(heading);
        
        // 1. Name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        // 2. Father Name
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        // 3. Patient Id
        JLabel lblpatient = new JLabel("Patient ID");
        lblpatient.setBounds(50, 200, 200, 30);
        lblpatient.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblpatient);
        
        labelpatient = new JLabel("P_"+first4);
        labelpatient.setBounds(200, 200, 200, 30);
        labelpatient.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(labelpatient);
        
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
        
        labelroom = new JLabel("Room_"+first2);
        labelroom.setBounds(200, 250, 150, 30);
        labelroom.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(labelroom);
        
        // 6. Department
        JLabel lbldepart = new JLabel("Department");
        lbldepart.setBounds(400, 250, 200, 30);
        lbldepart.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldepart);
        
        String depart[] = {"Anesthetics", "Breast Screening", "Cardiology", "Ear, nose & throat(ENT)", "Elderly Service department", "Gastroenterology", "General Surgery", "Gynecology", "Hematology", "Neonatal Unit", "Neurology", "Nutrition and dietetics", "Obsterics and gynecolgy units", "Oncology", "Ophthalmology", "Orthopedics", "Physiotherapy", "Renal Unit", "Sexual Health", "Urology" };
        cbdepart = new JComboBox(depart);
        cbdepart.setBounds(600, 250, 150, 30);
        cbdepart.setBackground(Color.WHITE);
        add(cbdepart);
        
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
        
         // 10. Charges
        JLabel lblcharges = new JLabel("Charges");
        lblcharges.setBounds(400, 350, 200, 30);
        lblcharges.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lblcharges);
        
        tfcharges = new JTextField();
        tfcharges.setBounds(600, 350, 150, 30);
        add(tfcharges);
        
        // 11. Deseases
        JLabel lbldesease = new JLabel("Desease");
        lbldesease.setBounds(50, 400, 200, 30);
        lbldesease.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldesease);
        
        String desease[] = {"Brain Desease", "Bones Desease", "Cold", "Cough", "Cancer", "Fever", "Heart Desease", "Infaction"};
        cbdesease = new JComboBox(desease);
        cbdesease.setBounds(200, 400, 150, 30);
        cbdesease.setBackground(Color.WHITE);
        add(cbdesease);
        
         //  12. Date Of Joining
        JLabel lbldoj = new JLabel("Date Of Joining");
        lbldoj.setBounds(400, 400, 200, 30);
        lbldoj.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        add(lbldoj);
        
        dcdoj = new JDateChooser();
        dcdoj.setBounds(600, 400, 150, 30);
        add(dcdoj);
                                                 
        submit = new JButton("Submit");
        submit.setBounds(250, 500, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 500, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        //Note
        JLabel note = new JLabel("NOTE : Verify your details before submiting. It will be not changed or modify in future");
        note.setBounds(150, 550, 600, 50);
        note.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        note.setForeground(Color.RED);
        add(note);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/addinfo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 700);
        add(image);
                                        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String patientID = labelpatient.getText();
            String dname = tfdname.getText();
            String room = labelroom.getText();
            String depart = (String) cbdepart.getSelectedItem();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String address = tfaddress.getText();
            String charges = tfcharges.getText();
            String desease = (String) cbdesease.getSelectedItem();
            String doj = ((JTextField) dcdoj.getDateEditor().getUiComponent()).getText();
            
             if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name Should not be Empty");
            return;
            } if (fname.equals("")) {
            JOptionPane.showMessageDialog(null, "Father's Name Should not be Empty");
            return;
            } if (dname.equals("")) {
            JOptionPane.showMessageDialog(null, "Dr. Name Should not be Empty");
            return;
            } if (phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Phone Number Should not be Empty");
            return;
            } if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email Address Should not be Empty");
            return;
            } if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address Should not be Empty");
            return;
            } if (charges.equals("")) {
            JOptionPane.showMessageDialog(null, "Charges Should not be Empty");
            return;
            } if (doj.equals("")) {
            JOptionPane.showMessageDialog(null, "Date of Joining Should not be Empty");
            return;
            }
            
            try {
                String query ="insert into patient values('"+name+"', '"+fname+"', '"+patientID+"', '"+dname+"', '"+room+"', '"+depart+"', '"+phone+"', '"+email+"', '"+address+"', '"+charges+"', '"+desease+"', '"+doj+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Patient Details Inserted Successfully");
                setVisible(false);
                
            } catch(Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddPatient();
    }
}