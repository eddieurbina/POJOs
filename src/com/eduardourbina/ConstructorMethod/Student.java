package com.eduardourbina.ConstructorMethod;

public class Student {

    private String name;
    private static int enrollmentNumber = 1;
    private int studentId;

    public Student(String name){
        this.name = name;
        this.studentId = enrollmentNumber++;
    }

    @Override
    public String toString() {
        return studentId + ": " + name + "\n";
    }
}
