package AllClassesForISP1Project;

public class WrittenExam {

    //localvariables

    private String examID;
    private int date;
    private String location;
    private int time;
    private int maxPoints;

    //below is writtenExam can have alot of students
    //also belonging to one course, this means that the two below are classes associated with this class writtenEx
    private Student[] students;
    private Course course;




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

    //constructor for this class with attributes as inparameters

    public WrittenExam (String examID, int date, String location, int time, int maxPoints){
        this.examID = examID;
        this.date= date;
        this.location= location;
        this.time= time;
        this.maxPoints = maxPoints;

    }









}
