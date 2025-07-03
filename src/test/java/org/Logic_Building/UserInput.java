package org.Logic_Building;

import java.util.Scanner;

public class UserInput {

    public static void main(String[]args){
        //Obj declear: Classname obj_name = new Classname (paramiter)
         Scanner input = new Scanner(System.in);


        System.out.println("Please Enter First number: ");
        int number1 = input.nextInt();

        System.out.println("Please Enter Second number: ");
        int number2 = input.nextInt();

        System.out.println("Summation: " +(number1+number2));
        System.out.println("Subtraction: " +(number1-number2));
        System.out.println("Multiplication: " +(number1*number2));
        System.out.println("Devetion: " +(number1/number2));


    }
}
