package clinic.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Random;

public class AddRooms extends JFrame implements ActionListener {
    JLabel heading, lblroomno, lblavailable, lbltype, lblprice, lblfaclities;
    JTextField tfroom, tfprice;
    JComboBox cbavailable, cbtype, cbfacilities;
    JButton submit, cancel, check;
    
    Random ran = new Random();
    long first3 = Math.abs((ran.nextLong() % 500L) + 100L);
    
    AddRooms() {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        // Heading
        heading = new JLabel("ADD ROOMS");
        heading.setBounds(150, 20, 200, 30);
        heading.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
        add(heading);
        
        //Room No
        lblroomno = new JLabel("Rooms Number");
        lblroomno.setBounds(60, 80, 120, 30);
        lblroomno.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lblroomno);
        
        tfroom = new JTextField("R-"+first3);
        tfroom.setBounds(200, 80, 150, 30);
        add(tfroom);
        
        //Room Available
        lblavailable = new JLabel("Available Rooms");
        lblavailable.setBounds(60, 130, 120, 30);
        lblavailable.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lblavailable);
        
        String availableOptions[] = {"Available", "Occupied"};
        cbavailable = new JComboBox(availableOptions);
        cbavailable.setBounds(200, 130, 150, 30);
        cbavailable.setBackground(Color.WHITE);
        add(cbavailable);
        
        //Room Type
        lbltype = new JLabel("Room Type");
        lbltype.setBounds(60, 180, 120, 30);
        lbltype.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lbltype);
        
        String typeOptions[] = {"Normal", "Emergency"};
        cbtype = new JComboBox(typeOptions);
        cbtype.setBounds(200, 180, 150, 30);
        cbtype.setBackground(Color.WHITE);
        add(cbtype);
        
        //facilities
        lblfaclities = new JLabel("Facilities");
        lblfaclities.setBounds(60, 230, 120, 30);
        lblfaclities.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lblfaclities);
        
        String facilities[] = {"General_Ward", "Special_Ward", "Test_Rooms", "Waiting Rooms", "Emergency", "Operation_Theatre", "ICU", "Storage_Rooms", "Bank" };
        cbfacilities = new JComboBox(facilities);
        cbfacilities.setBounds(200, 230, 150, 30);
        cbfacilities.setBackground(Color.WHITE);
        add(cbfacilities);
      
        //Price
        lblprice = new JLabel("Amount");
        lblprice.setBounds(60, 280, 120, 30);
        lblprice.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
        add(lblprice);
        
        tfprice = new JTextField();
        tfprice.setBounds(200, 280, 150, 30);
        add(tfprice);
        
        //Check
        check = new JButton("CHECK");
        check.setBounds(30, 350, 100, 30);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.addActionListener(this);
        add(check);

        // Submit Button
        submit = new JButton("SUBMIT");
        submit.setBounds(150, 350, 100, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
         // Cancel Button
        cancel = new JButton("Cancel");
        cancel.setBounds(270, 350, 100, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/room.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 30, 500, 350);
        add(image);
              
        setBounds(250, 180, 940, 470);
        setVisible(true);
       
    } 
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == check) {
            String type = (String) cbtype.getSelectedItem();
            String facilities = (String) cbfacilities.getSelectedItem();
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from price where type = '"+type+"'");
                while(rs.next()) {
                    tfprice.setText(rs.getString(facilities));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
          } else if (ae.getSource() == submit) {
            String roomnumber = tfroom.getText();
            String availability =  (String)cbavailable.getSelectedItem();
            String roomtype =  (String)cbtype.getSelectedItem();
            String facilities =  (String)cbfacilities.getSelectedItem();
            String price = tfprice.getText();
                        
            try {
                Conn conn = new Conn();
                String str = "insert into room Values('"+roomnumber+"', '"+availability+"', '"+roomtype+"', '"+facilities+"', '"+price+"')";
                
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "Room Added Succeussfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
                      
        } else {
            setVisible(false);
        }
        
    }
    
    public static void main(String[] agrs) {
        new AddRooms();
    }
}