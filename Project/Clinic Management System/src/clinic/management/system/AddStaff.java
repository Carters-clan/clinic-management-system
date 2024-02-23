package clinic.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddStaff extends JFrame implements ActionListener {
  
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfsalary;
    JLabel labelempId;
    JDateChooser dcdoj;
    JComboBox cbdesignation, cbdepart, cbshift, cbqualification;
    JButton submit, cancel;
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    AddStaff() {
        
        setSize(900, 700);
        setLocation(250, 50);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        //Heading
        JLabel heading = new JLabel("NEW STAFF DETAILS");
        heading.setBounds(220, 30, 500, 50);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        // 1. Name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblname.setForeground(Color.BLACK);
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        // 2. Father Name
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblfname.setForeground(Color.BLACK);
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        // 3. Employee ID
        JLabel lblempID = new JLabel("Employye ID");
        lblempID.setBounds(50, 200, 200, 30);
        lblempID.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblempID.setForeground(Color.BLACK);
        add(lblempID);
        
        labelempId = new JLabel("EMP_"+first4);
        labelempId.setBounds(200, 200, 200, 30);
        labelempId.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
        labelempId.setForeground(Color.BLACK);
        add(labelempId);
        
         // 4. Date Of Joining
        JLabel lbldoj = new JLabel("Date Of Joining");
        lbldoj.setBounds(400, 200, 200, 30);
        lbldoj.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lbldoj.setForeground(Color.BLACK);
        add(lbldoj);
        
        dcdoj = new JDateChooser();
        dcdoj.setBounds(600, 200, 150, 30);
        add(dcdoj);
        
        // 5. Address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lbladdress.setForeground(Color.BLACK);
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        // 6. Phone
        JLabel lblphone = new JLabel("Contact");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblphone.setForeground(Color.BLACK);
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        // 7. Email
        JLabel lblemail = new JLabel("Email ID");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblemail.setForeground(Color.BLACK);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        // 8. shift Timing
        JLabel lblshift = new JLabel("Shift");
        lblshift.setBounds(400, 300, 200, 30);
        lblshift.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblshift.setForeground(Color.BLACK);
        add(lblshift);
              
        String shift[] = {"Morning", "Afternoon", "Night" };
        cbshift = new JComboBox(shift);
        cbshift.setBounds(600, 300, 150, 30);
        cbshift.setBackground(Color.WHITE);
        add(cbshift);
        
         // 9. Qualification
        JLabel lblqual = new JLabel("Qualification");
        lblqual.setBounds(50, 350, 200, 30);
        lblqual.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblqual.setForeground(Color.BLACK);
        add(lblqual);
                     
        String course[] = {"BCA", "MCA", "B.Tech","M.Tech", "BSC", "MSC", "BBA", "MBA", "B.Com", "M.Com", "B.Tech", "M.Tech", "BA", "MA" };
        cbqualification = new JComboBox(course);
        cbqualification.setBounds(200, 350, 150, 30);
        cbqualification.setBackground(Color.WHITE);
        add(cbqualification);
        
        // 10. salary
        JLabel lblsalary = new JLabel("Salary");
        lblsalary.setBounds(400, 350, 200, 30);
        lblsalary.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblsalary.setForeground(Color.BLACK);
        add(lblsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 350, 150, 30);
        add(tfsalary);
        
        // 11. Designation
        JLabel lblDesig = new JLabel("Designation");
        lblDesig.setBounds(50, 400, 200, 30);
        lblDesig.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lblDesig.setForeground(Color.BLACK);
        add(lblDesig);
        
        String post[] = {"Docter", "Dietitian", "Licensed practical nurse", "Registered nurse", "Surgent", "Specialist", "Social worker", "Physician's assistants", "Patient advocate", "Patient care tecnician", "Physical therapists", "Hospital Pharmacits", "Interpreters", "Rapid response team", "Cleanliness and Hygiene", "Other team member"};
        cbdesignation = new JComboBox(post);
        cbdesignation.setBounds(200, 400, 150, 30);
        cbdesignation.setBackground(Color.WHITE);
        add(cbdesignation);
        
        // 12. Department
        JLabel lbldepartment = new JLabel("Department");
        lbldepartment.setBounds(400, 400, 200, 30);
        lbldepartment.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
        lbldepartment.setForeground(Color.BLACK);
        add(lbldepartment);
        
        String depart[] = {"Anesthetics", "Breast Screening", "Cardiology", "Ear, nose & throat(ENT)", "Elderly Service department", "Gastroenterology", "General Surgery", "Gynecology", "Hematology", "Neonatal Unit", "Neurology", "Nutrition and dietetics", "Obsterics and gynecolgy units", "Oncology", "Ophthalmology", "Orthopedics", "Physiotherapy", "Renal Unit", "Sexual Health", "Urology"};
        cbdepart = new JComboBox(depart);
        cbdepart.setBounds(600, 400, 150, 30);
        cbdepart.setBackground(Color.WHITE);
        add(cbdepart);
        
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
        note.setForeground(Color.BLUE);
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
            String empId = labelempId.getText();
            String doj = ((JTextField) dcdoj.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String shift = (String)cbshift.getSelectedItem();
            String qualification = (String) cbqualification.getSelectedItem();
            String salary = tfsalary.getText();
            String designation = (String)cbdesignation.getSelectedItem();
            String department = (String) cbdepart.getSelectedItem();
            
            if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name Should not be Empty");
            return;
            } if (fname.equals("")) {
            JOptionPane.showMessageDialog(null, "Father's Name Should not be Empty");
            return;
            } if (doj.equals("")) {
            JOptionPane.showMessageDialog(null, "Date of Joining Should not be Empty");
            return;
            } if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address Should not be Empty");
            return;
            } if (phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Phone Number Should not be Empty");
            return;
            } if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email Address Should not be Empty");
            return;
            } if (salary.equals("")) {
            JOptionPane.showMessageDialog(null, "Salary Field Should not be Empty");
            return;
            }
            
            try {
                String query ="insert into staff values('"+name+"', '"+fname+"', '"+empId+"','"+doj+"', '"+address+"', '"+phone+"', '"+email+"', '"+shift+"', '"+qualification+"', '"+salary+"', '"+designation+"', '"+department+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Staff Inserted Successfully");
                setVisible(false);
                
            } catch(Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddStaff();
    }
}
