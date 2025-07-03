package org.Logic_Building;

public class LoopExamples {

    public static void main(String[]args){

        //for_loop
        for(int i=0; i<=10; i++){
            System.out.println("Iteration: " +i);
        }

        //While_Loop
        int counter = 0;
        while(counter <= 5){
            System.out.println(counter);
            counter++;
        }

        //do_While_loop
        int counter2 = 0;
        do{
            System.out.println(counter2);
            counter2++;
        } while (counter2<=3);

    }
}
