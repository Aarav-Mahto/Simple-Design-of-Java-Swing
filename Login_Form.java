import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login_Form extends JFrame {
    Container c;
    JLabel name = new JLabel("UserName: ");
    JTextField uName = new JTextField();
    JLabel pass = new JLabel("Password: ");
    JLabel msg = new JLabel();
    JPasswordField password = new JPasswordField();
    JButton btn = new JButton("LogIn");

    Login_Form(String title){
        this.setTitle(title);
        this.setSize(600,500);
        this.setLocation(100,100);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.MAGENTA);
        c = this.getContentPane();
        c.setLayout(null);
        Font f = new Font("Arial",1,15);

        name.setBounds(90,100,100,50);
        name.setFont(f);
        c.add(name);

        uName.setBounds(200,110,200,30);
        uName.setFont(f);
        c.add(uName);

        pass.setBounds(100,170,100,50);
        pass.setFont(f);
        c.add(pass);

        password.setBounds(200,180,200,30);
        password.setFont(f);
        password.setEchoChar('*');
        c.add(password);

        btn.setBounds(200,300,100,40);
        btn.setFont(f);
        btn.setBorder(null);
        c.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(uName.getText()==""){
                    msg.setText("Invalid User");
                    msg.setBounds(110,20,200,50);
                    msg.setForeground(Color.red);
                    msg.setFont(f);
                    c.add(msg);
                }else {
                    JFrame f = new JFrame("Verifying...");
                    f.setVisible(true);
                    f.setBounds(200, 150, 300, 200);
                    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    f.setResizable(false);
                    Container c1 = f.getContentPane();
                    JLabel lb = new JLabel("Logged In Successfully...");
                    Font f1 = new Font("Arial", 1, 15);
                    lb.setText("UserName: "+uName.getText());
                    lb.setFont(f1);
                    c1.add(lb);

                    JLabel ps = new JLabel("Logged In Successfully...");
                    ps.setText("Password: "+password.getText());
                    ps.setFont(f1);
                    c1.add(lb);
                }
            }
        });

    }

    public static void main(String[] args) {
        Login_Form login = new Login_Form("Login");
        //c.setBackground(Color.YELLOW);
    }

}
