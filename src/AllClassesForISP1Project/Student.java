package AllClassesForISP1Project;

import java.util.ArrayList;


public class Student {

    //localvariables private
    //studentID shall be the primarykey for this class
    private String studentID;
    private String name;


    //constructor with inparameters

    public Student (String studentID, String name){
        this.studentID= studentID;
        this.name= name;
    }

    //down is due to many to many association between students and writtenexams.
    // and other associations after.
    private ArrayList<WrittenExam> writtenExams = new ArrayList<WrittenExam>();




    // some methods according to CRUD.


    //find a writtenExam-method
    public WrittenExam findExamForStudent (String examID){
        for(WrittenExam we: writtenExams){ //loopar igenom arraylistan av writtenExams, inom samma kodblock skapa if
            if(we.getExamID() == examID) {
                return we;
            }
        }
        return null;
    }

    //add a writtenexam to list of writtenExam-list that has been done by the student.
    public void addExam (WrittenExam writtenExam){
        writtenExams.add(writtenExam);

    }

    //remove metoden för att ta bort ett prov från den listan

    public void removeExam (String examID){
        WrittenExam writtenExam = findExamForStudent(examID);
        if(writtenExam != null){
            writtenExams.remove(writtenExam);
        }

    }

    //getters and setters for above attributes and for the many to many association

    public ArrayList<WrittenExam> getWrittenExams() {

        return writtenExams;
    }

    public void setWrittenExams(ArrayList<WrittenExam> writtenExams) {

        this.writtenExams = writtenExams;
    }

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





    // TODO: Kolla hur du ska skapa metoder genom texten, sök utube how to create methods for crud
    //  2021-06-24  se video utube på mvc och crud for application sen se också how to design using
    //todo: javafx eller windowsform ngt av de






}
