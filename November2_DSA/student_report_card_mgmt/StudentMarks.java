package com.company.student_report_card_mgmt;

public class StudentMarks implements Comparable<StudentMarks> {

    String name;
    int marks;

    public StudentMarks(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentMarks studentMarks) {
        return this.marks - studentMarks.marks;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
