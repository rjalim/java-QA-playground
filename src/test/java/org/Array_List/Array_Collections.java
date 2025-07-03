package org.Array_List;

import java.util.ArrayList;

public class Array_Collections {

    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size());

        list.add("Abdul Alim");
        list.add("Shompod");
        list.add("Shaher");
        list.add("Polash");
        list.add("Saniul");
        list.add("Jubayer");

        System.out.println(list);
        System.out.println(list.size());

        //for_Loop
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        //foreach
        for(String li:list){
            System.out.println(li);
        }

        list.remove("Polash");
        System.out.println("Index:- 2"+list);
        list.add("Fardin");
        System.out.println(list.get(2));
        System.out.println(list.size());
    }
}
