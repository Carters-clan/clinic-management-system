package clinic.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AmbulanceService extends JFrame implements ActionListener {
    JLabel heading, lbldname, lblpname, lblnumber, lbltime, lblphone, lbllocation;
    JTextField tfdname, tftime, tfpname, tfphone, tflocation;
    JComboBox cbnumber;
    JButton submit, cancel;
    
   
    AmbulanceService() {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        // Heading
        heading = new JLabel("AMBULANCE SERVICE");
        heading.setBounds(100, 20, 250, 30);
        heading.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
        add(heading);
        
        // Driver Name
        lbldname = new JLabel("Driver Name");
        lbldname.setBounds(60, 70, 120, 30);
        lbldname.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lbldname);
        
        tfdname = new JTextField();
        tfdname.setBounds(200, 70, 150, 30);
        add(tfdname);
        
         //Patient Name
        lblpname = new JLabel("Patient Name");
        lblpname.setBounds(60, 120, 120, 30);
        lblpname.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lblpname);
        
        tfpname = new JTextField();
        tfpname.setBounds(200, 120, 150, 30);
        add(tfpname);
                
        //Ambulane Number
        lblnumber = new JLabel("Ambulance No.");
        lblnumber.setBounds(60, 170, 120, 30);
        lblnumber.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lblnumber);
        
        String number[] = {"DL 4969", "DL 8646", "DL 1614", "DL 5248", "DL 1608"};
        cbnumber = new JComboBox(number);
        cbnumber.setBounds(200, 170, 150, 30);
        cbnumber.setBackground(Color.WHITE);
        add(cbnumber);
        
        //Time
        lbltime = new JLabel("Time");
        lbltime.setBounds(60, 220, 120, 30);
        lbltime.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lbltime);
        
        tftime = new JTextField();
        tftime.setBounds(200, 220, 150, 30);
        add(tftime);
        
        //Patient Contact
        lblphone = new JLabel("Patient Contact");
        lblphone.setBounds(60, 270, 120, 30);
        lblphone.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(200, 270, 150, 30);
        add(tfphone);
        
          //Location
        lbllocation = new JLabel("Location");
        lbllocation.setBounds(60, 320, 120, 30);
        lbllocation.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lbllocation);
        
        tflocation = new JTextField();
        tflocation.setBounds(200, 320, 150, 30);
        add(tflocation);
        
        // Submit Button
        submit = new JButton("SUBMIT");
        submit.setBounds(70, 370, 100, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
         // Cancel Button
        cancel = new JButton("Cancel");
        cancel.setBounds(220, 370, 100, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ambulance.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 30, 500, 350);
        add(image);
              
        setBounds(250, 180, 980, 470);
        setVisible(true);
       
    } 
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String dname = tfdname.getText();
            String pname =  tfpname.getText();
            String number =  (String)cbnumber.getSelectedItem();
            String time =  tftime.getText();
            String phone = tfphone.getText();
            String location = tflocation.getText();
                        
            try {
                Conn conn = new Conn();
                String str = "insert into ambulance Values('"+dname+"', '"+pname+"', '"+number+"', '"+time+"', '"+phone+"', '"+location+"')";
                
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "Ambulance Details Inserted Succeussfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
                      
        } else {
            setVisible(false);
        }
        
    }
    
    public static void main(String[] agrs) {
        new AmbulanceService();
    }
}
