package AllClassesForISP1Project;

public class Student {

    //localvariables private
    //studentID shall be the primarykey for this class
    private String studentID;
    private String name;

    //
    private WrittenExam [] writtenExams;



    //getters and setters for above attributes
    public String getStudentID() {

        return studentID;
    }

    public void setStudentID(String studentID) {

        this.studentID = studentID;
    }

    public String getName () {

        return name;

    }
    public void setName (String name) {

        this.name = name;
    }



    //constructor with inparameters

    public Student (String studentID, String name){
        this.studentID= studentID;
        this.name= name;
    }

    // TODO: Kolla hur du ska skapa metoder genom texten
    //  2021-06-24  se video utube på mvc och crud for application sen se också how to design using
    //todo: javafx eller windowsform ngt av de






}
