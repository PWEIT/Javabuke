package com.company;

public class Student extends Person {

    private String studentID;
    private float GPA;

    public Student(String studentID, float GPA){
        this.studentID = studentID;
        this.GPA = GPA;
    }

    public String getStudentID(){
        return studentID;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public float getGPA(){

        return GPA;
    }

}
