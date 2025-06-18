package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void studentHaveTeacher(){
        Student student = new Student("Marta Kowalska", new Teacher("Dominika Midas"));
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
        assertEquals("Dominika Midas", teacherName);
    }

    @Test
    public void studentNoHaveTeacher(){
        Student student = new Student("Marta Kowalska", null);
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");
        assertEquals("<undefined>", teacherName);
    }




}