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

    // TODO: 2021-06-22  checka uml dokumentation för att se hur man gör associationsklass i java, se t1 kurs mjukvaru






}
