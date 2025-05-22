package com.kodilla.abstracts.homework;

public  class Person {
    private String firstname;
    private int age;
    private Job job;

    public Person(String firstname, int age, Job job){
        this.firstname = firstname;
        this.age = age;
        this.job = job;
    }

    public void returnResposibilities(){
        System.out.println("Name: " + firstname + " age: " + age + " responsibilities: " + job.getResponsibilities() );
    }

}
