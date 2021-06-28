package AllClassesForISP1Project;

import java.util.ArrayList;

public class WrittenExam {

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

    }
    //association 1: a WrittenExam must belong to a course, and to one course only.
    private Course course;

    //assocation 2: a writtenExam may have been done by many students.
    private ArrayList<Student> students = new ArrayList<>();




    //getters and setters for the above attributes of this class

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




    // TODO: 2021-06-27 lägg default contsructor innan getters and setters, create araylist for students  
    // TODO: 2021-06-27 lägg till metoderna sen, find, add, remove.  








}
