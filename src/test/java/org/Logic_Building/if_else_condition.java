package org.Logic_Building;

import java.util.Scanner;

public class if_else_condition {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        if(number1>number2){
            System.out.println(number1+ " is greater than number " +number2);
        } else if (number1==number2) {
            System.out.println(number1+ " is equals to " +number2);
        }
        else{
            System.out.println(number1+ " is less than " +number2);
        }
    }
}
