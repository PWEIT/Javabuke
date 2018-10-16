package com.company;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private String year;

    private ArrayList<Student> studentArrayList;

    public void Course(String courseName, String year) {
        this.courseName = courseName;
        this.year = year;

        studentArrayList = new ArrayList<Student>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void addStudent(Student student) {

        for (Student stud : studentArrayList) {
            if (stud.getStudentID().equals(student.getStudentID())) {
                return;
            }
        }

        studentArrayList.add(student);
    }

    public void removeStudent(Student student) {

        for (Student stud : studentArrayList) {
            if (stud.getStudentID().equals(student.getStudentID())) {
                studentArrayList.remove(stud);
                return;
            }
        }
    }

//    public float calculateAverageGPA(){
//
//        float sumGPA = 0;
//        float sumStudent = 0;
//        float average = 0;
//
//        sumStudent = studentArrayList.size();
//
//        for (Student stud : studentArrayList) {
//            sumGPA = sumGPA + stud.getGPA();
//        }
//
//        average = sumGPA/sumStudent;
//
//        return average;
//
//    }

    public float calculateAverageGPA() {

        float sumGPA = 0;

        for (Student stud : studentArrayList) {
            sumGPA = sumGPA + stud.getGPA();
        }

        return sumGPA / studentArrayList.size();

    }
}
