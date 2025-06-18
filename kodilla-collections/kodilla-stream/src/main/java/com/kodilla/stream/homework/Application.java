package com.kodilla.stream.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Patrycja", new Teacher("Marta")));
        students.add(new Student("Marta",null));
        students.add(new Student("Kasia",null));
        students.add(new Student("Marek",null));
        students.add(new Student("Asia", new Teacher("Pablo")));

        for(Student student : students){
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");

            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacherName);
        }

    }
}
