package com.company.student_report_card_mgmt;

import java.util.ArrayList;

public class ReportCard {
    private Student student;
    private ArrayList<Subject> subjects;

    public ReportCard(Student student) {
        this.student = student;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        System.out.println("Adding " + subject);
        subjects.add(subject);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "student=" + student +
                ", subjects=" + subjects +
                '}';
    }
}
