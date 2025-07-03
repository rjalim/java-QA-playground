package org.Exception;

public class Exception_handling {
    public static void main(String[]args){
        int a= 100;
        int b= 0;

        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println("Invalid");
        }
    }
}
