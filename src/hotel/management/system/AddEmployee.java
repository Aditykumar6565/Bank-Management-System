package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField tfname,tfemail,tfphone,tfage,tfsalary,tfaadhar;
    JRadioButton rbmale,rbfemale;
    JButton submit;
    JComboBox cbjob;
    AddEmployee() {
        setLayout(null);
        JLabel lablname = new JLabel("NAME");
        lablname.setBounds(60,30,120,30);
        lablname.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lablname);

         tfname = new JTextField();
        tfname.setBounds(200,30,150,30);
        add(tfname);

        JLabel lablage = new JLabel("AGE");
        lablage.setBounds(60,80,120,30);
        lablage.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lablage);

         tfage = new JTextField();
        tfage.setBounds(200,80,150,30);
        add(tfage);


        JLabel lablgender = new JLabel("GENDER");
        lablgender.setBounds(60,130,120,30);
        lablgender.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lablgender);

         rbmale = new JRadioButton("Male");
        rbmale.setBounds(200,130,70,30);
        rbmale.setFont(new Font("Tahoma",Font.PLAIN,14));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);


         rbfemale = new JRadioButton("female");
        rbfemale.setBounds(280,130,70,30);
        rbfemale.setFont(new Font("Tahoma",Font.PLAIN,14));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbmale);
        bg.add(rbfemale);


        JLabel labljob = new JLabel("JOB");
        labljob.setBounds(60,180,120,30);
        labljob.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(labljob);

        String str[] ={"Front Desk Clerks","Porters","HouseKeeper","Kitechen Staff","Room Service","Chefs","Waiter/Waitress","Manager","Accountant"};
        JComboBox cbjob = new JComboBox<>(str);
        cbjob.setBounds(200,180,150,30);
        cbjob.setBackground(Color.WHITE);
        add(cbjob);

        JLabel lablemail = new JLabel("EMAIL");
        lablemail.setBounds(60,330,120,30);
        lablemail.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lablemail);

         tfemail = new JTextField();
        tfemail.setBounds(200,330,150,30);
        add(tfemail);

        JLabel lablsalary = new JLabel("SALARY");
        lablsalary.setBounds(60,230,120,30);
        lablsalary.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lablsalary);

         tfsalary = new JTextField();
        tfsalary.setBounds(200,230,150,30);
        add(tfsalary);

        JLabel lablphone = new JLabel("PHONE");
        lablphone.setBounds(60,280,120,30);
        lablphone.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lablphone);

        tfphone = new JTextField();
        tfphone.setBounds(200,280,150,30);
        add(tfphone);

        JLabel lablaadhar = new JLabel("AADHAR");
        lablaadhar.setBounds(60,380,120,30);
        lablaadhar.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lablaadhar);

        tfaadhar = new JTextField();
        tfaadhar.setBounds(200,380,150,30);
        add(tfaadhar);

        JButton submit = new JButton("SUBMIT");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(200,430,150,30);
        add(submit);


        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image i2 = il.getImage().getScaledInstance(450,450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380,60,450,370);
        add(image);




        getContentPane().setBackground(Color.WHITE);

        setBounds(350, 200, 850,540);
        setVisible(true);
    }

    public void  actionPerformed(ActionEvent ae) {
        String name = tfname.getText();
        String age = tfage.getText();
        String salary = tfsalary.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
        String aadhar = tfaadhar.getText();

        String gender =  null;
        if (rbmale.isSelected()) {
            gender = "Male";
        }else if (rbfemale.isSelected()) {
            gender = "Female";
        }

        String job = (String) cbjob.getSelectedItem();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
