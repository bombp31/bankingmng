package banksys;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposite extends JFrame implements ActionListener {
    String pin;
    TextField textfield;
    JButton b1,b2;

    deposite(String pin){
        this.pin= pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("iconss/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1= new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Ralway",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        textfield=new TextField();
        textfield.setBackground(new Color(65,125,128));
        textfield.setForeground(Color.WHITE);
        textfield.setFont(new Font("Ralway",Font.BOLD,22));
        textfield.setBounds(460,230,320,25);
        l3.add(textfield);

        b1=new JButton("DEPOSIT");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(700,360,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("BACK");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,406,150,35);
        b2.addActionListener(this);
        l3.add(b2);






        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {

        try {
            String amount = textfield.getText();
            Date date = new Date();
            if(e.getSource()==b1){
                if (textfield.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Deposit");
                }else{
                    con c=new con();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            }else if(e.getSource()==b2){
                setVisible(false);
                new main_class(pin);


            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }


    public static void main(String[] args) {
      new deposite("");

}
    }

