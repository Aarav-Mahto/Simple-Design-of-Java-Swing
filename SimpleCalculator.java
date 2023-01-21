import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    Container c;
    JLabel l1,l2,result;
    JTextField n2,n1;
    JButton add,sub,mul,div;
    SimpleCalculator(){
        this.setTitle("Simple Calculator");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        c= this.getContentPane();
        Font f = new Font("Arial",1,14);

        l1 = new JLabel("First Number");
        l1.setSize(150,30);
        l1.setLocation(40,100);
        l1.setFont(f);
        c.add(l1);

        n1 = new JTextField();
        n1.setSize(150,30);
        n1.setLocation(170,100);
        n1.setFont(f);
        c.add(n1);

        l2 = new JLabel("Second Number");
        l2.setBounds(40,150,120,30);
        l2.setFont(f);
        c.add(l2);

        n2 = new JTextField();
        n2.setBounds(170,150,150,30);
        n2.setFont(f);
        c.add(n2);

        add = new JButton("+");
        add.setBounds(180,230,50,30);
        add.setFont(f);
        c.add(add);

        sub = new JButton("-");
        sub.setBounds(240,230,50,30);
        sub.setFont(f);
        c.add(sub);

        mul = new JButton("*");
        mul.setBounds(300,230,50,30);
        mul.setFont(f);
        c.add(mul);

        div = new JButton("/");
        div.setBounds(360,230,50,30);
        div.setFont(f);
        c.add(div);

        result = new JLabel("Result ");
        result.setBounds(200,300,400,30);
        result.setFont(f);
        c.add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        try{
            double a = Double.parseDouble(n1.getText());
            double b = Double.parseDouble(n2.getText());
            double rs=0;
            if(e.getSource()==add){
                rs=a+b;
                result.setText("Result : "+rs);
            }
            else if(e.getSource()==sub){
                rs=a-b;
                result.setText("Result : "+rs);
            }
            else if(e.getSource()==mul){
                rs=a*b;
                result.setText("Result : "+rs);
            }
            else if(e.getSource()==div){
                if(b==0){
                    result.setText("Result : Divide by zero is not possible");
                    result.setForeground(Color.RED);
                }else {
                    rs = a / b;
                    result.setText("Result : " + rs);
                }
            }
        }
        catch(Exception e1){
            result.setText("Please Enter only integer");
            result.setForeground(Color.RED);
        }
    }
    public static void main(String[] args) {
        SimpleCalculator frame = new SimpleCalculator();
        frame.setBounds(100,100,700,500);
    }
}

