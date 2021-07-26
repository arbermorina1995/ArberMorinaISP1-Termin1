package View;

import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {

    public LoginForm(){ // constructor



        this.setTitle("Contoso University"); // sets the title to the this of GUI
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// pressing X will shut down the program


        this.setSize(500,500); //sets the x and y dimension
        this.setResizable(false); //preventing the program to change dimensions of size
        this.setVisible(true); // set it to true, this will make our this visible.

        ImageIcon imageLogo = new ImageIcon("armoCoding.png");
        this.setIconImage(imageLogo.getImage());
        this.getContentPane().setBackground(new Color(153, 99, 255, 255)); // this changes my background color

        JLabel label = new JLabel();
        label.setText("Välkommen till Contoso University");
        this.add(label);



    }




}
