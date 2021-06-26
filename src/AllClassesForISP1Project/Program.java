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














    }
}
