package View;

import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    //declaring my JButton globally in this frame to use it in the methods below constructor
    JButton button1 = new JButton();
    //constructor for this frame
    public LoginFrame(){


        this.setTitle("Contoso University");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("armoCoding.png"); // remember this logo should be at the project folder.
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(14, 122, 255, 117)); // this changes my background color

        JButton button1 = new JButton();
        button1.setBounds(200,100,100,50);
        this.add(button1);
        button1.addActionListener(this);









    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            System.out.println("Hejsan");
        }
    }
}
