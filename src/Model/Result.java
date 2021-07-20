package Model;

public class Result {

    //attributes for this associationclass, these are private

    private double result;
    private String letterGrade;




    //this asociationsclass is associated with downbelow classes.
    private Student student;
    private WrittenExam writtenExam;

    //the constructor for this class
    public Result (double result, String letterGrade, Student student, WrittenExam writtenExam){
        this.result = result;
        this.letterGrade= letterGrade;
        this.student= student;
        this.writtenExam= writtenExam;
    }



    //getters and setter for these attributes
    public WrittenExam getWrittenExam() { return writtenExam;
    }

    public void setWrittenExam(WrittenExam writtenExam) { this.writtenExam = writtenExam;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public double getResult (){

        return result;
    }

    public void setResult(double result) {

        this.result= result;

    }

    public String getLetterGrade (){

        return letterGrade;

    }

    public void setLetterGrade(String letterGrade){

        this.letterGrade = letterGrade;

    }





}
