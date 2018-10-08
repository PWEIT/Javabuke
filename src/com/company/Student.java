package com.company;

public class Student extends Person {

    private String studentID;
    private float GPA;

    public void Student(final String studentID, float GPA){
        this.studentID = studentID;
        this.GPA = GPA;
    }

    public String StudentID(){
        return studentID;
    }

    public float GPA(){ return GPA;
    }

}
