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



        // TODO: 2021-07-05 Nu har jag gjort så att jag idag 5/7 fixade associationsklassen 
        // TODO: 2021-07-05 detta gjorde jag genom implementera i både writtenexam klass och student klass då associations 
        //klassen är mellan dom två klasserna.
        // TODO: 2021-07-05  skapade linkedList<Result> results; i både written och student.
        // se koden.
        // todo---> nu kolla tutorial mvc och crud och java form. metoder också ifall de e klara.











    }
}
