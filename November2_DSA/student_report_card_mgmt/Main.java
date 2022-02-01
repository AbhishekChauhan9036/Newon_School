package com.company.student_report_card_mgmt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student krish = new Student("Krish", 21, "10th");
        Subject javaKrish = new Subject("Java");
        Exam javaKrishUnitTest = new Exam("Unit Test", 10, 20);
        javaKrish.addExam(javaKrishUnitTest);
        Exam javaKrishFinalExam = new Exam("Final Exam", 80, 100);
        javaKrish.addExam(javaKrishFinalExam);
        ReportCard krishReportCard = new ReportCard(krish);
        krishReportCard.addSubject(javaKrish);

        Student deepakThakur = new Student("Deepak Thakur", 14, "10th");
        Subject deepakThakurJava = new Subject("Java");
        Exam deepakThakurJavaUnitTest = new Exam("Unit Test", 20, 20);
        deepakThakurJava.addExam(deepakThakurJavaUnitTest);
        Exam deepakThakurJavaFinalExam = new Exam("Final Exam", 80, 100);
        deepakThakurJava.addExam(deepakThakurJavaFinalExam);
        ReportCard deepakReportCard = new ReportCard(deepakThakur);
        deepakReportCard.addSubject(deepakThakurJava);

//        System.out.println("name " + krishReportCard.getStudent().getName());
//        for (Subject subject : krishReportCard.getSubjects()) {
//            System.out.println(subject.getName());
//            for (Exam exam : subject.getExams()) {
//                System.out.println("Exam for " + subject.getName() + " : " + exam);
//            }
//        }
//        System.out.println(javaKrish.getExams());
//        Exam.examDuration = 3;
//        System.out.println(deepakThakurJava.getExams());
//        System.out.println(javaKrish.getExams());
//        Student.random();
        StudentMarks[] list = new StudentMarks[11];
        for (int i = 0; i <= 100; i += 10) {
            list[i/10] = (new StudentMarks("name" + i, 100 - i));
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("==============Sorting Now ================");
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

}
