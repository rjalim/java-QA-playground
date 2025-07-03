package org.Logic_Building;


import java.util.Scanner;

public class Switch_Case {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Condition 1 : ");
         int month = input.nextInt();

        switch (month){

            case 1:
                System.out.println("January");
                break;

            case 2:
                    System.out.println("February");
                    break;

            default:
                System.out.println("Not Found");
        }
    }
}
