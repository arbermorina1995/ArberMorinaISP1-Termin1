package AllClassesForISP1Project;

public class Result {

    //attributes for this associationclass, these are private

    private double result;
    private String letterGrade;


    //getters and setter for these attributes


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


    //the constructor for this class
    public Result (double result, String letterGrade){
        this.result = result;
        this.letterGrade= letterGrade;
    }
















}
