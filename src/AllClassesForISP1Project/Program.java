package AllClassesForISP1Project;
import Model.Course;
import Model.Student;
import Model.WrittenExam;
import View.LoginForm;

public class Program {


    public static void main (String[] args){

        //down below is the JFrame which is a GUI window with added components

        /* JFrame frame = new JFrame(); // this creates our frame --> boilerplate (standard code for a frame)

        frame.setTitle("Contoso University"); // sets the title to the frame of GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// pressing X will shut down the program


        frame.setSize(500,500); //sets the x and y dimension
        frame.setResizable(false); //preventing the program to change dimensions of size
        frame.setVisible(true); // set it to true, this will make our frame visible.

        ImageIcon imageLogo = new ImageIcon("armoCoding.png");
        frame.setIconImage(imageLogo.getImage());
        frame.getContentPane().setBackground(new Color(153, 99, 255, 255)); // this changes my background color */

        LoginForm loginForm = new LoginForm(); // calling an instance of the class loginForm.















        Student s1 = new Student("ar1834mo-s","Arber Morina");
        Student s2 = new Student("fi2000mo-s", "Fidaim Morina");
        Student s3 = new Student("li1991mo-s", "Linda Morina");
        Student s4 = new Student("ek1969mo-s","Ekrem Morina");

        Student[] students = {s1,s2,s3,s4};

        WrittenExam we = new WrittenExam("Mjukvaruarkitektur",20,"Lund",8, 100);
        Course sysa14 = new Course("Sysa14", "Programkonstruktion",4);



        // TODO: 2021-07-05 Nu har jag gjort så att jag idag 5/7 fixade associationsklassen
        // TODO: 2021-07-05 detta gjorde jag genom implementera i både writtenexam klass och student klass då associations
        //klassen är mellan dom två klasserna.
        // TODO: 2021-07-05  skapade linkedList<Result> results; i både written och student.
        // se koden.
        // todo---> nu kolla tutorial mvc och crud och java form. metoder också ifall de e klara.



    }












}
