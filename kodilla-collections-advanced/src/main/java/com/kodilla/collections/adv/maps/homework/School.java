package com.kodilla.collections.adv.maps.homework;


import java.util.ArrayList;
import java.util.List;

public class School {
    private String school;
    private List<Integer> countOfStudents = new ArrayList<>();

    public School(String school, List<Integer> countOfStudents) {
        this.school = school;
        this.countOfStudents = countOfStudents;
    }

    public String getSchool() {
        return school;
    }

    public int getSum() {    // [1]
        int sum = 0;            // [2]
        for (double grade : countOfStudents)  // [3]
            sum += grade;             // [4]
        return sum;  // [5]
    }

    @Override
    public String toString() {
        return "School{" +
                "school='" + school + '\'' +
                ", countOfStudents=" + countOfStudents +
                '}';
    }
}
