import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm extends JFrame {
    Container c;
    JLabel l1,l2,gender,dob,ta,infoL,msg;
    JTextField name,mob;
    JTextArea address,info;
    JRadioButton male,female,other;
    JComboBox<String> dd,mm,yy;
    JCheckBox tc;
    JButton submit;
    SimpleForm(){
        this.setTitle("Registration Form");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        c=this.getContentPane();
        Color c1 = new Color(112, 82, 122);
        c.setBackground(c1);
        Font f = new Font("Arial",1,14);

        l1 = new JLabel("Name : ");
        l1.setBounds(70,40,100,30);
        l1.setFont(f);
        c.add(l1);

        name = new JTextField();
        name.setBounds(160,40,200,30);
        name.setFont(f);
        c.add(name);

        l2 = new JLabel("Mobile : ");
        l2.setBounds(70,100,100,30);
        l2.setFont(f);
        c.add(l2);

        mob = new JTextField();
        mob.setBounds(160,100,200,30);
        mob.setFont(f);
        c.add(mob);

        //Gender
        gender = new JLabel("Gender ");
        gender.setBounds(70,150,100,30);
        gender.setFont(new Font("Arial",1,18));
        c.add(gender);

        male = new JRadioButton("Male");
        male.setBounds(150,150,70,30);
        male.setFont(f);
        male.setBackground(c1);
        c.add(male);
        female = new JRadioButton("Female");
        female.setBounds(230,150,80,30);
        female.setFont(f);
        female.setBackground(c1);
        c.add(female);
        other = new JRadioButton("Other");
        other.setBounds(320,150,75,30);
        other.setFont(f);
        other.setBackground(c1);
        c.add(other);
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        String date[]={"01","02","03","04","05","06","07","08","09","10","11","12",
                "13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String month[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
        String[] year={"1990","1991","1992","1993","1994","1995","1996","1997","1998",
                "1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
        dob = new JLabel("D.O.B.");
        dob.setBounds(70,200,50,30);
        dob.setFont(f);
        c.add(dob);
        dd = new JComboBox<String>(date);
        dd.setBounds(150,200,50,25);
        dd.setFont(f);
        c.add(dd);
        mm = new JComboBox<String>(month);
        mm.setBounds(210,200,50,25);
        mm.setFont(f);
        c.add(mm);
        yy  =new JComboBox<String>(year);
        yy.setBounds(270,200,65,25);
        yy.setFont(f);
        c.add(yy);

        ta = new JLabel("Address");
        ta.setBounds(70,270,100,25);
        ta.setFont(f);
        c.add(ta);
        address = new JTextArea();
        address.setBounds(180,250,200,80);
        address.setFont(f);
        c.add(address);

        tc = new JCheckBox("Accept Terms & Condition");
        tc.setBounds(110,420,250,25);
        tc.setBackground(c1);
        tc.setFont(f);
        c.add(tc);

        submit = new JButton("Submit");
        submit.setBounds(180,460,70,25);
        submit.setFont(f);
        submit.setBorder(null);
        submit.setForeground(Color.LIGHT_GRAY);
        submit.setBackground(Color.blue);
        c.add(submit);

        info = new JTextArea();
        info.setBounds(420,70,300,350);
        info.setFont(f);
        info.setBorder(null);
        info.setBackground(Color.LIGHT_GRAY);
        info.setLineWrap(true);
        c.add(info);

        infoL = new JLabel("Informations");
        infoL.setBounds(460,35,150,20);
        infoL.setFont(f);
        c.add(infoL);

        msg = new JLabel();
        msg.setBounds(80,500,250,25);
        msg.setFont(f);
        msg.setForeground(Color.RED);
        c.add(msg);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tc.isSelected()){
                    info.setText("Name: "+name.getText()+"\n");
                    info.append("Mobile: "+mob.getText()+"\n");
                    if(male.isSelected())
                        info.append("Gender: Male\n");
                    else if(female.isSelected())
                        info.append("Gender: Female\n");
                    else if(other.isSelected())
                        info.append("Gender: Other\n");
                    else
                        info.append("Gender: Not Selected\n");
                    info.append("DOB:  "+dd.getSelectedItem()+"/"+mm.getSelectedItem()+"/"+yy.getSelectedItem()+"\n");
                    info.append("Address: "+address.getText()+"\n");
                }
                else {
                    msg.setText("Please Select the terms & conditions!");
                }
            }
        });
    }
    public static void main(String[] args) {
        SimpleForm frame = new SimpleForm();
        frame.setBounds(100,100,800,700);
    }
}

