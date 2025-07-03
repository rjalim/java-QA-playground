package org.OOP_Concept;

public class Student extends Book{
    String name = "Abdul Alim";
    int age     = 27;

    public void StudentInfo(){
        System.out.println("Name: "+name+ "\nage: "+age);
        System.out.println("Title: "+ title+ "\nAuthor: "+author+"\nPublisher: "+publisher+ "\nPages"+pages );

    }
}
