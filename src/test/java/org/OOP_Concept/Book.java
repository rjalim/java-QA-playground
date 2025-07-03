package org.OOP_Concept;

public class Book {

    String title      = "Clean Code: A Handbook of Agile Software Craftsmanship";
    String author     = "Robert C. Martin";
    String publisher  =" Prentice Hall";
    int pages         = 464;

    public void BookInfo(){
        System.out.println("Title: "+ title+ "\nAuthor: "+author+"\nPublisher: "+publisher+ "\nPages"+pages );
    }
}
