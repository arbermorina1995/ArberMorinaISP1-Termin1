package Model;

import java.util.ArrayList;
import java.util.LinkedList;


public class Student {

    //localvariables private
    //studentID shall be the primarykey for this class
    private String studentID;
    private String name;

    //associationclass below
    private LinkedList<Result> results;


    //constructor with inparameters

    public Student (String studentID, String name){
        this.studentID= studentID;
        this.name= name;

        this.setResults(new LinkedList<Result>());
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





    //getters and setters for above attributes and for the many to many association, also for the associationclass

    public LinkedList<Result> getResults() {
        return results;
    }

    public void setResults(LinkedList<Result> results) {
        this.results = results;
    }

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




}
