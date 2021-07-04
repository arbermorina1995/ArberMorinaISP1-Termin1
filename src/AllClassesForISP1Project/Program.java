package AllClassesForISP1Project;

public class Program {


    public static void mainMethod(){

        Student s1 = new Student("ar1834mo-s","Arber Morina");
        Student s2 = new Student("fi2000mo-s", "Fidaim Morina");
        Student s3 = new Student("li1991mo-s", "Linda Morina");
        Student s4 = new Student("ek1969mo-s","Ekrem Morina");

        Student[] students = {s1,s2,s3,s4};

        WrittenExam we = new WrittenExam("Mjukvaruarkitektur",20,"Lund",8, 100);
        Course sysa14 = new Course("Sysa14", "Programkonstruktion",4);

        System.out.println(students);


        // TODO: 2021-07-01 kolla mats ppw 160 och 165 om associationsklasser.
        // TODO: 2021-07-01 nu finns alla getters and setters för attributer och associationer,
        // TODO: 2021-07-01 kolla nu på ppw 165 o se om du kan lösa associationsklassen!
        // TODO: 2021-07-04  kolla ppw om associationer du ska nog göra så att du också skapar get och set för
        // TODO: 2021-07-04  den andra klassens huvudattribut,  kolla ppw 159-160, --> när du skapar en instans av en annan
        // TODO: 2021-07-04  klass pga att de finns en association så ska du också hämta den andra klassen huvudattribut! 
        // TODO: 2021-07-04  efter du gjort detta för varje klass, kolla 165 om du kan fixa ASSOCIATIONSklassen 
        // TODO: 2021-07-04  sedan e de dags att börja designa med forms.  












    }
}
