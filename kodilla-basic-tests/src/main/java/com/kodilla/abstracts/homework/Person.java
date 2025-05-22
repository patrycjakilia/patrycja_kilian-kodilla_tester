package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private String job;



    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }

    public String getJob(){
        return job;
    }

    public void getResponsibilites(Job job){
        System.out.println("Obowiązki w pracy: " + job.ge);
    }

}
