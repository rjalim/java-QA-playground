package org.Methods_Function;


public class Methods {

           int a;
    static int b;

    public void non_Static_method(String[]args){
        System.out.println(a+b);
    }
    
    public static void static_method(String[]args){
        Methods obj = new Methods();
        System.out.println(obj.a+b);
    }

    public static void add(int number1, int number2){
        int sum= number1+number2;
        System.out.println(sum);
    }

    public void multiply(int number3, int number4){
        int mul = number3*number4;
        System.out.println(mul);

    }

    public static void main(String[]args){
        add(10,10);
        add(20,30);
        Methods obj = new Methods();
        obj.multiply(5,5);
    }

}
