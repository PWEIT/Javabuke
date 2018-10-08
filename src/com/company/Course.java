package com.company;

public class Course extends Student {

    private String courseName;
    private String year;

    public void Course(String courseName, String year) {
        this.courseName = courseName;
        this.year = year;
    }

    public String couseName() {
        return courseName;
    }

    public String year() {
        return year;
    }
}
