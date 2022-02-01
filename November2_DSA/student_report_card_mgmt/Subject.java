package com.company.student_report_card_mgmt;

import java.util.ArrayList;

public class Subject {
    private String name;
    private ArrayList<Exam> exams;

    public Subject(String name) {
        this.name = name;
        this.exams = new ArrayList<>();
    }

    public void addExam() {
        System.out.println("Adding default exam");
        Exam exam = new Exam(this.name, 50, 100);
        this.exams.add(exam);
    }

    public final void addExam(Exam exam) {
        System.out.println("Adding " + exam);
        exams.add(exam);
    }

    public void addExam(ArrayList<Exam> exams) {
        System.out.println("Adding multiple exams " + exams);
        this.exams.addAll(exams);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Exam> exams) {
        this.exams = exams;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", exams=" + exams +
                '}';
    }
}
