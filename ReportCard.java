package com.example.android.report_card;

/**
 * Created by mus on 6/26/17.
 */

public class ReportCard {

    //constant variable
    static final private String DEPT_NAME = "Department of Chemistry University of Innsbruck";
    static final private String GRADE_EXCELLENT = "A (Excellent)";
    static final private String GRADE_GOOD = "B (Good)";
    static final private String GRADE_SATISFACTORY = "C (Satisfactory)";
    static final private String GRADE_FAIL = "Fail";

    //variable for student name
    private String studentname;

    //variable for student id
    private int studentid;

    //variable for courses
    private int Calculus;
    private int OrganicChemistry;
    private int QuantumChemistry;
    private int IntroJava;
    private int Catalyst;
    private int MaterialScience;

    //variable for final result
    private String finalresult;

    //THE CONSTRUCTOR
    public ReportCard (String studentname, int studentid, int Calculus, int organicChemistry,
                       int QuatumChemistry, int IntroJava, int Catalyst, int MaterialScience,
                       String finalresult){
        this.studentname = studentname;
        this.studentid = studentid;
        this.Calculus = Calculus;
        this.OrganicChemistry = organicChemistry;
        this.QuantumChemistry = QuatumChemistry;
        this.IntroJava = IntroJava;
        this.MaterialScience = MaterialScience;
        this.Catalyst = Catalyst;
        this.finalresult = finalresult;
    }

    //Get and Set
    //Student name
    public String getStudentname (){
        return studentname;
    }
    public void setStudentname(String studentname){
        this.studentname = studentname;
    }

    //Student Id
    public int getStudentId (){
        return studentid;
    }
    public void setStudentid(int studentid){
        this.studentid = studentid;
    }

    //Calculus
    public  int getCalculus (){
        return Calculus;
    }
    public void setCalculus(int Calculus){
        this.Calculus = Calculus;
    }

    //Organic Chemistry
    public int getOrganicChemistry(){
        return OrganicChemistry;
    }
    public void setOrganicChemistry(int OrganicChemistry){
        this.OrganicChemistry = OrganicChemistry;
    }

    //Quantum Chemistry
    public int getQuantumChemistry(){
        return QuantumChemistry;
    }
    public void setQuantumChemistry(int QuantumChemistry){
        this.QuantumChemistry = QuantumChemistry;
    }

    //Intro Java
    public int getIntroJava(){
        return IntroJava;
    }
    public void setIntroJava(int IntroJava){
        this.IntroJava = IntroJava;
    }

    //Intro Catalyst
    public int getCatalyst(){
        return Catalyst;
    }
    public void setCatalyst(int Catalyst){
        this.Catalyst = Catalyst;
    }

    //Intro Material Science
    public int getMaterialScience(){
        return MaterialScience;
    }
    public void setMaterialScience(int MaterialScience){
        this.MaterialScience = MaterialScience;
    }

    //Calculate the score
    public void calculateTotalScore (int Calculus, int organicChemistry,int QuatumChemistry,
                                 int IntroJava, int Catalyst, int MaterialScience){
        float totalscore;
        totalscore = ((Calculus + organicChemistry + QuatumChemistry + IntroJava + Catalyst + MaterialScience) /6);
        if ((totalscore == 4) || (totalscore > 3)){
            finalresult = GRADE_EXCELLENT ;
            }
        if ((totalscore ==3) || (totalscore > 2.7)){
            finalresult = GRADE_GOOD;
            }
        if ((totalscore == 2.7) || (totalscore > 2.5)){
            finalresult = GRADE_SATISFACTORY;
        }
        if ((totalscore == 0) || (totalscore <= 2.5)){
            finalresult = GRADE_FAIL;
        }
    }

    //Return all values to readable format using String toString

    @Override
    public String toString() {
        return  "Student Name: " + studentname + " \n" +
                "Student ID: " + studentid + "\n" +
                "Calculus: " + Calculus + "\n" +
                "Organic Chemistry: " + OrganicChemistry + "\n" +
                "Quantum Chemistry: " + QuantumChemistry + "\n" +
                "Introduction of Java: " + IntroJava + "\n" +
                "Catalyst: " + Catalyst + "\n" +
                "Material Science: " + MaterialScience + "\n" +
                "Final Result: " + finalresult ;
    }
}

