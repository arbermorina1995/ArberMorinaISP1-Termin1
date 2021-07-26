package View;

import javax.swing.*;

public class ContosoUniversity extends  JFrame{


    private JPanel ContosoLogin;
    private JPanel panelForLogin;

    public ContosoUniversity (String title){
        super(title);

        //boilerplatecode below-->
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ContosoLogin);
        this.pack();
    }


}
