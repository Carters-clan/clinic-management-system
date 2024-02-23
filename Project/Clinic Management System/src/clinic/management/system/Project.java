package clinic.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    
    
    Project(){
        setSize(1366, 768);
            
        JLabel heading = new JLabel("AMIT GUSAIN");
        heading.setBounds(565, 550, 400, 30);
        heading.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel heading2 = new JLabel("We believe in healing with feeling.");
        heading2.setBounds(480, 600, 400, 30);
        heading2.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
        add(heading2);
        
        JLabel heading3 = new JLabel("For Support : 7289095248");
        heading3.setBounds(1100, 650, 400, 20);
        heading3.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(heading3);
        
        JLabel heading4 = new JLabel("amit89339@gmail.com");
        heading4.setBounds(1130, 680, 400, 20);
        heading4.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
        add(heading4);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/main.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1350, 705, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
        // New Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        JMenuItem staffInfo = new JMenuItem("New Staff Information");
        staffInfo.setBackground(Color.WHITE);
        staffInfo.addActionListener(this);
        newInformation.add(staffInfo);
        
        JMenuItem patientInfo = new JMenuItem("New Patient Information");
        patientInfo.setBackground(Color.WHITE);
        patientInfo.addActionListener(this);
        newInformation.add(patientInfo);
                
        //Facilities
        JMenu room = new JMenu("Facilities");
        room.setForeground(Color.RED);
        mb.add(room);               
        
        JMenuItem AddRoom = new JMenuItem("Add Rooms");
        AddRoom.setBackground(Color.WHITE);
        AddRoom.addActionListener(this);
        room.add(AddRoom);
        
        JMenuItem Amb = new JMenuItem("Ambulence Service");
        Amb.setBackground(Color.WHITE);
        Amb.addActionListener(this);
        room.add(Amb);                 
               
        //Leave
        JMenu leave = new JMenu("Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        JMenuItem applyleave = new JMenuItem("Apply Leave");
        applyleave.setBackground(Color.WHITE);
        applyleave.addActionListener(this);
        leave.add(applyleave);
        
        JMenuItem checkleave = new JMenuItem("Check Leave");
        checkleave.setBackground(Color.WHITE);
        checkleave.addActionListener(this);
        leave.add(checkleave);
        
        //Update Information
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add(updateInfo);
        
        JMenuItem updatestaffinfo = new JMenuItem("Update Staff Details");
        updatestaffinfo.setBackground(Color.WHITE);
        updatestaffinfo.addActionListener(this);
        updateInfo.add(updatestaffinfo);
        
        JMenuItem updatepatientinfo = new JMenuItem("Update Patient Details");
        updatepatientinfo.setBackground(Color.WHITE);
        updatepatientinfo.addActionListener(this);
        updateInfo.add(updatepatientinfo);
        
        //Payment Information
        JMenu payment = new JMenu("Payment");
        payment.setForeground(Color.BLUE);
        mb.add(payment);
        
        JMenuItem chargestructure = new JMenuItem("Charges Structure");
        chargestructure.setBackground(Color.WHITE);
        chargestructure.addActionListener(this);
        payment.add(chargestructure);
        
        JMenuItem gateway = new JMenuItem("Payment Gateway");
        gateway.setBackground(Color.WHITE);
        gateway.addActionListener(this);
        payment.add(gateway);
        
        //Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);
        
        JMenuItem staffdetails = new JMenuItem("View Staff Details");
        staffdetails.setBackground(Color.WHITE);
        staffdetails.addActionListener(this);
        details.add(staffdetails);
        
        JMenuItem patientfdetails = new JMenuItem("View Patient Details");
        patientfdetails.setBackground(Color.WHITE);
        patientfdetails.addActionListener(this);
        details.add(patientfdetails);
        
        JMenuItem Roomdetails = new JMenuItem("Room Record");
        Roomdetails.setBackground(Color.WHITE);
        Roomdetails.addActionListener(this);
        details.add(Roomdetails);
        
        JMenuItem Paymentdetails = new JMenuItem("Payment Record");
        Paymentdetails.setBackground(Color.WHITE);
        Paymentdetails.addActionListener(this);
        details.add(Paymentdetails);
        
        JMenuItem Ambulancedetails = new JMenuItem("Ambulance Record");
        Ambulancedetails.setBackground(Color.WHITE);
        Ambulancedetails.addActionListener(this);
        details.add(Ambulancedetails);
        
        //Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        //About
        JMenu about = new JMenu("About");
        about.setForeground(Color.RED);
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
        //Exit
        JMenu exit = new JMenu("Logout");
        exit.setForeground(Color.BLUE);
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
              
        setJMenuBar(mb);
        
        setVisible(true);
    }
            
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")) {
            setVisible(false);
        }
        else if (msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch (Exception e) {
                
            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                
            }
        }  else if (msg.equals("New Staff Information")) {
            new AddStaff();
        }  else if (msg.equals("New Patient Information")) {
            new AddPatient();
        }  else if (msg.equals("View Staff Details")) {
           new Staffdetails(); 
        }  else if (msg.equals("View Patient Details")) {
            new PatientDetails();
        }  else if (msg.equals("Apply Leave")) {
            new Leave();
        }  else if (msg.equals("Check Leave")) {
            new CheckLeave();
        }  else if (msg.equals("Update Staff Details")) {
            new UpdateStaff();
        }  else if (msg.equals("Update Patient Details")) {
            new UpdatePatient();
        }  else if (msg.equals("Add Rooms")) {
            new AddRooms();
        }  else if (msg.equals("Ambulence Service")) {
            new AmbulanceService();
        } else if (msg.equals("Charges Structure")) {
            new ChargesStructure();
        } else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Payment Gateway")) {
            new PaymentGateway();
        } else if (msg.equals("Room Record")) {
            new RoomRecord();
        } else if (msg.equals("Payment Record")) {
            new PaymentRecord();
        } else if (msg.equals("Ambulance Record")) {
            new AmbulanceRecord();
        }
    }
    
    public static void main(String[] args) {
        new Project();
    }
    
}

