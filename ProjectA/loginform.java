package ProjectA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginform  implements ActionListener {
    JFrame f;
    JLabel usernamelbl;
    JLabel passwordlbl;
    JTextField usernametxt;
    JPasswordField passwordtxt;
    JButton loginbtn,resetbtn,canclebtn;

    public loginform()
    {
        f=new JFrame("loginform");
        f.setSize(400,400);

        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        usernamelbl=new JLabel("username");
        usernamelbl.setBounds(30,30,200,30);//changed after adding setlayout(null);
        usernamelbl.setForeground(Color.GRAY);//for color
        usernamelbl.setFont(new Font("Pluto",Font.PLAIN,16));
        f.add(usernamelbl);


        passwordlbl=new JLabel("Password");
        passwordlbl.setBounds(30,85,200,50);//changed after adding setlayout(null);

        passwordlbl.setForeground(Color.GRAY);//for color
        passwordlbl.setFont(new Font("Pluto",Font.PLAIN,16));
        f.add(passwordlbl);

        usernametxt = new JTextField();
        usernametxt.setBounds(230,30,300,50);
        f.add(usernametxt);

        passwordtxt = new JPasswordField();
        passwordtxt.setBounds(230,85,300,50);
        passwordtxt.setEchoChar('1');   //password field ma * ko satta 1 dekhxha
        f.add(passwordtxt);




        JPanel p1 = new JPanel();
        p1.setBounds(30,145,500,75);
        f.add(p1);
        p1.setBackground(Color.cyan);
        p1.setLayout(new GridLayout(1,3,20,20));


        loginbtn=new JButton("login");
        loginbtn.setBounds(5,25,85,25);
        p1.add(loginbtn);



        resetbtn = new JButton("reset");
        resetbtn.setBounds(95,25,85,25);
        resetbtn.addActionListener(this);
        p1.add(resetbtn);
        f.setVisible(true);




        canclebtn = new JButton("cancle");
        canclebtn.setBounds(185,25,85,25);
        p1.add(canclebtn);




        f.setVisible(true);
    }


    public static void main(String[] args) {
        new loginform();
    }


    @Override   //reset button ko lagi
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginbtn) {

        } else if (e.getSource()==resetbtn) {
            usernametxt.setText("");
            passwordtxt.setText("");
        } else if (e.getSource()==canclebtn) {
            System.exit(0);

        }

    }
}