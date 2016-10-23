package com.gmail.rav;

public class Student extends Human {
    String group;
    String faculty;
    int course;

    public Student(String name, String surname, String sex, int age, int weight, int height, String group, String faculty, int course) {
        super(name, surname, sex, age, weight, height);
        this.group = group;
        this.faculty = faculty;
        this.course = course;
    }

    public Student() {
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", факультет " + faculty +
                ", курс " + course;
    }
}
