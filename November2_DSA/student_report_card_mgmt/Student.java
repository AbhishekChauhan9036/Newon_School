package com.company.student_report_card_mgmt;

class Student {

    private final String name;
    private int rollNumber;
    private String clss;

    public Student(String name, int rollNumber, String clss) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.clss = clss;
    }

    public String getName() {
        return this.name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getClss() {
        return clss;
    }

    public void setClss(String clss) {
        this.clss = clss;
    }

    public static void random() {
        System.out.println("This is very random");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", clss='" + clss + '\'' +
                '}';
    }
}
