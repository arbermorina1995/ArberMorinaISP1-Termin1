package AllClassesForISP1Project;

import java.util.ArrayList;

public class Course {

    //attributes

    private String courseCode;
    private String name;
    private int credits;

    //constructor
    public Course (String courseCode, String name, int credits ){
        this.courseCode= courseCode;
        this.name= name;
        this.credits= credits;

    }


    //a course has many writtensExams, while a writtenExam must belong to a course, and one course only.
    private ArrayList<WrittenExam> writtenExams = new ArrayList<>();


    //findmethod--> find a writtenExam for a certain course.

    public WrittenExam findWrittenExam (String examID){
        for(WrittenExam we: writtenExams){
            if(we.getExamID()== examID){
                return we;
            }

        }
        return null;

    }

    //add a writtenExam to the arraylist above
    public void addWrittenExamToCourse(WrittenExam writtenExam){
        writtenExams.add(writtenExam);

    }

    //remove a writtenExam from the arraylist above belonging to course.
    public void removeWrittenExamFromCourse(String examID){
        WrittenExam writtenExam = findWrittenExam(examID);
        if (writtenExam != null){
            writtenExams.remove(writtenExam);
        }

    }


    //getters and setters for our attributes


    // getters and setts for this below is to the association from course to writtenExam.
    public ArrayList<WrittenExam> getWrittenExams() {
        return writtenExams;
    }

    public void setWrittenExams(ArrayList<WrittenExam> writtenExams) {
        this.writtenExams = writtenExams;
    }


    public String getCourseCode() {

        return courseCode;
    }

    public void setCourseCode(String courseCode) {

        this.courseCode = courseCode;
    }



    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }



    public int getCredits() {

        return credits;
    }

    public void setCredits(int credits) {

        this.credits = credits;
    }












}
