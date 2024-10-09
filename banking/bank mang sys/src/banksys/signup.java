package banksys;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField textName,textFname,textEmail,textAdd,textCity,textState,textPin;
    JDateChooser dateChooser;

    Random ran=new Random();
    long f4=(ran.nextLong() % 9000l)+1000L;
    String f=""+Math.abs(f4);

    signup(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("iconss/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1= new JLabel("APPLICATION FORM NO."+ f);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);

        JLabel label2= new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3= new JLabel("Personal Details");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName= new JLabel("Name :");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName= new JLabel("Father's Name :");
        labelfName.setFont(new Font("Ralway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname=new JTextField();
        textFname.setFont(new Font("Ralway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel dob= new JLabel("Date of Birth :");
        dob.setFont(new Font("Ralway",Font.BOLD,20));
        dob.setBounds(100,340,200,30);
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,30));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG= new JLabel("Gender :");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1=new JRadioButton("Female");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(450,290,90,30);
        add(r1);

        r2=new JRadioButton("male");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(300,290,60,30);
        add(r2);

        ButtonGroup b=new ButtonGroup();
        b.add(r1);
        b.add(r2);

        JLabel labelEmail= new JLabel("Email Address :");
        labelEmail.setFont(new Font("Ralway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Ralway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs= new JLabel("Marital Status :");
        labelMs.setFont(new Font("Ralway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Ralway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Ralway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Ralway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(600,440,100,30);
        add(m3);


        ButtonGroup b1=new ButtonGroup();
        b1.add(m1);
        b1.add(m2);
        b1.add(m3);



        JLabel labelAdd= new JLabel("Address :");
        labelAdd.setFont(new Font("Ralway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Ralway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity= new JLabel("City :");
        labelCity.setFont(new Font("Ralway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity=new JTextField();
        textCity.setFont(new Font("Ralway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelpin= new JLabel("Pin Code :");
        labelpin.setFont(new Font("Ralway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textPin=new JTextField();
        textPin.setFont(new Font("Ralway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelstate= new JLabel("State :");
        labelstate.setFont(new Font("Ralway",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textState=new JTextField();
        textState.setFont(new Font("Ralway",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next=new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);




        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
     String formno=f;
     String name= textName.getText();
     String fname= textFname.getText();
     String dob= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
     String gender=null;
     if(r1.isSelected()){
      gender="female";
     }else if(r2.isSelected()){
      gender="male";

     }
     String email=textEmail.getText();
     String marital=null;
      if(m1.isSelected()){
       marital="Married";
      }else if(m2.isSelected()){
      marital="Unmarried";
     }else if(m3.isSelected()){
       marital="Other";
      }

     String address=textAdd.getText();
     String city=textCity.getText();
     String pincode=textPin.getText();
     String state=textState.getText();

     try{
      if(textName.getText().equals("")) {
       JOptionPane.showMessageDialog(null, "Fill all the fields.");
      }else{
       con conn1=new con();
       String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
       conn1.statement.executeUpdate(q);
       new signup2(formno);
       setVisible(false);
      }
     }catch(Exception E){
      E.printStackTrace();
     }





    }


    public static void main(String[] args) {
       new signup();
    }

}
