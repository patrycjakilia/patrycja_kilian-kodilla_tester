package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 3.0);
        grades.put("Chemistry", 5.0);
        grades.put("Philosophy", 4.5);

        double grade = grades.get("Mathematics");
        System.out.println(grade);

        for(Map.Entry<String, Double> note : grades.entrySet()){
            System.out.println("Subject: " + note.getKey() + " grade: " + note.getValue());
        }

    }
}
