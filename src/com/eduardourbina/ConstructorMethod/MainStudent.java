package com.eduardourbina.ConstructorMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Scanner names = new Scanner(System.in);

        //Student student
        String name;
        ArrayList<Object> students = new ArrayList<Object>();
        int studentNumber = key.nextInt();

        for(int i = 0; i < studentNumber; i++) {

            //student = new Student(name)
            students.add(new Student(name = names.nextLine()));
        }

        System.out.println();

        for(Object mate : students) {
            System.out.println(mate.toString());
        }
    }
}
