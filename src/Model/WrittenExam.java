package Model;

import java.util.ArrayList;
import java.util.LinkedList;

public class WrittenExam {



    private LinkedList<Result> results;


    //localvariables

    private String examID;
    private int date;
    private String location;
    private int time;
    private int maxPoints;

    //constructor for this class with attributes as inparameters

    public WrittenExam (String examID, int date, String location, int time, int maxPoints){
        this.examID = examID;
        this.date= date;
        this.location= location;
        this.time= time;
        this.maxPoints = maxPoints;
        this.setResults(new LinkedList<Result>());


    }

    //association 1: a WrittenExam must belong to a course, and to one course only.
    private Course course;

   //below get and set the main attribut for course, we wanna get


    //assocation 2: a writtenExam may have been done by many students.
    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {

        return students;
    }

    public void setStudents(ArrayList<Student> students) {

        this.students = students;
    }
    //get set for associationclass between writtenExan (result) and student, result is the associationclass.
    public LinkedList<Result> getResults() {
        return results;
    }

    public void setResults(LinkedList<Result> results) {
        this.results = results;
    }

    //getters and setters for the above attributes of this class


    public Course getCourse(){

        return course;
    }
    public void setCourse(Course course){

        this.course = course;
    }

    public String getExamID (){

        return examID;
    }

    public void setExamID (String examID) {

        this.examID = examID;

    }

    public int getDate(){

        return date;

    }

    public void setDate(int date){

        this.date= date;

    }
    public String getLocation(){

        return location;

    }
    public void setLocation(String location){

        this.location= location;

    }

    public int getTime (){

        return time;

    }
    public void setTime(int time){

        this.time = time;

    }

    public int getMaxPoints() {

        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {

        this.maxPoints = maxPoints;
    }









}
