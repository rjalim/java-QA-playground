package org.Methods_Function;

public class Method_Overloading {

    public static void add(int number1, int number2){
        int sum= number1+number2;
        System.out.println(sum);
    }

    public static void add(int number1,int number2,int number3){
        int sum = number1+ number2+number3;
        System.out.println(number1+" Parameter is different " + number2 + " for this reason "+ " \nIt is called method overloading " +number3 +" = "+sum);
    }

    public static void main(String[]args){
        add(50,50);
        add(50,50,50);
    }

}
