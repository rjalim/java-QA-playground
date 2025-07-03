package org.Logic_Building;


import java.util.Scanner;

public class String_Length_validation {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first text: ");
        String text1 = input.nextLine();

        System.out.println("Please enter the Second text: ");
        String text2 = input.nextLine();

        if(text1.equals(text2)){
            System.out.println(text1+ " is equals to " + text2);
        } else if (text1.equalsIgnoreCase(text2)) {
            System.out.println(text1 + " is equals to " + text2 + " But Its ignores case sencetvity");
        }else{

            System.out.println(text1+ " is not equals to " +text2);
        }


    }
}
